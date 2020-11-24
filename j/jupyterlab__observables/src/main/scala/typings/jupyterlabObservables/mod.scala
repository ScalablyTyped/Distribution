package typings.jupyterlabObservables

import typings.jupyterlabObservables.modeldbMod.ModelDB.ICreateOptions
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON.IChangedArgs
import typings.jupyterlabObservables.observablejsonMod.ObservableJSON.IOptions
import typings.jupyterlabObservables.undoablelistMod.ISerializer
import typings.luminoCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/observables", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Constructor for the `ModelDB`.
    */
  class ModelDB ()
    extends typings.jupyterlabObservables.modeldbMod.ModelDB {
    def this(options: ICreateOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new observable JSON object.
    */
  class ObservableJSON ()
    extends typings.jupyterlabObservables.observablejsonMod.ObservableJSON {
    def this(options: IOptions) = this()
  }
  @js.native
  object ObservableJSON extends js.Object {
    
    /**
      * An observable JSON change message.
      */
    @js.native
    class ChangeMessage protected ()
      extends typings.jupyterlabObservables.observablejsonMod.ObservableJSON.ChangeMessage {
      /**
        * Create a new metadata changed message.
        */
      def this(`type`: String, args: IChangedArgs) = this()
    }
  }
  
  @js.native
  /**
    * Construct a new observable map.
    */
  class ObservableList[T] ()
    extends typings.jupyterlabObservables.observablelistMod.ObservableList[T] {
    def this(options: typings.jupyterlabObservables.observablelistMod.ObservableList.IOptions[T]) = this()
  }
  
  @js.native
  /**
    * Construct a new observable map.
    */
  class ObservableMap[T] ()
    extends typings.jupyterlabObservables.observablemapMod.ObservableMap[T] {
    def this(options: typings.jupyterlabObservables.observablemapMod.ObservableMap.IOptions[T]) = this()
  }
  
  @js.native
  /**
    * Construct a new observable string.
    */
  class ObservableString ()
    extends typings.jupyterlabObservables.observablestringMod.ObservableString {
    def this(initialText: String) = this()
  }
  
  @js.native
  class ObservableUndoableList[T] protected ()
    extends typings.jupyterlabObservables.undoablelistMod.ObservableUndoableList[T] {
    /**
      * Construct a new undoable observable list.
      */
    def this(serializer: ISerializer[T]) = this()
  }
  @js.native
  object ObservableUndoableList extends js.Object {
    
    /**
      * A default, identity serializer.
      */
    @js.native
    class IdentitySerializer[T /* <: JSONValue */] ()
      extends typings.jupyterlabObservables.undoablelistMod.ObservableUndoableList.IdentitySerializer[T]
  }
  
  @js.native
  /**
    * Constructor for the value.
    *
    * @param initialValue: the starting value for the `ObservableValue`.
    */
  class ObservableValue ()
    extends typings.jupyterlabObservables.modeldbMod.ObservableValue {
    def this(initialValue: JSONValue) = this()
  }
  @js.native
  object ObservableValue extends js.Object {
    
    /**
      * The changed args object emitted by the `IObservableValue`.
      */
    @js.native
    class IChangedArgs ()
      extends typings.jupyterlabObservables.modeldbMod.ObservableValue.IChangedArgs
  }
}
