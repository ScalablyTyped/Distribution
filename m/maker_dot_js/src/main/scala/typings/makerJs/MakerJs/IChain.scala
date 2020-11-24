package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A chain of paths which connect end to end.
  */
@js.native
trait IChain extends js.Object {
  
  /**
    * Flag if this chain forms a loop end to end.
    */
  var endless: js.UndefOr[Boolean] = js.native
  
  /**
    * The links in this chain.
    */
  var links: js.Array[IChainLink] = js.native
  
  /**
    * Total length of all paths in the chain.
    */
  var pathLength: Double = js.native
}
object IChain {
  
  @scala.inline
  def apply(links: js.Array[IChainLink], pathLength: Double): IChain = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChain]
  }
  
  @scala.inline
  implicit class IChainOps[Self <: IChain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLinksVarargs(value: IChainLink*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[IChainLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathLength(value: Double): Self = this.set("pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndless(value: Boolean): Self = this.set("endless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndless: Self = this.set("endless", js.undefined)
  }
}
