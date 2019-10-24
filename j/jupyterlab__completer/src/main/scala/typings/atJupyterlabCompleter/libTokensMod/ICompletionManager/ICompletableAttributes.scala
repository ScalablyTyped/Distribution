package typings.atJupyterlabCompleter.libTokensMod.ICompletionManager

import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typings.atJupyterlabCoreutils.libInterfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes of a completable object that can change and sync at runtime.
  */
trait ICompletableAttributes extends js.Object {
  /**
    * The data connector used to populate the completer.
    */
  var connector: IDataConnector[IReply, Unit, IRequest]
  /**
    * The host editor for the completer.
    */
  var editor: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | Null
}

object ICompletableAttributes {
  @scala.inline
  def apply(
    connector: IDataConnector[IReply, Unit, IRequest],
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = null
  ): ICompletableAttributes = {
    val __obj = js.Dynamic.literal(connector = connector)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    __obj.asInstanceOf[ICompletableAttributes]
  }
}

