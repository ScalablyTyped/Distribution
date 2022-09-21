package typings.lokijs

import org.scalablytyped.runtime.StringDictionary
import typings.lokijs.anon.AsyncResponses
import typings.lokijs.anon.Found
import typings.lokijs.anon.Lastsave
import typings.lokijs.anon.PageSize
import typings.lokijs.anon.PartialDynamicViewOptions
import typings.lokijs.anon.PartialLokiConstructorOpt
import typings.lokijs.lokijsBooleans.`true`
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Collection class that handles documents of same type
    * @see {@link Loki#addCollection} for normal creation of collections
    */
  @JSGlobal("Collection")
  @js.native
  open class Collection[E /* <: js.Object */] protected ()
    extends StObject
       with typings.lokijs.Collection[E] {
    /**
      * @param name - collection name
      * @param [options] - (optional) configuration object
      * @param [options.unique=[]] - array of property names to define unique constraints for
      * @param [options.exact=[]] - array of property names to define exact constraints for
      * @param [options.indices=[]] - array property names to define binary indexes for
      * @param [options.adaptiveBinaryIndices=true] - collection indices will be actively rebuilt rather than lazily
      * @param [options.asyncListeners=false] - whether listeners are invoked asynchronously
      * @param [options.disableChangesApi=true] - set to false to enable Changes API
      * @param [options.disableDeltaChangesApi=true] - set to false to enable Delta Changes API (requires Changes API, forces cloning)
      * @param [options.autoupdate=false] - use Object.observe to update objects automatically
      * @param [options.clone=false] - specify whether inserts and queries clone to/from user
      * @param [options.serializableIndices=true[]] - converts date values on binary indexed properties to epoch time
      * @param [options.cloneMethod='parse-stringify'] - 'parse-stringify', 'jquery-extend-deep', 'shallow', 'shallow-assign'
      * @param options.ttlInterval - time interval for clearing out 'aged' documents; not set by default.
      * @see {@link Loki#addCollection} for normal creation of collections
      */
    def this(name: String) = this()
    def this(name: String, options: Partial[CollectionOptions[E]]) = this()
  }
  
  /**
    * DynamicView class is a versatile 'live' view class which can have filters and sorts applied.
    *    Collection.addDynamicView(name) instantiates this DynamicView object and notifies it
    *    whenever documents are add/updated/removed so it can remain up-to-date. (chainable)
    *
    * @example
    * var mydv = mycollection.addDynamicView('test');  // default is non-persistent
    * mydv.applyFind({ 'doors' : 4 });
    * mydv.applyWhere(function(obj) { return obj.name === 'Toyota'; });
    * var results = mydv.data();
    */
  @JSGlobal("DynamicView")
  @js.native
  open class DynamicView[E /* <: js.Object */] protected ()
    extends StObject
       with typings.lokijs.DynamicView[E] {
    /**
      * @param collection - A reference to the collection to work against
      * @param name - The name of this dynamic view
      * @param [options] - (Optional) Pass in object with 'persistent' and/or 'sortPriority' options.
      * @param [options.persistent=false] - indicates if view is to main internal results array in 'resultdata'
      * @param [options.sortPriority='passive'] - 'passive' (sorts performed on call to data) or 'active' (after updates)
      * @param [options.minRebuildInterval] - minimum rebuild interval (need clarification to docs here)
      * @see {@link Collection#addDynamicView} to construct instances of DynamicView
      */
    def this(collection: typings.lokijs.Collection[E], name: String) = this()
    def this(collection: typings.lokijs.Collection[E], name: String, options: PartialDynamicViewOptions) = this()
  }
  
  @JSGlobal("ExactIndex")
  @js.native
  open class ExactIndex[E /* <: js.Object */] protected ()
    extends StObject
       with typings.lokijs.ExactIndex[E] {
    def this(exactField: /* keyof E */ String) = this()
  }
  
  @JSGlobal("KeyValueStore")
  @js.native
  open class KeyValueStore ()
    extends StObject
       with typings.lokijs.KeyValueStore {
    
    /* CompleteClass */
    override def bs(): js.Function2[/* array */ js.Array[Any], /* item */ Any, Found] = js.native
    
    /* CompleteClass */
    override def get(key: Any): js.Array[Any] = js.native
    
    /* CompleteClass */
    var keys: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def set(key: Any, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def setSort(fun: js.Function2[/* target */ Any, /* test */ Any, Any]): Unit = js.native
    
    /* CompleteClass */
    override def sort(a: Any, b: Any): `-1` | `0` | `1` = js.native
    
    /* CompleteClass */
    var values: js.Array[Any] = js.native
  }
  
  /**
    * Loki: The main database class
    */
  @JSGlobal("Loki")
  @js.native
  open class Loki protected ()
    extends StObject
       with typings.lokijs.Loki {
    /**
      * @param filename - name of the file to be saved to
      * @param options - (Optional) config options object
      * @param options.env - override environment detection as 'NODEJS', 'BROWSER', 'CORDOVA'
      * @param [options.verbose=false] - enable console output
      * @param [options.autosave=false] - enables autosave
      * @param [options.autosaveInterval=5000] - time interval (in milliseconds) between saves (if dirty)
      * @param [options.autoload=false] - enables autoload on loki instantiation
      * @param options.autoloadCallback - user callback called after database load
      * @param options.adapter - an instance of a loki persistence adapter
      * @param [options.serializationMethod='normal'] - ['normal', 'pretty', 'destructured']
      * @param options.destructureDelimiter - string delimiter used for destructured serialization
      * @param [options.throttledSaves=true] - debounces multiple calls to to saveDatabase reducing number of disk I/O operations
      and guaranteeing proper serialization of the calls.
      */
    def this(filename: String) = this()
    def this(filename: String, options: PartialLokiConstructorOpt) = this()
  }
  
  /**
    * LokiJS
    * A lightweight document oriented javascript database
    * @author Joe Minichino <joe.minichino@gmail.com>
    */
  @JSGlobal("LokiConstructor")
  @js.native
  open class LokiConstructor protected ()
    extends StObject
       with typings.lokijs.Loki {
    def this(filename: String) = this()
    def this(filename: String, options: PartialLokiConstructorOpt) = this()
  }
  object LokiConstructor {
    
    @JSGlobal("LokiConstructor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("LokiConstructor.Collection")
    @js.native
    open class Collection[E /* <: js.Object */] ()
      extends StObject
         with typings.lokijs.Collection[E]
    
    @JSGlobal("LokiConstructor.DynamicView")
    @js.native
    open class DynamicView[E /* <: js.Object */] ()
      extends StObject
         with typings.lokijs.DynamicView[E]
    
    @JSGlobal("LokiConstructor.KeyValueStore")
    @js.native
    open class KeyValueStore ()
      extends StObject
         with typings.lokijs.KeyValueStore {
      
      /* CompleteClass */
      override def bs(): js.Function2[/* array */ js.Array[Any], /* item */ Any, Found] = js.native
      
      /* CompleteClass */
      override def get(key: Any): js.Array[Any] = js.native
      
      /* CompleteClass */
      var keys: js.Array[Any] = js.native
      
      /* CompleteClass */
      override def set(key: Any, value: Any): Unit = js.native
      
      /* CompleteClass */
      override def setSort(fun: js.Function2[/* target */ Any, /* test */ Any, Any]): Unit = js.native
      
      /* CompleteClass */
      override def sort(a: Any, b: Any): `-1` | `0` | `1` = js.native
      
      /* CompleteClass */
      var values: js.Array[Any] = js.native
    }
    
    @JSGlobal("LokiConstructor.LokiFsAdapter")
    @js.native
    open class LokiFsAdapter ()
      extends StObject
         with typings.lokijs.LokiFsAdapter {
      
      /* CompleteClass */
      override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    }
    
    @JSGlobal("LokiConstructor.LokiLocalStorageAdapter")
    @js.native
    open class LokiLocalStorageAdapter ()
      extends StObject
         with typings.lokijs.LokiLocalStorageAdapter {
      
      /**
        * deleteDatabase() - delete the database from localstorage, will throw an error if it
        * can't be deleted
        * @param dbname - the filename of the database to delete
        * @param callback - the callback to handle the result
        */
      /* CompleteClass */
      override def deleteDatabase(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
      
      /**
        * loadDatabase() - Load data from localstorage
        * @param dbname - the name of the database to load
        * @param callback - the callback to handle the result
        */
      /* CompleteClass */
      override def loadDatabase(dbname: String, callback: js.Function1[/* dataOrError */ Any | js.Error, Unit]): Unit = js.native
      
      /**
        * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
        * might want to expand this to avoid dataloss on partial save
        * @param dbname - the filename of the database to load
        * @param callback - the callback to handle the result
        */
      /* CompleteClass */
      override def saveDatabase(
        dbname: String,
        dbstring: String,
        callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
      ): Unit = js.native
    }
    
    @JSGlobal("LokiConstructor.LokiMemoryAdapter")
    @js.native
    open class LokiMemoryAdapter ()
      extends StObject
         with typings.lokijs.LokiMemoryAdapter {
      
      /**
        * Deletes a database from its in-memory store.
        *
        * @param dbname - name of the database (filename/keyname)
        * @param callback - function to call when done
        */
      /* CompleteClass */
      @JSName("deleteDatabase")
      override def deleteDatabase_MLokiMemoryAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
      
      /* CompleteClass */
      var hashStore: StringDictionary[Lastsave] = js.native
      
      /* CompleteClass */
      override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
      
      /* CompleteClass */
      var options: AsyncResponses = js.native
      
      /**
        * Saves a serialized database to its in-memory store.
        * (Loki persistence adapter interface function)
        *
        * @param dbname - name of the database (filename/keyname)
        * @param callback - adapter callback to return load result to caller
        */
      /* CompleteClass */
      @JSName("saveDatabase")
      override def saveDatabase_MLokiMemoryAdapter(dbname: String, dbstring: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    }
    
    @JSGlobal("LokiConstructor.LokiOps")
    @js.native
    def LokiOps: typings.lokijs.LokiOps = js.native
    inline def LokiOps_=(x: LokiOps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LokiOps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("LokiConstructor.LokiPartitioningAdapter")
    @js.native
    open class LokiPartitioningAdapter ()
      extends StObject
         with typings.lokijs.LokiPartitioningAdapter {
      
      /* CompleteClass */
      var adapter: LokiPersistenceAdapter | Null = js.native
      
      /* CompleteClass */
      var dbname: String = js.native
      
      /* CompleteClass */
      var dbref: typings.lokijs.Loki | Null = js.native
      
      /**
        * Saves a database by partioning into separate key/value saves.
        * (Loki 'reference mode' persistence adapter interface function)
        *
        * @param dbname - name of the database (filename/keyname)
        * @param dbref - reference to database which we will partition and save.
        * @param callback - adapter callback to return load result to caller
        */
      /* CompleteClass */
      @JSName("exportDatabase")
      override def exportDatabase_MLokiPartitioningAdapter(
        dbname: String,
        dbref: typings.lokijs.Loki,
        callback: js.Function1[/* err */ js.Error | Null, Unit]
      ): Unit = js.native
      
      /* CompleteClass */
      override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
      
      /**
        * Used to sequentially load the next page of collection partition, one at a time.
        *
        * @param callback - adapter callback to return load result to caller
        */
      /* CompleteClass */
      override def loadNextPage(callback: js.Function0[Unit]): Unit = js.native
      
      /**
        * Used to sequentially load each collection partition, one at a time.
        *
        * @param partition - ordinal collection position to load next
        * @param callback - adapter callback to return load result to caller
        */
      /* CompleteClass */
      override def loadNextPartition(partition: Double, callback: js.Function0[Unit]): Unit = js.native
      
      /* CompleteClass */
      @JSName("mode")
      var mode_LokiPartitioningAdapter: String = js.native
      
      /* CompleteClass */
      var options: PageSize = js.native
      
      /* CompleteClass */
      var pageIterator: PageIterator | js.Object = js.native
      
      /**
        * Helper method used internally to generate and save the next page of the current (dirty) partition.
        *
        * @param callback - adapter callback to return load result to caller
        */
      /* CompleteClass */
      override def saveNextPage(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
      
      /**
        * Helper method used internally to save each dirty collection, one at a time.
        *
        * @param callback - adapter callback to return load result to caller
        */
      /* CompleteClass */
      override def saveNextPartition(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    }
    
    inline def aeq(prop1: Any, prop2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aeq")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def gt(prop1: Any, prop2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def gt(prop1: Any, prop2: Any, equal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any], equal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def lt(prop1: Any, prop2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def lt(prop1: Any, prop2: Any, equal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any], equal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    object persistenceAdapters {
      
      @JSGlobal("LokiConstructor.persistenceAdapters")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("LokiConstructor.persistenceAdapters.fs")
      @js.native
      def fs: typings.lokijs._LokiFsAdapter = js.native
      inline def fs_=(x: typings.lokijs._LokiFsAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fs")(x.asInstanceOf[js.Any])
      
      @JSGlobal("LokiConstructor.persistenceAdapters.localStorage")
      @js.native
      def localStorage: typings.lokijs._LokiLocalStorageAdapter = js.native
      inline def localStorage_=(x: typings.lokijs._LokiLocalStorageAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * LokiEventEmitter is a minimalist version of EventEmitter. It enables any
    * constructor that inherits EventEmitter to emit events and trigger
    * listeners that have been added to the event through the on(event, callback) method
    */
  @JSGlobal("LokiEventEmitter")
  @js.native
  open class LokiEventEmitter ()
    extends StObject
       with typings.lokijs.LokiEventEmitter
  
  /**
    * A loki persistence adapter which persists using node fs module
    */
  @JSGlobal("LokiFsAdapter")
  @js.native
  open class LokiFsAdapter ()
    extends StObject
       with typings.lokijs.LokiFsAdapter {
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
  }
  
  /**
    * A loki persistence adapter which persists to web browser's local storage object
    */
  @JSGlobal("LokiLocalStorageAdapter")
  @js.native
  open class LokiLocalStorageAdapter ()
    extends StObject
       with typings.lokijs.LokiLocalStorageAdapter {
    
    /**
      * deleteDatabase() - delete the database from localstorage, will throw an error if it
      * can't be deleted
      * @param dbname - the filename of the database to delete
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def deleteDatabase(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /**
      * loadDatabase() - Load data from localstorage
      * @param dbname - the name of the database to load
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* dataOrError */ Any | js.Error, Unit]): Unit = js.native
    
    /**
      * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
      * might want to expand this to avoid dataloss on partial save
      * @param dbname - the filename of the database to load
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def saveDatabase(
      dbname: String,
      dbstring: String,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
  }
  
  /**
    * In in-memory persistence adapter for an in-memory database.
    * This simple 'key/value' adapter is intended for unit testing and diagnostics.
    *
    * @param [options] - memory adapter options
    * @param [options.asyncResponses=false] - whether callbacks are invoked asynchronously
    * @param [options.asyncTimeout=50] - timeout in ms to queue callbacks
    */
  @JSGlobal("LokiMemoryAdapter")
  @js.native
  open class LokiMemoryAdapter ()
    extends StObject
       with typings.lokijs.LokiMemoryAdapter {
    def this(options: AsyncResponses) = this()
    
    /**
      * Deletes a database from its in-memory store.
      *
      * @param dbname - name of the database (filename/keyname)
      * @param callback - function to call when done
      */
    /* CompleteClass */
    @JSName("deleteDatabase")
    override def deleteDatabase_MLokiMemoryAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /* CompleteClass */
    var hashStore: StringDictionary[Lastsave] = js.native
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    var options: AsyncResponses = js.native
    
    /**
      * Saves a serialized database to its in-memory store.
      * (Loki persistence adapter interface function)
      *
      * @param dbname - name of the database (filename/keyname)
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    @JSName("saveDatabase")
    override def saveDatabase_MLokiMemoryAdapter(dbname: String, dbstring: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  }
  
  object LokiOps {
    
    @JSGlobal("LokiOps")
    @js.native
    val ^ : js.Any = js.native
    
    // abstract/loose equality
    inline def aeq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$aeq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def and(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$and")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** ex : coll.find({'orderCount': {$between: [10, 50]}}); */
    inline def between(a: Any, vals: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$between")(a.asInstanceOf[js.Any], vals.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def contains(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$contains")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def containsAny(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$containsAny")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def containsNone(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$containsNone")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def containsString(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$containsString")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def definedin(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$definedin")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    // date equality / loki abstract equality test
    inline def dteq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$dteq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def eq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$eq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def finite(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$finite")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def gt(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$gt")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def gte(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$gte")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def in(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$in")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def jbetween(a: Any, vals: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$jbetween")(a.asInstanceOf[js.Any], vals.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def jgt(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$jgt")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def jgte(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$jgte")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def jlt(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$jlt")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def jlte(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$jlte")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def keyin(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$keyin")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def len(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$len")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def lt(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$lt")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def lte(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$lte")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ne(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$ne")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def nin(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$nin")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def nkeyin(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$nkeyin")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    // field-level logical operators
    // a is the value in the collection
    // b is the nested query operation (for '$not')
    //   or an array of nested query operations (for '$and' and '$or')
    inline def not(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$not")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def or(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$or")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def regex(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$regex")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def size(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$size")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def `type`(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$type")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def undefinedin(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$undefinedin")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def where(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$where")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * An adapter for adapters.  Converts a non reference mode adapter into a reference mode adapter
    * which can perform destructuring and partioning.  Each collection will be stored in its own key/save and
    * only dirty collections will be saved.  If you  turn on paging with default page size of 25megs and save
    * a 75 meg collection it should use up roughly 3 save slots (key/value pairs sent to inner adapter).
    * A dirty collection that spans three pages will save all three pages again
    * Paging mode was added mainly because Chrome has issues saving 'too large' of a string within a
    * single indexeddb row.  If a single document update causes the collection to be flagged as dirty, all
    * of that collection's pages will be written on next save.
    *
    * @param adapter - reference to a 'non-reference' mode loki adapter instance.
    * @param options - configuration options for partitioning and paging
    * @param [options.paging] - (default: false) set to true to enable paging collection data.
    * @param [options.pageSize] - (default : 25MB) you can use this to limit size of strings passed to inner adapter.
    * @param [options.delimiter] - allows you to override the default delimeter
    */
  @JSGlobal("LokiPartitioningAdapter")
  @js.native
  open class LokiPartitioningAdapter protected ()
    extends StObject
       with typings.lokijs.LokiPartitioningAdapter {
    def this(adapter: LokiPersistenceAdapter) = this()
    def this(adapter: LokiPersistenceAdapter, options: PageSize) = this()
    
    /* CompleteClass */
    var adapter: LokiPersistenceAdapter | Null = js.native
    
    /* CompleteClass */
    var dbname: String = js.native
    
    /* CompleteClass */
    var dbref: typings.lokijs.Loki | Null = js.native
    
    /**
      * Saves a database by partioning into separate key/value saves.
      * (Loki 'reference mode' persistence adapter interface function)
      *
      * @param dbname - name of the database (filename/keyname)
      * @param dbref - reference to database which we will partition and save.
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    @JSName("exportDatabase")
    override def exportDatabase_MLokiPartitioningAdapter(
      dbname: String,
      dbref: typings.lokijs.Loki,
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    /**
      * Used to sequentially load the next page of collection partition, one at a time.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def loadNextPage(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Used to sequentially load each collection partition, one at a time.
      *
      * @param partition - ordinal collection position to load next
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def loadNextPartition(partition: Double, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    @JSName("mode")
    var mode_LokiPartitioningAdapter: String = js.native
    
    /* CompleteClass */
    var options: PageSize = js.native
    
    /* CompleteClass */
    var pageIterator: PageIterator | js.Object = js.native
    
    /**
      * Helper method used internally to generate and save the next page of the current (dirty) partition.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def saveNextPage(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    /**
      * Helper method used internally to save each dirty collection, one at a time.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def saveNextPartition(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  }
  
  /**
    * Resultset class allowing chainable queries.  Intended to be instanced internally.
    *    Collection.find(), Collection.where(), and Collection.chain() instantiate this.
    *
    * @example
    *    mycollection.chain()
    *      .find({ 'doors' : 4 })
    *      .where(function(obj) { return obj.name === 'Toyota' })
    *      .data();
    */
  @JSGlobal("Resultset")
  @js.native
  open class Resultset[E /* <: js.Object */] protected ()
    extends StObject
       with typings.lokijs.Resultset[E] {
    /**
      * @param collection - The collection which this Resultset will query against.
      * @param options
      */
    def this(collection: typings.lokijs.Collection[E]) = this()
    def this(collection: typings.lokijs.Collection[E], options: Any) = this()
  }
  
  @JSGlobal("SortedIndex")
  @js.native
  open class SortedIndex protected ()
    extends StObject
       with typings.lokijs.SortedIndex {
    def this(sortedField: String) = this()
    
    /* CompleteClass */
    override def bs(): js.Function2[/* array */ js.Array[Any], /* item */ Any, Found] = js.native
    
    // clear will zap the index
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var field: String = js.native
    
    // get all values which have a key == the given key
    /* CompleteClass */
    override def get(key: Any): js.Array[Any] = js.native
    
    // get all vals from start to end
    /* CompleteClass */
    override def getAll(key: Any, start: Double, end: Double): js.Array[Any] = js.native
    
    // get all values which have a key > the given key
    /* CompleteClass */
    override def getGt(key: Any): js.Array[Any] = js.native
    
    // get all values which have a key < the given key
    /* CompleteClass */
    override def getLt(key: Any): js.Array[Any] = js.native
    
    // just in case someone wants to do something smart with ranges
    /* CompleteClass */
    override def getPos(key: Any): Found = js.native
    
    /* CompleteClass */
    var keys: js.Array[Any] = js.native
    
    // remove the value from the index, if the value was the last one, remove the key
    /* CompleteClass */
    override def remove(key: Any, value: Any): Unit = js.native
    
    // add the value you want returned  to the key in the index
    /* CompleteClass */
    override def set(key: Any, value: Any): Unit = js.native
    
    // and allow override of the default sort
    /* CompleteClass */
    override def setSort(fun: js.Function2[/* target */ Any, /* test */ Any, Double]): Unit = js.native
    
    // set the default sort
    /* CompleteClass */
    override def sort(a: Any, b: Any): `-1` | `0` | `1` = js.native
    
    /* CompleteClass */
    var values: js.Array[Any] = js.native
  }
  
  @JSGlobal("UniqueIndex")
  @js.native
  open class UniqueIndex[E /* <: js.Object */] protected ()
    extends StObject
       with typings.lokijs.UniqueIndex[E] {
    def this(uniqueField: /* keyof E */ String) = this()
  }
  
  // type aliases to allow the nested classes inside LokiConstructor to extend classes sharing them same name(s) as themselves
  @JSGlobal("_Collection")
  @js.native
  open class _Collection[E /* <: js.Object */] ()
    extends StObject
       with typings.lokijs.Collection[E]
  
  @JSGlobal("_DynamicView")
  @js.native
  open class _DynamicView[E /* <: js.Object */] ()
    extends StObject
       with typings.lokijs.DynamicView[E]
  
  @JSGlobal("_KeyValueStore")
  @js.native
  open class _KeyValueStore ()
    extends StObject
       with typings.lokijs.KeyValueStore {
    
    /* CompleteClass */
    override def bs(): js.Function2[/* array */ js.Array[Any], /* item */ Any, Found] = js.native
    
    /* CompleteClass */
    override def get(key: Any): js.Array[Any] = js.native
    
    /* CompleteClass */
    var keys: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def set(key: Any, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def setSort(fun: js.Function2[/* target */ Any, /* test */ Any, Any]): Unit = js.native
    
    /* CompleteClass */
    override def sort(a: Any, b: Any): `-1` | `0` | `1` = js.native
    
    /* CompleteClass */
    var values: js.Array[Any] = js.native
  }
  
  @JSGlobal("_LokiFsAdapter")
  @js.native
  open class _LokiFsAdapter ()
    extends StObject
       with typings.lokijs.LokiFsAdapter {
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
  }
  
  @JSGlobal("_LokiLocalStorageAdapter")
  @js.native
  open class _LokiLocalStorageAdapter ()
    extends StObject
       with typings.lokijs.LokiLocalStorageAdapter {
    
    /**
      * deleteDatabase() - delete the database from localstorage, will throw an error if it
      * can't be deleted
      * @param dbname - the filename of the database to delete
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def deleteDatabase(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /**
      * loadDatabase() - Load data from localstorage
      * @param dbname - the name of the database to load
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* dataOrError */ Any | js.Error, Unit]): Unit = js.native
    
    /**
      * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
      * might want to expand this to avoid dataloss on partial save
      * @param dbname - the filename of the database to load
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def saveDatabase(
      dbname: String,
      dbstring: String,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
  }
  
  @JSGlobal("_LokiMemoryAdapter")
  @js.native
  open class _LokiMemoryAdapter ()
    extends StObject
       with typings.lokijs.LokiMemoryAdapter {
    
    /**
      * Deletes a database from its in-memory store.
      *
      * @param dbname - name of the database (filename/keyname)
      * @param callback - function to call when done
      */
    /* CompleteClass */
    @JSName("deleteDatabase")
    override def deleteDatabase_MLokiMemoryAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /* CompleteClass */
    var hashStore: StringDictionary[Lastsave] = js.native
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    var options: AsyncResponses = js.native
    
    /**
      * Saves a serialized database to its in-memory store.
      * (Loki persistence adapter interface function)
      *
      * @param dbname - name of the database (filename/keyname)
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    @JSName("saveDatabase")
    override def saveDatabase_MLokiMemoryAdapter(dbname: String, dbstring: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  }
  
  @JSGlobal("_LokiPartitioningAdapter")
  @js.native
  open class _LokiPartitioningAdapter ()
    extends StObject
       with typings.lokijs.LokiPartitioningAdapter {
    
    /* CompleteClass */
    var adapter: LokiPersistenceAdapter | Null = js.native
    
    /* CompleteClass */
    var dbname: String = js.native
    
    /* CompleteClass */
    var dbref: typings.lokijs.Loki | Null = js.native
    
    /**
      * Saves a database by partioning into separate key/value saves.
      * (Loki 'reference mode' persistence adapter interface function)
      *
      * @param dbname - name of the database (filename/keyname)
      * @param dbref - reference to database which we will partition and save.
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    @JSName("exportDatabase")
    override def exportDatabase_MLokiPartitioningAdapter(
      dbname: String,
      dbref: typings.lokijs.Loki,
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    /**
      * Used to sequentially load the next page of collection partition, one at a time.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def loadNextPage(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Used to sequentially load each collection partition, one at a time.
      *
      * @param partition - ordinal collection position to load next
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def loadNextPartition(partition: Double, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    @JSName("mode")
    var mode_LokiPartitioningAdapter: String = js.native
    
    /* CompleteClass */
    var options: PageSize = js.native
    
    /* CompleteClass */
    var pageIterator: PageIterator | js.Object = js.native
    
    /**
      * Helper method used internally to generate and save the next page of the current (dirty) partition.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def saveNextPage(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    /**
      * Helper method used internally to save each dirty collection, one at a time.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def saveNextPartition(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  }
  
  /** if an op is registered in this object, our 'calculateRange' can use it with our binary indices.
    * if the op is registered to a function, we will run that function/op as a 2nd pass filter on results.
    * those 2nd pass filter functions should be similar to LokiOps functions, accepting 2 vals to compare.
    */
  object indexedOps {
    
    @JSGlobal("indexedOps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("indexedOps.$aeq")
    @js.native
    def aeq: `true` = js.native
    
    inline def aeq_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$aeq")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$between")
    @js.native
    def between: `true` = js.native
    
    inline def between_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$between")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$dteq")
    @js.native
    def dteq: `true` = js.native
    
    inline def dteq_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$dteq")(x.asInstanceOf[js.Any])
    
    inline def eq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$eq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("indexedOps.$eq")
    @js.native
    def eq_FindexedOps: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    
    inline def eq_FindexedOps_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$eq")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$gt")
    @js.native
    def gt: `true` = js.native
    
    inline def gt_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$gt")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$gte")
    @js.native
    def gte: `true` = js.native
    
    inline def gte_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$gte")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$in")
    @js.native
    def in: `true` = js.native
    
    inline def in_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$in")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$lt")
    @js.native
    def lt: `true` = js.native
    
    inline def lt_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$lt")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$lte")
    @js.native
    def lte: `true` = js.native
    
    inline def lte_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$lte")(x.asInstanceOf[js.Any])
  }
}
