package typings.lokijs

import typings.lokijs.anon.AsyncResponses
import typings.lokijs.anon.PageSize
import typings.lokijs.anon.PartialDynamicViewOptions
import typings.lokijs.anon.PartialLokiConstructorOpt
import typings.lokijs.lokijsBooleans.`true`
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Collection class that handles documents of same type
    * @implements LokiEventEmitter
    * @see {@link Loki#addCollection} for normal creation of collections
    */
  @JSGlobal("Collection")
  @js.native
  class Collection[E /* <: js.Object */] protected ()
    extends typings.lokijs.Collection[E] {
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
    *
    * @implements LokiEventEmitter
    */
  @JSGlobal("DynamicView")
  @js.native
  class DynamicView[E /* <: js.Object */] protected ()
    extends typings.lokijs.DynamicView[E] {
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
  class ExactIndex[E /* <: js.Object */] protected ()
    extends typings.lokijs.ExactIndex[E] {
    def this(exactField: /* keyof E */ String) = this()
  }
  
  @JSGlobal("KeyValueStore")
  @js.native
  class KeyValueStore ()
    extends typings.lokijs.KeyValueStore
  
  /**
    * Loki: The main database class
    * @implements LokiEventEmitter
    */
  @JSGlobal("Loki")
  @js.native
  class Loki protected ()
    extends typings.lokijs.Loki {
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
  class LokiConstructor protected ()
    extends typings.lokijs.Loki {
    def this(filename: String) = this()
    def this(filename: String, options: PartialLokiConstructorOpt) = this()
  }
  object LokiConstructor {
    
    @JSGlobal("LokiConstructor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("LokiConstructor.Collection")
    @js.native
    class Collection[E /* <: js.Object */] ()
      extends typings.lokijs.Collection[E]
    
    @JSGlobal("LokiConstructor.KeyValueStore")
    @js.native
    class KeyValueStore ()
      extends typings.lokijs.KeyValueStore
    
    @JSGlobal("LokiConstructor.LokiFsAdapter")
    @js.native
    class LokiFsAdapter ()
      extends typings.lokijs.LokiFsAdapter
    
    @JSGlobal("LokiConstructor.LokiLocalStorageAdapter")
    @js.native
    class LokiLocalStorageAdapter ()
      extends typings.lokijs.LokiLocalStorageAdapter
    
    @JSGlobal("LokiConstructor.LokiMemoryAdapter")
    @js.native
    class LokiMemoryAdapter ()
      extends typings.lokijs.LokiMemoryAdapter
    
    @JSGlobal("LokiConstructor.LokiOps")
    @js.native
    def LokiOps: typings.lokijs.LokiOps = js.native
    @scala.inline
    def LokiOps_=(x: LokiOps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LokiOps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("LokiConstructor.LokiPartitioningAdapter")
    @js.native
    class LokiPartitioningAdapter ()
      extends typings.lokijs.LokiPartitioningAdapter
    
    @JSGlobal("LokiConstructor.aeq")
    @js.native
    def aeq(prop1: js.Any, prop2: js.Any): Boolean = js.native
    
    @JSGlobal("LokiConstructor.gt")
    @js.native
    def gt(prop1: js.Any, prop2: js.Any): Boolean = js.native
    @JSGlobal("LokiConstructor.gt")
    @js.native
    def gt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
    
    @JSGlobal("LokiConstructor.lt")
    @js.native
    def lt(prop1: js.Any, prop2: js.Any): Boolean = js.native
    @JSGlobal("LokiConstructor.lt")
    @js.native
    def lt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
    
    object persistenceAdapters {
      
      @JSGlobal("LokiConstructor.persistenceAdapters")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("LokiConstructor.persistenceAdapters.fs")
      @js.native
      def fs: typings.lokijs._LokiFsAdapter = js.native
      @scala.inline
      def fs_=(x: typings.lokijs._LokiFsAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fs")(x.asInstanceOf[js.Any])
      
      @JSGlobal("LokiConstructor.persistenceAdapters.localStorage")
      @js.native
      def localStorage: typings.lokijs._LokiLocalStorageAdapter = js.native
      @scala.inline
      def localStorage_=(x: typings.lokijs._LokiLocalStorageAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * LokiEventEmitter is a minimalist version of EventEmitter. It enables any
    * constructor that inherits EventEmitter to emit events and trigger
    * listeners that have been added to the event through the on(event, callback) method
    *
    * @constructor LokiEventEmitter
    */
  @JSGlobal("LokiEventEmitter")
  @js.native
  class LokiEventEmitter ()
    extends typings.lokijs.LokiEventEmitter
  
  /**
    * A loki persistence adapter which persists using node fs module
    * @constructor LokiFsAdapter
    */
  @JSGlobal("LokiFsAdapter")
  @js.native
  class LokiFsAdapter ()
    extends typings.lokijs.LokiFsAdapter
  
  /**
    * A loki persistence adapter which persists to web browser's local storage object
    * @constructor LokiLocalStorageAdapter
    */
  @JSGlobal("LokiLocalStorageAdapter")
  @js.native
  class LokiLocalStorageAdapter ()
    extends typings.lokijs.LokiLocalStorageAdapter
  
  /**
    * In in-memory persistence adapter for an in-memory database.
    * This simple 'key/value' adapter is intended for unit testing and diagnostics.
    *
    * @param [options] - memory adapter options
    * @param [options.asyncResponses=false] - whether callbacks are invoked asynchronously
    * @param [options.asyncTimeout=50] - timeout in ms to queue callbacks
    * @constructor LokiMemoryAdapter
    */
  @JSGlobal("LokiMemoryAdapter")
  @js.native
  class LokiMemoryAdapter ()
    extends typings.lokijs.LokiMemoryAdapter {
    def this(options: AsyncResponses) = this()
  }
  
  object LokiOps {
    
    // abstract/loose equality
    @JSGlobal("LokiOps.$aeq")
    @js.native
    def aeq(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$and")
    @js.native
    def and(a: js.Any, b: js.Any): Boolean = js.native
    
    /** ex : coll.find({'orderCount': {$between: [10, 50]}}); */
    @JSGlobal("LokiOps.$between")
    @js.native
    def between(a: js.Any, vals: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$contains")
    @js.native
    def contains(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$containsAny")
    @js.native
    def containsAny(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$containsNone")
    @js.native
    def containsNone(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$containsString")
    @js.native
    def containsString(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$definedin")
    @js.native
    def definedin(a: js.Any, b: js.Any): Boolean = js.native
    
    // date equality / loki abstract equality test
    @JSGlobal("LokiOps.$dteq")
    @js.native
    def dteq(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$eq")
    @js.native
    def eq(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$finite")
    @js.native
    def finite(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$gt")
    @js.native
    def gt(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$gte")
    @js.native
    def gte(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$in")
    @js.native
    def in(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$jbetween")
    @js.native
    def jbetween(a: js.Any, vals: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$jgt")
    @js.native
    def jgt(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$jgte")
    @js.native
    def jgte(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$jlt")
    @js.native
    def jlt(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$jlte")
    @js.native
    def jlte(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$keyin")
    @js.native
    def keyin(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$len")
    @js.native
    def len(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$lt")
    @js.native
    def lt(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$lte")
    @js.native
    def lte(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$ne")
    @js.native
    def ne(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$nin")
    @js.native
    def nin(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$nkeyin")
    @js.native
    def nkeyin(a: js.Any, b: js.Any): Boolean = js.native
    
    // field-level logical operators
    // a is the value in the collection
    // b is the nested query operation (for '$not')
    //   or an array of nested query operations (for '$and' and '$or')
    @JSGlobal("LokiOps.$not")
    @js.native
    def not(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$or")
    @js.native
    def or(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$regex")
    @js.native
    def regex(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$size")
    @js.native
    def size(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$undefinedin")
    @js.native
    def undefinedin(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$where")
    @js.native
    def where(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSGlobal("LokiOps.$type")
    @js.native
    def `type`(a: js.Any, b: js.Any): Boolean = js.native
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
    * @constructor LokiPartitioningAdapter
    */
  @JSGlobal("LokiPartitioningAdapter")
  @js.native
  class LokiPartitioningAdapter protected ()
    extends typings.lokijs.LokiPartitioningAdapter {
    def this(adapter: LokiPersistenceAdapter) = this()
    def this(adapter: LokiPersistenceAdapter, options: PageSize) = this()
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
  class Resultset[E /* <: js.Object */] protected ()
    extends typings.lokijs.Resultset[E] {
    /**
      * @param collection - The collection which this Resultset will query against.
      * @param options
      */
    def this(collection: typings.lokijs.Collection[E]) = this()
    def this(collection: typings.lokijs.Collection[E], options: js.Any) = this()
  }
  
  @JSGlobal("SortedIndex")
  @js.native
  class SortedIndex protected ()
    extends typings.lokijs.SortedIndex {
    def this(sortedField: String) = this()
  }
  
  @JSGlobal("UniqueIndex")
  @js.native
  class UniqueIndex[E /* <: js.Object */] protected ()
    extends typings.lokijs.UniqueIndex[E] {
    def this(uniqueField: /* keyof E */ String) = this()
  }
  
  // type aliases to allow the nested classes inside LokiConstructor to extend classes sharing them same name(s) as themselves
  @JSGlobal("_Collection")
  @js.native
  class _Collection[E /* <: js.Object */] ()
    extends typings.lokijs.Collection[E]
  
  @JSGlobal("_KeyValueStore")
  @js.native
  class _KeyValueStore ()
    extends typings.lokijs.KeyValueStore
  
  @JSGlobal("_LokiFsAdapter")
  @js.native
  class _LokiFsAdapter ()
    extends typings.lokijs.LokiFsAdapter
  
  @JSGlobal("_LokiLocalStorageAdapter")
  @js.native
  class _LokiLocalStorageAdapter ()
    extends typings.lokijs.LokiLocalStorageAdapter
  
  @JSGlobal("_LokiMemoryAdapter")
  @js.native
  class _LokiMemoryAdapter ()
    extends typings.lokijs.LokiMemoryAdapter
  
  @JSGlobal("_LokiPartitioningAdapter")
  @js.native
  class _LokiPartitioningAdapter ()
    extends typings.lokijs.LokiPartitioningAdapter
  
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
    
    @scala.inline
    def aeq_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$aeq")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$between")
    @js.native
    def between: `true` = js.native
    
    @scala.inline
    def between_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$between")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$dteq")
    @js.native
    def dteq: `true` = js.native
    
    @scala.inline
    def dteq_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$dteq")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$eq")
    @js.native
    def eq(a: js.Any, b: js.Any): Boolean = js.native
    @JSGlobal("indexedOps.$eq")
    @js.native
    def eq_FindexedOps: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    
    @scala.inline
    def eq_FindexedOps_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$eq")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$gt")
    @js.native
    def gt: `true` = js.native
    
    @scala.inline
    def gt_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$gt")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$gte")
    @js.native
    def gte: `true` = js.native
    
    @scala.inline
    def gte_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$gte")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$in")
    @js.native
    def in: `true` = js.native
    
    @scala.inline
    def in_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$in")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$lt")
    @js.native
    def lt: `true` = js.native
    
    @scala.inline
    def lt_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$lt")(x.asInstanceOf[js.Any])
    
    @JSGlobal("indexedOps.$lte")
    @js.native
    def lte: `true` = js.native
    
    @scala.inline
    def lte_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$lte")(x.asInstanceOf[js.Any])
  }
}
