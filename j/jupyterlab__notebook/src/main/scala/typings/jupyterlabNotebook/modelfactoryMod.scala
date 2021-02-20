package typings.jupyterlabNotebook

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typings.jupyterlabNotebook.modelfactoryMod.NotebookModelFactory.IOptions
import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelfactoryMod {
  
  @JSImport("@jupyterlab/notebook/lib/modelfactory", "NotebookModelFactory")
  @js.native
  class NotebookModelFactory protected () extends IModelFactory[INotebookModel] {
    /**
      * Construct a new notebook model factory.
      */
    def this(options: IOptions) = this()
    
    var _disposed: js.Any = js.native
    
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
      * The format of the file.
      */
    @JSName("fileFormat")
    def fileFormat_MNotebookModelFactory: FileFormat = js.native
    
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The factory for code cell content.
        */
      var codeCellContentFactory: js.UndefOr[typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory] = js.native
      
      /**
        * The content factory used by the NotebookModelFactory.  If
        * given, it will supersede the `codeCellContentFactory`.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCodeCellContentFactory(value: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = StObject.set(x, "codeCellContentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCodeCellContentFactoryUndefined: Self = StObject.set(x, "codeCellContentFactory", js.undefined)
        
        @scala.inline
        def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
      }
    }
  }
}
