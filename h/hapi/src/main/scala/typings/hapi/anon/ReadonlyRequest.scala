package typings.hapi.anon

import typings.boom.mod.^
import typings.hapi.mod.ApplicationState
import typings.hapi.mod.PluginsStates
import typings.hapi.mod.RequestAuth
import typings.hapi.mod.RequestEvents
import typings.hapi.mod.RequestInfo
import typings.hapi.mod.RequestLog
import typings.hapi.mod.RequestOrig
import typings.hapi.mod.RequestQuery
import typings.hapi.mod.RequestRoute
import typings.hapi.mod.ResponseObject
import typings.hapi.mod.Util.Dictionary
import typings.hapi.mod.Util.HTTP_METHODS_PARTIAL
import typings.hapi.mod.Util.HTTP_METHODS_PARTIAL_LOWERCASE
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.urlMod.URL_
import typings.podium.mod.Events
import typings.podium.mod.Listener
import typings.podium.mod.Podium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<hapi.hapi.Request> */
@js.native
trait ReadonlyRequest extends StObject {
  
  def active(): Boolean = js.native
  
  def addListener(criteria: String, listener: Listener): Unit = js.native
  
  val app: ApplicationState = js.native
  
  val auth: RequestAuth = js.native
  
  def emit(criteria: String, data: js.Any): Unit = js.native
  
  val events: RequestEvents = js.native
  
  def generateResponse(): ResponseObject = js.native
  def generateResponse(source: String): ResponseObject = js.native
  def generateResponse(source: String, options: Close): ResponseObject = js.native
  def generateResponse(source: js.Object): ResponseObject = js.native
  def generateResponse(source: js.Object, options: Close): ResponseObject = js.native
  def generateResponse(source: Null, options: Close): ResponseObject = js.native
  
  def hasListeners(name: String): Boolean = js.native
  
  val headers: Dictionary[String] = js.native
  
  val info: RequestInfo = js.native
  
  def log(tags: String): Unit = js.native
  def log(tags: String, data: String): Unit = js.native
  def log(tags: String, data: js.Function0[String | js.Object]): Unit = js.native
  def log(tags: String, data: js.Object): Unit = js.native
  def log(tags: js.Array[String]): Unit = js.native
  def log(tags: js.Array[String], data: String): Unit = js.native
  def log(tags: js.Array[String], data: js.Function0[String | js.Object]): Unit = js.native
  def log(tags: js.Array[String], data: js.Object): Unit = js.native
  
  val logs: js.Array[RequestLog] = js.native
  
  val method: HTTP_METHODS_PARTIAL_LOWERCASE = js.native
  
  val mime: String = js.native
  
  def on(criteria: String, listener: Listener): Unit = js.native
  
  def once(criteria: String, listener: Listener): Unit = js.native
  
  val orig: RequestOrig = js.native
  
  val params: Dictionary[String] = js.native
  
  val paramsArray: js.Array[String] = js.native
  
  val path: String = js.native
  
  val payload: Readable | Buffer | String | js.Object = js.native
  
  val plugins: PluginsStates = js.native
  
  val pre: Dictionary[_] = js.native
  
  val preResponses: Dictionary[_] = js.native
  
  val query: RequestQuery = js.native
  
  val raw: Req = js.native
  
  def registerEvent(events: js.Array[Events]): Unit = js.native
  
  def registerPodium(podiums: js.Array[Podium]): Unit = js.native
  
  def removeAllListeners(name: String): Podium = js.native
  
  def removeListener(name: String, listener: Listener): Podium = js.native
  
  val response: ResponseObject | ^[_] = js.native
  
  val route: RequestRoute = js.native
  
  val server: typings.hapi.mod.Server = js.native
  
  def setMethod(method: HTTP_METHODS_PARTIAL): Unit = js.native
  
  def setUrl(url: String): Unit = js.native
  def setUrl(url: String, stripTrailingSlash: Boolean): Unit = js.native
  def setUrl(url: URL_): Unit = js.native
  def setUrl(url: URL_, stripTrailingSlash: Boolean): Unit = js.native
  
  val state: Dictionary[_] = js.native
  
  val url: URL_ = js.native
}
