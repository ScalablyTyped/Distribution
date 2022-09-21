package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth2V2 {
  
  @JSImport("googleapis", "oauth2_v2.Oauth2")
  @js.native
  open class Oauth2 protected ()
    extends typings.googleapis.oauth2V2Mod.oauth2V2.Oauth2 {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "oauth2_v2.Resource$Userinfo")
  @js.native
  open class ResourceUserinfo protected ()
    extends typings.googleapis.oauth2V2Mod.oauth2V2.ResourceUserinfo {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oauth2_v2.Resource$Userinfo$V2")
  @js.native
  open class ResourceUserinfoV2 protected ()
    extends typings.googleapis.oauth2V2Mod.oauth2V2.ResourceUserinfoV2 {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oauth2_v2.Resource$Userinfo$V2$Me")
  @js.native
  open class ResourceUserinfoV2Me protected ()
    extends typings.googleapis.oauth2V2Mod.oauth2V2.ResourceUserinfoV2Me {
    def this(context: APIRequestContext) = this()
  }
}
