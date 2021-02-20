package typings.jupyterlabDocregistry

import typings.jupyterlabDocregistry.anon.PartialIFileType
import typings.jupyterlabDocregistry.contextMod.Context.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/docregistry", "ABCWidgetFactory")
  @js.native
  abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
    extends typings.jupyterlabDocregistry.defaultMod.ABCWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "Base64ModelFactory")
  @js.native
  class Base64ModelFactory ()
    extends typings.jupyterlabDocregistry.defaultMod.Base64ModelFactory
  
  @JSImport("@jupyterlab/docregistry", "Context")
  @js.native
  class Context[T /* <: IModel */] protected ()
    extends typings.jupyterlabDocregistry.contextMod.Context[T] {
    /**
      * Construct a new document context.
      */
    def this(options: IOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "DocumentModel")
  @js.native
  /**
    * Construct a new document model.
    */
  class DocumentModel ()
    extends typings.jupyterlabDocregistry.defaultMod.DocumentModel {
    def this(languagePreference: String) = this()
    def this(languagePreference: js.UndefOr[scala.Nothing], modelDB: IModelDB) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "DocumentRegistry")
  @js.native
  /**
    * Construct a new document registry.
    */
  class DocumentRegistry ()
    extends typings.jupyterlabDocregistry.registryMod.DocumentRegistry {
    def this(options: typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IOptions) = this()
  }
  object DocumentRegistry {
    
    /**
      * The default directory file type used by the document registry.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.defaultDirectoryFileType")
    @js.native
    val defaultDirectoryFileType: IFileType = js.native
    
    /**
      * The default file types used by the document registry.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.defaultFileTypes")
    @js.native
    val defaultFileTypes: js.Array[PartialIFileType] = js.native
    
    /**
      * The default notebook file type used by the document registry.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.defaultNotebookFileType")
    @js.native
    val defaultNotebookFileType: IFileType = js.native
    
    /**
      * The default text file type used by the document registry.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.defaultTextFileType")
    @js.native
    val defaultTextFileType: IFileType = js.native
    
    /**
      * The defaults used for a file type.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.fileTypeDefaults")
    @js.native
    val fileTypeDefaults: IFileType = js.native
  }
  
  @JSImport("@jupyterlab/docregistry", "DocumentWidget")
  @js.native
  class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected ()
    extends typings.jupyterlabDocregistry.defaultMod.DocumentWidget[T, U] {
    def this(options: typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions[T, U]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "MimeContent")
  @js.native
  class MimeContent protected ()
    extends typings.jupyterlabDocregistry.mimedocumentMod.MimeContent {
    /**
      * Construct a new widget.
      */
    def this(options: typings.jupyterlabDocregistry.mimedocumentMod.MimeContent.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "MimeDocument")
  @js.native
  class MimeDocument protected ()
    extends typings.jupyterlabDocregistry.mimedocumentMod.MimeDocument {
    def this(options: typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions[typings.jupyterlabDocregistry.mimedocumentMod.MimeContent, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "MimeDocumentFactory")
  @js.native
  class MimeDocumentFactory protected ()
    extends typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[typings.jupyterlabDocregistry.mimedocumentMod.MimeDocument]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "TextModelFactory")
  @js.native
  class TextModelFactory ()
    extends typings.jupyterlabDocregistry.defaultMod.TextModelFactory
}
