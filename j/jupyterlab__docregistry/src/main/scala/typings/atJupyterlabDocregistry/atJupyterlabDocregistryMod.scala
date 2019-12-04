package typings.atJupyterlabDocregistry

import typings.atJupyterlabDocregistry.libContextMod.Context.IOptions
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IFileType
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry", JSImport.Namespace)
@js.native
object atJupyterlabDocregistryMod extends js.Object {
  @js.native
  abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
    extends typings.atJupyterlabDocregistry.libDefaultMod.ABCWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
  }
  
  @js.native
  class Base64ModelFactory ()
    extends typings.atJupyterlabDocregistry.libDefaultMod.Base64ModelFactory
  
  @js.native
  class Context[T /* <: IModel */] protected ()
    extends typings.atJupyterlabDocregistry.libContextMod.Context[T] {
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
    extends typings.atJupyterlabDocregistry.libDefaultMod.DocumentModel {
    def this(languagePreference: String) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
  }
  
  @js.native
  /**
    * Construct a new document registry.
    */
  class DocumentRegistry ()
    extends typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry {
    def this(options: typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IOptions) = this()
  }
  
  @js.native
  class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected ()
    extends typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidget[T, U] {
    def this(options: typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions[T, U]) = this()
  }
  
  @js.native
  class MimeContent protected ()
    extends typings.atJupyterlabDocregistry.libMimedocumentMod.MimeContent {
    /**
      * Construct a new widget.
      */
    def this(options: typings.atJupyterlabDocregistry.libMimedocumentMod.MimeContent.IOptions) = this()
  }
  
  @js.native
  class MimeDocument ()
    extends typings.atJupyterlabDocregistry.libMimedocumentMod.MimeDocument
  
  @js.native
  class MimeDocumentFactory protected ()
    extends typings.atJupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typings.atJupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory.IOptions[typings.atJupyterlabDocregistry.libMimedocumentMod.MimeDocument]) = this()
  }
  
  @js.native
  class TextModelFactory ()
    extends typings.atJupyterlabDocregistry.libDefaultMod.TextModelFactory
  
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

