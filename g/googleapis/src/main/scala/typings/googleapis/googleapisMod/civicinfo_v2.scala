package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "civicinfo_v2")
@js.native
object civicinfo_v2 extends js.Object {
  /**
    * Google Civic Information API
    *
    * Provides polling places, early vote locations, contest data, election
    * officials, and government representatives for U.S. residential addresses.
    *
    * @example
    * const {google} = require('googleapis');
    * const civicinfo = google.civicinfo('v2');
    *
    * @namespace civicinfo
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Civicinfo
    */
  @js.native
  class Civicinfo protected ()
    extends typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2.Civicinfo {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Divisions protected ()
    extends typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2.Resource$Divisions {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Elections protected ()
    extends typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2.Resource$Elections {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Representatives protected ()
    extends typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2.Resource$Representatives {
    def this(context: APIRequestContext) = this()
  }
  
}

