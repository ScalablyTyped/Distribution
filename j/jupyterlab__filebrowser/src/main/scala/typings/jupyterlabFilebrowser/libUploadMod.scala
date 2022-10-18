package typings.jupyterlabFilebrowser

import typings.jupyterlabApputils.mod.ToolbarButton
import typings.jupyterlabFilebrowser.libModelMod.FileBrowserModel
import typings.jupyterlabFilebrowser.libUploadMod.Uploader.IOptions
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUploadMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/upload", "Uploader")
  @js.native
  open class Uploader protected () extends ToolbarButton {
    /**
      * Construct a new file browser buttons widget.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _input: Any = js.native
    
    /**
      * The 'change' handler for the input field.
      */
    /* private */ var _onInputChanged: Any = js.native
    
    /**
      * The 'click' handler for the input field.
      */
    /* private */ var _onInputClicked: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /**
      * The underlying file browser fileBrowserModel for the widget.
      *
      * This cannot be named model as that conflicts with the model property of VDomRenderer.
      */
    val fileBrowserModel: FileBrowserModel = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object Uploader {
    
    /**
      * The options used to create an uploader.
      */
    trait IOptions extends StObject {
      
      /**
        * A file browser fileBrowserModel instance.
        */
      var model: FileBrowserModel
      
      /**
        * The language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(model: FileBrowserModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setModel(value: FileBrowserModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
