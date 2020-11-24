package typings.jqueryPnotify

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNotifyStack extends js.Object {
  
  var context: js.UndefOr[JQuery[HTMLElement]] = js.native
  
  var dir1: js.UndefOr[String] = js.native
  
  var dir2: js.UndefOr[String] = js.native
  
  var firstpos1: js.UndefOr[Double] = js.native
  
  var firstpos2: js.UndefOr[Double] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var push: js.UndefOr[String] = js.native
  
  var spacing1: js.UndefOr[Double] = js.native
  
  var spacing2: js.UndefOr[Double] = js.native
}
object PNotifyStack {
  
  @scala.inline
  def apply(): PNotifyStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyStack]
  }
  
  @scala.inline
  implicit class PNotifyStackOps[Self <: PNotifyStack] (val x: Self) extends AnyVal {
    
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
    def setContext(value: JQuery[HTMLElement]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDir1(value: String): Self = this.set("dir1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir1: Self = this.set("dir1", js.undefined)
    
    @scala.inline
    def setDir2(value: String): Self = this.set("dir2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir2: Self = this.set("dir2", js.undefined)
    
    @scala.inline
    def setFirstpos1(value: Double): Self = this.set("firstpos1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstpos1: Self = this.set("firstpos1", js.undefined)
    
    @scala.inline
    def setFirstpos2(value: Double): Self = this.set("firstpos2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstpos2: Self = this.set("firstpos2", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setPush(value: String): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setSpacing1(value: Double): Self = this.set("spacing1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing1: Self = this.set("spacing1", js.undefined)
    
    @scala.inline
    def setSpacing2(value: Double): Self = this.set("spacing2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing2: Self = this.set("spacing2", js.undefined)
  }
}
