package typings.googleapis.mod.firestoreV1

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
  * const firestore = google.firestore('v1');
  *
  * @namespace firestore
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Firestore
  */
@JSImport("googleapis", "firestore_v1.Firestore")
@js.native
class Firestore protected ()
  extends typings.googleapis.firestoreV1Mod.firestoreV1.Firestore {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

