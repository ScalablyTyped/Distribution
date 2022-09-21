package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryagentV1 {
  
  @JSImport("googleapis", "libraryagent_v1.Libraryagent")
  @js.native
  open class Libraryagent protected ()
    extends typings.googleapis.libraryagentV1Mod.libraryagentV1.Libraryagent {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "libraryagent_v1.Resource$Shelves")
  @js.native
  open class ResourceShelves protected ()
    extends typings.googleapis.libraryagentV1Mod.libraryagentV1.ResourceShelves {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "libraryagent_v1.Resource$Shelves$Books")
  @js.native
  open class ResourceShelvesBooks protected ()
    extends typings.googleapis.libraryagentV1Mod.libraryagentV1.ResourceShelvesBooks {
    def this(context: APIRequestContext) = this()
  }
}
