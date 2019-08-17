package typings.atJupyterlabFileeditor.libWidgetMod.FileEditorFactoryNs

import typings.atJupyterlabCodeeditor.libTokensMod.IEditorServices
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IWidgetFactoryOptions
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.atJupyterlabFileeditor.libWidgetMod.FileEditor
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
    val __obj = js.Dynamic.literal(editorServices = editorServices, factoryOptions = factoryOptions)
  
    __obj.asInstanceOf[IOptions]
  }
}

