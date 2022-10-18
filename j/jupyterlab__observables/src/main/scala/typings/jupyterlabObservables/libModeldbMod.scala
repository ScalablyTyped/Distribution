package typings.jupyterlabObservables

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Value
import typings.jupyterlabObservables.libModeldbMod.ModelDB.ICreateOptions
import typings.jupyterlabObservables.libModeldbMod.ObservableValue.IChangedArgs
import typings.jupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.jupyterlabObservables.libObservablemapMod.IObservableMap
import typings.jupyterlabObservables.libObservablestringMod.IObservableString
import typings.jupyterlabObservables.libUndoablelistMod.IObservableUndoableList
import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.luminoCoreutils.typesJsonMod.JSONValue
import typings.luminoCoreutils.typesJsonMod.PartialJSONValue
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModeldbMod {
  
  @JSImport("@jupyterlab/observables/lib/modeldb", "ModelDB")
  @js.native
  /**
    * Constructor for the `ModelDB`.
    */
  open class ModelDB ()
    extends StObject
       with IModelDB {
    def this(options: ICreateOptions) = this()
    
    /* private */ var _basePath: Any = js.native
    
    /* private */ var _db: Any = js.native
    
    /* private */ var _disposables: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /**
      * Compute the fully resolved path for a path argument.
      */
    /* private */ var _resolvePath: Any = js.native
    
    /* private */ var _toDispose: Any = js.native
    
    /**
      * The base path for the `IModelDB`. This is prepended
      * to all the paths that are passed in to the member
      * functions of the object.
      */
    /* CompleteClass */
    override val basePath: String = js.native
    /**
      * The base path for the `ModelDB`. This is prepended
      * to all the paths that are passed in to the member
      * functions of the object.
      */
    @JSName("basePath")
    def basePath_MModelDB: String = js.native
    
    /**
      * A promise that resolves when the database
      * has connected to its backend, if any.
      */
    /* CompleteClass */
    override val connected: js.Promise[Unit] = js.native
    
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
    /* CompleteClass */
    override def createList[T /* <: JSONValue */](path: String): IObservableUndoableList[T] = js.native
    
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
    /* CompleteClass */
    override def createMap(path: String): IObservableJSON = js.native
    
    /**
      * Create a string and insert it in the database.
      *
      * @param path: the path for the string.
      *
      * @returns the string that was created.
      */
    /* CompleteClass */
    override def createString(path: String): IObservableString = js.native
    
    /**
      * Create an opaque value and insert it in the database.
      *
      * @param path: the path for the value.
      *
      * @returns the value that was created.
      */
    /* CompleteClass */
    override def createValue(path: String): IObservableValue = js.native
    
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
      * Get a value for a path.
      *
      * @param path: the path for the object.
      *
      * @returns an `IObservable`.
      */
    /* CompleteClass */
    override def get(path: String): js.UndefOr[IObservable] = js.native
    
    /**
      * Get a value at a path, or `undefined if it has not been set
      * That value must already have been created using `createValue`.
      *
      * @param path: the path for the value.
      */
    /* CompleteClass */
    override def getValue(path: String): js.UndefOr[JSONValue] = js.native
    
    /**
      * Whether the `IModelDB` has an object at this path.
      *
      * @param path: the path for the object.
      *
      * @returns a boolean for whether an object is at `path`.
      */
    /* CompleteClass */
    override def has(path: String): Boolean = js.native
    
    /**
      * Whether the database is collaborative.
      */
    /* CompleteClass */
    override val isCollaborative: Boolean = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Whether the database is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MModelDB: Boolean = js.native
    
    /**
      * Whether the database has been populated
      * with model values prior to connection.
      */
    /* CompleteClass */
    override val isPrepopulated: Boolean = js.native
    
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
    
    /**
      * Set a value at a path. That value must already have
      * been created using `createValue`.
      *
      * @param path: the path for the value.
      *
      * @param value: the new value.
      */
    /* CompleteClass */
    override def setValue(path: String, value: JSONValue): Unit = js.native
    
    /**
      * Create a view onto a subtree of the model database.
      *
      * @param basePath: the path for the root of the subtree.
      *
      * @returns an `IModelDB` with a view onto the original
      *   `IModelDB`, with `basePath` prepended to all paths.
      */
    /* CompleteClass */
    override def view(basePath: String): IModelDB = js.native
  }
  object ModelDB {
    
    /**
      * Options for creating a `ModelDB` object.
      */
    trait ICreateOptions extends StObject {
      
      /**
        * A ModelDB to use as the store for this
        * ModelDB. If none is given, it uses its own store.
        */
      var baseDB: js.UndefOr[ModelDB] = js.undefined
      
      /**
        * The base path to prepend to all the path arguments.
        */
      var basePath: js.UndefOr[String] = js.undefined
    }
    object ICreateOptions {
      
      inline def apply(): ICreateOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICreateOptions]
      }
      
      extension [Self <: ICreateOptions](x: Self) {
        
        inline def setBaseDB(value: ModelDB): Self = StObject.set(x, "baseDB", value.asInstanceOf[js.Any])
        
        inline def setBaseDBUndefined: Self = StObject.set(x, "baseDB", js.undefined)
        
        inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      }
    }
    
    /**
      * A factory interface for creating `IModelDB` objects.
      */
    trait IFactory extends StObject {
      
      /**
        * Create a new `IModelDB` instance.
        */
      def createNew(path: String): IModelDB
    }
    object IFactory {
      
      inline def apply(createNew: String => IModelDB): IFactory = {
        val __obj = js.Dynamic.literal(createNew = js.Any.fromFunction1(createNew))
        __obj.asInstanceOf[IFactory]
      }
      
      extension [Self <: IFactory](x: Self) {
        
        inline def setCreateNew(value: String => IModelDB): Self = StObject.set(x, "createNew", js.Any.fromFunction1(value))
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
  open class ObservableValue ()
    extends StObject
       with IObservableValue {
    def this(initialValue: JSONValue) = this()
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    /**
      * The changed signal.
      */
    /* CompleteClass */
    override val changed: ISignal[IObservableValue, IChangedArgs] = js.native
    /**
      * The changed signal.
      */
    @JSName("changed")
    def changed_MObservableValue: ISignal[this.type, IChangedArgs] = js.native
    
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
      * Get the current value, or `undefined` if it has not been set.
      */
    /* CompleteClass */
    override def get(): js.UndefOr[PartialJSONValue] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Whether the value has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MObservableValue: Boolean = js.native
    
    /**
      * Set the value.
      */
    /* CompleteClass */
    override def set(value: PartialJSONValue): Unit = js.native
    
    /**
      * The type of this object.
      */
    /* CompleteClass */
    override val `type`: ObservableType = js.native
    /**
      * The type of this object.
      */
    /* CompleteClass */
    @JSName("type")
    override val type_IObservableValue: Value = js.native
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
    open class IChangedArgs () extends StObject {
      
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
  
  trait ICollaborator
    extends StObject
       with JSONObject {
    
    /**
      * A color to be used to identify the collaborator in
      * UI elements.
      */
    val color: String
    
    /**
      * A human-readable display name for a collaborator.
      */
    val displayName: String
    
    /**
      * A session id, which should be unique to a
      * particular view on a collaborative model.
      */
    val sessionId: String
    
    /**
      * A human-readable short name for a collaborator, for
      * use in places where the full `displayName` would take
      * too much space.
      */
    val shortName: String
    
    /**
      * A user id for the collaborator.
      * This might not be unique, if the user has more than
      * one editing session at a time.
      */
    val userId: String
  }
  object ICollaborator {
    
    inline def apply(color: String, displayName: String, sessionId: String, shortName: String, userId: String): ICollaborator = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICollaborator]
    }
    
    extension [Self <: ICollaborator](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICollaboratorMap
    extends StObject
       with IObservableMap[ICollaborator] {
    
    /**
      * The local collaborator on a model.
      */
    val localCollaborator: ICollaborator
  }
  object ICollaboratorMap {
    
    inline def apply(
      changed: ISignal[
          ICollaboratorMap, 
          typings.jupyterlabObservables.libObservablemapMod.IObservableMap.IChangedArgs[ICollaborator]
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
      values: () => js.Array[ICollaborator]
    ): ICollaboratorMap = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = js.Any.fromFunction0(keys), localCollaborator = localCollaborator.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.updateDynamic("type")("Map")
      __obj.asInstanceOf[ICollaboratorMap]
    }
    
    extension [Self <: ICollaboratorMap](x: Self) {
      
      inline def setLocalCollaborator(value: ICollaborator): Self = StObject.set(x, "localCollaborator", value.asInstanceOf[js.Any])
    }
  }
  
  trait IModelDB
    extends StObject
       with IDisposable {
    
    /**
      * The base path for the `IModelDB`. This is prepended
      * to all the paths that are passed in to the member
      * functions of the object.
      */
    val basePath: String
    
    /**
      * A map of the currently active collaborators
      * for the database, including the local user.
      */
    val collaborators: js.UndefOr[ICollaboratorMap] = js.undefined
    
    /**
      * A promise that resolves when the database
      * has connected to its backend, if any.
      */
    val connected: js.Promise[Unit]
    
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
    def createList[T /* <: JSONValue */](path: String): IObservableUndoableList[T]
    
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
    def createMap(path: String): IObservableJSON
    
    /**
      * Create a string and insert it in the database.
      *
      * @param path: the path for the string.
      *
      * @returns the string that was created.
      */
    def createString(path: String): IObservableString
    
    /**
      * Create an opaque value and insert it in the database.
      *
      * @param path: the path for the value.
      *
      * @returns the value that was created.
      */
    def createValue(path: String): IObservableValue
    
    /**
      * Get a value for a path.
      *
      * @param path: the path for the object.
      *
      * @returns an `IObservable`.
      */
    def get(path: String): js.UndefOr[IObservable]
    
    /**
      * Get a value at a path, or `undefined if it has not been set
      * That value must already have been created using `createValue`.
      *
      * @param path: the path for the value.
      */
    def getValue(path: String): js.UndefOr[JSONValue]
    
    /**
      * Whether the `IModelDB` has an object at this path.
      *
      * @param path: the path for the object.
      *
      * @returns a boolean for whether an object is at `path`.
      */
    def has(path: String): Boolean
    
    /**
      * Whether the database is collaborative.
      */
    val isCollaborative: Boolean
    
    /**
      * Whether the database has been populated
      * with model values prior to connection.
      */
    val isPrepopulated: Boolean
    
    /**
      * Set a value at a path. That value must already have
      * been created using `createValue`.
      *
      * @param path: the path for the value.
      *
      * @param value: the new value.
      */
    def setValue(path: String, value: JSONValue): Unit
    
    /**
      * Create a view onto a subtree of the model database.
      *
      * @param basePath: the path for the root of the subtree.
      *
      * @returns an `IModelDB` with a view onto the original
      *   `IModelDB`, with `basePath` prepended to all paths.
      */
    def view(basePath: String): IModelDB
  }
  object IModelDB {
    
    inline def apply(
      basePath: String,
      connected: js.Promise[Unit],
      createList: String => IObservableUndoableList[Any],
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
    
    extension [Self <: IModelDB](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setCollaborators(value: ICollaboratorMap): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      inline def setCollaboratorsUndefined: Self = StObject.set(x, "collaborators", js.undefined)
      
      inline def setConnected(value: js.Promise[Unit]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setCreateList(value: String => IObservableUndoableList[Any]): Self = StObject.set(x, "createList", js.Any.fromFunction1(value))
      
      inline def setCreateMap(value: String => IObservableJSON): Self = StObject.set(x, "createMap", js.Any.fromFunction1(value))
      
      inline def setCreateString(value: String => IObservableString): Self = StObject.set(x, "createString", js.Any.fromFunction1(value))
      
      inline def setCreateValue(value: String => IObservableValue): Self = StObject.set(x, "createValue", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => js.UndefOr[IObservable]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: String => js.UndefOr[JSONValue]): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setIsCollaborative(value: Boolean): Self = StObject.set(x, "isCollaborative", value.asInstanceOf[js.Any])
      
      inline def setIsPrepopulated(value: Boolean): Self = StObject.set(x, "isPrepopulated", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: (String, JSONValue) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      inline def setView(value: String => IModelDB): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
    }
  }
  
  trait IObservable
    extends StObject
       with IDisposable {
    
    /**
      * The type of this object.
      */
    val `type`: ObservableType
  }
  object IObservable {
    
    inline def apply(dispose: () => Unit, isDisposed: Boolean, `type`: ObservableType): IObservable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservable]
    }
    
    extension [Self <: IObservable](x: Self) {
      
      inline def setType(value: ObservableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IObservableValue
    extends StObject
       with IObservable {
    
    /**
      * The changed signal.
      */
    val changed: ISignal[IObservableValue, IChangedArgs]
    
    /**
      * Get the current value, or `undefined` if it has not been set.
      */
    def get(): js.UndefOr[PartialJSONValue]
    
    /**
      * Set the value.
      */
    def set(value: PartialJSONValue): Unit
    
    /**
      * The type of this object.
      */
    @JSName("type")
    val type_IObservableValue: Value
  }
  object IObservableValue {
    
    inline def apply(
      changed: ISignal[IObservableValue, IChangedArgs],
      dispose: () => Unit,
      get: () => js.UndefOr[PartialJSONValue],
      isDisposed: Boolean,
      set: PartialJSONValue => Unit
    ): IObservableValue = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction0(get), isDisposed = isDisposed.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.updateDynamic("type")("Value")
      __obj.asInstanceOf[IObservableValue]
    }
    
    extension [Self <: IObservableValue](x: Self) {
      
      inline def setChanged(value: ISignal[IObservableValue, IChangedArgs]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setGet(value: () => js.UndefOr[PartialJSONValue]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setSet(value: PartialJSONValue => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setType(value: Value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def List: typings.jupyterlabObservables.jupyterlabObservablesStrings.List = "List".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.List]
    
    inline def Map: typings.jupyterlabObservables.jupyterlabObservablesStrings.Map = "Map".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.Map]
    
    inline def String: typings.jupyterlabObservables.jupyterlabObservablesStrings.String = "String".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.String]
    
    inline def Value: typings.jupyterlabObservables.jupyterlabObservablesStrings.Value = "Value".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.Value]
  }
}
