package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translateV2 {
  
  @JSImport("googleapis", "translate_v2.Resource$Detections")
  @js.native
  open class ResourceDetections protected ()
    extends typings.googleapis.translateV2Mod.translateV2.ResourceDetections {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "translate_v2.Resource$Languages")
  @js.native
  open class ResourceLanguages protected ()
    extends typings.googleapis.translateV2Mod.translateV2.ResourceLanguages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "translate_v2.Resource$Translations")
  @js.native
  open class ResourceTranslations protected ()
    extends typings.googleapis.translateV2Mod.translateV2.ResourceTranslations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "translate_v2.Translate")
  @js.native
  open class Translate protected ()
    extends typings.googleapis.translateV2Mod.translateV2.Translate {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
