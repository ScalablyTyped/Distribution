package typings
package atJupyterlabCompleterLib.atJupyterlabCompleterMod.ICompletionManagerNs

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
  val parent: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget
}

object ICompletable {
  @scala.inline
  def apply(
    connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IReply, 
      scala.Unit, 
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IRequest
    ],
    parent: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget,
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = null
  ): ICompletable = {
    val __obj = js.Dynamic.literal(connector = connector, parent = parent)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    __obj.asInstanceOf[ICompletable]
  }
}

