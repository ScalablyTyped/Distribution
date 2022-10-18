package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.Authenticator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthUtilsGetAuthenticatorFromEnvironmentMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/utils/get-authenticator-from-environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAuthenticatorFromEnvironment(serviceName: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthenticatorFromEnvironment")(serviceName.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
}
