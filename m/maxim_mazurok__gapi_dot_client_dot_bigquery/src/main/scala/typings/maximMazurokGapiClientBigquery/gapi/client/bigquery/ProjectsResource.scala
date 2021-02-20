package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigquery.anon.Key
import typings.maximMazurokGapiClientBigquery.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Returns the email address of the service account for your project used for interactions with Google Cloud KMS. */
  def getServiceAccount(): Request[GetServiceAccountResponse] = js.native
  def getServiceAccount(request: Key): Request[GetServiceAccountResponse] = js.native
  
  /** Lists all projects to which you have been granted any project role. */
  def list(): Request[ProjectList] = js.native
  def list(request: PageToken): Request[ProjectList] = js.native
}
