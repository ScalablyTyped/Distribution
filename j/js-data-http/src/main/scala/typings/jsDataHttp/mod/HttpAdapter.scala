package typings.jsDataHttp.mod

import typings.jsDataAdapter.mod.Adapter
import typings.jsDataHttp.anon.Alpha
import typings.jsDataHttp.anon.TypeofHttpAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data-http", "HttpAdapter")
@js.native
class HttpAdapter () extends Adapter {
  def this(opts: IBaseHttpAdapter) = this()
  def DEL(url: String): js.Promise[_] = js.native
  def DEL(url: String, config: js.Any): js.Promise[_] = js.native
  def DEL(url: String, config: js.Any, opts: js.Any): js.Promise[_] = js.native
  def GET(url: String): js.Promise[_] = js.native
  def GET(url: String, config: js.Any): js.Promise[_] = js.native
  def GET(url: String, config: js.Any, opts: js.Any): js.Promise[_] = js.native
  def HTTP(config: js.Any): js.Promise[_] = js.native
  def HTTP(config: js.Any, opts: js.Any): js.Promise[_] = js.native
  def POST(url: String, data: js.Any): js.Promise[_] = js.native
  def POST(url: String, data: js.Any, config: js.Any): js.Promise[_] = js.native
  def POST(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Promise[_] = js.native
  def PUT(url: String, data: js.Any): js.Promise[_] = js.native
  def PUT(url: String, data: js.Any, config: js.Any): js.Promise[_] = js.native
  def PUT(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Promise[_] = js.native
  def _count(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
  def _count(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def _create(mapper: js.Any, props: js.Any): js.Promise[_] = js.native
  def _create(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def _createMany(mapper: js.Any, props: js.Any): js.Promise[_] = js.native
  def _createMany(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def _destroy(mapper: js.Any, id: String): js.Promise[_] = js.native
  def _destroy(mapper: js.Any, id: String, opts: js.Any): js.Promise[_] = js.native
  def _destroy(mapper: js.Any, id: Double): js.Promise[_] = js.native
  def _destroy(mapper: js.Any, id: Double, opts: js.Any): js.Promise[_] = js.native
  def _destroyAll(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
  def _destroyAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def _end(mapper: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
  def _find(mapper: js.Any, id: String): js.Promise[_] = js.native
  def _find(mapper: js.Any, id: String, opts: js.Any): js.Promise[_] = js.native
  def _find(mapper: js.Any, id: Double): js.Promise[_] = js.native
  def _find(mapper: js.Any, id: Double, opts: js.Any): js.Promise[_] = js.native
  def _findAll(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
  def _findAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def _sum(mapper: js.Any, field: js.Any, query: js.Any): js.Promise[_] = js.native
  def _sum(mapper: js.Any, field: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def _update(mapper: js.Any, id: js.Any, props: js.Any): js.Promise[_] = js.native
  def _update(mapper: js.Any, id: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def _updateAll(mapper: js.Any, props: js.Any, query: js.Any): js.Promise[_] = js.native
  def _updateAll(mapper: js.Any, props: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def _updateMany(mapper: js.Any, records: js.Any): js.Promise[_] = js.native
  def _updateMany(mapper: js.Any, records: js.Any, opts: js.Any): js.Promise[_] = js.native
  def afterDEL(url: String, config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
  def afterGET(url: String, config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
  def afterHTTP(config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
  def afterPOST(url: String, data: js.Any, config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
  def afterPUT(url: String, data: js.Any, config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
  def beforeDEL(url: String, config: js.Any, opts: js.Any): js.Any = js.native
  def beforeGET(url: String, config: js.Any, opts: js.Any): js.Any = js.native
  def beforeHTTP(config: js.Any, opts: js.Any): js.Any = js.native
  def beforePOST(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Any = js.native
  def beforePUT(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Any = js.native
  def count(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
  def count(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def create(mapper: js.Any, props: js.Any): js.Promise[_] = js.native
  def create(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def createMany(mapper: js.Any, props: js.Any): js.Promise[_] = js.native
  def createMany(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def deserialize(mapper: js.Any, response: js.Any): js.Any = js.native
  def deserialize(mapper: js.Any, response: js.Any, opts: js.Any): js.Any = js.native
  def destroy(mapper: js.Any, id: String): js.Promise[_] = js.native
  def destroy(mapper: js.Any, id: String, opts: js.Any): js.Promise[_] = js.native
  def destroy(mapper: js.Any, id: Double): js.Promise[_] = js.native
  def destroy(mapper: js.Any, id: Double, opts: js.Any): js.Promise[_] = js.native
  def destroyAll(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
  def destroyAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def error(args: js.Any*): Unit = js.native
  def fetch(config: js.Any): js.Promise[_] = js.native
  def fetch(config: js.Any, opts: js.Any): js.Promise[_] = js.native
  def find(mapper: js.Any, id: String): js.Promise[_] = js.native
  def find(mapper: js.Any, id: String, opts: js.Any): js.Promise[_] = js.native
  def find(mapper: js.Any, id: Double): js.Promise[_] = js.native
  def find(mapper: js.Any, id: Double, opts: js.Any): js.Promise[_] = js.native
  def findAll(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
  def findAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def getEndpoint(mapper: js.Any, id: String): js.Any = js.native
  def getEndpoint(mapper: js.Any, id: String, opts: js.Any): js.Any = js.native
  def getEndpoint(mapper: js.Any, id: Double): js.Any = js.native
  def getEndpoint(mapper: js.Any, id: Double, opts: js.Any): js.Any = js.native
  def getParams(): js.Any = js.native
  def getParams(opts: js.Any): js.Any = js.native
  def getPath(method: String, mapper: js.Any, id: js.Any): js.Any = js.native
  def getPath(method: String, mapper: js.Any, id: js.Any, opts: js.Any): js.Any = js.native
  def getSuffix(mapper: js.Any): js.Any = js.native
  def getSuffix(mapper: js.Any, opts: js.Any): js.Any = js.native
  def queryTransform(mapper: js.Any, params: js.Any): js.Any = js.native
  def queryTransform(mapper: js.Any, params: js.Any, opts: js.Any): js.Any = js.native
  def responseError(err: js.Any): js.Any = js.native
  def responseError(err: js.Any, config: js.Any): js.Any = js.native
  def responseError(err: js.Any, config: js.Any, opts: js.Any): js.Any = js.native
  def serialize(mapper: js.Any, data: js.Any): js.Promise[_] = js.native
  def serialize(mapper: js.Any, data: js.Any, opts: js.Any): js.Promise[_] = js.native
  def sum(mapper: js.Any, field: js.Any, query: js.Any): js.Promise[_] = js.native
  def sum(mapper: js.Any, field: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def update(mapper: js.Any, id: js.Any, props: js.Any): js.Promise[_] = js.native
  def update(mapper: js.Any, id: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  def updateAll(mapper: js.Any, props: js.Any, query: js.Any): js.Promise[_] = js.native
  def updateAll(mapper: js.Any, props: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def updateMany(mapper: js.Any, records: js.Any): js.Promise[_] = js.native
  def updateMany(mapper: js.Any, records: js.Any, opts: js.Any): js.Promise[_] = js.native
}

/* static members */
@JSImport("js-data-http", "HttpAdapter")
@js.native
object HttpAdapter extends js.Object {
  var version: Alpha = js.native
  def extend(): TypeofHttpAdapter = js.native
  def extend(instanceProps: IDict): TypeofHttpAdapter = js.native
  def extend(instanceProps: IDict, classProps: IDict): TypeofHttpAdapter = js.native
}

