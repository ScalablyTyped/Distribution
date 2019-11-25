package typings.atJupyterlabCompleter.libTokensMod.ICompletionManager

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typings.atJupyterlabCoreutils.libInterfacesMod.IDataConnector
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for completer-compatible objects.
  */
trait ICompletable extends ICompletableAttributes {
  /**
    * The parent of the completer; the completer resources dispose with parent.
    */
  val parent: Widget
}

object ICompletable {
  @scala.inline
  def apply(connector: IDataConnector[IReply, Unit, IRequest], parent: Widget, editor: IEditor = null): ICompletable = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletable]
  }
}

