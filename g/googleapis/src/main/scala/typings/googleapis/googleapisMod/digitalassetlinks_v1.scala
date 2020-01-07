package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "digitalassetlinks_v1")
@js.native
object digitalassetlinks_v1 extends js.Object {
  /**
    * Digital Asset Links API
    *
    * Discovers relationships between online assets such as websites or mobile
    * apps.
    *
    * @example
    * const {google} = require('googleapis');
    * const digitalassetlinks = google.digitalassetlinks('v1');
    *
    * @namespace digitalassetlinks
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Digitalassetlinks
    */
  @js.native
  class Digitalassetlinks protected ()
    extends typings.googleapis.buildSrcApisDigitalassetlinksV1Mod.digitalassetlinks_v1.Digitalassetlinks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Assetlinks protected ()
    extends typings.googleapis.buildSrcApisDigitalassetlinksV1Mod.digitalassetlinks_v1.Resource$Assetlinks {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Statements protected ()
    extends typings.googleapis.buildSrcApisDigitalassetlinksV1Mod.digitalassetlinks_v1.Resource$Statements {
    def this(context: APIRequestContext) = this()
  }
  
}

