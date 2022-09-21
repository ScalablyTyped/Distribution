package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectortileV1 {
  
  @JSImport("googleapis", "vectortile_v1.Resource$Featuretiles")
  @js.native
  open class ResourceFeaturetiles protected ()
    extends typings.googleapis.vectortileV1Mod.vectortileV1.ResourceFeaturetiles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vectortile_v1.Resource$Terraintiles")
  @js.native
  open class ResourceTerraintiles protected ()
    extends typings.googleapis.vectortileV1Mod.vectortileV1.ResourceTerraintiles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vectortile_v1.Vectortile")
  @js.native
  open class Vectortile protected ()
    extends typings.googleapis.vectortileV1Mod.vectortileV1.Vectortile {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
