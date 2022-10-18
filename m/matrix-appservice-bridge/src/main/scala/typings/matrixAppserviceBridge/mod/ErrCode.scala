package typings.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "ErrCode")
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
