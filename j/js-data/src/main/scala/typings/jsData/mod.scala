package typings.jsData

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jsData.anon.AllOf
import typings.jsData.anon.Array
import typings.jsData.anon.Integer
import typings.jsData.anon.TypeofRecord
import typings.jsData.anon._empty
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-data", "Collection")
  @js.native
  open class Collection () extends Component {
    def this(records: js.Array[Any]) = this()
    def this(records: js.Array[Any], opts: Any) = this()
    def this(records: Unit, opts: Any) = this()
    
    def _onRecordEvent(args: Any*): Unit = js.native
    
    def add(records: Any): Any = js.native
    def add(records: Any, opts: Any): Any = js.native
    
    def afterAdd(args: Any*): Unit = js.native
    
    def afterRemove(args: Any*): Unit = js.native
    
    def afterRemoveAll(args: Any*): Unit = js.native
    
    def beforeAdd(args: Any*): Unit = js.native
    
    def beforeRemove(args: Any*): Unit = js.native
    
    def beforeRemoveAll(args: Any*): Unit = js.native
    
    def between(leftKeys: Any, rightKeys: Any): js.Array[Any] = js.native
    def between(leftKeys: Any, rightKeys: Any, opts: Any): js.Array[Any] = js.native
    
    def createIndex(name: Any, fieldList: Any): this.type = js.native
    def createIndex(name: Any, fieldList: Any, opts: Any): this.type = js.native
    
    def filter(query: Any): js.Array[Any] = js.native
    def filter(query: Any, thisArg: Any): js.Array[Any] = js.native
    
    def forEach(cb: js.Function): Unit = js.native
    def forEach(cb: js.Function, thisArg: Any): Unit = js.native
    
    def get(id: String): Any = js.native
    def get(id: Double): Any = js.native
    
    def getAll(args: Any*): js.Array[Any] = js.native
    
    def getIndex(name: String): Any = js.native
    
    var idAttribute: String = js.native
    
    var index: Index = js.native
    
    var indexes: Any = js.native
    
    def limit(num: Double): js.Array[Any] = js.native
    
    def map(cb: Any, thisArg: Any): js.Array[Any] = js.native
    
    def mapCall(funcName: String, args: Any*): js.Array[Any] = js.native
    
    var mapper: Mapper = js.native
    
    var onConflict: String = js.native
    
    def prune(): js.Array[Any] = js.native
    
    def query(): Query = js.native
    
    def recordId(): Any = js.native
    def recordId(record: Any): Any = js.native
    
    var recordOpts: Any = js.native
    
    def reduce(cb: js.Function, initialValue: Any): Any = js.native
    
    def remove(id: String): Any = js.native
    def remove(id: String, opts: Any): Any = js.native
    def remove(id: Double): Any = js.native
    def remove(id: Double, opts: Any): Any = js.native
    
    def removeAll(query: Any): js.Array[Any] = js.native
    def removeAll(query: Any, opts: Any): js.Array[Any] = js.native
    
    def skip(num: Double): js.Array[Any] = js.native
    
    def toJSON(): js.Array[Any] = js.native
    def toJSON(opts: Any): js.Array[Any] = js.native
    
    def unsaved(): js.Array[Any] = js.native
    
    def updateIndex(record: Any): Unit = js.native
    def updateIndex(record: Any, opts: Any): Unit = js.native
    
    def updateIndexes(record: Any): Unit = js.native
  }
  
  @JSImport("js-data", "Component")
  @js.native
  open class Component () extends StObject {
    def this(opts: Any) = this()
    
    var _listeners: js.Object = js.native
    
    def dbg(args: Any*): Unit = js.native
    
    def emit(key: String, args: Any*): Unit = js.native
    
    def log(level: String, args: Any*): Unit = js.native
    
    def off(): Unit = js.native
    def off(key: String): Unit = js.native
    def off(key: String, handler: js.Function): Unit = js.native
    def off(key: Unit, handler: js.Function): Unit = js.native
    
    def on(key: String, handler: js.Function): Unit = js.native
    def on(key: String, handler: js.Function, ctx: Any): Unit = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("js-data", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[Any]
    inline def extend(instanceProps: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def extend(instanceProps: Any, classProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def extend(instanceProps: Unit, classProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("js-data", "Container")
  @js.native
  open class Container () extends Component {
    def this(opts: Any) = this()
    
    var _adapters: js.Object = js.native
    
    var _mappers: js.Object = js.native
    
    def as(name: String): Any = js.native
    
    def createRecord(name: String): Record = js.native
    def createRecord(name: String, props: Any): Record = js.native
    def createRecord(name: String, props: Any, opts: Any): Record = js.native
    def createRecord(name: String, props: Unit, opts: Any): Record = js.native
    
    def defineMapper(name: String): Mapper = js.native
    def defineMapper(name: String, opts: Any): Mapper = js.native
    
    def defineResource(name: String): Mapper = js.native
    def defineResource(name: String, opts: Any): Mapper = js.native
    
    def getAdapter(name: Any): Any = js.native
    
    def getAdapterName(): String = js.native
    def getAdapterName(opts: Any): String = js.native
    
    def getAdapters(): Any = js.native
    
    def getMapper(name: String): Mapper = js.native
    
    def getMapperByName(name: String): Mapper = js.native
    
    var mapperClass: Instantiable1[/* opts */ js.UndefOr[Any], Mapper] = js.native
    
    var mapperDefaults: Any = js.native
    
    def registerAdapter(name: String, adapter: Any): Unit = js.native
    def registerAdapter(name: String, adapter: Any, opts: Any): Unit = js.native
  }
  
  @JSImport("js-data", "DataStore")
  @js.native
  open class DataStore () extends SimpleStore {
    def this(opts: Any) = this()
    
    @JSName("collectionClass")
    var collectionClass_DataStore: Instantiable0[LinkedCollection] = js.native
  }
  
  @JSImport("js-data", "Index")
  @js.native
  open class Index protected () extends StObject {
    def this(fieldList: js.Array[String]) = this()
    def this(fieldList: js.Array[String], opts: Any) = this()
    
    def _between(leftKeys: Any, rightKeys: Any, opts: Any): js.Array[Any] = js.native
    
    def between(leftKeys: Any, rightKeys: Any): js.Array[Any] = js.native
    def between(leftKeys: Any, rightKeys: Any, opts: Any): js.Array[Any] = js.native
    
    def clear(): Unit = js.native
    
    var fieldGetter: js.Function = js.native
    
    var fieldList: js.Array[String] = js.native
    
    def get(keyList: js.Array[Any]): Any = js.native
    
    def getAll(): js.Array[Any] = js.native
    
    @JSName("hashCode")
    var hashCode_FIndex: js.Function = js.native
    
    def insertRecord(data: Any): Unit = js.native
    
    var isIndex: Boolean = js.native
    
    var keys: js.Array[Any] = js.native
    
    def peek(): Any = js.native
    
    def removeRecord(data: Any): Any = js.native
    
    def set(keyList: js.Array[Any], value: Any): Unit = js.native
    
    def updateRecord(data: Any): Unit = js.native
    
    var values: js.Array[Any] = js.native
    
    def visitAll(cb: js.Function): Unit = js.native
    def visitAll(cb: js.Function, thisArg: Any): Unit = js.native
  }
  
  @JSImport("js-data", "LinkedCollection")
  @js.native
  open class LinkedCollection () extends Collection {
    def this(records: js.Array[Any]) = this()
    def this(records: js.Array[Any], opts: Any) = this()
    def this(records: Unit, opts: Any) = this()
    
    var _added: js.Object = js.native
    
    var datastore: DataStore = js.native
  }
  
  @JSImport("js-data", "Mapper")
  @js.native
  open class Mapper () extends Component {
    def this(opts: Any) = this()
    
    var _adapters: js.Object = js.native
    
    def _end(result: Any, opts: Any): Any = js.native
    def _end(result: Any, opts: Any, skip: Boolean): Any = js.native
    
    def afterCount(query: Any, opts: Any, result: Any): Any = js.native
    
    def afterCreate(props: Any, opts: Any, result: Any): Any = js.native
    
    def afterCreateMany(records: js.Array[Any], opts: Any, result: Any): Any = js.native
    
    def afterDestroy(id: String, opts: Any, result: Any): Any = js.native
    def afterDestroy(id: Double, opts: Any, result: Any): Any = js.native
    
    def afterDestroyAll(query: Any, opts: Any, result: Any): Any = js.native
    
    def afterFind(id: String, opts: Any, result: Any): Any = js.native
    def afterFind(id: Double, opts: Any, result: Any): Any = js.native
    
    def afterFindAll(query: Any, opts: Any, result: Any): Any = js.native
    
    def afterSum(field: String, query: Any, opts: Any, result: Any): Any = js.native
    
    def afterUpdate(id: String, props: Any, opts: Any, result: Any): Any = js.native
    def afterUpdate(id: Double, props: Any, opts: Any, result: Any): Any = js.native
    
    def afterUpdateAll(props: Any, query: Any, opts: Any, result: Any): Any = js.native
    
    def afterUpdateMany(records: js.Array[Any], opts: Any, result: Any): Any = js.native
    
    var applySchema: Boolean = js.native
    
    def beforeCount(query: Any, opts: Any): Any = js.native
    
    def beforeCreate(props: Any, opts: Any): Any = js.native
    
    def beforeCreateMany(records: js.Array[Any], opts: Any): Any = js.native
    
    def beforeDestroy(id: String, opts: Any): Any = js.native
    def beforeDestroy(id: Double, opts: Any): Any = js.native
    
    def beforeDestroyAll(query: Any, opts: Any): Any = js.native
    
    def beforeFind(id: String, opts: Any): Any = js.native
    def beforeFind(id: Double, opts: Any): Any = js.native
    
    def beforeFindAll(query: Any, opts: Any): Any = js.native
    
    def beforeSum(field: String, query: Any, opts: Any): Any = js.native
    
    def beforeUpdate(id: String, opts: Any): Any = js.native
    def beforeUpdate(id: Double, opts: Any): Any = js.native
    
    def beforeUpdateAll(query: Any, opts: Any): Any = js.native
    
    def beforeUpdateMany(records: js.Array[Any], opts: Any): Any = js.native
    
    def belongsTo(relatedMapper: Any, opts: Any): Unit = js.native
    
    def count(query: Any): js.Promise[Any] = js.native
    def count(query: Any, opts: Any): js.Promise[Any] = js.native
    
    def create(props: Any): js.Promise[Any] = js.native
    def create(props: Any, opts: Any): js.Promise[Any] = js.native
    
    def createInstance(props: Any): Any = js.native
    def createInstance(props: Any, opts: Any): Any = js.native
    
    def createMany(records: js.Array[Any]): js.Promise[Any] = js.native
    def createMany(records: js.Array[Any], opts: Any): js.Promise[Any] = js.native
    
    def createRecord(): Record = js.native
    def createRecord(props: Any): Record = js.native
    def createRecord(props: Any, opts: Any): Record = js.native
    def createRecord(props: Unit, opts: Any): Record = js.native
    
    def crud(method: Any, args: Any*): js.Promise[Any] = js.native
    
    var debug: Boolean = js.native
    
    var defaultAdapter: String = js.native
    
    def destroy(id: String): js.Promise[Any] = js.native
    def destroy(id: String, opts: Any): js.Promise[Any] = js.native
    def destroy(id: Double): js.Promise[Any] = js.native
    def destroy(id: Double, opts: Any): js.Promise[Any] = js.native
    
    def destroyAll(query: Any): js.Promise[Any] = js.native
    def destroyAll(query: Any, opts: Any): js.Promise[Any] = js.native
    
    def find(id: String): js.Promise[Any] = js.native
    def find(id: String, opts: Any): js.Promise[Any] = js.native
    def find(id: Double): js.Promise[Any] = js.native
    def find(id: Double, opts: Any): js.Promise[Any] = js.native
    
    def findAll(query: Any): js.Promise[Any] = js.native
    def findAll(query: Any, opts: Any): js.Promise[Any] = js.native
    
    def getAdapter(name: Any): Any = js.native
    
    def getAdapterName(): Any = js.native
    def getAdapterName(opts: Any): Any = js.native
    
    def getAdapters(): Any = js.native
    
    def getSchema(): Schema = js.native
    
    def hasMany(relatedMapper: Any, opts: Any): Unit = js.native
    
    def hasOne(relatedMapper: Any, opts: Any): Unit = js.native
    
    var idAttribute: String = js.native
    
    def is(record: Any): Boolean = js.native
    
    var lifecycleMethods: Any = js.native
    
    var name: String = js.native
    
    @JSName("notify")
    var notify_FMapper: Boolean = js.native
    
    var raw: Boolean = js.native
    
    var recordClass: TypeofRecord = js.native
    
    def registerAdapter(name: String, adapter: Any): Unit = js.native
    def registerAdapter(name: String, adapter: Any, opts: Any): Unit = js.native
    
    var relationFields: js.Array[String] = js.native
    
    var relationList: js.Array[Any] = js.native
    
    var schema: Schema = js.native
    
    def sum(field: String, query: Any): js.Promise[Any] = js.native
    def sum(field: String, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def toJSON(record: Any): js.Object = js.native
    def toJSON(record: Any, opts: Any): js.Object = js.native
    
    def update(id: String, props: Any): js.Promise[Any] = js.native
    def update(id: String, props: Any, opts: Any): js.Promise[Any] = js.native
    def update(id: Double, props: Any): js.Promise[Any] = js.native
    def update(id: Double, props: Any, opts: Any): js.Promise[Any] = js.native
    
    def updateAll(props: Any, query: Any): js.Promise[Any] = js.native
    def updateAll(props: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def updateMany(records: js.Array[Any]): js.Promise[Any] = js.native
    def updateMany(records: js.Array[Any], opts: Any): js.Promise[Any] = js.native
    
    def validate(records: js.Array[Any]): Any = js.native
    def validate(records: js.Array[Any], opts: Any): Any = js.native
    def validate(records: Any): Any = js.native
    def validate(records: Any, opts: Any): Any = js.native
  }
  
  @JSImport("js-data", "Query")
  @js.native
  open class Query () extends Component {
    def this(collection: Collection) = this()
    
    def between(leftKeys: Any, rightKeys: Any): this.type = js.native
    def between(leftKeys: Any, rightKeys: Any, opts: Any): this.type = js.native
    
    var collection: Collection | LinkedCollection = js.native
    
    def compare(orderBy: Any, index: Any, a: Any, b: Any): Any = js.native
    
    var data: js.Array[Any] = js.native
    
    def evaluate(value: Any, op: String, predicate: Any): Boolean = js.native
    
    def filter(query: Any): this.type = js.native
    def filter(query: Any, thisArg: Any): this.type = js.native
    
    def forEach(forEachFn: js.Function): this.type = js.native
    def forEach(forEachFn: js.Function, thisArg: Any): this.type = js.native
    
    def get(): this.type = js.native
    def get(keyList: js.Array[Any]): this.type = js.native
    def get(keyList: js.Array[Any], opts: Any): this.type = js.native
    def get(keyList: Unit, opts: Any): this.type = js.native
    
    def getAll(args: Any*): this.type = js.native
    
    def getData(): js.Array[Any] = js.native
    
    def like(pattern: Any, flags: Any): js.RegExp = js.native
    
    def limit(num: Double): this.type = js.native
    
    def map(mapFn: js.Function): this.type = js.native
    def map(mapFn: js.Function, thisArg: Any): this.type = js.native
    
    def mapCall(funcName: String, args: Any*): this.type = js.native
    
    def run(): js.Array[Any] = js.native
    
    def skip(num: Double): this.type = js.native
  }
  /* static members */
  object Query {
    
    @JSImport("js-data", "Query")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("js-data", "Query.ops")
    @js.native
    def ops: _empty = js.native
    inline def ops_=(x: _empty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ops")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("js-data", "Record")
  @js.native
  open class Record () extends Component {
    def this(props: Any) = this()
    def this(props: Any, opts: Any) = this()
    def this(props: Unit, opts: Any) = this()
    
    def _get(prop: String): Any = js.native
    
    def _mapper(): Mapper = js.native
    
    def _set(prop: Any): Unit = js.native
    def _set(prop: Any, value: Any): Unit = js.native
    
    def _unset(prop: Any): Unit = js.native
    
    def afterLoadRelations(): Unit = js.native
    
    def afterSave(): Unit = js.native
    
    def beforeLoadRelations(): Unit = js.native
    
    def beforeSave(): Unit = js.native
    
    def changeHistory(): js.Array[Any] = js.native
    
    def changes(): Diff = js.native
    def changes(opts: Any): Diff = js.native
    
    def commit(): this.type = js.native
    
    def create(): js.Promise[Record] = js.native
    def create(opts: Any): js.Promise[Record] = js.native
    
    def destroy(): js.Promise[Any] = js.native
    def destroy(opts: Any): js.Promise[Any] = js.native
    
    def get(key: String): Any = js.native
    
    def hasChanges(): Boolean = js.native
    def hasChanges(opts: Any): Boolean = js.native
    
    def isNew(): Boolean = js.native
    
    def loadRelations(relations: Any): js.Promise[this.type] = js.native
    def loadRelations(relations: Any, opts: Any): js.Promise[this.type] = js.native
    
    def previous(key: Any): Any = js.native
    
    def revert(): this.type = js.native
    def revert(opts: Any): this.type = js.native
    
    def save(): js.Promise[this.type] = js.native
    def save(opts: Any): js.Promise[this.type] = js.native
    
    def set(key: String): Unit = js.native
    def set(key: String, value: Any): Unit = js.native
    def set(key: String, value: Any, opts: Any): Unit = js.native
    def set(key: String, value: Unit, opts: Any): Unit = js.native
    
    def toJSON(): Any = js.native
    def toJSON(opts: Any): Any = js.native
    
    def unset(key: String): Unit = js.native
    def unset(key: String, opts: Any): Unit = js.native
    
    def validate(): Any = js.native
    def validate(opts: Any): Any = js.native
  }
  /* static members */
  object Record {
    
    @JSImport("js-data", "Record")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("js-data", "Record.mapper")
    @js.native
    def mapper: Mapper = js.native
    inline def mapper_=(x: Mapper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapper")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("js-data", "Schema")
  @js.native
  open class Schema protected () extends Component {
    def this(definition: Any) = this()
    
    @JSName("apply")
    def apply(target: Any): Unit = js.native
    @JSName("apply")
    def apply(target: Any, opts: Any): Unit = js.native
    
    def applyDefaults(target: Any): Unit = js.native
    
    def makeDescriptor(prop: String, schema: Schema): Any = js.native
    def makeDescriptor(prop: String, schema: Schema, opts: Any): Any = js.native
    
    def pick(value: Any): Any = js.native
    
    var properties: Any = js.native
    
    def validate(value: Any): js.Array[SchemaValidationError] = js.native
    def validate(value: Any, opts: Any): js.Array[SchemaValidationError] = js.native
  }
  /* static members */
  object Schema {
    
    @JSImport("js-data", "Schema")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("js-data", "Schema.typeGroupValidators")
    @js.native
    def typeGroupValidators: Integer = js.native
    inline def typeGroupValidators_=(x: Integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeGroupValidators")(x.asInstanceOf[js.Any])
    
    @JSImport("js-data", "Schema.types")
    @js.native
    def types: Array = js.native
    inline def types_=(x: Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
    
    inline def validate(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[SchemaValidationError]]
    
    @JSImport("js-data", "Schema.validationKeywords")
    @js.native
    def validationKeywords: AllOf = js.native
    inline def validationKeywords_=(x: AllOf): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationKeywords")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("js-data", "Settable")
  @js.native
  open class Settable () extends StObject
  /* static members */
  object Settable {
    
    @JSImport("js-data", "Settable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[Any]
    inline def extend(instanceProps: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def extend(instanceProps: Any, classProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def extend(instanceProps: Unit, classProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("js-data", "SimpleStore")
  @js.native
  open class SimpleStore () extends Container {
    def this(opts: Any) = this()
    
    def _callSuper(method: String, args: Any*): Any = js.native
    
    var _collections: js.Object = js.native
    
    var _completedQueries: js.Object = js.native
    
    def _end(mapperName: String, data: Any): Any = js.native
    def _end(mapperName: String, data: Any, opts: Any): Any = js.native
    
    var _pendingQueries: js.Object = js.native
    
    def add(mapperName: String, records: js.Array[Any]): js.Array[Any] | Any = js.native
    def add(mapperName: String, records: js.Array[Any], opts: Any): js.Array[Any] | Any = js.native
    def add(mapperName: String, records: Any): js.Array[Any] | Any = js.native
    def add(mapperName: String, records: Any, opts: Any): js.Array[Any] | Any = js.native
    
    def addToCache(mapperName: String, data: Any, opts: Any): Any = js.native
    
    def between(mapperName: String, leftKeys: Any, rightKeys: Any): js.Array[Any] = js.native
    def between(mapperName: String, leftKeys: Any, rightKeys: Any, opts: Any): js.Array[Any] = js.native
    
    def cacheFind(mapperName: String, data: Any, id: String, opts: Any): Unit = js.native
    def cacheFind(mapperName: String, data: Any, id: Double, opts: Any): Unit = js.native
    
    def cacheFindAll(mapperName: String, data: Any, hash: String, opts: Any): Unit = js.native
    
    def cachedFind(mapperName: String, id: String, opts: Any): Any = js.native
    def cachedFind(mapperName: String, id: Any): Any = js.native
    def cachedFind(mapperName: String, id: Any, opts: Any): Any = js.native
    def cachedFind(mapperName: String, id: Double, opts: Any): Any = js.native
    
    def cachedFindAll(mapperName: String, hash: String, opts: Any): Any = js.native
    def cachedFindAll(mapperName: String, query: Any): Any = js.native
    def cachedFindAll(mapperName: String, query: Any, opts: Any): Any = js.native
    
    def clear(): Any = js.native
    
    var collectionClass: Instantiable2[/* records */ js.UndefOr[js.Array[Any]], /* opts */ js.UndefOr[Any], Collection] = js.native
    
    def create(mapperName: String, record: Any): js.Promise[Any] = js.native
    def create(mapperName: String, record: Any, opts: Any): js.Promise[Any] = js.native
    
    def createIndex(mapperName: String, name: Any, fieldList: Any): Collection = js.native
    def createIndex(mapperName: String, name: Any, fieldList: Any, opts: Any): Collection = js.native
    
    def createMany(mapperName: String, records: Any): js.Promise[js.Array[Any] | Any] = js.native
    def createMany(mapperName: String, records: Any, opts: Any): js.Promise[js.Array[Any] | Any] = js.native
    
    def destroy(mapperName: String, id: Any): js.Promise[Any] = js.native
    def destroy(mapperName: String, id: Any, opts: Any): js.Promise[Any] = js.native
    
    def destroyAll(mapperName: String): js.Promise[Any] = js.native
    def destroyAll(mapperName: String, query: Any): js.Promise[Any] = js.native
    def destroyAll(mapperName: String, query: Any, opts: Any): js.Promise[Any] = js.native
    def destroyAll(mapperName: String, query: Unit, opts: Any): js.Promise[Any] = js.native
    
    def filter(mapperName: String, query: Any): js.Array[Any] = js.native
    def filter(mapperName: String, query: Any, thisArg: Any): js.Array[Any] = js.native
    
    def find(mapperName: String, id: Any): js.Promise[Any] = js.native
    def find(mapperName: String, id: Any, opts: Any): js.Promise[Any] = js.native
    
    def findAll(mapperName: String): js.Promise[Any] = js.native
    def findAll(mapperName: String, query: Any): js.Promise[Any] = js.native
    def findAll(mapperName: String, query: Any, opts: Any): js.Promise[Any] = js.native
    def findAll(mapperName: String, query: Unit, opts: Any): js.Promise[Any] = js.native
    
    def get(mapperName: String, id: String): Any = js.native
    def get(mapperName: String, id: Double): Any = js.native
    
    def getAll(mapperName: String, args: Any*): js.Array[Any] = js.native
    
    def getCollection(mapperName: String): Collection = js.native
    
    def hashQuery(mapperName: String, query: Any): String = js.native
    def hashQuery(mapperName: String, query: Any, opts: Any): String = js.native
    
    def query(mapperName: String): Query = js.native
    
    def remove(mapperName: String, id: String): Any = js.native
    def remove(mapperName: String, id: String, opts: Any): Any = js.native
    def remove(mapperName: String, id: Double): Any = js.native
    def remove(mapperName: String, id: Double, opts: Any): Any = js.native
    
    def removeAll(mapperName: String): Unit | js.Array[Any] = js.native
    def removeAll(mapperName: String, query: Any): Unit | js.Array[Any] = js.native
    def removeAll(mapperName: String, query: Any, opts: Any): Unit | js.Array[Any] = js.native
    def removeAll(mapperName: String, query: Unit, opts: Any): Unit | js.Array[Any] = js.native
    
    def toJson(mapperName: String): js.Array[Any] = js.native
    def toJson(mapperName: String, opts: Any): js.Array[Any] = js.native
    
    def update(mapperName: String, id: Any, record: Any): js.Promise[Any] = js.native
    def update(mapperName: String, id: Any, record: Any, opts: Any): js.Promise[Any] = js.native
    
    def updateAll(mapperName: String, props: Any): js.Promise[js.Array[Any] | Any] = js.native
    def updateAll(mapperName: String, props: Any, query: Any): js.Promise[js.Array[Any] | Any] = js.native
    def updateAll(mapperName: String, props: Any, query: Any, opts: Any): js.Promise[js.Array[Any] | Any] = js.native
    def updateAll(mapperName: String, props: Any, query: Unit, opts: Any): js.Promise[js.Array[Any] | Any] = js.native
    
    def updateMany(mapperName: String, records: Any): js.Promise[js.Array[Any] | Any] = js.native
    def updateMany(mapperName: String, records: Any, opts: Any): js.Promise[js.Array[Any] | Any] = js.native
    
    var usePendingFind: Boolean = js.native
    
    var usePendingFindAll: Boolean = js.native
  }
  
  inline def belongsTo(related: Any, opts: Any): js.Function1[/* target */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("belongsTo")(related.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ Any, Unit]]
  
  @JSImport("js-data", "belongsToType")
  @js.native
  val belongsToType: String = js.native
  
  inline def hasMany(related: Any, opts: Any): js.Function1[/* target */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMany")(related.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ Any, Unit]]
  
  @JSImport("js-data", "hasManyType")
  @js.native
  val hasManyType: String = js.native
  
  inline def hasOne(related: Any, opts: Any): js.Function1[/* target */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOne")(related.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ Any, Unit]]
  
  @JSImport("js-data", "hasOneType")
  @js.native
  val hasOneType: String = js.native
  
  object utils {
    
    @JSImport("js-data", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("js-data", "utils.Promise")
    @js.native
    open class Promise[T] protected ()
      extends StObject
         with typings.std.Promise[T] {
      /**
        * Creates a new Promise.
        * @param executor A callback used to initialize the promise. This callback is passed two arguments:
        * a resolve callback used to resolve the promise with a value or the result of another promise,
        * and a reject callback used to reject the promise with a provided reason or error.
        */
      /* standard es2015.promise */
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
                Unit
              ]) = this()
    }
    @JSImport("js-data", "utils.Promise")
    @js.native
    def Promise: PromiseConstructor = js.native
    inline def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    inline def _underscore(dest: Any, src: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addHiddenPropsToTarget(target: js.Object, props: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHiddenPropsToTarget")(target.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def areDifferent(a: js.Object, b: js.Object, opts: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areDifferent")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def classCallCheck(instance: js.Object, ctor: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("classCallCheck")(instance.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def copy(from: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def copy(from: Any, to: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Any, stackTo: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Any, stackTo: Any, blacklist: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Any, stackTo: Any, blacklist: js.Array[Any], plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Any, stackTo: Any, blacklist: Unit, plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Any, stackTo: Unit, blacklist: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Any, stackTo: Unit, blacklist: js.Array[Any], plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Any, stackTo: Unit, blacklist: Unit, plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Unit, stackTo: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Unit, stackTo: Any, blacklist: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Unit, stackTo: Any, blacklist: js.Array[Any], plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Unit, stackTo: Any, blacklist: Unit, plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Unit, stackTo: Unit, blacklist: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Unit, stackTo: Unit, blacklist: js.Array[Any], plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Any, stackFrom: Unit, stackTo: Unit, blacklist: Unit, plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Any, stackTo: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Any, stackTo: Any, blacklist: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Any, stackTo: Any, blacklist: js.Array[Any], plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Any, stackTo: Any, blacklist: Unit, plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Any, stackTo: Unit, blacklist: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Any, stackTo: Unit, blacklist: js.Array[Any], plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Any, stackTo: Unit, blacklist: Unit, plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Unit, stackTo: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Unit, stackTo: Any, blacklist: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Unit, stackTo: Any, blacklist: js.Array[Any], plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Unit, stackTo: Any, blacklist: Unit, plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Unit, stackTo: Unit, blacklist: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Unit, stackTo: Unit, blacklist: js.Array[Any], plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def copy(from: Any, to: Unit, stackFrom: Unit, stackTo: Unit, blacklist: Unit, plain: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def deepEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def deepFillIn(dest: js.Object, source: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFillIn")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def deepMixIn(dest: js.Object, source: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMixIn")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def diffObjects(a: Any, b: Any, opts: Any): Diff = (^.asInstanceOf[js.Dynamic].applyDynamic("diffObjects")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Diff]
    
    inline def equal(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def eventify(target: Any, getter: js.Function, setter: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventify")(target.asInstanceOf[js.Any], getter.asInstanceOf[js.Any], setter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eventify(target: Any, getter: js.Function, setter: js.Function, enumerable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventify")(target.asInstanceOf[js.Any], getter.asInstanceOf[js.Any], setter.asInstanceOf[js.Any], enumerable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def extend(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[js.Function]
    inline def extend(props: Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend(props: Any, classProps: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend(props: Unit, classProps: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    inline def fillIn(dest: js.Object, src: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillIn")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def findIndex(array: js.Array[Any], fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def forEachRelation(mapper: Any, opts: Any, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachRelation")(mapper.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEachRelation(mapper: Any, opts: Any, fn: js.Function, ctx: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachRelation")(mapper.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def forOwn(obj: Any, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forOwn")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forOwn(obj: Any, fn: js.Function, thisArg: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forOwn")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def forRelation(opts: Any, `def`: Any, fn: js.Function, ctx: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_forRelation")(opts.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fromJson(json: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(json.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def get(`object`: js.Object, prop: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getIndex(list: js.Array[Any], relation: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_getIndex")(list.asInstanceOf[js.Any], relation.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getSuper(instance: Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuper")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def getSuper(instance: Any, isCtor: Boolean): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuper")(instance.asInstanceOf[js.Any], isCtor.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    inline def intersection(array1: js.Array[Any], array2: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def isArray(arg: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isBlacklisted(prop: String, bl: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlacklisted")(prop.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isBoolean(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("js-data", "utils.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    inline def isDate(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFunction(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isInteger(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNull(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNumber(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isRegExp(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSorN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSorN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isUndefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def logify(target: Any, defaultNamespace: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logify")(target.asInstanceOf[js.Any], defaultNamespace.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def noDupeAdd(array: js.Array[Any], record: Any, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noDupeAdd")(array.asInstanceOf[js.Any], record.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def omit(props: js.Object, keys: js.Array[String]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(props.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def plainCopy(from: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("plainCopy")(from.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def possibleConstructorReturn(self: js.Object, call: js.Function): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("possibleConstructorReturn")(self.asInstanceOf[js.Any], call.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def possibleConstructorReturn(self: js.Object, call: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("possibleConstructorReturn")(self.asInstanceOf[js.Any], call.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def reject(value: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def remove(array: js.Array[Any], fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resolve(value: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def set(`object`: js.Object, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def set(`object`: js.Object, path: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toJson(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toJson(value: Any, replacer: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toJson(value: Any, replacer: js.Function, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toJson(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def unset(`object`: js.Object, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unset")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object version {
    
    @JSImport("js-data", "version")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("js-data", "version.alpha")
    @js.native
    def alpha: String | Boolean = js.native
    inline def alpha_=(x: String | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alpha")(x.asInstanceOf[js.Any])
    
    @JSImport("js-data", "version.beta")
    @js.native
    def beta: String | Boolean = js.native
    inline def beta_=(x: String | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beta")(x.asInstanceOf[js.Any])
    
    @JSImport("js-data", "version.full")
    @js.native
    def full: String = js.native
    inline def full_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("full")(x.asInstanceOf[js.Any])
    
    @JSImport("js-data", "version.major")
    @js.native
    def major: Double = js.native
    inline def major_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("major")(x.asInstanceOf[js.Any])
    
    @JSImport("js-data", "version.minor")
    @js.native
    def minor: Double = js.native
    inline def minor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minor")(x.asInstanceOf[js.Any])
    
    @JSImport("js-data", "version.patch")
    @js.native
    def patch: Double = js.native
    inline def patch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("patch")(x.asInstanceOf[js.Any])
  }
  
  trait Diff extends StObject {
    
    var added: Any
    
    var changed: Any
    
    var removed: Any
  }
  object Diff {
    
    inline def apply(added: Any, changed: Any, removed: Any): Diff = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diff]
    }
    
    extension [Self <: Diff](x: Self) {
      
      inline def setAdded(value: Any): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setChanged(value: Any): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Any): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  trait SchemaValidationError extends StObject {
    
    var actual: String
    
    var expected: Any
    
    var path: String
  }
  object SchemaValidationError {
    
    inline def apply(actual: String, expected: Any, path: String): SchemaValidationError = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaValidationError]
    }
    
    extension [Self <: SchemaValidationError](x: Self) {
      
      inline def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
