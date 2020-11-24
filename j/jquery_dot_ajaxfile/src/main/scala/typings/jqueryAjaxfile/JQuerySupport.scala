package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  Collection of properties of the current browser
*/
@js.native
trait JQuerySupport extends js.Object {
  
  var ajax: js.UndefOr[Boolean] = js.native
  
  var boxModel: js.UndefOr[Boolean] = js.native
  
  var changeBubbles: js.UndefOr[Boolean] = js.native
  
  var checkClone: js.UndefOr[Boolean] = js.native
  
  var checkOn: js.UndefOr[Boolean] = js.native
  
  var cors: js.UndefOr[Boolean] = js.native
  
  var cssFloat: js.UndefOr[Boolean] = js.native
  
  var hrefNormalized: js.UndefOr[Boolean] = js.native
  
  var htmlSerialize: js.UndefOr[Boolean] = js.native
  
  var leadingWhitespace: js.UndefOr[Boolean] = js.native
  
  var noCloneChecked: js.UndefOr[Boolean] = js.native
  
  var noCloneEvent: js.UndefOr[Boolean] = js.native
  
  var opacity: js.UndefOr[Boolean] = js.native
  
  var optDisabled: js.UndefOr[Boolean] = js.native
  
  var optSelected: js.UndefOr[Boolean] = js.native
  
  var scriptEval: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var style: js.UndefOr[Boolean] = js.native
  
  var submitBubbles: js.UndefOr[Boolean] = js.native
  
  var tbody: js.UndefOr[Boolean] = js.native
}
object JQuerySupport {
  
  @scala.inline
  def apply(): JQuerySupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQuerySupport]
  }
  
  @scala.inline
  implicit class JQuerySupportOps[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    
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
    def setAjax(value: Boolean): Self = this.set("ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    
    @scala.inline
    def setBoxModel(value: Boolean): Self = this.set("boxModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxModel: Self = this.set("boxModel", js.undefined)
    
    @scala.inline
    def setChangeBubbles(value: Boolean): Self = this.set("changeBubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeBubbles: Self = this.set("changeBubbles", js.undefined)
    
    @scala.inline
    def setCheckClone(value: Boolean): Self = this.set("checkClone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckClone: Self = this.set("checkClone", js.undefined)
    
    @scala.inline
    def setCheckOn(value: Boolean): Self = this.set("checkOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckOn: Self = this.set("checkOn", js.undefined)
    
    @scala.inline
    def setCors(value: Boolean): Self = this.set("cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    
    @scala.inline
    def setCssFloat(value: Boolean): Self = this.set("cssFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssFloat: Self = this.set("cssFloat", js.undefined)
    
    @scala.inline
    def setHrefNormalized(value: Boolean): Self = this.set("hrefNormalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHrefNormalized: Self = this.set("hrefNormalized", js.undefined)
    
    @scala.inline
    def setHtmlSerialize(value: Boolean): Self = this.set("htmlSerialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlSerialize: Self = this.set("htmlSerialize", js.undefined)
    
    @scala.inline
    def setLeadingWhitespace(value: Boolean): Self = this.set("leadingWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingWhitespace: Self = this.set("leadingWhitespace", js.undefined)
    
    @scala.inline
    def setNoCloneChecked(value: Boolean): Self = this.set("noCloneChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCloneChecked: Self = this.set("noCloneChecked", js.undefined)
    
    @scala.inline
    def setNoCloneEvent(value: Boolean): Self = this.set("noCloneEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCloneEvent: Self = this.set("noCloneEvent", js.undefined)
    
    @scala.inline
    def setOpacity(value: Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOptDisabled(value: Boolean): Self = this.set("optDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptDisabled: Self = this.set("optDisabled", js.undefined)
    
    @scala.inline
    def setOptSelected(value: Boolean): Self = this.set("optSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptSelected: Self = this.set("optSelected", js.undefined)
    
    @scala.inline
    def setScriptEval(value: () => Boolean): Self = this.set("scriptEval", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteScriptEval: Self = this.set("scriptEval", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubmitBubbles(value: Boolean): Self = this.set("submitBubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitBubbles: Self = this.set("submitBubbles", js.undefined)
    
    @scala.inline
    def setTbody(value: Boolean): Self = this.set("tbody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTbody: Self = this.set("tbody", js.undefined)
  }
}
