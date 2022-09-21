package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebasemlV1 {
  
  @JSImport("googleapis", "firebaseml_v1.Firebaseml")
  @js.native
  open class Firebaseml protected ()
    extends typings.googleapis.firebasemlV1Mod.firebasemlV1.Firebaseml {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "firebaseml_v1.Resource$Operations")
  @js.native
  open class ResourceOperations protected ()
    extends typings.googleapis.firebasemlV1Mod.firebasemlV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
}
