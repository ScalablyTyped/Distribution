package typings.googleapis.mod.replicapoolV1beta1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Replica Pool API
  *
  * The Replica Pool API allows users to declaratively provision and manage
  * groups of Google Compute Engine instances based on a common template.
  *
  * @example
  * const {google} = require('googleapis');
  * const replicapool = google.replicapool('v1beta1');
  *
  * @namespace replicapool
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Replicapool
  */
@JSImport("googleapis", "replicapool_v1beta1.Replicapool")
@js.native
class Replicapool protected ()
  extends typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1.Replicapool {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
