package typings.googleapis.mod.visionV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Vision API
  *
  * Integrates Google Vision features, including image labeling, face, logo,
  * and landmark detection, optical character recognition (OCR), and detection
  * of explicit content, into applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const vision = google.vision('v1');
  *
  * @namespace vision
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Vision
  */
@JSImport("googleapis", "vision_v1.Vision")
@js.native
class Vision protected ()
  extends typings.googleapis.visionV1Mod.visionV1.Vision {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
