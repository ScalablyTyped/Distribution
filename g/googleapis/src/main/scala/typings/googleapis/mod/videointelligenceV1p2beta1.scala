package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videointelligenceV1p2beta1 {
  
  @JSImport("googleapis", "videointelligence_v1p2beta1.Resource$Videos")
  @js.native
  open class ResourceVideos protected ()
    extends typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1.ResourceVideos {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "videointelligence_v1p2beta1.Videointelligence")
  @js.native
  open class Videointelligence protected ()
    extends typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1.Videointelligence {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
