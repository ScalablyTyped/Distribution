package typings.jsData.mod

import typings.jsData.TypeofClassRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "Mapper")
@js.native
class Mapper () extends Component {
  def this(opts: js.Any) = this()
  var _adapters: js.Object = js.native
  var applySchema: Boolean = js.native
  var debug: Boolean = js.native
  var defaultAdapter: String = js.native
  var idAttribute: String = js.native
  var lifecycleMethods: js.Any = js.native
  var name: String = js.native
  @JSName("notify")
  var notify_FMapper: Boolean = js.native
  var raw: Boolean = js.native
  var recordClass: TypeofClassRecord = js.native
  var relationFields: js.Array[String] = js.native
  var relationList: js.Array[_] = js.native
  var schema: Schema = js.native
  def _end(result: js.Any, opts: js.Any): js.Any = js.native
  def _end(result: js.Any, opts: js.Any, skip: Boolean): js.Any = js.native
  def afterCount(query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterCreate(props: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterCreateMany(records: js.Array[_], opts: js.Any, result: js.Any): js.Any = js.native
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
  def afterUpdateMany(records: js.Array[_], opts: js.Any, result: js.Any): js.Any = js.native
  def beforeCount(query: js.Any, opts: js.Any): js.Any = js.native
  def beforeCreate(props: js.Any, opts: js.Any): js.Any = js.native
  def beforeCreateMany(records: js.Array[_], opts: js.Any): js.Any = js.native
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
  def beforeUpdateMany(records: js.Array[_], opts: js.Any): js.Any = js.native
  def belongsTo(relatedMapper: js.Any, opts: js.Any): Unit = js.native
  def count(query: js.Any): js.Promise[_] = js.native
  def count(query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def create(props: js.Any): js.Promise[_] = js.native
  def create(props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def createInstance(props: js.Any): js.Any = js.native
  def createInstance(props: js.Any, opts: js.Any): js.Any = js.native
  def createMany(records: js.Array[_]): js.Promise[_] = js.native
  def createMany(records: js.Array[_], opts: js.Any): js.Promise[_] = js.native
  def createRecord(): Record = js.native
  def createRecord(props: js.Any): Record = js.native
  def createRecord(props: js.Any, opts: js.Any): Record = js.native
  def crud(method: js.Any, args: js.Any*): js.Promise[_] = js.native
  def destroy(id: String): js.Promise[_] = js.native
  def destroy(id: String, opts: js.Any): js.Promise[_] = js.native
  def destroy(id: Double): js.Promise[_] = js.native
  def destroy(id: Double, opts: js.Any): js.Promise[_] = js.native
  def destroyAll(query: js.Any): js.Promise[_] = js.native
  def destroyAll(query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def find(id: String): js.Promise[_] = js.native
  def find(id: String, opts: js.Any): js.Promise[_] = js.native
  def find(id: Double): js.Promise[_] = js.native
  def find(id: Double, opts: js.Any): js.Promise[_] = js.native
  def findAll(query: js.Any): js.Promise[_] = js.native
  def findAll(query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def getAdapter(name: js.Any): js.Any = js.native
  def getAdapterName(): js.Any = js.native
  def getAdapterName(opts: js.Any): js.Any = js.native
  def getAdapters(): js.Any = js.native
  def getSchema(): Schema = js.native
  def hasMany(relatedMapper: js.Any, opts: js.Any): Unit = js.native
  def hasOne(relatedMapper: js.Any, opts: js.Any): Unit = js.native
  def is(record: js.Any): Boolean = js.native
  def registerAdapter(name: String, adapter: js.Any): Unit = js.native
  def registerAdapter(name: String, adapter: js.Any, opts: js.Any): Unit = js.native
  def sum(field: String, query: js.Any): js.Promise[_] = js.native
  def sum(field: String, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def toJSON(record: js.Any): js.Object = js.native
  def toJSON(record: js.Any, opts: js.Any): js.Object = js.native
  def update(id: String, props: js.Any): js.Promise[_] = js.native
  def update(id: String, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def update(id: Double, props: js.Any): js.Promise[_] = js.native
  def update(id: Double, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def updateAll(props: js.Any, query: js.Any): js.Promise[_] = js.native
  def updateAll(props: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def updateMany(records: js.Array[_]): js.Promise[_] = js.native
  def updateMany(records: js.Array[_], opts: js.Any): js.Promise[_] = js.native
  def validate(records: js.Any): js.Any = js.native
  def validate(records: js.Any, opts: js.Any): js.Any = js.native
  def validate(records: js.Array[_]): js.Any = js.native
  def validate(records: js.Array[_], opts: js.Any): js.Any = js.native
}

