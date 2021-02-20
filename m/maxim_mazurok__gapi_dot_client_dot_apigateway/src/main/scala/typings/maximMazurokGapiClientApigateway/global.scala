package typings.maximMazurokGapiClientApigateway

import typings.maximMazurokGapiClientApigateway.gapi.client.apigateway.ProjectsResource
import typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.apigateway
import typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.v1beta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object apigateway {
        
        @JSGlobal("gapi.client.apigateway.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load API Gateway API v1beta */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: apigateway, version: v1beta): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: apigateway, version: v1beta, callback: js.Function0[_]): Unit = js.native
    }
  }
}
