package typings.maximMazurokGapiClientApigateway

import typings.maximMazurokGapiClientApigateway.gapi.client.apigateway.ProjectsResource
import typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.apigateway
import typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.v1beta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load API Gateway API v1beta */
      def load(name: apigateway, version: v1beta): js.Thenable[Unit] = js.native
      def load(name: apigateway, version: v1beta, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object apigateway extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
