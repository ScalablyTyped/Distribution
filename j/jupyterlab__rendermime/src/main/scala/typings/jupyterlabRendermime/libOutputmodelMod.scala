package typings.jupyterlabRendermime

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermime.libOutputmodelMod.IOutputModel.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.typesJsonMod.PartialJSONObject
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOutputmodelMod {
  
  @JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
  @js.native
  open class OutputModel protected ()
    extends StObject
       with IOutputModel {
    /**
      * Construct a new output model.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _metadata: Any = js.native
    
    /* private */ var _raw: Any = js.native
    
    /* private */ var _rawData: Any = js.native
    
    /* private */ var _rawMetadata: Any = js.native
    
    /**
      * Update an observable JSON object using a readonly JSON object.
      */
    /* private */ var _updateObservable: Any = js.native
    
    /**
      * A signal emitted when the output model changes.
      */
    /* CompleteClass */
    override val changed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the output model changes.
      */
    @JSName("changed")
    def changed_MOutputModel: ISignal[this.type, Unit] = js.native
    
    /**
      * The data associated with the model.
      */
    /* CompleteClass */
    override val data: ReadonlyPartialJSONObject = js.native
    /**
      * The data associated with the model.
      */
    @JSName("data")
    def data_MOutputModel: ReadonlyPartialJSONObject = js.native
    
    /**
      * Dispose of the resources used by the output model.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The execution count of the model.
      */
    /* CompleteClass */
    override val executionCount: ExecutionCount = js.native
    
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
    def metadata_MOutputModel: ReadonlyPartialJSONObject = js.native
    
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
    override def toJSON(): IOutput = js.native
    
    /**
      * Whether the data in the model is trusted.
      */
    /* CompleteClass */
    override val trusted: Boolean = js.native
    
    /**
      * The output type.
      */
    /* CompleteClass */
    override val `type`: String = js.native
  }
  object OutputModel {
    
    @JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the data for an output.
      *
      * @params output - A kernel output message payload.
      *
      * @returns - The data for the payload.
      */
    inline def getData(output: IOutput): PartialJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(output.asInstanceOf[js.Any]).asInstanceOf[PartialJSONObject]
    
    /**
      * Get the metadata from an output message.
      *
      * @params output - A kernel output message payload.
      *
      * @returns - The metadata for the payload.
      */
    inline def getMetadata(output: IOutput): PartialJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(output.asInstanceOf[js.Any]).asInstanceOf[PartialJSONObject]
  }
  
  trait IOutputModel
    extends StObject
       with IMimeModel {
    
    /**
      * A signal emitted when the output model changes.
      */
    val changed: ISignal[this.type, Unit]
    
    /**
      * Dispose of the resources used by the output model.
      */
    def dispose(): Unit
    
    /**
      * The execution count of the model.
      */
    val executionCount: ExecutionCount
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): IOutput
    
    /**
      * The output type.
      */
    val `type`: String
  }
  object IOutputModel {
    
    inline def apply(
      changed: ISignal[IOutputModel, Unit],
      data: ReadonlyPartialJSONObject,
      dispose: () => Unit,
      metadata: ReadonlyPartialJSONObject,
      setData: ISetDataOptions => Unit,
      toJSON: () => IOutput,
      trusted: Boolean,
      `type`: String
    ): IOutputModel = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], executionCount = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOutputModel]
    }
    
    /**
      * The options used to create a notebook output model.
      */
    trait IOptions extends StObject {
      
      /**
        * Whether the output is trusted.  The default is false.
        */
      var trusted: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The raw output value.
        */
      var value: IOutput
    }
    object IOptions {
      
      inline def apply(value: IOutput): IOptions = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
        
        inline def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
        
        inline def setValue(value: IOutput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: IOutputModel](x: Self) {
      
      inline def setChanged(value: ISignal[IOutputModel, Unit]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setExecutionCount(value: ExecutionCount): Self = StObject.set(x, "executionCount", value.asInstanceOf[js.Any])
      
      inline def setExecutionCountNull: Self = StObject.set(x, "executionCount", null)
      
      inline def setToJSON(value: () => IOutput): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
