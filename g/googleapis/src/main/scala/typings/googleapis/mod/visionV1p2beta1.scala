package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visionV1p2beta1 {
  
  @JSImport("googleapis", "vision_v1p2beta1.Resource$Files")
  @js.native
  class ResourceFiles protected ()
    extends typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1.ResourceFiles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1p2beta1.Resource$Images")
  @js.native
  class ResourceImages protected ()
    extends typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1.ResourceImages {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Vision API
    *
    * Integrates Google Vision features, including image labeling, face, logo,
    * and landmark detection, optical character recognition (OCR), and detection
    * of explicit content, into applications.
    *
    * @example
    * const {google} = require('googleapis');
    * const vision = google.vision('v1p2beta1');
    *
    * @namespace vision
    * @type {Function}
    * @version v1p2beta1
    * @variation v1p2beta1
    * @param {object=} options Options for Vision
    */
  @JSImport("googleapis", "vision_v1p2beta1.Vision")
  @js.native
  class Vision protected ()
    extends typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1.Vision {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
