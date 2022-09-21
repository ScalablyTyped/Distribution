package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebasehostingV1 {
  
  @JSImport("googleapis", "firebasehosting_v1.Firebasehosting")
  @js.native
  open class Firebasehosting protected ()
    extends typings.googleapis.firebasehostingV1Mod.firebasehostingV1.Firebasehosting {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "firebasehosting_v1.Resource$Operations")
  @js.native
  open class ResourceOperations protected ()
    extends typings.googleapis.firebasehostingV1Mod.firebasehostingV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
}
