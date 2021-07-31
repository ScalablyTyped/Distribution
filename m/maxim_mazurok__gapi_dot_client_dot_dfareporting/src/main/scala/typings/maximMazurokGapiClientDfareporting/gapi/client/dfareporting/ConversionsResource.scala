package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.KeyOauthtoken
import typings.maximMazurokGapiClientDfareporting.anon.OauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionsResource extends StObject {
  
  def batchinsert(request: Callback, body: ConversionsBatchInsertRequest): Request[ConversionsBatchInsertResponse] = js.native
  /** Inserts conversions. */
  def batchinsert(request: KeyOauthtoken): Request[ConversionsBatchInsertResponse] = js.native
  
  def batchupdate(request: Callback, body: ConversionsBatchUpdateRequest): Request[ConversionsBatchUpdateResponse] = js.native
  /** Updates existing conversions. */
  def batchupdate(request: OauthtokenPrettyPrint): Request[ConversionsBatchUpdateResponse] = js.native
}
