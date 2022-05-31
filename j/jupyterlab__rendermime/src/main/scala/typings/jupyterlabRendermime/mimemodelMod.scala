package typings.jupyterlabRendermime

import typings.jupyterlabRendermime.mimemodelMod.MimeModel.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimemodelMod {
  
  @JSImport("@jupyterlab/rendermime/lib/mimemodel", "MimeModel")
  @js.native
  /**
    * Construct a new mime model.
    */
  class MimeModel ()
    extends StObject
       with IMimeModel {
    def this(options: IOptions) = this()
    
    /* private */ var _callback: js.Any = js.native
    
    /* private */ var _data: js.Any = js.native
    
    /* private */ var _metadata: js.Any = js.native
    
    /**
      * The data associated with the model.
      */
    /* CompleteClass */
    override val data: ReadonlyPartialJSONObject = js.native
    /**
      * The data associated with the model.
      */
    @JSName("data")
    def data_MMimeModel: ReadonlyPartialJSONObject = js.native
    
    /**
      * The metadata associated with the model.
      *
      * Among others, it can include an attribute named `fragment`
      * that stores a URI fragment identifier for the MIME resource.
      */
    /* CompleteClass */
    override val metadata: ReadonlyPartialJSONObject = js.native
    /**
      * The metadata associated with the model.
      */
    @JSName("metadata")
    def metadata_MMimeModel: ReadonlyPartialJSONObject = js.native
    
    /**
      * Set the data associated with the model.
      *
      * #### Notes
      * Calling this function may trigger an asynchronous operation
      * that could cause the renderer to be rendered with a new model
      * containing the new data.
      */
    /* CompleteClass */
    override def setData(options: ISetDataOptions): Unit = js.native
    
    /**
      * Whether the data in the model is trusted.
      */
    /* CompleteClass */
    override val trusted: Boolean = js.native
  }
  object MimeModel {
    
    /**
      * The options used to create a mime model.
      */
    trait IOptions extends StObject {
      
      /**
        * A callback function for when the data changes.
        */
      var callback: js.UndefOr[js.Function1[/* options */ ISetDataOptions, Unit]] = js.undefined
      
      /**
        * The initial mime data.
        */
      var data: js.UndefOr[ReadonlyPartialJSONObject] = js.undefined
      
      /**
        * The initial mime metadata.
        */
      var metadata: js.UndefOr[ReadonlyPartialJSONObject] = js.undefined
      
      /**
        * Whether the model is trusted.  Defaults to `false`.
        */
      var trusted: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCallback(value: /* options */ ISetDataOptions => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setData(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setMetadata(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
        
        inline def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
      }
    }
  }
}
