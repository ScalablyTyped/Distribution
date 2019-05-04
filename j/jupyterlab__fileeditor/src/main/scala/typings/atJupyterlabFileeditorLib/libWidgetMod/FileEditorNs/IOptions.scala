package typings
package atJupyterlabFileeditorLib.libWidgetMod.FileEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an editor widget.
  */
trait IOptions extends js.Object {
  /**
    * The document context associated with the editor.
    */
  var context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.CodeContext
  /**
    * A code editor factory.
    */
  var factory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
  /**
    * The mime type service for the editor.
    */
  var mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
}

object IOptions {
  @scala.inline
  def apply(
    context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.CodeContext,
    factory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any,
    mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context, factory = factory, mimeTypeService = mimeTypeService)
  
    __obj.asInstanceOf[IOptions]
  }
}

