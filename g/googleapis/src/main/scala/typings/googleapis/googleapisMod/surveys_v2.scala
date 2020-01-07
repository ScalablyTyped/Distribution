package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "surveys_v2")
@js.native
object surveys_v2 extends js.Object {
  @js.native
  class Resource$Results protected ()
    extends typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2.Resource$Results {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Surveys protected ()
    extends typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2.Resource$Surveys {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Surveys API
    *
    * Creates and conducts surveys, lists the surveys that an authenticated user
    * owns, and retrieves survey results and information about specified surveys.
    *
    * @example
    * const {google} = require('googleapis');
    * const surveys = google.surveys('v2');
    *
    * @namespace surveys
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Surveys
    */
  @js.native
  class Surveys protected ()
    extends typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2.Surveys {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

