package typings.jupyterlabMainmenu.viewMod.IViewMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a text editor viewer to register
  * itself with the text editor extension points.
  */
trait IEditorViewer[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * Whether line numbers are toggled.
    */
  var lineNumbersToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
  /**
    * Whether match brackets is toggled.
    */
  var matchBracketsToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
  /**
    * Whether to show line numbers in the editor.
    */
  var toggleLineNumbers: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * Whether to match brackets in the editor.
    */
  var toggleMatchBrackets: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * Whether to word-wrap the editor.
    */
  var toggleWordWrap: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * Whether word wrap is toggled.
    */
  var wordWrapToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
}

object IEditorViewer {
  @scala.inline
  def apply[T /* <: Widget */](
    tracker: IWidgetTracker[T],
    isEnabled: T => Boolean = null,
    lineNumbersToggled: /* widget */ T => Boolean = null,
    matchBracketsToggled: /* widget */ T => Boolean = null,
    toggleLineNumbers: /* widget */ T => Unit = null,
    toggleMatchBrackets: /* widget */ T => Unit = null,
    toggleWordWrap: /* widget */ T => Unit = null,
    wordWrapToggled: /* widget */ T => Boolean = null
  ): IEditorViewer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    if (lineNumbersToggled != null) __obj.updateDynamic("lineNumbersToggled")(js.Any.fromFunction1(lineNumbersToggled))
    if (matchBracketsToggled != null) __obj.updateDynamic("matchBracketsToggled")(js.Any.fromFunction1(matchBracketsToggled))
    if (toggleLineNumbers != null) __obj.updateDynamic("toggleLineNumbers")(js.Any.fromFunction1(toggleLineNumbers))
    if (toggleMatchBrackets != null) __obj.updateDynamic("toggleMatchBrackets")(js.Any.fromFunction1(toggleMatchBrackets))
    if (toggleWordWrap != null) __obj.updateDynamic("toggleWordWrap")(js.Any.fromFunction1(toggleWordWrap))
    if (wordWrapToggled != null) __obj.updateDynamic("wordWrapToggled")(js.Any.fromFunction1(wordWrapToggled))
    __obj.asInstanceOf[IEditorViewer[T]]
  }
}

