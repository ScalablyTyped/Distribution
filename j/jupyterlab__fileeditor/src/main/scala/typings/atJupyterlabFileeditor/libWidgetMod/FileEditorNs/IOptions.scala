package typings.atJupyterlabFileeditor.libWidgetMod.FileEditorNs

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.Factory
import typings.atJupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.CodeContext
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
  var context: CodeContext
  /**
    * A code editor factory.
    */
  var factory: Factory
  /**
    * The mime type service for the editor.
    */
  var mimeTypeService: IEditorMimeTypeService
}

object IOptions {
  @scala.inline
  def apply(context: CodeContext, factory: Factory, mimeTypeService: IEditorMimeTypeService): IOptions = {
    val __obj = js.Dynamic.literal(context = context, factory = factory, mimeTypeService = mimeTypeService)
  
    __obj.asInstanceOf[IOptions]
  }
}

