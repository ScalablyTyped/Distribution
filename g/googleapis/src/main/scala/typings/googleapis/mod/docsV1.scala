package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docsV1 {
  
  @JSImport("googleapis", "docs_v1.Docs")
  @js.native
  open class Docs protected ()
    extends typings.googleapis.docsV1Mod.docsV1.Docs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "docs_v1.Resource$Documents")
  @js.native
  open class ResourceDocuments protected ()
    extends typings.googleapis.docsV1Mod.docsV1.ResourceDocuments {
    def this(context: APIRequestContext) = this()
  }
}
