package typings.jupyterlabRendermime

import typings.jupyterlabRendermime.mimemodelMod.MimeModel.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimemodelMod {
  
  @JSImport("@jupyterlab/rendermime/lib/mimemodel", "MimeModel")
  @js.native
  /**
    * Construct a new mime model.
    */
  class MimeModel () extends IMimeModel {
    def this(options: IOptions) = this()
    
    var _callback: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var _metadata: js.Any = js.native
    
    /**
      * The data associated with the model.
      */
    @JSName("data")
    def data_MMimeModel: ReadonlyPartialJSONObject = js.native
    
    /**
      * The metadata associated with the model.
      */
    @JSName("metadata")
    def metadata_MMimeModel: ReadonlyPartialJSONObject = js.native
  }
  object MimeModel {
    
    /**
      * The options used to create a mime model.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A callback function for when the data changes.
        */
      var callback: js.UndefOr[js.Function1[/* options */ ISetDataOptions, Unit]] = js.native
      
      /**
        * The initial mime data.
        */
      var data: js.UndefOr[ReadonlyPartialJSONObject] = js.native
      
      /**
        * The initial mime metadata.
        */
      var metadata: js.UndefOr[ReadonlyPartialJSONObject] = js.native
      
      /**
        * Whether the model is trusted.  Defaults to `false`.
        */
      var trusted: js.UndefOr[Boolean] = js.native
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
        def setCallback(value: /* options */ ISetDataOptions => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        @scala.inline
        def setData(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setMetadata(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
      }
    }
  }
}
