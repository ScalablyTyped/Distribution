package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languageV1 {
  
  @JSImport("googleapis", "language_v1.Language")
  @js.native
  open class Language protected ()
    extends typings.googleapis.languageV1Mod.languageV1.Language {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "language_v1.Resource$Documents")
  @js.native
  open class ResourceDocuments protected ()
    extends typings.googleapis.languageV1Mod.languageV1.ResourceDocuments {
    def this(context: APIRequestContext) = this()
  }
}
