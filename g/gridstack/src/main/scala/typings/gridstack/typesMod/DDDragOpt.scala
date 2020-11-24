package typings.gridstack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DDDragOpt extends js.Object {
  
  /** default to 'body' */
  var appendTo: js.UndefOr[String] = js.native
  
  /** parent constraining where item can be dragged out from (default: null = no constrain) */
  var containment: js.UndefOr[String] = js.native
  
  /** class selector of items that can be dragged. default to '.grid-stack-item-content' */
  var handle: js.UndefOr[String] = js.native
  
  /** default to `true` */
  var scroll: js.UndefOr[Boolean] = js.native
}
object DDDragOpt {
  
  @scala.inline
  def apply(): DDDragOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DDDragOpt]
  }
  
  @scala.inline
  implicit class DDDragOptOps[Self <: DDDragOpt] (val x: Self) extends AnyVal {
    
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
    def setAppendTo(value: String): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setContainment(value: String): Self = this.set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
  }
}
