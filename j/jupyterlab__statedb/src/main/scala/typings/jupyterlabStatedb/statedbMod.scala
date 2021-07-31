package typings.jupyterlabStatedb

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.cancel
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.clear
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.merge
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.overwrite
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.remove
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.save
import typings.jupyterlabStatedb.statedbMod.StateDB.Change
import typings.jupyterlabStatedb.statedbMod.StateDB.IOptions
import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statedbMod {
  
  @JSImport("@jupyterlab/statedb/lib/statedb", "StateDB")
  @js.native
  /**
    * Create a new state database.
    *
    * @param options - The instantiation options for a state database.
    */
  class StateDB[T /* <: ReadonlyPartialJSONValue */] ()
    extends StObject
       with IStateDB[T] {
    def this(options: IOptions[T]) = this()
    
    var _changed: js.Any = js.native
    
    /**
      * Clear the entire database.
      */
    var _clear: js.Any = js.native
    
    var _connector: js.Any = js.native
    
    /**
      * Fetch a value from the database.
      */
    var _fetch: js.Any = js.native
    
    /**
      * Fetch a list from the database.
      */
    var _list: js.Any = js.native
    
    /**
      * Merge data into the state database.
      */
    var _merge: js.Any = js.native
    
    /**
      * Overwrite the entire database with new contents.
      */
    var _overwrite: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    /**
      * Remove a key in the database.
      */
    var _remove: js.Any = js.native
    
    /**
      * Save a key and its value in the database.
      */
    var _save: js.Any = js.native
    
    /**
      * A signal that emits the change type any time a value changes.
      */
    def changed: ISignal[this.type, Change] = js.native
    
    /**
      * Clear the entire database.
      */
    def clear(): js.Promise[Unit] = js.native
  }
  object StateDB {
    
    /**
      * An in-memory string key/value data connector.
      */
    @JSImport("@jupyterlab/statedb/lib/statedb", "StateDB.Connector")
    @js.native
    class Connector ()
      extends StObject
         with IDataConnector[String, String, String, String] {
      
      var _storage: js.Any = js.native
    }
    
    /**
      * A state database change.
      */
    trait Change extends StObject {
      
      /**
        * The key of the database item that was changed.
        *
        * #### Notes
        * This field is set to `null` for global changes (i.e. `clear`).
        */
      var id: String | Null
      
      /**
        * The type of change.
        */
      var `type`: clear | remove | save
    }
    object Change {
      
      @scala.inline
      def apply(`type`: clear | remove | save): Change = {
        val __obj = js.Dynamic.literal(id = null)
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Change]
      }
      
      @scala.inline
      implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdNull: Self = StObject.set(x, "id", null)
        
        @scala.inline
        def setType(value: clear | remove | save): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Database content map
      */
    type Content[T] = StringDictionary[js.UndefOr[T]]
    
    /**
      * A data transformation that can be applied to a state database.
      */
    trait DataTransform[T /* <: ReadonlyPartialJSONValue */] extends StObject {
      
      /**
        * The contents of the change operation.
        */
      var contents: Content[T] | Null
      
      var `type`: cancel | clear | merge | overwrite
    }
    object DataTransform {
      
      @scala.inline
      def apply[T /* <: ReadonlyPartialJSONValue */](`type`: cancel | clear | merge | overwrite): DataTransform[T] = {
        val __obj = js.Dynamic.literal(contents = null)
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[DataTransform[T]]
      }
      
      @scala.inline
      implicit class DataTransformMutableBuilder[Self <: DataTransform[?], T /* <: ReadonlyPartialJSONValue */] (val x: Self & DataTransform[T]) extends AnyVal {
        
        @scala.inline
        def setContents(value: Content[T]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentsNull: Self = StObject.set(x, "contents", null)
        
        @scala.inline
        def setType(value: cancel | clear | merge | overwrite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The instantiation options for a state database.
      */
    trait IOptions[T /* <: ReadonlyPartialJSONValue */] extends StObject {
      
      /**
        * Optional string key/value connector. Defaults to in-memory connector.
        */
      var connector: js.UndefOr[IDataConnector[String, String, String, String]] = js.undefined
      
      /**
        * An optional promise that resolves with a data transformation that is
        * applied to the database contents before the database begins resolving
        * client requests.
        */
      var transform: js.UndefOr[js.Promise[DataTransform[T]]] = js.undefined
    }
    object IOptions {
      
      @scala.inline
      def apply[T /* <: ReadonlyPartialJSONValue */](): IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[?], T /* <: ReadonlyPartialJSONValue */] (val x: Self & IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setConnector(value: IDataConnector[String, String, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
        
        @scala.inline
        def setTransform(value: js.Promise[DataTransform[T]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
  }
}
