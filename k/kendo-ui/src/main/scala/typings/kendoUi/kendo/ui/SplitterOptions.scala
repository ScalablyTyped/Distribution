package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitterOptions extends js.Object {
  
  var collapse: js.UndefOr[js.Function1[/* e */ SplitterCollapseEvent, Unit]] = js.native
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ SplitterContentLoadEvent, Unit]] = js.native
  
  var error: js.UndefOr[js.Function1[/* e */ SplitterErrorEvent, Unit]] = js.native
  
  var expand: js.UndefOr[js.Function1[/* e */ SplitterExpandEvent, Unit]] = js.native
  
  var layoutChange: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var panes: js.UndefOr[js.Array[SplitterPane]] = js.native
  
  var resize: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.native
}
object SplitterOptions {
  
  @scala.inline
  def apply(): SplitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterOptions]
  }
  
  @scala.inline
  implicit class SplitterOptionsOps[Self <: SplitterOptions] (val x: Self) extends AnyVal {
    
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
    def setCollapse(value: /* e */ SplitterCollapseEvent => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ SplitterContentLoadEvent => Unit): Self = this.set("contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentLoad: Self = this.set("contentLoad", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ SplitterErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ SplitterExpandEvent => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setLayoutChange(value: /* e */ SplitterEvent => Unit): Self = this.set("layoutChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLayoutChange: Self = this.set("layoutChange", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPanesVarargs(value: SplitterPane*): Self = this.set("panes", js.Array(value :_*))
    
    @scala.inline
    def setPanes(value: js.Array[SplitterPane]): Self = this.set("panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanes: Self = this.set("panes", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ SplitterEvent => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
  }
}
