package typings.jupyterlabMainmenu.viewMod.IViewMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a text editor viewer to register
  * itself with the text editor extension points.
  */
@js.native
trait IEditorViewer[T /* <: Widget */] extends IMenuExtender[T] {
  
  /**
    * Whether line numbers are toggled.
    */
  var lineNumbersToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
  
  /**
    * Whether match brackets is toggled.
    */
  var matchBracketsToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
  
  /**
    * Whether to show line numbers in the editor.
    */
  var toggleLineNumbers: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  
  /**
    * Whether to match brackets in the editor.
    */
  var toggleMatchBrackets: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  
  /**
    * Whether to word-wrap the editor.
    */
  var toggleWordWrap: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  
  /**
    * Whether word wrap is toggled.
    */
  var wordWrapToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
}
object IEditorViewer {
  
  @scala.inline
  def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IEditorViewer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorViewer[T]]
  }
  
  @scala.inline
  implicit class IEditorViewerOps[Self <: IEditorViewer[_], T /* <: Widget */] (val x: Self with IEditorViewer[T]) extends AnyVal {
    
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
    def setLineNumbersToggled(value: /* widget */ T => Boolean): Self = this.set("lineNumbersToggled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLineNumbersToggled: Self = this.set("lineNumbersToggled", js.undefined)
    
    @scala.inline
    def setMatchBracketsToggled(value: /* widget */ T => Boolean): Self = this.set("matchBracketsToggled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMatchBracketsToggled: Self = this.set("matchBracketsToggled", js.undefined)
    
    @scala.inline
    def setToggleLineNumbers(value: /* widget */ T => Unit): Self = this.set("toggleLineNumbers", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleLineNumbers: Self = this.set("toggleLineNumbers", js.undefined)
    
    @scala.inline
    def setToggleMatchBrackets(value: /* widget */ T => Unit): Self = this.set("toggleMatchBrackets", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleMatchBrackets: Self = this.set("toggleMatchBrackets", js.undefined)
    
    @scala.inline
    def setToggleWordWrap(value: /* widget */ T => Unit): Self = this.set("toggleWordWrap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleWordWrap: Self = this.set("toggleWordWrap", js.undefined)
    
    @scala.inline
    def setWordWrapToggled(value: /* widget */ T => Boolean): Self = this.set("wordWrapToggled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWordWrapToggled: Self = this.set("wordWrapToggled", js.undefined)
  }
}
