package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formsV1 {
  
  @JSImport("googleapis", "forms_v1.Forms")
  @js.native
  open class Forms protected ()
    extends typings.googleapis.formsV1Mod.formsV1.Forms {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "forms_v1.Resource$Forms")
  @js.native
  open class ResourceForms protected ()
    extends typings.googleapis.formsV1Mod.formsV1.ResourceForms {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "forms_v1.Resource$Forms$Responses")
  @js.native
  open class ResourceFormsResponses protected ()
    extends typings.googleapis.formsV1Mod.formsV1.ResourceFormsResponses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "forms_v1.Resource$Forms$Watches")
  @js.native
  open class ResourceFormsWatches protected ()
    extends typings.googleapis.formsV1Mod.formsV1.ResourceFormsWatches {
    def this(context: APIRequestContext) = this()
  }
}
