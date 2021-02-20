package typings.jupyterlabFilebrowser

import typings.jupyterlabApputils.mod.ToolbarButton
import typings.jupyterlabFilebrowser.modelMod.FileBrowserModel
import typings.jupyterlabFilebrowser.uploadMod.Uploader.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/upload", "Uploader")
  @js.native
  class Uploader protected () extends ToolbarButton {
    /**
      * Construct a new file browser buttons widget.
      */
    def this(options: IOptions) = this()
    
    var _input: js.Any = js.native
    
    /**
      * The 'change' handler for the input field.
      */
    var _onInputChanged: js.Any = js.native
    
    /**
      * The 'click' handler for the input field.
      */
    var _onInputClicked: js.Any = js.native
    
    /**
      * The underlying file browser fileBrowserModel for the widget.
      *
      * This cannot be named model as that conflicts with the model property of VDomRenderer.
      */
    val fileBrowserModel: FileBrowserModel = js.native
  }
  object Uploader {
    
    /**
      * The options used to create an uploader.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A file browser fileBrowserModel instance.
        */
      var model: FileBrowserModel = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(model: FileBrowserModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setModel(value: FileBrowserModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      }
    }
  }
}
