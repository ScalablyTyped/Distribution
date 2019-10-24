package typings.atJupyterlabFileeditor.libWidgetMod.FileEditorFactory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an editor widget factory.
  */
trait IOptions extends js.Object {
  /**
    * The editor services used by the factory.
    */
  var editorServices: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorServices */ js.Any
  /**
    * The factory options associated with the factory.
    */
  var factoryOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IWidgetFactoryOptions<IDocumentWidget<FileEditor>> */ js.Any
}

object IOptions {
  @scala.inline
  def apply(
    editorServices: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorServices */ js.Any,
    factoryOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IWidgetFactoryOptions<IDocumentWidget<FileEditor>> */ js.Any
  ): IOptions = {
    val __obj = js.Dynamic.literal(editorServices = editorServices, factoryOptions = factoryOptions)
  
    __obj.asInstanceOf[IOptions]
  }
}

