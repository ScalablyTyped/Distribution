package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Storage JSON API
  *
  * Lets you store and retrieve potentially-large, immutable data objects.
  *
  * @example
  * const {google} = require('googleapis');
  * const storage = google.storage('v1beta2');
  *
  * @namespace storage
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Storage
  */
@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Storage")
@js.native
class Storage protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var bucketAccessControls: ResourceBucketaccesscontrols = js.native
  
  var buckets: ResourceBuckets = js.native
  
  var channels: ResourceChannels = js.native
  
  var context: APIRequestContext = js.native
  
  var defaultObjectAccessControls: ResourceDefaultobjectaccesscontrols = js.native
  
  var objectAccessControls: ResourceObjectaccesscontrols = js.native
  
  var objects: ResourceObjects = js.native
}
