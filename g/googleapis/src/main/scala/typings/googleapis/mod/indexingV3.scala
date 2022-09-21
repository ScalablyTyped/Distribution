package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexingV3 {
  
  @JSImport("googleapis", "indexing_v3.Indexing")
  @js.native
  open class Indexing protected ()
    extends typings.googleapis.indexingV3Mod.indexingV3.Indexing {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "indexing_v3.Resource$Urlnotifications")
  @js.native
  open class ResourceUrlnotifications protected ()
    extends typings.googleapis.indexingV3Mod.indexingV3.ResourceUrlnotifications {
    def this(context: APIRequestContext) = this()
  }
}
