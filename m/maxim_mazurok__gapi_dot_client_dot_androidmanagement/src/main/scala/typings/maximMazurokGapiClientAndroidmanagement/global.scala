package typings.maximMazurokGapiClientAndroidmanagement

import typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement.EnterprisesResource
import typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement.SignupUrlsResource
import typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.androidmanagement
import typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object androidmanagement {
        
        @JSGlobal("gapi.client.androidmanagement.enterprises")
        @js.native
        val enterprises: EnterprisesResource = js.native
        
        @JSGlobal("gapi.client.androidmanagement.signupUrls")
        @js.native
        val signupUrls: SignupUrlsResource = js.native
      }
      
      /** Load Android Management API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: androidmanagement, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: androidmanagement, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
