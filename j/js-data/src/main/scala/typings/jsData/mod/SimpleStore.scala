package typings.jsData.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "SimpleStore")
@js.native
class SimpleStore () extends Container {
  def this(opts: js.Any) = this()
  var _collections: js.Object = js.native
  var _completedQueries: js.Object = js.native
  var _pendingQueries: js.Object = js.native
  var collectionClass: Instantiable2[
    js.UndefOr[/* records */ js.Array[js.Any]], 
    js.UndefOr[/* opts */ js.Any], 
    Collection
  ] = js.native
  var usePendingFind: Boolean = js.native
  var usePendingFindAll: Boolean = js.native
  def _callSuper(method: String, args: js.Any*): js.Any = js.native
  def _end(mapperName: String, data: js.Any): js.Any = js.native
  def _end(mapperName: String, data: js.Any, opts: js.Any): js.Any = js.native
  def add(mapperName: String, records: js.Any): js.Array[_] | js.Any = js.native
  def add(mapperName: String, records: js.Any, opts: js.Any): js.Array[_] | js.Any = js.native
  def add(mapperName: String, records: js.Array[_]): js.Array[_] | js.Any = js.native
  def add(mapperName: String, records: js.Array[_], opts: js.Any): js.Array[_] | js.Any = js.native
  def addToCache(mapperName: String, data: js.Any, opts: js.Any): js.Any = js.native
  def between(mapperName: String, leftKeys: js.Any, rightKeys: js.Any): js.Array[_] = js.native
  def between(mapperName: String, leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[_] = js.native
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
  def create(mapperName: String, record: js.Any): js.Promise[_] = js.native
  def create(mapperName: String, record: js.Any, opts: js.Any): js.Promise[_] = js.native
  def createIndex(mapperName: String, name: js.Any, fieldList: js.Any): Collection = js.native
  def createIndex(mapperName: String, name: js.Any, fieldList: js.Any, opts: js.Any): Collection = js.native
  def createMany(mapperName: String, records: js.Any): js.Promise[js.Array[_] | _] = js.native
  def createMany(mapperName: String, records: js.Any, opts: js.Any): js.Promise[js.Array[_] | _] = js.native
  def destroy(mapperName: String, id: js.Any): js.Promise[_] = js.native
  def destroy(mapperName: String, id: js.Any, opts: js.Any): js.Promise[_] = js.native
  def destroyAll(mapperName: String): js.Promise[_] = js.native
  def destroyAll(mapperName: String, query: js.Any): js.Promise[_] = js.native
  def destroyAll(mapperName: String, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def filter(mapperName: String, query: js.Any): js.Array[_] = js.native
  def filter(mapperName: String, query: js.Any, thisArg: js.Any): js.Array[_] = js.native
  def find(mapperName: String, id: js.Any): js.Promise[_] = js.native
  def find(mapperName: String, id: js.Any, opts: js.Any): js.Promise[_] = js.native
  def findAll(mapperName: String): js.Promise[_] = js.native
  def findAll(mapperName: String, query: js.Any): js.Promise[_] = js.native
  def findAll(mapperName: String, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def get(mapperName: String, id: String): js.Any = js.native
  def get(mapperName: String, id: Double): js.Any = js.native
  def getAll(mapperName: String, args: js.Any*): js.Array[_] = js.native
  def getCollection(mapperName: String): Collection = js.native
  def hashQuery(mapperName: String, query: js.Any): String = js.native
  def hashQuery(mapperName: String, query: js.Any, opts: js.Any): String = js.native
  def query(mapperName: String): Query = js.native
  def remove(mapperName: String, id: String): js.Any = js.native
  def remove(mapperName: String, id: String, opts: js.Any): js.Any = js.native
  def remove(mapperName: String, id: Double): js.Any = js.native
  def remove(mapperName: String, id: Double, opts: js.Any): js.Any = js.native
  def removeAll(mapperName: String): Unit | js.Array[_] = js.native
  def removeAll(mapperName: String, query: js.Any): Unit | js.Array[_] = js.native
  def removeAll(mapperName: String, query: js.Any, opts: js.Any): Unit | js.Array[_] = js.native
  def toJson(mapperName: String): js.Array[_] = js.native
  def toJson(mapperName: String, opts: js.Any): js.Array[_] = js.native
  def update(mapperName: String, id: js.Any, record: js.Any): js.Promise[_] = js.native
  def update(mapperName: String, id: js.Any, record: js.Any, opts: js.Any): js.Promise[_] = js.native
  def updateAll(mapperName: String, props: js.Any): js.Promise[js.Array[_] | _] = js.native
  def updateAll(mapperName: String, props: js.Any, query: js.Any): js.Promise[js.Array[_] | _] = js.native
  def updateAll(mapperName: String, props: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Array[_] | _] = js.native
  def updateMany(mapperName: String, records: js.Any): js.Promise[js.Array[_] | _] = js.native
  def updateMany(mapperName: String, records: js.Any, opts: js.Any): js.Promise[js.Array[_] | _] = js.native
}

