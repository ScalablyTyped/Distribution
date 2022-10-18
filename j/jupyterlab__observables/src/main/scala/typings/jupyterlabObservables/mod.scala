package typings.jupyterlabObservables

import typings.jupyterlabObservables.libModeldbMod.ModelDB.ICreateOptions
import typings.jupyterlabObservables.libObservablejsonMod.IObservableJSON.IChangedArgs
import typings.jupyterlabObservables.libObservablejsonMod.ObservableJSON.IOptions
import typings.jupyterlabObservables.libUndoablelistMod.ISerializer
import typings.luminoCoreutils.typesJsonMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/observables", "ModelDB")
  @js.native
  /**
    * Constructor for the `ModelDB`.
    */
  open class ModelDB ()
    extends typings.jupyterlabObservables.libModeldbMod.ModelDB {
    def this(options: ICreateOptions) = this()
  }
  
  @JSImport("@jupyterlab/observables", "ObservableJSON")
  @js.native
  /**
    * Construct a new observable JSON object.
    */
  open class ObservableJSON ()
    extends typings.jupyterlabObservables.libObservablejsonMod.ObservableJSON {
    def this(options: IOptions) = this()
  }
  object ObservableJSON {
    
    /**
      * An observable JSON change message.
      */
    @JSImport("@jupyterlab/observables", "ObservableJSON.ChangeMessage")
    @js.native
    open class ChangeMessage protected ()
      extends typings.jupyterlabObservables.libObservablejsonMod.ObservableJSON.ChangeMessage {
      /**
        * Create a new metadata changed message.
        */
      def this(`type`: String, args: IChangedArgs) = this()
    }
  }
  
  @JSImport("@jupyterlab/observables", "ObservableList")
  @js.native
  /**
    * Construct a new observable map.
    */
  open class ObservableList[T] ()
    extends typings.jupyterlabObservables.libObservablelistMod.ObservableList[T] {
    def this(options: typings.jupyterlabObservables.libObservablelistMod.ObservableList.IOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/observables", "ObservableMap")
  @js.native
  /**
    * Construct a new observable map.
    */
  open class ObservableMap[T] ()
    extends typings.jupyterlabObservables.libObservablemapMod.ObservableMap[T] {
    def this(options: typings.jupyterlabObservables.libObservablemapMod.ObservableMap.IOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/observables", "ObservableString")
  @js.native
  /**
    * Construct a new observable string.
    */
  open class ObservableString ()
    extends typings.jupyterlabObservables.libObservablestringMod.ObservableString {
    def this(initialText: String) = this()
  }
  
  @JSImport("@jupyterlab/observables", "ObservableUndoableList")
  @js.native
  open class ObservableUndoableList[T] protected ()
    extends typings.jupyterlabObservables.libUndoablelistMod.ObservableUndoableList[T] {
    /**
      * Construct a new undoable observable list.
      */
    def this(serializer: ISerializer[T]) = this()
  }
  object ObservableUndoableList {
    
    /**
      * A default, identity serializer.
      */
    @JSImport("@jupyterlab/observables", "ObservableUndoableList.IdentitySerializer")
    @js.native
    open class IdentitySerializer[T /* <: JSONValue */] ()
      extends typings.jupyterlabObservables.libUndoablelistMod.ObservableUndoableList.IdentitySerializer[T]
  }
  
  @JSImport("@jupyterlab/observables", "ObservableValue")
  @js.native
  /**
    * Constructor for the value.
    *
    * @param initialValue: the starting value for the `ObservableValue`.
    */
  open class ObservableValue ()
    extends typings.jupyterlabObservables.libModeldbMod.ObservableValue {
    def this(initialValue: JSONValue) = this()
  }
  object ObservableValue {
    
    /**
      * The changed args object emitted by the `IObservableValue`.
      */
    @JSImport("@jupyterlab/observables", "ObservableValue.IChangedArgs")
    @js.native
    open class IChangedArgs ()
      extends typings.jupyterlabObservables.libModeldbMod.ObservableValue.IChangedArgs
  }
}
