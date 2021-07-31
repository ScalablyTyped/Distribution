package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResource
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.QuotaUserTargetGrpcProxy
import typings.maximMazurokGapiClientCompute.anon.ResourceTargetGrpcProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGrpcProxiesResource extends StObject {
  
  /** Deletes the specified TargetGrpcProxy in the given scope */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.TargetGrpcProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetGrpcProxy resource in the given scope. */
  def get(): Request[TargetGrpcProxy] = js.native
  def get(request: QuotaUserTargetGrpcProxy): Request[TargetGrpcProxy] = js.native
  
  /** Creates a TargetGrpcProxy in the specified project in the given scope using the parameters that are included in the request. */
  def insert(request: AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResource): Request[Operation] = js.native
  def insert(request: FieldsKey, body: TargetGrpcProxy): Request[Operation] = js.native
  
  /** Lists the TargetGrpcProxies for a project in the given scope. */
  def list(): Request[TargetGrpcProxyList] = js.native
  def list(request: MaxResults): Request[TargetGrpcProxyList] = js.native
  
  /** Patches the specified TargetGrpcProxy resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: ResourceTargetGrpcProxy): Request[Operation] = js.native
  def patch(request: typings.maximMazurokGapiClientCompute.anon.TargetGrpcProxy, body: TargetGrpcProxy): Request[Operation] = js.native
}
