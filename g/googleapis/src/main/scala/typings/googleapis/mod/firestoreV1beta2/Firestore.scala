package typings.googleapis.mod.firestoreV1beta2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Firestore API
  *
  * Accesses the NoSQL document database built for automatic scaling, high
  * performance, and ease of application development.
  *
  * @example
  * const {google} = require('googleapis');
  * const firestore = google.firestore('v1beta2');
  *
  * @namespace firestore
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Firestore
  */
@JSImport("googleapis", "firestore_v1beta2.Firestore")
@js.native
class Firestore protected ()
  extends typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

