package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kgsearchV1 {
  
  @JSImport("googleapis", "kgsearch_v1.Kgsearch")
  @js.native
  open class Kgsearch protected ()
    extends typings.googleapis.kgsearchV1Mod.kgsearchV1.Kgsearch {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "kgsearch_v1.Resource$Entities")
  @js.native
  open class ResourceEntities protected ()
    extends typings.googleapis.kgsearchV1Mod.kgsearchV1.ResourceEntities {
    def this(context: APIRequestContext) = this()
  }
}
