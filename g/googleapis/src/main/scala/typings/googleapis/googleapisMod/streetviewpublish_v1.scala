package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "streetviewpublish_v1")
@js.native
object streetviewpublish_v1 extends js.Object {
  @js.native
  class Resource$Photo protected ()
    extends typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1.Resource$Photo {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Photos protected ()
    extends typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1.Resource$Photos {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Street View Publish API
    *
    * Publishes 360 photos to Google Maps, along with position, orientation, and
    * connectivity metadata. Apps can offer an interface for positioning,
    * connecting, and uploading user-generated Street View images.
    *
    * @example
    * const {google} = require('googleapis');
    * const streetviewpublish = google.streetviewpublish('v1');
    *
    * @namespace streetviewpublish
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Streetviewpublish
    */
  @js.native
  class Streetviewpublish protected ()
    extends typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1.Streetviewpublish {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

