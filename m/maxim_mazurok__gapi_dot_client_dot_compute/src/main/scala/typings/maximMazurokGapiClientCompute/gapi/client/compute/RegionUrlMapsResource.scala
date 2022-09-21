package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProjectQuotaUser
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.Oauthtoken
import typings.maximMazurokGapiClientCompute.anon.UploadTypeUploadprotocolUrlMap
import typings.maximMazurokGapiClientCompute.anon.UploadprotocolUrlMap
import typings.maximMazurokGapiClientCompute.anon.UrlMapUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionUrlMapsResource extends StObject {
  
  /** Deletes the specified UrlMap resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.UrlMap): Request[Operation] = js.native
  
  /** Returns the specified UrlMap resource. Gets a list of available URL maps by making a list() request. */
  def get(): Request[UrlMap] = js.native
  def get(request: UploadprotocolUrlMap): Request[UrlMap] = js.native
  
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: FieldsKeyOauthtokenPrettyPrintProjectQuotaUser): Request[Operation] = js.native
  def insert(request: Oauthtoken, body: UrlMap): Request[Operation] = js.native
  
  /** Retrieves the list of UrlMap resources available to the specified project in the specified region. */
  def list(): Request[UrlMapList] = js.native
  def list(request: Filter): Request[UrlMapList] = js.native
  
  /** Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: UrlMapUserIp): Request[Operation] = js.native
  def patch(request: typings.maximMazurokGapiClientCompute.anon.UrlMap, body: UrlMap): Request[Operation] = js.native
  
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: UrlMapUserIp): Request[Operation] = js.native
  def update(request: typings.maximMazurokGapiClientCompute.anon.UrlMap, body: UrlMap): Request[Operation] = js.native
  
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: UploadTypeUploadprotocolUrlMap): Request[UrlMapsValidateResponse] = js.native
  def validate(request: UploadprotocolUrlMap, body: RegionUrlMapsValidateRequest): Request[UrlMapsValidateResponse] = js.native
}
