package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessverifications/v1", "mybusinessverifications_v1.Mybusinessverifications")
@js.native
open class Mybusinessverifications protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var locations: ResourceLocations = js.native
  
  var verificationTokens: ResourceVerificationtokens = js.native
}
