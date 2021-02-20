package typings.jupyterlabObservables

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON.IChangedArgs
import typings.jupyterlabObservables.observablejsonMod.ObservableJSON.IOptions
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablemapMod.ObservableMap
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoMessaging.mod.Message
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablejsonMod {
  
  @JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON")
  @js.native
  /**
    * Construct a new observable JSON object.
    */
  class ObservableJSON () extends ObservableMap[ReadonlyPartialJSONValue] {
    def this(options: IOptions) = this()
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): PartialJSONObject = js.native
  }
  object ObservableJSON {
    
    /**
      * An observable JSON change message.
      */
    @JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON.ChangeMessage")
    @js.native
    class ChangeMessage protected () extends Message {
      /**
        * Create a new metadata changed message.
        */
      def this(`type`: String, args: IChangedArgs) = this()
      
      /**
        * The arguments of the change.
        */
      val args: IChangedArgs = js.native
    }
    
    /**
      * The options use to initialize an observable JSON object.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The optional initial value for the object.
        */
      var values: js.UndefOr[JSONObject] = js.native
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
        def setValues(value: JSONObject): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      }
    }
  }
  
  @js.native
  trait IObservableJSON
    extends IObservableMap[js.UndefOr[ReadonlyPartialJSONValue]] {
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): PartialJSONObject = js.native
  }
  object IObservableJSON {
    
    @scala.inline
    def apply(
      changed: ISignal[
          IObservableJSON, 
          typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs[js.UndefOr[ReadonlyPartialJSONValue]]
        ],
      clear: () => Unit,
      delete: String => js.UndefOr[js.UndefOr[ReadonlyPartialJSONValue]],
      dispose: () => Unit,
      get: String => js.UndefOr[js.UndefOr[ReadonlyPartialJSONValue]],
      has: String => Boolean,
      isDisposed: Boolean,
      keys: () => js.Array[String],
      set: (String, js.UndefOr[ReadonlyPartialJSONValue]) => js.UndefOr[js.UndefOr[ReadonlyPartialJSONValue]],
      size: Double,
      toJSON: () => PartialJSONObject,
      `type`: Map,
      values: () => js.Array[js.UndefOr[ReadonlyPartialJSONValue]]
    ): IObservableJSON = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), values = js.Any.fromFunction0(values))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableJSON]
    }
    
    /**
      * A type alias for observable JSON changed args.
      */
    type IChangedArgs = typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs[ReadonlyPartialJSONValue]
    
    @scala.inline
    implicit class IObservableJSONMutableBuilder[Self <: IObservableJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToJSON(value: () => PartialJSONObject): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
