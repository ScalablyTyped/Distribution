package typings.hopscotch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseTooltip extends js.Object {
  
  var closeTooltip: js.UndefOr[String] = js.native
  
  var doneBtn: js.UndefOr[String] = js.native
  
  var nextBtn: js.UndefOr[String] = js.native
  
  var prevBtn: js.UndefOr[String] = js.native
  
  var skipBtn: js.UndefOr[String] = js.native
  
  var stepNums: js.UndefOr[js.Array[String]] = js.native
}
object CloseTooltip {
  
  @scala.inline
  def apply(): CloseTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseTooltip]
  }
  
  @scala.inline
  implicit class CloseTooltipOps[Self <: CloseTooltip] (val x: Self) extends AnyVal {
    
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
    def setCloseTooltip(value: String): Self = this.set("closeTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseTooltip: Self = this.set("closeTooltip", js.undefined)
    
    @scala.inline
    def setDoneBtn(value: String): Self = this.set("doneBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneBtn: Self = this.set("doneBtn", js.undefined)
    
    @scala.inline
    def setNextBtn(value: String): Self = this.set("nextBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextBtn: Self = this.set("nextBtn", js.undefined)
    
    @scala.inline
    def setPrevBtn(value: String): Self = this.set("prevBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevBtn: Self = this.set("prevBtn", js.undefined)
    
    @scala.inline
    def setSkipBtn(value: String): Self = this.set("skipBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipBtn: Self = this.set("skipBtn", js.undefined)
    
    @scala.inline
    def setStepNumsVarargs(value: String*): Self = this.set("stepNums", js.Array(value :_*))
    
    @scala.inline
    def setStepNums(value: js.Array[String]): Self = this.set("stepNums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepNums: Self = this.set("stepNums", js.undefined)
  }
}
