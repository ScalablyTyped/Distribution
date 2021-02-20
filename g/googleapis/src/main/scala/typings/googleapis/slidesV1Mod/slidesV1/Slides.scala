package typings.googleapis.slidesV1Mod.slidesV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Slides API
  *
  * Reads and writes Google Slides presentations.
  *
  * @example
  * const {google} = require('googleapis');
  * const slides = google.slides('v1');
  *
  * @namespace slides
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Slides
  */
@JSImport("googleapis/build/src/apis/slides/v1", "slides_v1.Slides")
@js.native
class Slides protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var presentations: ResourcePresentations = js.native
}
