package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of links, which are references from this span to a span in the
  * same or different trace.
  */
@js.native
trait SchemaLinks extends js.Object {
  
  /**
    * The number of dropped links after the maximum size was enforced. If this
    * value is 0, then no links were dropped.
    */
  var droppedLinksCount: js.UndefOr[Double] = js.native
  
  /**
    * A collection of links.
    */
  var link: js.UndefOr[js.Array[SchemaLink]] = js.native
}
object SchemaLinks {
  
  @scala.inline
  def apply(): SchemaLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinks]
  }
  
  @scala.inline
  implicit class SchemaLinksOps[Self <: SchemaLinks] (val x: Self) extends AnyVal {
    
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
    def setDroppedLinksCount(value: Double): Self = this.set("droppedLinksCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDroppedLinksCount: Self = this.set("droppedLinksCount", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: SchemaLink*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[SchemaLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
}
