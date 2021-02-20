package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Mirror API
  *
  * Interacts with Glass users via the timeline.
  *
  * @example
  * const {google} = require('googleapis');
  * const mirror = google.mirror('v1');
  *
  * @namespace mirror
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Mirror
  */
@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Mirror")
@js.native
class Mirror protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accounts: ResourceAccounts = js.native
  
  var contacts: ResourceContacts = js.native
  
  var context: APIRequestContext = js.native
  
  var locations: ResourceLocations = js.native
  
  var settings: ResourceSettings = js.native
  
  var subscriptions: ResourceSubscriptions = js.native
  
  var timeline: ResourceTimeline = js.native
}
