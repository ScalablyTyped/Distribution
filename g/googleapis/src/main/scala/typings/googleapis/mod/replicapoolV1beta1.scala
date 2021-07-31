package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replicapoolV1beta1 {
  
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
  
  @JSImport("googleapis", "replicapool_v1beta1.Resource$Pools")
  @js.native
  class ResourcePools protected ()
    extends typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1.ResourcePools {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "replicapool_v1beta1.Resource$Replicas")
  @js.native
  class ResourceReplicas protected ()
    extends typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1.ResourceReplicas {
    def this(context: APIRequestContext) = this()
  }
}
