package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/identitytoolkit/v2", "identitytoolkit_v2.Resource$Accounts")
@js.native
open class ResourceAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var mfaEnrollment: ResourceAccountsMfaenrollment = js.native
  
  var mfaSignIn: ResourceAccountsMfasignin = js.native
}
