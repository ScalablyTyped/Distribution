package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Links extends js.Object {
  
  /** The number of dropped links after the maximum size was enforced. If this value is 0, then no links were dropped. */
  var droppedLinksCount: js.UndefOr[Double] = js.native
  
  /** A collection of links. */
  var link: js.UndefOr[js.Array[Link]] = js.native
}
object Links {
  
  @scala.inline
  def apply(): Links = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit class LinksOps[Self <: Links] (val x: Self) extends AnyVal {
    
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
    def setLinkVarargs(value: Link*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[Link]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
}
