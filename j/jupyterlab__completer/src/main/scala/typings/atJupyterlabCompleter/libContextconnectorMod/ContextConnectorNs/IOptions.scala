package typings.atJupyterlabCompleter.libContextconnectorMod.ContextConnectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for cell completion handlers.
  */
trait IOptions extends js.Object {
  /**
    * The session used by the context connector.
    */
  var editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any
}

object IOptions {
  @scala.inline
  def apply(
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any
  ): IOptions = {
    val __obj = js.Dynamic.literal(editor = editor)
  
    __obj.asInstanceOf[IOptions]
  }
}

