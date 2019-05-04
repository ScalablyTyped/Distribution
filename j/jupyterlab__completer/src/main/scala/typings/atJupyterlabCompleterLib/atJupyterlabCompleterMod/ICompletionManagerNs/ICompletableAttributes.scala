package typings
package atJupyterlabCompleterLib.atJupyterlabCompleterMod.ICompletionManagerNs

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
  var connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
    atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IReply, 
    scala.Unit, 
    atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IRequest
  ]
  /**
    * The host editor for the completer.
    */
  var editor: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | scala.Null
}

object ICompletableAttributes {
  @scala.inline
  def apply(
    connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IReply, 
      scala.Unit, 
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IRequest
    ],
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = null
  ): ICompletableAttributes = {
    val __obj = js.Dynamic.literal(connector = connector)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    __obj.asInstanceOf[ICompletableAttributes]
  }
}

