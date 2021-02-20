package typings.jupyterlabRendermime

import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachmentmodelMod {
  
  @JSImport("@jupyterlab/rendermime/lib/attachmentmodel", "AttachmentModel")
  @js.native
  class AttachmentModel protected () extends IAttachmentModel {
    /**
      * Construct a new attachment model.
      */
    def this(options: IOptions) = this()
    
    var _changed: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var _raw: js.Any = js.native
    
    var _rawData: js.Any = js.native
    
    /**
      * Update an observable JSON object using a readonly JSON object.
      */
    var _updateObservable: js.Any = js.native
    
    /**
      * A signal emitted when the attachment model changes.
      */
    @JSName("changed")
    def changed_MAttachmentModel: ISignal[this.type, Unit] = js.native
    
    /**
      * The data associated with the model.
      */
    @JSName("data")
    def data_MAttachmentModel: ReadonlyPartialJSONObject = js.native
    
    /**
      * The metadata associated with the model.
      */
    @JSName("metadata")
    def metadata_MAttachmentModel: ReadonlyPartialJSONObject = js.native
  }
  object AttachmentModel {
    
    /**
      * Get the data for an attachment.
      *
      * @params bundle - A kernel attachment MIME bundle.
      *
      * @returns - The data for the payload.
      */
    @JSImport("@jupyterlab/rendermime/lib/attachmentmodel", "AttachmentModel.getData")
    @js.native
    def getData(bundle: IMimeBundle): PartialJSONObject = js.native
  }
  
  @js.native
  trait IAttachmentModel extends IMimeModel {
    
    /**
      * A signal emitted when the attachment model changes.
      */
    val changed: ISignal[this.type, Unit] = js.native
    
    /**
      * Dispose of the resources used by the attachment model.
      */
    def dispose(): Unit = js.native
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): IMimeBundle = js.native
  }
  object IAttachmentModel {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IAttachmentModelMutableBuilder[Self <: IAttachmentModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanged(value: ISignal[IAttachmentModel, Unit]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: () => IMimeBundle): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
    
    /**
      * The options used to create a notebook attachment model.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The raw attachment value.
        */
      var value: IMimeBundle = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(value: IMimeBundle): IOptions = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValue(value: IMimeBundle): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
