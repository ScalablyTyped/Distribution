package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.FieldsKey
import typings.maximMazurokGapiClientDataflow.anon.LocationOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexTemplatesResource extends StObject {
  
  /** Launch a job with a FlexTemplate. */
  def launch(request: FieldsKey): Request[LaunchFlexTemplateResponse] = js.native
  def launch(request: LocationOauthtoken, body: LaunchFlexTemplateRequest): Request[LaunchFlexTemplateResponse] = js.native
}
