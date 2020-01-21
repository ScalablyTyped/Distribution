package typings.jupyterlabDocregistry

import typings.jupyterlabDocregistry.contextMod.Context.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.phosphorWidgets.mod.Widget
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
    extends typings.jupyterlabDocregistry.defaultMod.ABCWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
  }
  
  @js.native
  class Base64ModelFactory ()
    extends typings.jupyterlabDocregistry.defaultMod.Base64ModelFactory
  
  @js.native
  class Context[T /* <: IModel */] protected ()
    extends typings.jupyterlabDocregistry.contextMod.Context[T] {
    /**
      * Construct a new document context.
      */
    def this(options: IOptions[T]) = this()
  }
  
  @js.native
  /**
    * Construct a new document model.
    */
  class DocumentModel ()
    extends typings.jupyterlabDocregistry.defaultMod.DocumentModel {
    def this(languagePreference: String) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
  }
  
  @js.native
  /**
    * Construct a new document registry.
    */
  class DocumentRegistry ()
    extends typings.jupyterlabDocregistry.registryMod.DocumentRegistry {
    def this(options: typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IOptions) = this()
  }
  
  @js.native
  class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected ()
    extends typings.jupyterlabDocregistry.defaultMod.DocumentWidget[T, U] {
    def this(options: typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions[T, U]) = this()
  }
  
  @js.native
  class MimeContent protected ()
    extends typings.jupyterlabDocregistry.mimedocumentMod.MimeContent {
    /**
      * Construct a new widget.
      */
    def this(options: typings.jupyterlabDocregistry.mimedocumentMod.MimeContent.IOptions) = this()
  }
  
  @js.native
  class MimeDocument ()
    extends typings.jupyterlabDocregistry.mimedocumentMod.MimeDocument
  
  @js.native
  class MimeDocumentFactory protected ()
    extends typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[typings.jupyterlabDocregistry.mimedocumentMod.MimeDocument]) = this()
  }
  
  @js.native
  class TextModelFactory ()
    extends typings.jupyterlabDocregistry.defaultMod.TextModelFactory
  
  @js.native
  object DocumentRegistry extends js.Object {
    /**
      * The default directory file type used by the document registry.
      */
    val defaultDirectoryFileType: IFileType = js.native
    /**
      * The default file types used by the document registry.
      */
    val defaultFileTypes: js.Array[Partial[IFileType]] = js.native
    /**
      * The default notebook file type used by the document registry.
      */
    val defaultNotebookFileType: IFileType = js.native
    /**
      * The default text file type used by the document registry.
      */
    val defaultTextFileType: IFileType = js.native
    /**
      * The defaults used for a file type.
      */
    val fileTypeDefaults: IFileType = js.native
  }
  
}

