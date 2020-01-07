package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "language_v1beta2")
@js.native
object language_v1beta2 extends js.Object {
  /**
    * Cloud Natural Language API
    *
    * Provides natural language understanding technologies, such as sentiment
    * analysis, entity recognition, entity sentiment analysis, and other text
    * annotations, to developers.
    *
    * @example
    * const {google} = require('googleapis');
    * const language = google.language('v1beta2');
    *
    * @namespace language
    * @type {Function}
    * @version v1beta2
    * @variation v1beta2
    * @param {object=} options Options for Language
    */
  @js.native
  class Language protected ()
    extends typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2.Language {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Documents protected ()
    extends typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2.Resource$Documents {
    def this(context: APIRequestContext) = this()
  }
  
}

