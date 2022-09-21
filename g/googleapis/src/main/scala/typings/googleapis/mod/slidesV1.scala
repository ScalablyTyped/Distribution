package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slidesV1 {
  
  @JSImport("googleapis", "slides_v1.Resource$Presentations")
  @js.native
  open class ResourcePresentations protected ()
    extends typings.googleapis.slidesV1Mod.slidesV1.ResourcePresentations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "slides_v1.Resource$Presentations$Pages")
  @js.native
  open class ResourcePresentationsPages protected ()
    extends typings.googleapis.slidesV1Mod.slidesV1.ResourcePresentationsPages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "slides_v1.Slides")
  @js.native
  open class Slides protected ()
    extends typings.googleapis.slidesV1Mod.slidesV1.Slides {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
