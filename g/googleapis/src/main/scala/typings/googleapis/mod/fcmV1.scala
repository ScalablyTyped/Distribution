package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fcmV1 {
  
  @JSImport("googleapis", "fcm_v1.Fcm")
  @js.native
  open class Fcm protected ()
    extends typings.googleapis.fcmV1Mod.fcmV1.Fcm {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "fcm_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.fcmV1Mod.fcmV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "fcm_v1.Resource$Projects$Messages")
  @js.native
  open class ResourceProjectsMessages protected ()
    extends typings.googleapis.fcmV1Mod.fcmV1.ResourceProjectsMessages {
    def this(context: APIRequestContext) = this()
  }
}
