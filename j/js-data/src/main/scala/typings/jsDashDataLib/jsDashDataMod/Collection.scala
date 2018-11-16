package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "Collection")
@js.native
class Collection () extends Component {
  def this(records: js.Array[_]) = this()
  def this(records: js.Array[_], opts: js.Any) = this()
  var idAttribute: java.lang.String = js.native
  var index: Index = js.native
  var indexes: js.Any = js.native
  var mapper: Mapper = js.native
  var onConflict: java.lang.String = js.native
  var recordOpts: js.Any = js.native
  def _onRecordEvent(args: js.Any*): scala.Unit = js.native
  def add(records: js.Any): js.Any = js.native
  def add(records: js.Any, opts: js.Any): js.Any = js.native
  def afterAdd(args: js.Any*): scala.Unit = js.native
  def afterRemove(args: js.Any*): scala.Unit = js.native
  def afterRemoveAll(args: js.Any*): scala.Unit = js.native
  def beforeAdd(args: js.Any*): scala.Unit = js.native
  def beforeRemove(args: js.Any*): scala.Unit = js.native
  def beforeRemoveAll(args: js.Any*): scala.Unit = js.native
  def between(leftKeys: js.Any, rightKeys: js.Any): js.Array[_] = js.native
  def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[_] = js.native
  def createIndex(name: js.Any, fieldList: js.Any): this.type = js.native
  def createIndex(name: js.Any, fieldList: js.Any, opts: js.Any): this.type = js.native
  def filter(query: js.Any): js.Array[_] = js.native
  def filter(query: js.Any, thisArg: js.Any): js.Array[_] = js.native
  def forEach(cb: js.Function): scala.Unit = js.native
  def forEach(cb: js.Function, thisArg: js.Any): scala.Unit = js.native
  def get(id: java.lang.String): js.Any = js.native
  def get(id: scala.Double): js.Any = js.native
  def getAll(args: js.Any*): js.Array[_] = js.native
  def getIndex(name: java.lang.String): js.Any = js.native
  def limit(num: scala.Double): js.Array[_] = js.native
  def map(cb: js.Any, thisArg: js.Any): js.Array[_] = js.native
  def mapCall(funcName: java.lang.String, args: js.Any*): js.Array[_] = js.native
  def prune(): js.Array[_] = js.native
  def query(): Query = js.native
  def recordId(): js.Any = js.native
  def recordId(record: js.Any): js.Any = js.native
  def reduce(cb: js.Function, initialValue: js.Any): js.Any = js.native
  def remove(id: java.lang.String): js.Any = js.native
  def remove(id: java.lang.String, opts: js.Any): js.Any = js.native
  def remove(id: scala.Double): js.Any = js.native
  def remove(id: scala.Double, opts: js.Any): js.Any = js.native
  def removeAll(query: js.Any): js.Array[_] = js.native
  def removeAll(query: js.Any, opts: js.Any): js.Array[_] = js.native
  def skip(num: scala.Double): js.Array[_] = js.native
  def toJSON(): js.Array[_] = js.native
  def toJSON(opts: js.Any): js.Array[_] = js.native
  def unsaved(): js.Array[_] = js.native
  def updateIndex(record: js.Any): scala.Unit = js.native
  def updateIndex(record: js.Any, opts: js.Any): scala.Unit = js.native
  def updateIndexes(record: js.Any): scala.Unit = js.native
}

