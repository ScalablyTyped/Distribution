package typings.atJupyterlabObservables

import typings.atJupyterlabObservables.libModeldbMod.ModelDB.ICreateOptions
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON.IChangedArgs
import typings.atJupyterlabObservables.libObservablejsonMod.ObservableJSON.IOptions
import typings.atJupyterlabObservables.libUndoablelistMod.ISerializer
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables", JSImport.Namespace)
@js.native
object atJupyterlabObservablesMod extends js.Object {
  @js.native
  /**
    * Constructor for the `ModelDB`.
    */
  class ModelDB ()
    extends typings.atJupyterlabObservables.libModeldbMod.ModelDB {
    def this(options: ICreateOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new observable JSON object.
    */
  class ObservableJSON ()
    extends typings.atJupyterlabObservables.libObservablejsonMod.ObservableJSON {
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new observable map.
    */
  class ObservableList[T] ()
    extends typings.atJupyterlabObservables.libObservablelistMod.ObservableList[T] {
    def this(options: typings.atJupyterlabObservables.libObservablelistMod.ObservableList.IOptions[T]) = this()
  }
  
  @js.native
  /**
    * Construct a new observable map.
    */
  class ObservableMap[T] ()
    extends typings.atJupyterlabObservables.libObservablemapMod.ObservableMap[T] {
    def this(options: typings.atJupyterlabObservables.libObservablemapMod.ObservableMap.IOptions[T]) = this()
  }
  
  @js.native
  /**
    * Construct a new observable string.
    */
  class ObservableString ()
    extends typings.atJupyterlabObservables.libObservablestringMod.ObservableString {
    def this(initialText: String) = this()
  }
  
  @js.native
  class ObservableUndoableList[T] protected ()
    extends typings.atJupyterlabObservables.libUndoablelistMod.ObservableUndoableList[T] {
    /**
      * Construct a new undoable observable list.
      */
    def this(serializer: ISerializer[T]) = this()
  }
  
  @js.native
  /**
    * Constructor for the value.
    *
    * @param initialValue: the starting value for the `ObservableValue`.
    */
  class ObservableValue ()
    extends typings.atJupyterlabObservables.libModeldbMod.ObservableValue {
    def this(initialValue: JSONValue) = this()
  }
  
  @js.native
  object ObservableJSON extends js.Object {
    /**
      * An observable JSON change message.
      */
    @js.native
    class ChangeMessage protected ()
      extends typings.atJupyterlabObservables.libObservablejsonMod.ObservableJSON.ChangeMessage {
      /**
        * Create a new metadata changed message.
        */
      def this(`type`: String, args: IChangedArgs) = this()
    }
    
  }
  
  @js.native
  object ObservableUndoableList extends js.Object {
    /**
      * A default, identity serializer.
      */
    @js.native
    class IdentitySerializer[T /* <: JSONValue */] ()
      extends typings.atJupyterlabObservables.libUndoablelistMod.ObservableUndoableList.IdentitySerializer[T]
    
  }
  
  @js.native
  object ObservableValue extends js.Object {
    /**
      * The changed args object emitted by the `IObservableValue`.
      */
    @js.native
    class IChangedArgs ()
      extends typings.atJupyterlabObservables.libModeldbMod.ObservableValue.IChangedArgs
    
  }
  
}

