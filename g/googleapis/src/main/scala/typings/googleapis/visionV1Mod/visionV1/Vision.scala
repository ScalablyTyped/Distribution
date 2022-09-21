package typings.googleapis.visionV1Mod.visionV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Vision")
@js.native
open class Vision protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var files: ResourceFiles = js.native
  
  var images: ResourceImages = js.native
  
  var locations: ResourceLocations = js.native
  
  var operations: ResourceOperations = js.native
  
  var projects: ResourceProjects = js.native
}
