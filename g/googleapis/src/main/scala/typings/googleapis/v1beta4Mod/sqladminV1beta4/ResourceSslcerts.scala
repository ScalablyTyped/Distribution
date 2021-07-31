package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Sslcerts")
@js.native
class ResourceSslcerts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * sql.sslCerts.createEphemeral
    * @desc Generates a short-lived X509 certificate containing the provided
    * public key and signed by a private key specific to the target instance.
    * Users may use the certificate to authenticate as themselves when
    * connecting to the database.
    * @alias sql.sslCerts.createEphemeral
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the Cloud SQL project.
    * @param {().SslCertsCreateEphemeralRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createEphemeral(): GaxiosPromise[SchemaSslCert] = js.native
  def createEphemeral(callback: BodyResponseCallback[SchemaSslCert]): Unit = js.native
  def createEphemeral(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSslCert] = js.native
  def createEphemeral(params: ParamsResourceSslcertsCreateephemeral): GaxiosPromise[SchemaSslCert] = js.native
  def createEphemeral(params: ParamsResourceSslcertsCreateephemeral, callback: BodyResponseCallback[SchemaSslCert]): Unit = js.native
  def createEphemeral(
    params: ParamsResourceSslcertsCreateephemeral,
    options: BodyResponseCallback[SchemaSslCert],
    callback: BodyResponseCallback[SchemaSslCert]
  ): Unit = js.native
  def createEphemeral(params: ParamsResourceSslcertsCreateephemeral, options: MethodOptions): GaxiosPromise[SchemaSslCert] = js.native
  def createEphemeral(
    params: ParamsResourceSslcertsCreateephemeral,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCert]
  ): Unit = js.native
  
  /**
    * sql.sslCerts.delete
    * @desc Deletes the SSL certificate. For First Generation instances, the
    * certificate remains valid until the instance is restarted.
    * @alias sql.sslCerts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {string} params.sha1Fingerprint Sha1 FingerPrint.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSslcertsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSslcertsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceSslcertsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceSslcertsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceSslcertsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.sslCerts.get
    * @desc Retrieves a particular SSL certificate. Does not include the
    * private key (required for usage). The private key must be saved from the
    * response to initial creation.
    * @alias sql.sslCerts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {string} params.sha1Fingerprint Sha1 FingerPrint.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSslCert] = js.native
  def get(callback: BodyResponseCallback[SchemaSslCert]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSslCert] = js.native
  def get(params: ParamsResourceSslcertsGet): GaxiosPromise[SchemaSslCert] = js.native
  def get(params: ParamsResourceSslcertsGet, callback: BodyResponseCallback[SchemaSslCert]): Unit = js.native
  def get(
    params: ParamsResourceSslcertsGet,
    options: BodyResponseCallback[SchemaSslCert],
    callback: BodyResponseCallback[SchemaSslCert]
  ): Unit = js.native
  def get(params: ParamsResourceSslcertsGet, options: MethodOptions): GaxiosPromise[SchemaSslCert] = js.native
  def get(
    params: ParamsResourceSslcertsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCert]
  ): Unit = js.native
  
  /**
    * sql.sslCerts.insert
    * @desc Creates an SSL certificate and returns it along with the private
    * key and server certificate authority. The new certificate will not be
    * usable until the instance is restarted.
    * @alias sql.sslCerts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().SslCertsInsertRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSslCertsInsertResponse] = js.native
  def insert(callback: BodyResponseCallback[SchemaSslCertsInsertResponse]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSslCertsInsertResponse] = js.native
  def insert(params: ParamsResourceSslcertsInsert): GaxiosPromise[SchemaSslCertsInsertResponse] = js.native
  def insert(params: ParamsResourceSslcertsInsert, callback: BodyResponseCallback[SchemaSslCertsInsertResponse]): Unit = js.native
  def insert(
    params: ParamsResourceSslcertsInsert,
    options: BodyResponseCallback[SchemaSslCertsInsertResponse],
    callback: BodyResponseCallback[SchemaSslCertsInsertResponse]
  ): Unit = js.native
  def insert(params: ParamsResourceSslcertsInsert, options: MethodOptions): GaxiosPromise[SchemaSslCertsInsertResponse] = js.native
  def insert(
    params: ParamsResourceSslcertsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCertsInsertResponse]
  ): Unit = js.native
  
  /**
    * sql.sslCerts.list
    * @desc Lists all of the current SSL certificates for the instance.
    * @alias sql.sslCerts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSslCertsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSslCertsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSslCertsListResponse] = js.native
  def list(params: ParamsResourceSslcertsList): GaxiosPromise[SchemaSslCertsListResponse] = js.native
  def list(params: ParamsResourceSslcertsList, callback: BodyResponseCallback[SchemaSslCertsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSslcertsList,
    options: BodyResponseCallback[SchemaSslCertsListResponse],
    callback: BodyResponseCallback[SchemaSslCertsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSslcertsList, options: MethodOptions): GaxiosPromise[SchemaSslCertsListResponse] = js.native
  def list(
    params: ParamsResourceSslcertsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCertsListResponse]
  ): Unit = js.native
}
