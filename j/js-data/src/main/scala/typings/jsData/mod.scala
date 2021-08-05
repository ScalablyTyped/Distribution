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
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-data", "Collection")
  @js.native
  class Collection () extends Component {
    def this(records: js.Array[js.Any]) = this()
    def this(records: js.Array[js.Any], opts: js.Any) = this()
    def this(records: Unit, opts: js.Any) = this()
    
    def _onRecordEvent(args: js.Any*): Unit = js.native
    
    def add(records: js.Any): js.Any = js.native
    def add(records: js.Any, opts: js.Any): js.Any = js.native
    
    def afterAdd(args: js.Any*): Unit = js.native
    
    def afterRemove(args: js.Any*): Unit = js.native
    
    def afterRemoveAll(args: js.Any*): Unit = js.native
    
    def beforeAdd(args: js.Any*): Unit = js.native
    
    def beforeRemove(args: js.Any*): Unit = js.native
    
    def beforeRemoveAll(args: js.Any*): Unit = js.native
    
    def between(leftKeys: js.Any, rightKeys: js.Any): js.Array[js.Any] = js.native
    def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[js.Any] = js.native
    
    def createIndex(name: js.Any, fieldList: js.Any): this.type = js.native
    def createIndex(name: js.Any, fieldList: js.Any, opts: js.Any): this.type = js.native
    
    def filter(query: js.Any): js.Array[js.Any] = js.native
    def filter(query: js.Any, thisArg: js.Any): js.Array[js.Any] = js.native
    
    def forEach(cb: js.Function): Unit = js.native
    def forEach(cb: js.Function, thisArg: js.Any): Unit = js.native
    
    def get(id: String): js.Any = js.native
    def get(id: Double): js.Any = js.native
    
    def getAll(args: js.Any*): js.Array[js.Any] = js.native
    
    def getIndex(name: String): js.Any = js.native
    
    var idAttribute: String = js.native
    
    var index: Index = js.native
    
    var indexes: js.Any = js.native
    
    def limit(num: Double): js.Array[js.Any] = js.native
    
    def map(cb: js.Any, thisArg: js.Any): js.Array[js.Any] = js.native
    
    def mapCall(funcName: String, args: js.Any*): js.Array[js.Any] = js.native
    
    var mapper: Mapper = js.native
    
    var onConflict: String = js.native
    
    def prune(): js.Array[js.Any] = js.native
    
    def query(): Query = js.native
    
    def recordId(): js.Any = js.native
    def recordId(record: js.Any): js.Any = js.native
    
    var recordOpts: js.Any = js.native
    
    def reduce(cb: js.Function, initialValue: js.Any): js.Any = js.native
    
    def remove(id: String): js.Any = js.native
    def remove(id: String, opts: js.Any): js.Any = js.native
    def remove(id: Double): js.Any = js.native
    def remove(id: Double, opts: js.Any): js.Any = js.native
    
    def removeAll(query: js.Any): js.Array[js.Any] = js.native
    def removeAll(query: js.Any, opts: js.Any): js.Array[js.Any] = js.native
    
    def skip(num: Double): js.Array[js.Any] = js.native
    
    def toJSON(): js.Array[js.Any] = js.native
    def toJSON(opts: js.Any): js.Array[js.Any] = js.native
    
    def unsaved(): js.Array[js.Any] = js.native
    
    def updateIndex(record: js.Any): Unit = js.native
    def updateIndex(record: js.Any, opts: js.Any): Unit = js.native
    
    def updateIndexes(record: js.Any): Unit = js.native
  }
  
  @JSImport("js-data", "Component")
  @js.native
  class Component () extends StObject {
    def this(opts: js.Any) = this()
    
    var _listeners: js.Object = js.native
    
    def dbg(args: js.Any*): Unit = js.native
    
    def emit(key: String, args: js.Any*): Unit = js.native
    
    def log(level: String, args: js.Any*): Unit = js.native
    
    def off(): Unit = js.native
    def off(key: String): Unit = js.native
    def off(key: String, handler: js.Function): Unit = js.native
    def off(key: Unit, handler: js.Function): Unit = js.native
    
    def on(key: String, handler: js.Function): Unit = js.native
    def on(key: String, handler: js.Function, ctx: js.Any): Unit = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("js-data", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[js.Any]
    inline def extend(instanceProps: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def extend(instanceProps: js.Any, classProps: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def extend(instanceProps: Unit, classProps: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSImport("js-data", "Container")
  @js.native
  class Container () extends Component {
    def this(opts: js.Any) = this()
    
    var _adapters: js.Object = js.native
    
    var _mappers: js.Object = js.native
    
    def as(name: String): js.Any = js.native
    
    def createRecord(name: String): Record = js.native
    def createRecord(name: String, props: js.Any): Record = js.native
    def createRecord(name: String, props: js.Any, opts: js.Any): Record = js.native
    def createRecord(name: String, props: Unit, opts: js.Any): Record = js.native
    
    def defineMapper(name: String): Mapper = js.native
    def defineMapper(name: String, opts: js.Any): Mapper = js.native
    
    def defineResource(name: String): Mapper = js.native
    def defineResource(name: String, opts: js.Any): Mapper = js.native
    
    def getAdapter(name: js.Any): js.Any = js.native
    
    def getAdapterName(): String = js.native
    def getAdapterName(opts: js.Any): String = js.native
    
    def getAdapters(): js.Any = js.native
    
    def getMapper(name: String): Mapper = js.native
    
    def getMapperByName(name: String): Mapper = js.native
    
    var mapperClass: Instantiable1[/* opts */ js.UndefOr[js.Any], Mapper] = js.native
    
    var mapperDefaults: js.Any = js.native
    
    def registerAdapter(name: String, adapter: js.Any): Unit = js.native
    def registerAdapter(name: String, adapter: js.Any, opts: js.Any): Unit = js.native
  }
  
  @JSImport("js-data", "DataStore")
  @js.native
  class DataStore () extends SimpleStore {
    def this(opts: js.Any) = this()
    
    @JSName("collectionClass")
    var collectionClass_DataStore: Instantiable0[LinkedCollection] = js.native
  }
  
  @JSImport("js-data", "Index")
  @js.native
  class Index protected () extends StObject {
    def this(fieldList: js.Array[String]) = this()
    def this(fieldList: js.Array[String], opts: js.Any) = this()
    
    def _between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[js.Any] = js.native
    
    def between(leftKeys: js.Any, rightKeys: js.Any): js.Array[js.Any] = js.native
    def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[js.Any] = js.native
    
    def clear(): Unit = js.native
    
    var fieldGetter: js.Function = js.native
    
    var fieldList: js.Array[String] = js.native
    
    def get(keyList: js.Array[js.Any]): js.Any = js.native
    
    def getAll(): js.Array[js.Any] = js.native
    
    @JSName("hashCode")
    var hashCode_FIndex: js.Function = js.native
    
    def insertRecord(data: js.Any): Unit = js.native
    
    var isIndex: Boolean = js.native
    
    var keys: js.Array[js.Any] = js.native
    
    def peek(): js.Any = js.native
    
    def removeRecord(data: js.Any): js.Any = js.native
    
    def set(keyList: js.Array[js.Any], value: js.Any): Unit = js.native
    
    def updateRecord(data: js.Any): Unit = js.native
    
    var values: js.Array[js.Any] = js.native
    
    def visitAll(cb: js.Function): Unit = js.native
    def visitAll(cb: js.Function, thisArg: js.Any): Unit = js.native
  }
  
  @JSImport("js-data", "LinkedCollection")
  @js.native
  class LinkedCollection () extends Collection {
    def this(records: js.Array[js.Any]) = this()
    def this(records: js.Array[js.Any], opts: js.Any) = this()
    def this(records: Unit, opts: js.Any) = this()
    
    var _added: js.Object = js.native
    
    var datastore: DataStore = js.native
  }
  
  @JSImport("js-data", "Mapper")
  @js.native
  class Mapper () extends Component {
    def this(opts: js.Any) = this()
    
    var _adapters: js.Object = js.native
    
    def _end(result: js.Any, opts: js.Any): js.Any = js.native
    def _end(result: js.Any, opts: js.Any, skip: Boolean): js.Any = js.native
    
    def afterCount(query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterCreate(props: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterCreateMany(records: js.Array[js.Any], opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterDestroy(id: String, opts: js.Any, result: js.Any): js.Any = js.native
    def afterDestroy(id: Double, opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterDestroyAll(query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterFind(id: String, opts: js.Any, result: js.Any): js.Any = js.native
    def afterFind(id: Double, opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterFindAll(query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterSum(field: String, query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterUpdate(id: String, props: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
    def afterUpdate(id: Double, props: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterUpdateAll(props: js.Any, query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
    
    def afterUpdateMany(records: js.Array[js.Any], opts: js.Any, result: js.Any): js.Any = js.native
    
    var applySchema: Boolean = js.native
    
    def beforeCount(query: js.Any, opts: js.Any): js.Any = js.native
    
    def beforeCreate(props: js.Any, opts: js.Any): js.Any = js.native
    
    def beforeCreateMany(records: js.Array[js.Any], opts: js.Any): js.Any = js.native
    
    def beforeDestroy(id: String, opts: js.Any): js.Any = js.native
    def beforeDestroy(id: Double, opts: js.Any): js.Any = js.native
    
    def beforeDestroyAll(query: js.Any, opts: js.Any): js.Any = js.native
    
    def beforeFind(id: String, opts: js.Any): js.Any = js.native
    def beforeFind(id: Double, opts: js.Any): js.Any = js.native
    
    def beforeFindAll(query: js.Any, opts: js.Any): js.Any = js.native
    
    def beforeSum(field: String, query: js.Any, opts: js.Any): js.Any = js.native
    
    def beforeUpdate(id: String, opts: js.Any): js.Any = js.native
    def beforeUpdate(id: Double, opts: js.Any): js.Any = js.native
    
    def beforeUpdateAll(query: js.Any, opts: js.Any): js.Any = js.native
    
    def beforeUpdateMany(records: js.Array[js.Any], opts: js.Any): js.Any = js.native
    
    def belongsTo(relatedMapper: js.Any, opts: js.Any): Unit = js.native
    
    def count(query: js.Any): js.Promise[js.Any] = js.native
    def count(query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def create(props: js.Any): js.Promise[js.Any] = js.native
    def create(props: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def createInstance(props: js.Any): js.Any = js.native
    def createInstance(props: js.Any, opts: js.Any): js.Any = js.native
    
    def createMany(records: js.Array[js.Any]): js.Promise[js.Any] = js.native
    def createMany(records: js.Array[js.Any], opts: js.Any): js.Promise[js.Any] = js.native
    
    def createRecord(): Record = js.native
    def createRecord(props: js.Any): Record = js.native
    def createRecord(props: js.Any, opts: js.Any): Record = js.native
    def createRecord(props: Unit, opts: js.Any): Record = js.native
    
    def crud(method: js.Any, args: js.Any*): js.Promise[js.Any] = js.native
    
    var debug: Boolean = js.native
    
    var defaultAdapter: String = js.native
    
    def destroy(id: String): js.Promise[js.Any] = js.native
    def destroy(id: String, opts: js.Any): js.Promise[js.Any] = js.native
    def destroy(id: Double): js.Promise[js.Any] = js.native
    def destroy(id: Double, opts: js.Any): js.Promise[js.Any] = js.native
    
    def destroyAll(query: js.Any): js.Promise[js.Any] = js.native
    def destroyAll(query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def find(id: String): js.Promise[js.Any] = js.native
    def find(id: String, opts: js.Any): js.Promise[js.Any] = js.native
    def find(id: Double): js.Promise[js.Any] = js.native
    def find(id: Double, opts: js.Any): js.Promise[js.Any] = js.native
    
    def findAll(query: js.Any): js.Promise[js.Any] = js.native
    def findAll(query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def getAdapter(name: js.Any): js.Any = js.native
    
    def getAdapterName(): js.Any = js.native
    def getAdapterName(opts: js.Any): js.Any = js.native
    
    def getAdapters(): js.Any = js.native
    
    def getSchema(): Schema = js.native
    
    def hasMany(relatedMapper: js.Any, opts: js.Any): Unit = js.native
    
    def hasOne(relatedMapper: js.Any, opts: js.Any): Unit = js.native
    
    var idAttribute: String = js.native
    
    def is(record: js.Any): Boolean = js.native
    
    var lifecycleMethods: js.Any = js.native
    
    var name: String = js.native
    
    @JSName("notify")
    var notify_FMapper: Boolean = js.native
    
    var raw: Boolean = js.native
    
    var recordClass: TypeofRecord = js.native
    
    def registerAdapter(name: String, adapter: js.Any): Unit = js.native
    def registerAdapter(name: String, adapter: js.Any, opts: js.Any): Unit = js.native
    
    var relationFields: js.Array[String] = js.native
    
    var relationList: js.Array[js.Any] = js.native
    
    var schema: Schema = js.native
    
    def sum(field: String, query: js.Any): js.Promise[js.Any] = js.native
    def sum(field: String, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def toJSON(record: js.Any): js.Object = js.native
    def toJSON(record: js.Any, opts: js.Any): js.Object = js.native
    
    def update(id: String, props: js.Any): js.Promise[js.Any] = js.native
    def update(id: String, props: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    def update(id: Double, props: js.Any): js.Promise[js.Any] = js.native
    def update(id: Double, props: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def updateAll(props: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def updateAll(props: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def updateMany(records: js.Array[js.Any]): js.Promise[js.Any] = js.native
    def updateMany(records: js.Array[js.Any], opts: js.Any): js.Promise[js.Any] = js.native
    
    def validate(records: js.Any): js.Any = js.native
    def validate(records: js.Any, opts: js.Any): js.Any = js.native
    def validate(records: js.Array[js.Any]): js.Any = js.native
    def validate(records: js.Array[js.Any], opts: js.Any): js.Any = js.native
  }
  
  @JSImport("js-data", "Query")
  @js.native
  class Query () extends Component {
    def this(collection: Collection) = this()
    
    def between(leftKeys: js.Any, rightKeys: js.Any): this.type = js.native
    def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): this.type = js.native
    
    var collection: Collection | LinkedCollection = js.native
    
    def compare(orderBy: js.Any, index: js.Any, a: js.Any, b: js.Any): js.Any = js.native
    
    var data: js.Array[js.Any] = js.native
    
    def evaluate(value: js.Any, op: String, predicate: js.Any): Boolean = js.native
    
    def filter(query: js.Any): this.type = js.native
    def filter(query: js.Any, thisArg: js.Any): this.type = js.native
    
    def forEach(forEachFn: js.Function): this.type = js.native
    def forEach(forEachFn: js.Function, thisArg: js.Any): this.type = js.native
    
    def get(): this.type = js.native
    def get(keyList: js.Array[js.Any]): this.type = js.native
    def get(keyList: js.Array[js.Any], opts: js.Any): this.type = js.native
    def get(keyList: Unit, opts: js.Any): this.type = js.native
    
    def getAll(args: js.Any*): this.type = js.native
    
    def getData(): js.Array[js.Any] = js.native
    
    def like(pattern: js.Any, flags: js.Any): RegExp = js.native
    
    def limit(num: Double): this.type = js.native
    
    def map(mapFn: js.Function): this.type = js.native
    def map(mapFn: js.Function, thisArg: js.Any): this.type = js.native
    
    def mapCall(funcName: String, args: js.Any*): this.type = js.native
    
    def run(): js.Array[js.Any] = js.native
    
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
  class Record () extends Component {
    def this(props: js.Any) = this()
    def this(props: js.Any, opts: js.Any) = this()
    def this(props: Unit, opts: js.Any) = this()
    
    def _get(prop: String): js.Any = js.native
    
    def _mapper(): Mapper = js.native
    
    def _set(prop: js.Any): Unit = js.native
    def _set(prop: js.Any, value: js.Any): Unit = js.native
    
    def _unset(prop: js.Any): Unit = js.native
    
    def afterLoadRelations(): Unit = js.native
    
    def afterSave(): Unit = js.native
    
    def beforeLoadRelations(): Unit = js.native
    
    def beforeSave(): Unit = js.native
    
    def changeHistory(): js.Array[js.Any] = js.native
    
    def changes(): Diff = js.native
    def changes(opts: js.Any): Diff = js.native
    
    def commit(): this.type = js.native
    
    def create(): js.Promise[Record] = js.native
    def create(opts: js.Any): js.Promise[Record] = js.native
    
    def destroy(): js.Promise[js.Any] = js.native
    def destroy(opts: js.Any): js.Promise[js.Any] = js.native
    
    def get(key: String): js.Any = js.native
    
    def hasChanges(): Boolean = js.native
    def hasChanges(opts: js.Any): Boolean = js.native
    
    def isNew(): Boolean = js.native
    
    def loadRelations(relations: js.Any): js.Promise[this.type] = js.native
    def loadRelations(relations: js.Any, opts: js.Any): js.Promise[this.type] = js.native
    
    def previous(key: js.Any): js.Any = js.native
    
    def revert(): this.type = js.native
    def revert(opts: js.Any): this.type = js.native
    
    def save(): js.Promise[this.type] = js.native
    def save(opts: js.Any): js.Promise[this.type] = js.native
    
    def set(key: String): Unit = js.native
    def set(key: String, value: js.Any): Unit = js.native
    def set(key: String, value: js.Any, opts: js.Any): Unit = js.native
    def set(key: String, value: Unit, opts: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    def toJSON(opts: js.Any): js.Any = js.native
    
    def unset(key: String): Unit = js.native
    def unset(key: String, opts: js.Any): Unit = js.native
    
    def validate(): js.Any = js.native
    def validate(opts: js.Any): js.Any = js.native
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
  class Schema protected () extends Component {
    def this(definition: js.Any) = this()
    
    @JSName("apply")
    def apply(target: js.Any): Unit = js.native
    @JSName("apply")
    def apply(target: js.Any, opts: js.Any): Unit = js.native
    
    def applyDefaults(target: js.Any): Unit = js.native
    
    def makeDescriptor(prop: String, schema: Schema): js.Any = js.native
    def makeDescriptor(prop: String, schema: Schema, opts: js.Any): js.Any = js.native
    
    def pick(value: js.Any): js.Any = js.native
    
    var properties: js.Any = js.native
    
    def validate(value: js.Any): js.Array[SchemaValidationError] = js.native
    def validate(value: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
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
    
    inline def validate(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[SchemaValidationError]]
    
    @JSImport("js-data", "Schema.validationKeywords")
    @js.native
    def validationKeywords: AllOf = js.native
    inline def validationKeywords_=(x: AllOf): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationKeywords")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("js-data", "Settable")
  @js.native
  class Settable () extends StObject
  /* static members */
  object Settable {
    
    @JSImport("js-data", "Settable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[js.Any]
    inline def extend(instanceProps: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def extend(instanceProps: js.Any, classProps: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def extend(instanceProps: Unit, classProps: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSImport("js-data", "SimpleStore")
  @js.native
  class SimpleStore () extends Container {
    def this(opts: js.Any) = this()
    
    def _callSuper(method: String, args: js.Any*): js.Any = js.native
    
    var _collections: js.Object = js.native
    
    var _completedQueries: js.Object = js.native
    
    def _end(mapperName: String, data: js.Any): js.Any = js.native
    def _end(mapperName: String, data: js.Any, opts: js.Any): js.Any = js.native
    
    var _pendingQueries: js.Object = js.native
    
    def add(mapperName: String, records: js.Any): js.Array[js.Any] | js.Any = js.native
    def add(mapperName: String, records: js.Any, opts: js.Any): js.Array[js.Any] | js.Any = js.native
    def add(mapperName: String, records: js.Array[js.Any]): js.Array[js.Any] | js.Any = js.native
    def add(mapperName: String, records: js.Array[js.Any], opts: js.Any): js.Array[js.Any] | js.Any = js.native
    
    def addToCache(mapperName: String, data: js.Any, opts: js.Any): js.Any = js.native
    
    def between(mapperName: String, leftKeys: js.Any, rightKeys: js.Any): js.Array[js.Any] = js.native
    def between(mapperName: String, leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[js.Any] = js.native
    
    def cacheFind(mapperName: String, data: js.Any, id: String, opts: js.Any): Unit = js.native
    def cacheFind(mapperName: String, data: js.Any, id: Double, opts: js.Any): Unit = js.native
    
    def cacheFindAll(mapperName: String, data: js.Any, hash: String, opts: js.Any): Unit = js.native
    
    def cachedFind(mapperName: String, id: String, opts: js.Any): js.Any = js.native
    def cachedFind(mapperName: String, id: js.Any): js.Any = js.native
    def cachedFind(mapperName: String, id: js.Any, opts: js.Any): js.Any = js.native
    def cachedFind(mapperName: String, id: Double, opts: js.Any): js.Any = js.native
    
    def cachedFindAll(mapperName: String, hash: String, opts: js.Any): js.Any = js.native
    def cachedFindAll(mapperName: String, query: js.Any): js.Any = js.native
    def cachedFindAll(mapperName: String, query: js.Any, opts: js.Any): js.Any = js.native
    
    def clear(): js.Any = js.native
    
    var collectionClass: Instantiable2[
        /* records */ js.UndefOr[js.Array[js.Any]], 
        /* opts */ js.UndefOr[js.Any], 
        Collection
      ] = js.native
    
    def create(mapperName: String, record: js.Any): js.Promise[js.Any] = js.native
    def create(mapperName: String, record: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def createIndex(mapperName: String, name: js.Any, fieldList: js.Any): Collection = js.native
    def createIndex(mapperName: String, name: js.Any, fieldList: js.Any, opts: js.Any): Collection = js.native
    
    def createMany(mapperName: String, records: js.Any): js.Promise[js.Array[js.Any] | js.Any] = js.native
    def createMany(mapperName: String, records: js.Any, opts: js.Any): js.Promise[js.Array[js.Any] | js.Any] = js.native
    
    def destroy(mapperName: String, id: js.Any): js.Promise[js.Any] = js.native
    def destroy(mapperName: String, id: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def destroyAll(mapperName: String): js.Promise[js.Any] = js.native
    def destroyAll(mapperName: String, query: js.Any): js.Promise[js.Any] = js.native
    def destroyAll(mapperName: String, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    def destroyAll(mapperName: String, query: Unit, opts: js.Any): js.Promise[js.Any] = js.native
    
    def filter(mapperName: String, query: js.Any): js.Array[js.Any] = js.native
    def filter(mapperName: String, query: js.Any, thisArg: js.Any): js.Array[js.Any] = js.native
    
    def find(mapperName: String, id: js.Any): js.Promise[js.Any] = js.native
    def find(mapperName: String, id: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def findAll(mapperName: String): js.Promise[js.Any] = js.native
    def findAll(mapperName: String, query: js.Any): js.Promise[js.Any] = js.native
    def findAll(mapperName: String, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    def findAll(mapperName: String, query: Unit, opts: js.Any): js.Promise[js.Any] = js.native
    
    def get(mapperName: String, id: String): js.Any = js.native
    def get(mapperName: String, id: Double): js.Any = js.native
    
    def getAll(mapperName: String, args: js.Any*): js.Array[js.Any] = js.native
    
    def getCollection(mapperName: String): Collection = js.native
    
    def hashQuery(mapperName: String, query: js.Any): String = js.native
    def hashQuery(mapperName: String, query: js.Any, opts: js.Any): String = js.native
    
    def query(mapperName: String): Query = js.native
    
    def remove(mapperName: String, id: String): js.Any = js.native
    def remove(mapperName: String, id: String, opts: js.Any): js.Any = js.native
    def remove(mapperName: String, id: Double): js.Any = js.native
    def remove(mapperName: String, id: Double, opts: js.Any): js.Any = js.native
    
    def removeAll(mapperName: String): Unit | js.Array[js.Any] = js.native
    def removeAll(mapperName: String, query: js.Any): Unit | js.Array[js.Any] = js.native
    def removeAll(mapperName: String, query: js.Any, opts: js.Any): Unit | js.Array[js.Any] = js.native
    def removeAll(mapperName: String, query: Unit, opts: js.Any): Unit | js.Array[js.Any] = js.native
    
    def toJson(mapperName: String): js.Array[js.Any] = js.native
    def toJson(mapperName: String, opts: js.Any): js.Array[js.Any] = js.native
    
    def update(mapperName: String, id: js.Any, record: js.Any): js.Promise[js.Any] = js.native
    def update(mapperName: String, id: js.Any, record: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def updateAll(mapperName: String, props: js.Any): js.Promise[js.Array[js.Any] | js.Any] = js.native
    def updateAll(mapperName: String, props: js.Any, query: js.Any): js.Promise[js.Array[js.Any] | js.Any] = js.native
    def updateAll(mapperName: String, props: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Array[js.Any] | js.Any] = js.native
    def updateAll(mapperName: String, props: js.Any, query: Unit, opts: js.Any): js.Promise[js.Array[js.Any] | js.Any] = js.native
    
    def updateMany(mapperName: String, records: js.Any): js.Promise[js.Array[js.Any] | js.Any] = js.native
    def updateMany(mapperName: String, records: js.Any, opts: js.Any): js.Promise[js.Array[js.Any] | js.Any] = js.native
    
    var usePendingFind: Boolean = js.native
    
    var usePendingFindAll: Boolean = js.native
  }
  
  inline def belongsTo(related: js.Any, opts: js.Any): js.Function1[/* target */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("belongsTo")(related.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
  @JSImport("js-data", "belongsToType")
  @js.native
  val belongsToType: String = js.native
  
  inline def hasMany(related: js.Any, opts: js.Any): js.Function1[/* target */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMany")(related.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
  @JSImport("js-data", "hasManyType")
  @js.native
  val hasManyType: String = js.native
  
  inline def hasOne(related: js.Any, opts: js.Any): js.Function1[/* target */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOne")(related.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
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
    class Promise[T] protected ()
      extends StObject
         with typings.std.Promise[T] {
      /**
        * Creates a new Promise.
        * @param executor A callback used to initialize the promise. This callback is passed two arguments:
        * a resolve callback used to resolve the promise with a value or the result of another promise,
        * and a reject callback used to reject the promise with a provided reason or error.
        */
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
    }
    @JSImport("js-data", "utils.Promise")
    @js.native
    def Promise: PromiseConstructor = js.native
    inline def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    inline def _underscore(dest: js.Any, src: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addHiddenPropsToTarget(target: js.Object, props: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHiddenPropsToTarget")(target.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def areDifferent(a: js.Object, b: js.Object, opts: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areDifferent")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def classCallCheck(instance: js.Object, ctor: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("classCallCheck")(instance.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def copy(from: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: js.Any, blacklist: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(
      from: js.Any,
      to: js.Any,
      stackFrom: js.Any,
      stackTo: js.Any,
      blacklist: js.Array[js.Any],
      plain: Boolean
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: js.Any, blacklist: Unit, plain: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: Unit, blacklist: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(
      from: js.Any,
      to: js.Any,
      stackFrom: js.Any,
      stackTo: Unit,
      blacklist: js.Array[js.Any],
      plain: Boolean
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: Unit, blacklist: Unit, plain: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: Unit, stackTo: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: Unit, stackTo: js.Any, blacklist: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(
      from: js.Any,
      to: js.Any,
      stackFrom: Unit,
      stackTo: js.Any,
      blacklist: js.Array[js.Any],
      plain: Boolean
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: Unit, stackTo: js.Any, blacklist: Unit, plain: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: Unit, stackTo: Unit, blacklist: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(
      from: js.Any,
      to: js.Any,
      stackFrom: Unit,
      stackTo: Unit,
      blacklist: js.Array[js.Any],
      plain: Boolean
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: js.Any, stackFrom: Unit, stackTo: Unit, blacklist: Unit, plain: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: js.Any, stackTo: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: js.Any, stackTo: js.Any, blacklist: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(
      from: js.Any,
      to: Unit,
      stackFrom: js.Any,
      stackTo: js.Any,
      blacklist: js.Array[js.Any],
      plain: Boolean
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: js.Any, stackTo: js.Any, blacklist: Unit, plain: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: js.Any, stackTo: Unit, blacklist: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(
      from: js.Any,
      to: Unit,
      stackFrom: js.Any,
      stackTo: Unit,
      blacklist: js.Array[js.Any],
      plain: Boolean
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: js.Any, stackTo: Unit, blacklist: Unit, plain: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: Unit, stackTo: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: Unit, stackTo: js.Any, blacklist: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(
      from: js.Any,
      to: Unit,
      stackFrom: Unit,
      stackTo: js.Any,
      blacklist: js.Array[js.Any],
      plain: Boolean
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: Unit, stackTo: js.Any, blacklist: Unit, plain: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: Unit, stackTo: Unit, blacklist: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(
      from: js.Any,
      to: Unit,
      stackFrom: Unit,
      stackTo: Unit,
      blacklist: js.Array[js.Any],
      plain: Boolean
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def copy(from: js.Any, to: Unit, stackFrom: Unit, stackTo: Unit, blacklist: Unit, plain: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], stackFrom.asInstanceOf[js.Any], stackTo.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def deepEqual(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def deepFillIn(dest: js.Object, source: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFillIn")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def deepMixIn(dest: js.Object, source: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMixIn")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def diffObjects(a: js.Any, b: js.Any, opts: js.Any): Diff = (^.asInstanceOf[js.Dynamic].applyDynamic("diffObjects")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Diff]
    
    inline def equal(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def eventify(target: js.Any, getter: js.Function, setter: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventify")(target.asInstanceOf[js.Any], getter.asInstanceOf[js.Any], setter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eventify(target: js.Any, getter: js.Function, setter: js.Function, enumerable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventify")(target.asInstanceOf[js.Any], getter.asInstanceOf[js.Any], setter.asInstanceOf[js.Any], enumerable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def extend(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[js.Function]
    inline def extend(props: js.Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend(props: js.Any, classProps: js.Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend(props: Unit, classProps: js.Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    inline def fillIn(dest: js.Object, src: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillIn")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def findIndex(array: js.Array[js.Any], fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def forEachRelation(mapper: js.Any, opts: js.Any, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachRelation")(mapper.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEachRelation(mapper: js.Any, opts: js.Any, fn: js.Function, ctx: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachRelation")(mapper.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def forOwn(obj: js.Any, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forOwn")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forOwn(obj: js.Any, fn: js.Function, thisArg: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forOwn")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def forRelation(opts: js.Any, `def`: js.Any, fn: js.Function, ctx: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_forRelation")(opts.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fromJson(json: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(json.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def get(`object`: js.Object, prop: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def getIndex(list: js.Array[js.Any], relation: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_getIndex")(list.asInstanceOf[js.Any], relation.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getSuper(instance: js.Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuper")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def getSuper(instance: js.Any, isCtor: Boolean): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuper")(instance.asInstanceOf[js.Any], isCtor.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    inline def intersection(array1: js.Array[js.Any], array2: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    inline def isArray(arg: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isBlacklisted(prop: String, bl: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlacklisted")(prop.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isBoolean(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("js-data", "utils.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    inline def isDate(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFunction(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isInteger(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNull(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNumber(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isRegExp(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSorN(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSorN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isUndefined(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def logify(target: js.Any, defaultNamespace: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logify")(target.asInstanceOf[js.Any], defaultNamespace.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def noDupeAdd(array: js.Array[js.Any], record: js.Any, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noDupeAdd")(array.asInstanceOf[js.Any], record.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def omit(props: js.Object, keys: js.Array[String]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(props.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def plainCopy(from: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("plainCopy")(from.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def possibleConstructorReturn(self: js.Object, call: js.Function): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("possibleConstructorReturn")(self.asInstanceOf[js.Any], call.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def possibleConstructorReturn(self: js.Object, call: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("possibleConstructorReturn")(self.asInstanceOf[js.Any], call.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def reject(value: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    
    inline def remove(array: js.Array[js.Any], fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resolve(value: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    
    inline def set(`object`: js.Object, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def set(`object`: js.Object, path: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toJson(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toJson(value: js.Any, replacer: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toJson(value: js.Any, replacer: js.Function, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toJson(value: js.Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    
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
    
    var added: js.Any
    
    var changed: js.Any
    
    var removed: js.Any
  }
  object Diff {
    
    inline def apply(added: js.Any, changed: js.Any, removed: js.Any): Diff = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diff]
    }
    
    extension [Self <: Diff](x: Self) {
      
      inline def setAdded(value: js.Any): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setChanged(value: js.Any): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: js.Any): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  trait SchemaValidationError extends StObject {
    
    var actual: String
    
    var expected: js.Any
    
    var path: String
  }
  object SchemaValidationError {
    
    inline def apply(actual: String, expected: js.Any, path: String): SchemaValidationError = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaValidationError]
    }
    
    extension [Self <: SchemaValidationError](x: Self) {
      
      inline def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
