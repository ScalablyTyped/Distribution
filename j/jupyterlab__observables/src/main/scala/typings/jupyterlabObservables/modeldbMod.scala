package typings.jupyterlabObservables

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typings.jupyterlabObservables.jupyterlabObservablesStrings.Value
import typings.jupyterlabObservables.modeldbMod.ModelDB.ICreateOptions
import typings.jupyterlabObservables.modeldbMod.ObservableValue.IChangedArgs
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.JSONValue
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeldbMod {
  
  @JSImport("@jupyterlab/observables/lib/modeldb", "ModelDB")
  @js.native
  /**
    * Constructor for the `ModelDB`.
    */
  class ModelDB () extends IModelDB {
    def this(options: ICreateOptions) = this()
    
    var _basePath: js.Any = js.native
    
    var _db: js.Any = js.native
    
    var _disposables: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /**
      * Compute the fully resolved path for a path argument.
      */
    var _resolvePath: js.Any = js.native
    
    var _toDispose: js.Any = js.native
    
    /**
      * The base path for the `ModelDB`. This is prepended
      * to all the paths that are passed in to the member
      * functions of the object.
      */
    @JSName("basePath")
    def basePath_MModelDB: String = js.native
    
    /**
      * Whether the database is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MModelDB: Boolean = js.native
    
    /**
      * Set a value at a path. Not intended to
      * be called by user code, instead use the
      * `create*` factory methods.
      *
      * @param path: the path to set the value at.
      *
      * @param value: the value to set at the path.
      */
    def set(path: String, value: IObservable): Unit = js.native
  }
  object ModelDB {
    
    /**
      * Options for creating a `ModelDB` object.
      */
    @js.native
    trait ICreateOptions extends StObject {
      
      /**
        * A ModelDB to use as the store for this
        * ModelDB. If none is given, it uses its own store.
        */
      var baseDB: js.UndefOr[ModelDB] = js.native
      
      /**
        * The base path to prepend to all the path arguments.
        */
      var basePath: js.UndefOr[String] = js.native
    }
    object ICreateOptions {
      
      @scala.inline
      def apply(): ICreateOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICreateOptions]
      }
      
      @scala.inline
      implicit class ICreateOptionsMutableBuilder[Self <: ICreateOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBaseDB(value: ModelDB): Self = StObject.set(x, "baseDB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseDBUndefined: Self = StObject.set(x, "baseDB", js.undefined)
        
        @scala.inline
        def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      }
    }
    
    /**
      * A factory interface for creating `IModelDB` objects.
      */
    @js.native
    trait IFactory extends StObject {
      
      /**
        * Create a new `IModelDB` instance.
        */
      def createNew(path: String): IModelDB = js.native
    }
    object IFactory {
      
      @scala.inline
      def apply(createNew: String => IModelDB): IFactory = {
        val __obj = js.Dynamic.literal(createNew = js.Any.fromFunction1(createNew))
        __obj.asInstanceOf[IFactory]
      }
      
      @scala.inline
      implicit class IFactoryMutableBuilder[Self <: IFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateNew(value: String => IModelDB): Self = StObject.set(x, "createNew", js.Any.fromFunction1(value))
      }
    }
  }
  
  @JSImport("@jupyterlab/observables/lib/modeldb", "ObservableValue")
  @js.native
  /**
    * Constructor for the value.
    *
    * @param initialValue: the starting value for the `ObservableValue`.
    */
  class ObservableValue () extends IObservableValue {
    def this(initialValue: JSONValue) = this()
    
    var _changed: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _value: js.Any = js.native
    
    /**
      * The changed signal.
      */
    @JSName("changed")
    def changed_MObservableValue: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * Whether the value has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MObservableValue: Boolean = js.native
    
    /**
      * The observable type.
      */
    @JSName("type")
    def type_MObservableValue: Value = js.native
  }
  object ObservableValue {
    
    /**
      * The changed args object emitted by the `IObservableValue`.
      */
    @JSImport("@jupyterlab/observables/lib/modeldb", "ObservableValue.IChangedArgs")
    @js.native
    class IChangedArgs () extends StObject {
      
      /**
        * The new value.
        */
      var newValue: js.UndefOr[JSONValue] = js.native
      
      /**
        * The old value.
        */
      var oldValue: js.UndefOr[JSONValue] = js.native
    }
  }
  
  @js.native
  trait ICollaborator extends JSONObject {
    
    /**
      * A color to be used to identify the collaborator in
      * UI elements.
      */
    val color: String = js.native
    
    /**
      * A human-readable display name for a collaborator.
      */
    val displayName: String = js.native
    
    /**
      * A session id, which should be unique to a
      * particular view on a collaborative model.
      */
    val sessionId: String = js.native
    
    /**
      * A human-readable short name for a collaborator, for
      * use in places where the full `displayName` would take
      * too much space.
      */
    val shortName: String = js.native
    
    /**
      * A user id for the collaborator.
      * This might not be unique, if the user has more than
      * one editing session at a time.
      */
    val userId: String = js.native
  }
  object ICollaborator {
    
    @scala.inline
    def apply(color: String, displayName: String, sessionId: String, shortName: String, userId: String): ICollaborator = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICollaborator]
    }
    
    @scala.inline
    implicit class ICollaboratorMutableBuilder[Self <: ICollaborator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICollaboratorMap extends IObservableMap[ICollaborator] {
    
    /**
      * The local collaborator on a model.
      */
    val localCollaborator: ICollaborator = js.native
  }
  object ICollaboratorMap {
    
    @scala.inline
    def apply(
      changed: ISignal[
          ICollaboratorMap, 
          typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs[ICollaborator]
        ],
      clear: () => Unit,
      delete: String => js.UndefOr[ICollaborator],
      dispose: () => Unit,
      get: String => js.UndefOr[ICollaborator],
      has: String => Boolean,
      isDisposed: Boolean,
      keys: () => js.Array[String],
      localCollaborator: ICollaborator,
      set: (String, ICollaborator) => js.UndefOr[ICollaborator],
      size: Double,
      `type`: Map,
      values: () => js.Array[ICollaborator]
    ): ICollaboratorMap = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = js.Any.fromFunction0(keys), localCollaborator = localCollaborator.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICollaboratorMap]
    }
    
    @scala.inline
    implicit class ICollaboratorMapMutableBuilder[Self <: ICollaboratorMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalCollaborator(value: ICollaborator): Self = StObject.set(x, "localCollaborator", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IModelDB extends IDisposable {
    
    /**
      * The base path for the `IModelDB`. This is prepended
      * to all the paths that are passed in to the member
      * functions of the object.
      */
    val basePath: String = js.native
    
    /**
      * A map of the currently active collaborators
      * for the database, including the local user.
      */
    val collaborators: js.UndefOr[ICollaboratorMap] = js.native
    
    /**
      * A promise that resolves when the database
      * has connected to its backend, if any.
      */
    val connected: js.Promise[Unit] = js.native
    
    /**
      * Create an undoable list and insert it in the database.
      *
      * @param path: the path for the list.
      *
      * @returns the list that was created.
      *
      * #### Notes
      * The list can only store objects that are simple
      * JSON Objects and primitives.
      */
    def createList[T /* <: JSONValue */](path: String): IObservableUndoableList[T] = js.native
    
    /**
      * Create a map and insert it in the database.
      *
      * @param path: the path for the map.
      *
      * @returns the map that was created.
      *
      * #### Notes
      * The map can only store objects that are simple
      * JSON Objects and primitives.
      */
    def createMap(path: String): IObservableJSON = js.native
    
    /**
      * Create a string and insert it in the database.
      *
      * @param path: the path for the string.
      *
      * @returns the string that was created.
      */
    def createString(path: String): IObservableString = js.native
    
    /**
      * Create an opaque value and insert it in the database.
      *
      * @param path: the path for the value.
      *
      * @returns the value that was created.
      */
    def createValue(path: String): IObservableValue = js.native
    
    /**
      * Get a value for a path.
      *
      * @param path: the path for the object.
      *
      * @returns an `IObservable`.
      */
    def get(path: String): js.UndefOr[IObservable] = js.native
    
    /**
      * Get a value at a path, or `undefined if it has not been set
      * That value must already have been created using `createValue`.
      *
      * @param path: the path for the value.
      */
    def getValue(path: String): js.UndefOr[JSONValue] = js.native
    
    /**
      * Whether the `IModelDB` has an object at this path.
      *
      * @param path: the path for the object.
      *
      * @returns a boolean for whether an object is at `path`.
      */
    def has(path: String): Boolean = js.native
    
    /**
      * Whether the database is collaborative.
      */
    val isCollaborative: Boolean = js.native
    
    /**
      * Whether the database has been populated
      * with model values prior to connection.
      */
    val isPrepopulated: Boolean = js.native
    
    /**
      * Set a value at a path. That value must already have
      * been created using `createValue`.
      *
      * @param path: the path for the value.
      *
      * @param value: the new value.
      */
    def setValue(path: String, value: JSONValue): Unit = js.native
    
    /**
      * Create a view onto a subtree of the model database.
      *
      * @param basePath: the path for the root of the subtree.
      *
      * @returns an `IModelDB` with a view onto the original
      *   `IModelDB`, with `basePath` prepended to all paths.
      */
    def view(basePath: String): IModelDB = js.native
  }
  object IModelDB {
    
    @scala.inline
    def apply(
      basePath: String,
      connected: js.Promise[Unit],
      createList: String => IObservableUndoableList[js.Any],
      createMap: String => IObservableJSON,
      createString: String => IObservableString,
      createValue: String => IObservableValue,
      dispose: () => Unit,
      get: String => js.UndefOr[IObservable],
      getValue: String => js.UndefOr[JSONValue],
      has: String => Boolean,
      isCollaborative: Boolean,
      isDisposed: Boolean,
      isPrepopulated: Boolean,
      setValue: (String, JSONValue) => Unit,
      view: String => IModelDB
    ): IModelDB = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], createList = js.Any.fromFunction1(createList), createMap = js.Any.fromFunction1(createMap), createString = js.Any.fromFunction1(createString), createValue = js.Any.fromFunction1(createValue), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), getValue = js.Any.fromFunction1(getValue), has = js.Any.fromFunction1(has), isCollaborative = isCollaborative.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isPrepopulated = isPrepopulated.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue), view = js.Any.fromFunction1(view))
      __obj.asInstanceOf[IModelDB]
    }
    
    @scala.inline
    implicit class IModelDBMutableBuilder[Self <: IModelDB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollaborators(value: ICollaboratorMap): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollaboratorsUndefined: Self = StObject.set(x, "collaborators", js.undefined)
      
      @scala.inline
      def setConnected(value: js.Promise[Unit]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateList(value: String => IObservableUndoableList[js.Any]): Self = StObject.set(x, "createList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateMap(value: String => IObservableJSON): Self = StObject.set(x, "createMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateString(value: String => IObservableString): Self = StObject.set(x, "createString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateValue(value: String => IObservableValue): Self = StObject.set(x, "createValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.UndefOr[IObservable]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValue(value: String => js.UndefOr[JSONValue]): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsCollaborative(value: Boolean): Self = StObject.set(x, "isCollaborative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPrepopulated(value: Boolean): Self = StObject.set(x, "isPrepopulated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetValue(value: (String, JSONValue) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setView(value: String => IModelDB): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IObservable extends IDisposable {
    
    /**
      * The type of this object.
      */
    val `type`: ObservableType = js.native
  }
  object IObservable {
    
    @scala.inline
    def apply(dispose: () => Unit, isDisposed: Boolean, `type`: ObservableType): IObservable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservable]
    }
    
    @scala.inline
    implicit class IObservableMutableBuilder[Self <: IObservable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ObservableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IObservableValue extends IObservable {
    
    /**
      * The changed signal.
      */
    val changed: ISignal[IObservableValue, IChangedArgs] = js.native
    
    /**
      * Get the current value, or `undefined` if it has not been set.
      */
    def get(): js.UndefOr[PartialJSONValue] = js.native
    
    /**
      * Set the value.
      */
    def set(value: PartialJSONValue): Unit = js.native
    
    /**
      * The type of this object.
      */
    @JSName("type")
    val type_IObservableValue: Value = js.native
  }
  object IObservableValue {
    
    @scala.inline
    def apply(
      changed: ISignal[IObservableValue, IChangedArgs],
      dispose: () => Unit,
      get: () => js.UndefOr[PartialJSONValue],
      isDisposed: Boolean,
      set: PartialJSONValue => Unit,
      `type`: Value
    ): IObservableValue = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction0(get), isDisposed = isDisposed.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableValue]
    }
    
    @scala.inline
    implicit class IObservableValueMutableBuilder[Self <: IObservableValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanged(value: ISignal[IObservableValue, IChangedArgs]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: () => js.UndefOr[PartialJSONValue]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: PartialJSONValue => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: Value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabObservables.jupyterlabObservablesStrings.Map
    - typings.jupyterlabObservables.jupyterlabObservablesStrings.List
    - typings.jupyterlabObservables.jupyterlabObservablesStrings.String
    - typings.jupyterlabObservables.jupyterlabObservablesStrings.Value
  */
  trait ObservableType extends StObject
  object ObservableType {
    
    @scala.inline
    def List: typings.jupyterlabObservables.jupyterlabObservablesStrings.List = "List".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.List]
    
    @scala.inline
    def Map: typings.jupyterlabObservables.jupyterlabObservablesStrings.Map = "Map".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.Map]
    
    @scala.inline
    def String: typings.jupyterlabObservables.jupyterlabObservablesStrings.String = "String".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.String]
    
    @scala.inline
    def Value: typings.jupyterlabObservables.jupyterlabObservablesStrings.Value = "Value".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.Value]
  }
}
