package typings.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "ErrCode")
@js.native
object ErrCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.matrixAppserviceBridge.provisioningErrorsMod.ErrCode & String] = js.native
  
  /* "M_AS_BAD_OPENID" */ val BadOpenID: typings.matrixAppserviceBridge.provisioningErrorsMod.ErrCode.BadOpenID & String = js.native
  
  /* "M_AS_BAD_TOKEN" */ val BadToken: typings.matrixAppserviceBridge.provisioningErrorsMod.ErrCode.BadToken & String = js.native
  
  /* "M_AS_BAD_VALUE" */ val BadValue: typings.matrixAppserviceBridge.provisioningErrorsMod.ErrCode.BadValue & String = js.native
  
  /* "M_AS_DISABLED_FEATURE" */ val DisabledFeature: typings.matrixAppserviceBridge.provisioningErrorsMod.ErrCode.DisabledFeature & String = js.native
  
  /* "M_AS_LIMIT_EXCEEDED" */ val Ratelimited: typings.matrixAppserviceBridge.provisioningErrorsMod.ErrCode.Ratelimited & String = js.native
  
  /* "M_AS_UNKNOWN" */ val Unknown: typings.matrixAppserviceBridge.provisioningErrorsMod.ErrCode.Unknown & String = js.native
  
  /* "M_AS_UNSUPPORTED_OPERATION" */ val UnsupportedOperation: typings.matrixAppserviceBridge.provisioningErrorsMod.ErrCode.UnsupportedOperation & String = js.native
}
