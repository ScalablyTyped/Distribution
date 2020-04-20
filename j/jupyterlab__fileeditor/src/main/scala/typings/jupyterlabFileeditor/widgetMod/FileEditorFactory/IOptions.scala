package typings.jupyterlabFileeditor.widgetMod.FileEditorFactory

import typings.jupyterlabCodeeditor.tokensMod.IEditorServices
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.jupyterlabFileeditor.widgetMod.FileEditor
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
  var editorServices: IEditorServices
  /**
    * The factory options associated with the factory.
    */
  var factoryOptions: IWidgetFactoryOptions[IDocumentWidget[FileEditor, IModel]]
}

object IOptions {
  @scala.inline
  def apply(
    editorServices: IEditorServices,
    factoryOptions: IWidgetFactoryOptions[IDocumentWidget[FileEditor, IModel]]
  ): IOptions = {
    val __obj = js.Dynamic.literal(editorServices = editorServices.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

