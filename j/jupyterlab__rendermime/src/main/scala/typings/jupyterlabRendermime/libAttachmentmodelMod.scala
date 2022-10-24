package typings.jupyterlabRendermime

import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.typesJsonMod.PartialJSONObject
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAttachmentmodelMod {
  
  @JSImport("@jupyterlab/rendermime/lib/attachmentmodel", "AttachmentModel")
  @js.native
  open class AttachmentModel protected ()
    extends StObject
       with IAttachmentModel {
    /**
      * Construct a new attachment model.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _raw: Any = js.native
    
    /* private */ var _rawData: Any = js.native
    
    /**
      * Update an observable JSON object using a readonly JSON object.
      */
    /* private */ var _updateObservable: Any = js.native
    
    /**
      * A signal emitted when the attachment model changes.
      */
    /* CompleteClass */
    override val changed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the attachment model changes.
      */
    @JSName("changed")
    def changed_MAttachmentModel: ISignal[this.type, Unit] = js.native
    
    /**
      * The data associated with the model.
      */
    /* CompleteClass */
    override val data: ReadonlyPartialJSONObject = js.native
    /**
      * The data associated with the model.
      */
    @JSName("data")
    def data_MAttachmentModel: ReadonlyPartialJSONObject = js.native
    
    /**
      * Dispose of the resources used by the attachment model.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
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
    def metadata_MAttachmentModel: ReadonlyPartialJSONObject = js.native
    
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
      * Serialize the model to JSON.
      */
    /* CompleteClass */
    override def toJSON(): IMimeBundle = js.native
    
    /**
      * Whether the data in the model is trusted.
      */
    /* CompleteClass */
    override val trusted: Boolean = js.native
  }
  object AttachmentModel {
    
    @JSImport("@jupyterlab/rendermime/lib/attachmentmodel", "AttachmentModel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the data for an attachment.
      *
      * @params bundle - A kernel attachment MIME bundle.
      *
      * @returns - The data for the payload.
      */
    inline def getData(bundle: IMimeBundle): PartialJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(bundle.asInstanceOf[js.Any]).asInstanceOf[PartialJSONObject]
  }
  
  trait IAttachmentModel
    extends StObject
       with IMimeModel {
    
    /**
      * A signal emitted when the attachment model changes.
      */
    val changed: ISignal[this.type, Unit]
    
    /**
      * Dispose of the resources used by the attachment model.
      */
    def dispose(): Unit
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): IMimeBundle
  }
  object IAttachmentModel {
    
    inline def apply(
      changed: ISignal[IAttachmentModel, Unit],
      data: ReadonlyPartialJSONObject,
      dispose: () => Unit,
      metadata: ReadonlyPartialJSONObject,
      setData: ISetDataOptions => Unit,
      toJSON: () => IMimeBundle,
      trusted: Boolean
    ): IAttachmentModel = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttachmentModel]
    }
    
    /**
      * The options used to create a notebook attachment model.
      */
    trait IOptions extends StObject {
      
      /**
        * The raw attachment value.
        */
      var value: IMimeBundle
    }
    object IOptions {
      
      inline def apply(value: IMimeBundle): IOptions = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setValue(value: IMimeBundle): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: IAttachmentModel](x: Self) {
      
      inline def setChanged(value: ISignal[IAttachmentModel, Unit]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setToJSON(value: () => IMimeBundle): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
