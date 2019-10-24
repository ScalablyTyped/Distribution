package typings.atJupyterlabCells.libWidgetMod.Cell.ContentFactory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the content factory.
  */
trait IOptions extends js.Object {
  /**
    * The editor factory used by the content factory.
    *
    * If this is not passed, a default CodeMirror editor factory
    * will be used.
    */
  var editorFactory: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
  ] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (editorFactory != null) __obj.updateDynamic("editorFactory")(editorFactory)
    __obj.asInstanceOf[IOptions]
  }
}

