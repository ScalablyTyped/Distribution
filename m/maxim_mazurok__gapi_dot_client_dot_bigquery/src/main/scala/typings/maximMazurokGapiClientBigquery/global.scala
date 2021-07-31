package typings.maximMazurokGapiClientBigquery

import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.DatasetsResource
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobsResource
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.ModelsResource
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.ProjectsResource
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.RoutinesResource
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.RowAccessPoliciesResource
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.TabledataResource
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.TablesResource
import typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.bigquery
import typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object bigquery {
        
        @JSGlobal("gapi.client.bigquery.datasets")
        @js.native
        val datasets: DatasetsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.jobs")
        @js.native
        val jobs: JobsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.models")
        @js.native
        val models: ModelsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.routines")
        @js.native
        val routines: RoutinesResource = js.native
        
        @JSGlobal("gapi.client.bigquery.rowAccessPolicies")
        @js.native
        val rowAccessPolicies: RowAccessPoliciesResource = js.native
        
        @JSGlobal("gapi.client.bigquery.tabledata")
        @js.native
        val tabledata: TabledataResource = js.native
        
        @JSGlobal("gapi.client.bigquery.tables")
        @js.native
        val tables: TablesResource = js.native
      }
      
      /** Load BigQuery API v2 */
      @scala.inline
      def load(name: bigquery, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: bigquery, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
