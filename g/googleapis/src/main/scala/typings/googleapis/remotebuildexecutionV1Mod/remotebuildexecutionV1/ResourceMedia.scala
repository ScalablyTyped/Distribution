package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution/v1", "remotebuildexecution_v1.Resource$Media")
@js.native
class ResourceMedia protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * remotebuildexecution.media.download
    * @desc Downloads media. Download is supported on the URI
    * `/v1/media/{+name}?alt=media`.
    * @alias remotebuildexecution.media.download
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName Name of the media that is being downloaded.  See ReadRequest.resource_name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def download(): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def download(callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
  def download(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def download(params: ParamsResourceMediaDownload): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def download(params: ParamsResourceMediaDownload, callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: BodyResponseCallback[SchemaGoogleBytestreamMedia],
    callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]
  ): Unit = js.native
  def download(params: ParamsResourceMediaDownload, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]
  ): Unit = js.native
  
  /**
    * remotebuildexecution.media.upload
    * @desc Uploads media. Upload is supported on the URI
    * `/upload/v1/media/{+name}`.
    * @alias remotebuildexecution.media.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName Name of the media that is being downloaded.  See ReadRequest.resource_name.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def upload(callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def upload(params: ParamsResourceMediaUpload): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def upload(params: ParamsResourceMediaUpload, callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: BodyResponseCallback[SchemaGoogleBytestreamMedia],
    callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]
  ): Unit = js.native
  def upload(params: ParamsResourceMediaUpload, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]
  ): Unit = js.native
}
