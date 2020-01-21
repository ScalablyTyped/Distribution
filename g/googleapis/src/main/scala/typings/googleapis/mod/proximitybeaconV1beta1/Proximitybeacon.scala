package typings.googleapis.mod.proximitybeaconV1beta1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Proximity Beacon API
  *
  * Registers, manages, indexes, and searches beacons.
  *
  * @example
  * const {google} = require('googleapis');
  * const proximitybeacon = google.proximitybeacon('v1beta1');
  *
  * @namespace proximitybeacon
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Proximitybeacon
  */
@JSImport("googleapis", "proximitybeacon_v1beta1.Proximitybeacon")
@js.native
class Proximitybeacon protected ()
  extends typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1.Proximitybeacon {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

