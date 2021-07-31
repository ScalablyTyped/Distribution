package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentsResource extends StObject {
  
  /** Returns the list of all non-draft environments of the specified agent. */
  def list(): Request[GoogleCloudDialogflowV2ListEnvironmentsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDialogflowV2ListEnvironmentsResponse] = js.native
  
  var users: UsersResource = js.native
}
