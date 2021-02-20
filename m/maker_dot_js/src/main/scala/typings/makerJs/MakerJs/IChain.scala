package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A chain of paths which connect end to end.
  */
@js.native
trait IChain extends StObject {
  
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
  implicit class IChainMutableBuilder[Self <: IChain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndless(value: Boolean): Self = StObject.set(x, "endless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndlessUndefined: Self = StObject.set(x, "endless", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[IChainLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: IChainLink*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setPathLength(value: Double): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
  }
}
