package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "androidpublisher_v1")
@js.native
object androidpublisher_v1 extends js.Object {
  /**
    * Google Play Developer API
    *
    * Accesses Android application developers&#39; Google Play accounts.
    *
    * @example
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v1');
    *
    * @namespace androidpublisher
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Androidpublisher
    */
  @js.native
  class Androidpublisher protected ()
    extends typings.googleapis.buildSrcApisAndroidpublisherV1Mod.androidpublisher_v1.Androidpublisher {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Purchases protected ()
    extends typings.googleapis.buildSrcApisAndroidpublisherV1Mod.androidpublisher_v1.Resource$Purchases {
    def this(context: APIRequestContext) = this()
  }
  
}

