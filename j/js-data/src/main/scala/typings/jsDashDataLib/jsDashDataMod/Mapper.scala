package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "Mapper")
@js.native
class Mapper () extends Component {
  def this(opts: js.Any) = this()
  var _adapters: js.Object = js.native
  var applySchema: scala.Boolean = js.native
  var debug: scala.Boolean = js.native
  var defaultAdapter: java.lang.String = js.native
  var idAttribute: java.lang.String = js.native
  var lifecycleMethods: js.Any = js.native
  var name: java.lang.String = js.native
  @JSName("notify")
  var notify_FMapper: scala.Boolean = js.native
  var raw: scala.Boolean = js.native
  var recordClass: ScalablyTyped.runtime.Instantiable2[
    /* props */ js.UndefOr[/* props */ js.Any], 
    /* opts */ js.UndefOr[/* opts */ js.Any], 
    Record
  ] = js.native
  var relationFields: js.Array[java.lang.String] = js.native
  var relationList: js.Array[_] = js.native
  var schema: Schema = js.native
  def _end(result: js.Any, opts: js.Any): js.Any = js.native
  def _end(result: js.Any, opts: js.Any, skip: scala.Boolean): js.Any = js.native
  def afterCount(query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterCreate(props: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterCreateMany(records: js.Array[_], opts: js.Any, result: js.Any): js.Any = js.native
  def afterDestroy(id: java.lang.String, opts: js.Any, result: js.Any): js.Any = js.native
  def afterDestroy(id: scala.Double, opts: js.Any, result: js.Any): js.Any = js.native
  def afterDestroyAll(query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterFind(id: java.lang.String, opts: js.Any, result: js.Any): js.Any = js.native
  def afterFind(id: scala.Double, opts: js.Any, result: js.Any): js.Any = js.native
  def afterFindAll(query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterSum(field: java.lang.String, query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterUpdate(id: java.lang.String, props: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterUpdate(id: scala.Double, props: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterUpdateAll(props: js.Any, query: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  def afterUpdateMany(records: js.Array[_], opts: js.Any, result: js.Any): js.Any = js.native
  def beforeCount(query: js.Any, opts: js.Any): js.Any = js.native
  def beforeCreate(props: js.Any, opts: js.Any): js.Any = js.native
  def beforeCreateMany(records: js.Array[_], opts: js.Any): js.Any = js.native
  def beforeDestroy(id: java.lang.String, opts: js.Any): js.Any = js.native
  def beforeDestroy(id: scala.Double, opts: js.Any): js.Any = js.native
  def beforeDestroyAll(query: js.Any, opts: js.Any): js.Any = js.native
  def beforeFind(id: java.lang.String, opts: js.Any): js.Any = js.native
  def beforeFind(id: scala.Double, opts: js.Any): js.Any = js.native
  def beforeFindAll(query: js.Any, opts: js.Any): js.Any = js.native
  def beforeSum(field: java.lang.String, query: js.Any, opts: js.Any): js.Any = js.native
  def beforeUpdate(id: java.lang.String, opts: js.Any): js.Any = js.native
  def beforeUpdate(id: scala.Double, opts: js.Any): js.Any = js.native
  def beforeUpdateAll(query: js.Any, opts: js.Any): js.Any = js.native
  def beforeUpdateMany(records: js.Array[_], opts: js.Any): js.Any = js.native
  def belongsTo(relatedMapper: js.Any, opts: js.Any): scala.Unit = js.native
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
  def destroy(id: java.lang.String): js.Promise[_] = js.native
  def destroy(id: java.lang.String, opts: js.Any): js.Promise[_] = js.native
  def destroy(id: scala.Double): js.Promise[_] = js.native
  def destroy(id: scala.Double, opts: js.Any): js.Promise[_] = js.native
  def destroyAll(query: js.Any): js.Promise[_] = js.native
  def destroyAll(query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def find(id: java.lang.String): js.Promise[_] = js.native
  def find(id: java.lang.String, opts: js.Any): js.Promise[_] = js.native
  def find(id: scala.Double): js.Promise[_] = js.native
  def find(id: scala.Double, opts: js.Any): js.Promise[_] = js.native
  def findAll(query: js.Any): js.Promise[_] = js.native
  def findAll(query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def getAdapter(name: js.Any): js.Any = js.native
  def getAdapterName(): js.Any = js.native
  def getAdapterName(opts: js.Any): js.Any = js.native
  def getAdapters(): js.Any = js.native
  def getSchema(): Schema = js.native
  def hasMany(relatedMapper: js.Any, opts: js.Any): scala.Unit = js.native
  def hasOne(relatedMapper: js.Any, opts: js.Any): scala.Unit = js.native
  def is(record: js.Any): scala.Boolean = js.native
  def registerAdapter(name: java.lang.String, adapter: js.Any): scala.Unit = js.native
  def registerAdapter(name: java.lang.String, adapter: js.Any, opts: js.Any): scala.Unit = js.native
  def sum(field: java.lang.String, query: js.Any): js.Promise[_] = js.native
  def sum(field: java.lang.String, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def toJSON(record: js.Any): js.Object = js.native
  def toJSON(record: js.Any, opts: js.Any): js.Object = js.native
  def update(id: java.lang.String, props: js.Any): js.Promise[_] = js.native
  def update(id: java.lang.String, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def update(id: scala.Double, props: js.Any): js.Promise[_] = js.native
  def update(id: scala.Double, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def updateAll(props: js.Any, query: js.Any): js.Promise[_] = js.native
  def updateAll(props: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def updateMany(records: js.Array[_]): js.Promise[_] = js.native
  def updateMany(records: js.Array[_], opts: js.Any): js.Promise[_] = js.native
  def validate(records: js.Any): js.Any = js.native
  def validate(records: js.Any, opts: js.Any): js.Any = js.native
  def validate(records: js.Array[_]): js.Any = js.native
  def validate(records: js.Array[_], opts: js.Any): js.Any = js.native
}

