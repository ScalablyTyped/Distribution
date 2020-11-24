package typings.maximMazurokGapiClientAndroidmanagement

import typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement.EnterprisesResource
import typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement.SignupUrlsResource
import typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.androidmanagement
import typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.v1
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
      
      /** Load Android Management API v1 */
      def load(name: androidmanagement, version: v1): js.Thenable[Unit] = js.native
      def load(name: androidmanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object androidmanagement extends js.Object {
        
        val enterprises: EnterprisesResource = js.native
        
        val signupUrls: SignupUrlsResource = js.native
      }
    }
  }
}
