package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osloginV1 {
  
  @JSImport("googleapis", "oslogin_v1.Oslogin")
  @js.native
  open class Oslogin protected ()
    extends typings.googleapis.osloginV1Mod.osloginV1.Oslogin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "oslogin_v1.Resource$Users")
  @js.native
  open class ResourceUsers protected ()
    extends typings.googleapis.osloginV1Mod.osloginV1.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oslogin_v1.Resource$Users$Projects")
  @js.native
  open class ResourceUsersProjects protected ()
    extends typings.googleapis.osloginV1Mod.osloginV1.ResourceUsersProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oslogin_v1.Resource$Users$Sshpublickeys")
  @js.native
  open class ResourceUsersSshpublickeys protected ()
    extends typings.googleapis.osloginV1Mod.osloginV1.ResourceUsersSshpublickeys {
    def this(context: APIRequestContext) = this()
  }
}
