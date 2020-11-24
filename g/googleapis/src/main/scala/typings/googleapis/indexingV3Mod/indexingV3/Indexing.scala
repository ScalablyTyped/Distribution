package typings.googleapis.indexingV3Mod.indexingV3

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indexing API
  *
  * Notifies Google when your web pages change.
  *
  * @example
  * const {google} = require('googleapis');
  * const indexing = google.indexing('v3');
  *
  * @namespace indexing
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Indexing
  */
@JSImport("googleapis/build/src/apis/indexing/v3", "indexing_v3.Indexing")
@js.native
class Indexing protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var urlNotifications: ResourceUrlnotifications = js.native
}
