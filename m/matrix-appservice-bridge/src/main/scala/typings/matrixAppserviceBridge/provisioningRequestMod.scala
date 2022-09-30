package typings.matrixAppserviceBridge

import typings.express.mod.Request_
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.delete_
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.get_
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.post_
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.provisioner
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.put_
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.widget
import typings.matrixAppserviceBridge.membershipQueueMod.ThinRequest
import typings.matrixAppserviceBridge.mod.Logger
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provisioningRequestMod {
  
  @JSImport("matrix-appservice-bridge/lib/provisioning/request", "ProvisioningRequest")
  @js.native
  open class ProvisioningRequest[Params, ResBody, ReqBody, ReqQuery] protected ()
    extends StObject
       with ThinRequest {
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner,
      widgetToken: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner,
      widgetToken: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner,
      widgetToken: String,
      fnName: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner,
      widgetToken: Unit,
      fnName: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner,
      widgetToken: String,
      fnName: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner,
      widgetToken: Unit,
      fnName: String
    ) = this()
    
    def body: ReqBody = js.native
    
    val expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]] = js.native
    
    val fnName: js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def getId(): String = js.native
    
    val id: String = js.native
    
    val log: Logger = js.native
    
    def params: Params = js.native
    
    def query: ReqQuery = js.native
    
    val requestSource: widget | provisioner = js.native
    
    val userId: String | Null = js.native
    
    val widgetToken: js.UndefOr[String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.all
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.get_
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.post_
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.put_
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.delete_
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.patch
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.options
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.head
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.checkout
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.connect
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.copy
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.lock
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.merge
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkactivity
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkcol
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.move
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`m-search`
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.notify
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.propfind
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.proppatch
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.purge
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.report
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.search
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.subscribe
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unlock
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unsubscribe
  */
  trait Methods extends StObject
  object Methods {
    
    inline def all: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.all = "all".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.all]
    
    inline def checkout: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.checkout = "checkout".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.checkout]
    
    inline def connect: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.connect = "connect".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.connect]
    
    inline def copy: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.copy = "copy".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.copy]
    
    inline def delete: delete_ = "delete".asInstanceOf[delete_]
    
    inline def get: get_ = "get".asInstanceOf[get_]
    
    inline def head: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.head = "head".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.head]
    
    inline def lock: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.lock = "lock".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.lock]
    
    inline def `m-search`: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`m-search` = "m-search".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`m-search`]
    
    inline def merge: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.merge = "merge".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.merge]
    
    inline def mkactivity: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkactivity = "mkactivity".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkactivity]
    
    inline def mkcol: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkcol = "mkcol".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkcol]
    
    inline def move: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.move = "move".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.move]
    
    inline def options: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.options = "options".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.options]
    
    inline def patch: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.patch = "patch".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.patch]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def propfind: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.propfind = "propfind".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.propfind]
    
    inline def proppatch: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.proppatch = "proppatch".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.proppatch]
    
    inline def purge: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.purge = "purge".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.purge]
    
    inline def put: put_ = "put".asInstanceOf[put_]
    
    inline def report: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.report = "report".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.report]
    
    inline def search: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.search = "search".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.search]
    
    inline def subscribe: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.subscribe = "subscribe".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.subscribe]
    
    inline def trace: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace = "trace".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace]
    
    inline def unlock: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unlock = "unlock".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unlock]
    
    inline def unsubscribe: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unsubscribe = "unsubscribe".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unsubscribe]
  }
}
