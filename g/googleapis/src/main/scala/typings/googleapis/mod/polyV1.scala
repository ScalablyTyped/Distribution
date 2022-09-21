package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyV1 {
  
  @JSImport("googleapis", "poly_v1.Poly")
  @js.native
  open class Poly protected ()
    extends typings.googleapis.polyV1Mod.polyV1.Poly {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "poly_v1.Resource$Assets")
  @js.native
  open class ResourceAssets protected ()
    extends typings.googleapis.polyV1Mod.polyV1.ResourceAssets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "poly_v1.Resource$Users")
  @js.native
  open class ResourceUsers protected ()
    extends typings.googleapis.polyV1Mod.polyV1.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "poly_v1.Resource$Users$Assets")
  @js.native
  open class ResourceUsersAssets protected ()
    extends typings.googleapis.polyV1Mod.polyV1.ResourceUsersAssets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "poly_v1.Resource$Users$Likedassets")
  @js.native
  open class ResourceUsersLikedassets protected ()
    extends typings.googleapis.polyV1Mod.polyV1.ResourceUsersLikedassets {
    def this(context: APIRequestContext) = this()
  }
}
