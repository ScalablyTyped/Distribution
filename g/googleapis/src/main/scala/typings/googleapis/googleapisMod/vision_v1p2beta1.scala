package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "vision_v1p2beta1")
@js.native
object vision_v1p2beta1 extends js.Object {
  @js.native
  class Resource$Files protected ()
    extends typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1.Resource$Files {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Images protected ()
    extends typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1.Resource$Images {
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
  @js.native
  class Vision protected ()
    extends typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1.Vision {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

