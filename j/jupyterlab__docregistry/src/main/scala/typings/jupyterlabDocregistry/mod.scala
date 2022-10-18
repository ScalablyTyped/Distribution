package typings.jupyterlabDocregistry

import typings.jupyterlabDocregistry.anon.PartialIFileType
import typings.jupyterlabDocregistry.libContextMod.Context.IOptions
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.jupyterlabObservables.libModeldbMod.IModelDB
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("@jupyterlab/docregistry", "ABCWidgetFactory")
  @js.native
  open class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
    extends typings.jupyterlabDocregistry.libDefaultMod.ABCWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "Base64ModelFactory")
  @js.native
  open class Base64ModelFactory ()
    extends typings.jupyterlabDocregistry.libDefaultMod.Base64ModelFactory
  
  @JSImport("@jupyterlab/docregistry", "Context")
  @js.native
  open class Context[T /* <: IModel */] protected ()
    extends typings.jupyterlabDocregistry.libContextMod.Context[T] {
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
  open class DocumentModel ()
    extends typings.jupyterlabDocregistry.libDefaultMod.DocumentModel {
    def this(languagePreference: String) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
    def this(languagePreference: Unit, modelDB: IModelDB) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "DocumentRegistry")
  @js.native
  /**
    * Construct a new document registry.
    */
  open class DocumentRegistry ()
    extends typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry {
    def this(options: typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IOptions) = this()
  }
  object DocumentRegistry {
    
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default directory file type used by the document registry.
      *
      * @param translator - The application language translator.
      *
      * @returns The default directory file type.
      */
    inline def getDefaultDirectoryFileType(): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDirectoryFileType")().asInstanceOf[IFileType]
    inline def getDefaultDirectoryFileType(translator: ITranslator): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDirectoryFileType")(translator.asInstanceOf[js.Any]).asInstanceOf[IFileType]
    
    /**
      * The default file types used by the document registry.
      *
      * @param translator - The application language translator.
      *
      * @returns The default directory file types.
      */
    inline def getDefaultFileTypes(): js.Array[PartialIFileType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFileTypes")().asInstanceOf[js.Array[PartialIFileType]]
    inline def getDefaultFileTypes(translator: ITranslator): js.Array[PartialIFileType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFileTypes")(translator.asInstanceOf[js.Any]).asInstanceOf[js.Array[PartialIFileType]]
    
    /**
      * The default notebook file type used by the document registry.
      *
      * @param translator - The application language translator.
      *
      * @returns The default notebook file type.
      */
    inline def getDefaultNotebookFileType(): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNotebookFileType")().asInstanceOf[IFileType]
    inline def getDefaultNotebookFileType(translator: ITranslator): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNotebookFileType")(translator.asInstanceOf[js.Any]).asInstanceOf[IFileType]
    
    /**
      * The default text file type used by the document registry.
      *
      * @param translator - The application language translator.
      *
      * @returns The default text file type.
      */
    inline def getDefaultTextFileType(): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTextFileType")().asInstanceOf[IFileType]
    inline def getDefaultTextFileType(translator: ITranslator): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTextFileType")(translator.asInstanceOf[js.Any]).asInstanceOf[IFileType]
    
    /**
      * The defaults used for a file type.
      *
      * @param translator - The application language translator.
      *
      * @returns The default file type.
      */
    inline def getFileTypeDefaults(): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileTypeDefaults")().asInstanceOf[IFileType]
    inline def getFileTypeDefaults(translator: ITranslator): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileTypeDefaults")(translator.asInstanceOf[js.Any]).asInstanceOf[IFileType]
  }
  
  @JSImport("@jupyterlab/docregistry", "DocumentWidget")
  @js.native
  open class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected ()
    extends typings.jupyterlabDocregistry.libDefaultMod.DocumentWidget[T, U] {
    def this(options: typings.jupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions[T, U]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "MimeContent")
  @js.native
  open class MimeContent protected ()
    extends typings.jupyterlabDocregistry.libMimedocumentMod.MimeContent {
    /**
      * Construct a new widget.
      */
    def this(options: typings.jupyterlabDocregistry.libMimedocumentMod.MimeContent.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "MimeDocument")
  @js.native
  open class MimeDocument protected ()
    extends typings.jupyterlabDocregistry.libMimedocumentMod.MimeDocument {
    def this(options: typings.jupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions[typings.jupyterlabDocregistry.libMimedocumentMod.MimeContent, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "MimeDocumentFactory")
  @js.native
  open class MimeDocumentFactory protected ()
    extends typings.jupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typings.jupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory.IOptions[typings.jupyterlabDocregistry.libMimedocumentMod.MimeDocument]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "TextModelFactory")
  @js.native
  open class TextModelFactory ()
    extends typings.jupyterlabDocregistry.libDefaultMod.TextModelFactory
}
