package typings.matrixAppserviceBridge

import typings.express.mod.Request_
import typings.matrixAppserviceBridge.libProvisioningApiMod.ProvisioningApiOpts
import typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode
import typings.matrixAppserviceBridge.libProvisioningStoreMod.ProvisioningStore
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.provisioner
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.widget
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProvisioningMod {
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "ApiError")
  @js.native
  open class ApiError protected ()
    extends typings.matrixAppserviceBridge.libProvisioningErrorsMod.ApiError {
    def this(error: String) = this()
    def this(error: String, errcode: ErrCode) = this()
    def this(error: String, errcode: Unit, statusCode: Double) = this()
    def this(error: String, errcode: ErrCode, statusCode: Double) = this()
    def this(error: String, errcode: Unit, statusCode: Double, additionalContent: Record[String, Any]) = this()
    def this(error: String, errcode: Unit, statusCode: Unit, additionalContent: Record[String, Any]) = this()
    def this(error: String, errcode: ErrCode, statusCode: Double, additionalContent: Record[String, Any]) = this()
    def this(error: String, errcode: ErrCode, statusCode: Unit, additionalContent: Record[String, Any]) = this()
  }
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "DefaultDisallowedIpRanges")
  @js.native
  val DefaultDisallowedIpRanges: js.Array[String] = js.native
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "ErrCode")
  @js.native
  object ErrCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode & String] = js.native
    
    /* "M_AS_BAD_OPENID" */ val BadOpenID: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.BadOpenID & String = js.native
    
    /* "M_AS_BAD_TOKEN" */ val BadToken: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.BadToken & String = js.native
    
    /* "M_AS_BAD_VALUE" */ val BadValue: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.BadValue & String = js.native
    
    /* "M_AS_DISABLED_FEATURE" */ val DisabledFeature: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.DisabledFeature & String = js.native
    
    /* "M_AS_LIMIT_EXCEEDED" */ val Ratelimited: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.Ratelimited & String = js.native
    
    /* "M_AS_UNKNOWN" */ val Unknown: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.Unknown & String = js.native
    
    /* "M_AS_UNSUPPORTED_OPERATION" */ val UnsupportedOperation: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.UnsupportedOperation & String = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "MemoryProvisioningStore")
  @js.native
  open class MemoryProvisioningStore ()
    extends typings.matrixAppserviceBridge.libProvisioningStoreMod.MemoryProvisioningStore
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "ProvisioningApi")
  @js.native
  open class ProvisioningApi protected ()
    extends typings.matrixAppserviceBridge.libProvisioningApiMod.ProvisioningApi {
    def this(store: ProvisioningStore) = this()
    def this(store: ProvisioningStore, opts: ProvisioningApiOpts) = this()
  }
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "ProvisioningRequest")
  @js.native
  open class ProvisioningRequest[Params, ResBody, ReqBody, ReqQuery] protected ()
    extends typings.matrixAppserviceBridge.libProvisioningRequestMod.ProvisioningRequest[Params, ResBody, ReqBody, ReqQuery] {
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
  }
}
