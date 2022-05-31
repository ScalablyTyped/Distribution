package typings.jupyterlabNotebook

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typings.jupyterlabNotebook.modelfactoryMod.NotebookModelFactory.IOptions
import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelfactoryMod {
  
  @JSImport("@jupyterlab/notebook/lib/modelfactory", "NotebookModelFactory")
  @js.native
  class NotebookModelFactory protected ()
    extends StObject
       with IModelFactory[INotebookModel] {
    /**
      * Construct a new notebook model factory.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _disposed: js.Any = js.native
    
    /**
      * The content model factory used by the NotebookModelFactory.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * The content type of the file.
      */
    @JSName("contentType")
    def contentType_MNotebookModelFactory: ContentType = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The format of the file.
      */
    @JSName("fileFormat")
    def fileFormat_MNotebookModelFactory: FileFormat = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Get whether the model factory has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MNotebookModelFactory: Boolean = js.native
    
    /**
      * The name of the model.
      */
    @JSName("name")
    def name_MNotebookModelFactory: String = js.native
  }
  object NotebookModelFactory {
    
    /**
      * The options used to initialize a NotebookModelFactory.
      */
    trait IOptions extends StObject {
      
      /**
        * The factory for code cell content.
        */
      var codeCellContentFactory: js.UndefOr[typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory] = js.undefined
      
      /**
        * The content factory used by the NotebookModelFactory.  If
        * given, it will supersede the `codeCellContentFactory`.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCodeCellContentFactory(value: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = StObject.set(x, "codeCellContentFactory", value.asInstanceOf[js.Any])
        
        inline def setCodeCellContentFactoryUndefined: Self = StObject.set(x, "codeCellContentFactory", js.undefined)
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
      }
    }
  }
}
