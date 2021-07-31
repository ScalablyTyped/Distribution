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
  class ResourcePresentations protected ()
    extends typings.googleapis.slidesV1Mod.slidesV1.ResourcePresentations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "slides_v1.Resource$Presentations$Pages")
  @js.native
  class ResourcePresentationsPages protected ()
    extends typings.googleapis.slidesV1Mod.slidesV1.ResourcePresentationsPages {
    def this(context: APIRequestContext) = this()
  }
  
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
  @JSImport("googleapis", "slides_v1.Slides")
  @js.native
  class Slides protected ()
    extends typings.googleapis.slidesV1Mod.slidesV1.Slides {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
