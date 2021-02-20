package typings.jupyterlabRendermime

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputmodelMod {
  
  @JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
  @js.native
  class OutputModel protected () extends IOutputModel {
    /**
      * Construct a new output model.
      */
    def this(options: IOptions) = this()
    
    var _changed: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var _metadata: js.Any = js.native
    
    var _raw: js.Any = js.native
    
    var _rawData: js.Any = js.native
    
    var _rawMetadata: js.Any = js.native
    
    /**
      * Update an observable JSON object using a readonly JSON object.
      */
    var _updateObservable: js.Any = js.native
    
    /**
      * A signal emitted when the output model changes.
      */
    @JSName("changed")
    def changed_MOutputModel: ISignal[this.type, Unit] = js.native
    
    /**
      * The data associated with the model.
      */
    @JSName("data")
    def data_MOutputModel: ReadonlyPartialJSONObject = js.native
    
    /**
      * The metadata associated with the model.
      */
    @JSName("metadata")
    def metadata_MOutputModel: ReadonlyPartialJSONObject = js.native
  }
  object OutputModel {
    
    /**
      * Get the data for an output.
      *
      * @params output - A kernel output message payload.
      *
      * @returns - The data for the payload.
      */
    @JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel.getData")
    @js.native
    def getData(output: IOutput): PartialJSONObject = js.native
    
    /**
      * Get the metadata from an output message.
      *
      * @params output - A kernel output message payload.
      *
      * @returns - The metadata for the payload.
      */
    @JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel.getMetadata")
    @js.native
    def getMetadata(output: IOutput): PartialJSONObject = js.native
  }
  
  @js.native
  trait IOutputModel extends IMimeModel {
    
    /**
      * A signal emitted when the output model changes.
      */
    val changed: ISignal[this.type, Unit] = js.native
    
    /**
      * Dispose of the resources used by the output model.
      */
    def dispose(): Unit = js.native
    
    /**
      * The execution count of the model.
      */
    val executionCount: ExecutionCount = js.native
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): IOutput = js.native
    
    /**
      * The output type.
      */
    val `type`: String = js.native
  }
  object IOutputModel {
    
    @scala.inline
    def apply(
      changed: ISignal[IOutputModel, Unit],
      data: ReadonlyPartialJSONObject,
      dispose: () => Unit,
      metadata: ReadonlyPartialJSONObject,
      setData: ISetDataOptions => Unit,
      toJSON: () => IOutput,
      trusted: Boolean,
      `type`: String
    ): IOutputModel = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOutputModel]
    }
    
    /**
      * The options used to create a notebook output model.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Whether the output is trusted.  The default is false.
        */
      var trusted: js.UndefOr[Boolean] = js.native
      
      /**
        * The raw output value.
        */
      var value: IOutput = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(value: IOutput): IOptions = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
        
        @scala.inline
        def setValue(value: IOutput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class IOutputModelMutableBuilder[Self <: IOutputModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanged(value: ISignal[IOutputModel, Unit]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExecutionCount(value: ExecutionCount): Self = StObject.set(x, "executionCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionCountNull: Self = StObject.set(x, "executionCount", null)
      
      @scala.inline
      def setToJSON(value: () => IOutput): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
