package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bigqueryV2 {
  
  /**
    * BigQuery API
    *
    * A data platform for customers to create, manage, share and query data.
    *
    * @example
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * @namespace bigquery
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Bigquery
    */
  @JSImport("googleapis", "bigquery_v2.Bigquery")
  @js.native
  class Bigquery protected ()
    extends typings.googleapis.bigqueryV2Mod.bigqueryV2.Bigquery {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "bigquery_v2.Resource$Datasets")
  @js.native
  class ResourceDatasets protected ()
    extends typings.googleapis.bigqueryV2Mod.bigqueryV2.ResourceDatasets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquery_v2.Resource$Jobs")
  @js.native
  class ResourceJobs protected ()
    extends typings.googleapis.bigqueryV2Mod.bigqueryV2.ResourceJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquery_v2.Resource$Models")
  @js.native
  class ResourceModels protected ()
    extends typings.googleapis.bigqueryV2Mod.bigqueryV2.ResourceModels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquery_v2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.bigqueryV2Mod.bigqueryV2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquery_v2.Resource$Tabledata")
  @js.native
  class ResourceTabledata protected ()
    extends typings.googleapis.bigqueryV2Mod.bigqueryV2.ResourceTabledata {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquery_v2.Resource$Tables")
  @js.native
  class ResourceTables protected ()
    extends typings.googleapis.bigqueryV2Mod.bigqueryV2.ResourceTables {
    def this(context: APIRequestContext) = this()
  }
}
