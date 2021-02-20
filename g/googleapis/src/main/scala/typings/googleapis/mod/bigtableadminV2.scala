package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bigtableadminV2 {
  
  /**
    * Cloud Bigtable Admin API
    *
    * Administer your Cloud Bigtable tables and instances.
    *
    * @example
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * @namespace bigtableadmin
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Bigtableadmin
    */
  @JSImport("googleapis", "bigtableadmin_v2.Bigtableadmin")
  @js.native
  class Bigtableadmin protected ()
    extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v2.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v2.Resource$Operations$Projects")
  @js.native
  class ResourceOperationsProjects protected ()
    extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceOperationsProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v2.Resource$Operations$Projects$Operations")
  @js.native
  class ResourceOperationsProjectsOperations protected ()
    extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceOperationsProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v2.Resource$Projects$Instances")
  @js.native
  class ResourceProjectsInstances protected ()
    extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v2.Resource$Projects$Instances$Appprofiles")
  @js.native
  class ResourceProjectsInstancesAppprofiles protected ()
    extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstancesAppprofiles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v2.Resource$Projects$Instances$Clusters")
  @js.native
  class ResourceProjectsInstancesClusters protected ()
    extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstancesClusters {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v2.Resource$Projects$Instances$Tables")
  @js.native
  class ResourceProjectsInstancesTables protected ()
    extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstancesTables {
    def this(context: APIRequestContext) = this()
  }
}
