package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "replicapool_v1beta1")
@js.native
object replicapool_v1beta1 extends js.Object {
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
  @js.native
  class Replicapool protected ()
    extends typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1.Replicapool {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Pools protected ()
    extends typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1.Resource$Pools {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Replicas protected ()
    extends typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1.Resource$Replicas {
    def this(context: APIRequestContext) = this()
  }
  
}

