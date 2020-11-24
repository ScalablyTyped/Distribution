package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/streetviewpublish/v1", "streetviewpublish_v1.Streetviewpublish")
@js.native
class Streetviewpublish protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var photo: ResourcePhoto = js.native
  
  var photos: ResourcePhotos = js.native
}
