package typings.jupyterlabOutputarea

import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabObservables.observablelistMod.IObservableList
import typings.jupyterlabObservables.observablelistMod.IObservableList.IChangedArgs
import typings.jupyterlabOutputarea.anon.LastModel
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.ChangedArgs
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IContentFactory
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel")
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class OutputAreaModel ()
    extends StObject
       with IOutputAreaModel {
    def this(options: IOptions) = this()
    
    /**
      * Add a copy of the item to the list.
      */
    /* private */ var _add: js.Any = js.native
    
    /* private */ var _changed: js.Any = js.native
    
    /**
      * Create an output item and hook up its signals.
      */
    /* private */ var _createItem: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /* private */ var _lastName: js.Any = js.native
    
    /* private */ var _lastStream: js.Any = js.native
    
    /**
      * Handle a change to an item.
      */
    /* private */ var _onGenericChange: js.Any = js.native
    
    /**
      * Handle a change to the list.
      */
    /* private */ var _onListChanged: js.Any = js.native
    
    /* private */ var _stateChanged: js.Any = js.native
    
    /* private */ var _trusted: js.Any = js.native
    
    /**
      * A signal emitted when the model changes.
      */
    @JSName("changed")
    def changed_MOutputAreaModel: ISignal[this.type, ChangedArgs] = js.native
    
    /**
      * A flag that is set when we want to clear the output area
      * *after* the next addition to it.
      */
    /* protected */ var clearNext: Boolean = js.native
    
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
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the model is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MOutputAreaModel: Boolean = js.native
    
    /**
      * Get the length of the items in the model.
      */
    @JSName("length")
    def length_MOutputAreaModel: Double = js.native
    
    /**
      * An observable list containing the output models
      * for this output area.
      */
    /* protected */ var list: IObservableList[IOutputModel] = js.native
    
    /**
      * Whether a new value should be consolidated with the previous output.
      *
      * This will only be called if the minimal criteria of both being stream
      * messages of the same type.
      */
    /* protected */ def shouldCombine(options: LastModel): Boolean = js.native
    
    /**
      * A signal emitted when the model state changes.
      */
    @JSName("stateChanged")
    def stateChanged_MOutputAreaModel: ISignal[IOutputAreaModel, Unit] = js.native
    
    /**
      * Get whether the model is trusted.
      */
    @JSName("trusted")
    def trusted_MOutputAreaModel: Boolean = js.native
  }
  object OutputAreaModel {
    
    /**
      * The default implementation of a `IModelOutputFactory`.
      */
    @JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel.ContentFactory")
    @js.native
    class ContentFactory ()
      extends StObject
         with IContentFactory {
      
      /**
        * Create an output model.
        */
      /* CompleteClass */
      override def createOutputModel(options: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions): IOutputModel = js.native
    }
    
    /**
      * The default output model factory.
      */
    @JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
  }
  
  @js.native
  trait IOutputAreaModel
    extends StObject
       with IDisposable {
    
    /**
      * Add an output, which may be combined with previous output.
      *
      * @returns The total number of outputs.
      *
      * #### Notes
      * The output bundle is copied.
      * Contiguous stream outputs of the same `name` are combined.
      */
    def add(output: IOutput): Double = js.native
    
    /**
      * A signal emitted when the model changes.
      */
    val changed: ISignal[IOutputAreaModel, ChangedArgs] = js.native
    
    /**
      * Clear all of the output.
      *
      * @param wait - Delay clearing the output until the next message is added.
      */
    def clear(): Unit = js.native
    def clear(wait: Boolean): Unit = js.native
    
    /**
      * The output content factory used by the model.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * Deserialize the model from JSON.
      *
      * #### Notes
      * This will clear any existing data.
      */
    def fromJSON(values: js.Array[IOutput]): Unit = js.native
    
    /**
      * Get an item at the specified index.
      */
    def get(index: Double): IOutputModel = js.native
    
    /**
      * The length of the items in the model.
      */
    val length: Double = js.native
    
    /**
      * Set the value at the specified index.
      */
    def set(index: Double, output: IOutput): Unit = js.native
    
    /**
      * A signal emitted when the model state changes.
      */
    val stateChanged: ISignal[IOutputAreaModel, Unit] = js.native
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): js.Array[IOutput] = js.native
    
    /**
      * Whether the output area is trusted.
      */
    var trusted: Boolean = js.native
  }
  object IOutputAreaModel {
    
    /**
      * A type alias for changed args.
      */
    type ChangedArgs = IChangedArgs[IOutputModel]
    
    /**
      * The interface for an output content factory.
      */
    trait IContentFactory extends StObject {
      
      /**
        * Create an output model.
        */
      def createOutputModel(options: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions): IOutputModel
    }
    object IContentFactory {
      
      inline def apply(
        createOutputModel: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions => IOutputModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createOutputModel = js.Any.fromFunction1(createOutputModel))
        __obj.asInstanceOf[IContentFactory]
      }
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateOutputModel(value: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions => IOutputModel): Self = StObject.set(x, "createOutputModel", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to create a output area model.
      */
    trait IOptions extends StObject {
      
      /**
        * The output content factory used by the model.
        *
        * If not given, a default factory will be used.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
      
      /**
        * Whether the output is trusted.  The default is false.
        */
      var trusted: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The initial values for the model.
        */
      var values: js.UndefOr[js.Array[IOutput]] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
        
        inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
        
        inline def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
        
        inline def setValues(value: js.Array[IOutput]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        inline def setValuesVarargs(value: IOutput*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
  }
}
