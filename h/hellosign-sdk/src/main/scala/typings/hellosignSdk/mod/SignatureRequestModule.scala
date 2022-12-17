package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hellosignSdk.anon.OmitSignatureRequestReque
import typings.hellosignSdk.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureRequestModule extends StObject {
  
  def cancel(requestId: String): js.Promise[BaseResponse] = js.native
  
  def createEmbedded(options: OmitSignatureRequestReque): js.Promise[SignatureRequestResponse] = js.native
  
  def createEmbeddedWithTemplate(options: OmitSignatureRequestReque): js.Promise[SignatureRequestResponse] = js.native
  
  def download[Options /* <: js.UndefOr[FilesOptions] */](requestId: String): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: Options extends {  file_type :'pdf',   get_url :true} ? / * Inlined {  file_url :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse * /
  {  file_url :string,   expires_at :std.Date,   resHeaders :node.http.IncomingHttpHeaders,   statusCode :number | undefined | undefined,   statusMessage :string | undefined | undefined} : Options extends {  file_type :'pdf',   get_data_uri :true} ? / * Inlined {  data_uri :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse * /
  {  data_uri :string,   expires_at :std.Date,   resHeaders :node.http.IncomingHttpHeaders,   statusCode :number | undefined | undefined,   statusMessage :string | undefined | undefined} : node.http.IncomingMessage */ js.Any
  ] = js.native
  def download[Options /* <: js.UndefOr[FilesOptions] */](requestId: String, options: Options): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: Options extends {  file_type :'pdf',   get_url :true} ? / * Inlined {  file_url :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse * /
  {  file_url :string,   expires_at :std.Date,   resHeaders :node.http.IncomingHttpHeaders,   statusCode :number | undefined | undefined,   statusMessage :string | undefined | undefined} : Options extends {  file_type :'pdf',   get_data_uri :true} ? / * Inlined {  data_uri :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse * /
  {  data_uri :string,   expires_at :std.Date,   resHeaders :node.http.IncomingHttpHeaders,   statusCode :number | undefined | undefined,   statusMessage :string | undefined | undefined} : node.http.IncomingMessage */ js.Any
  ] = js.native
  
  def get(signatureRequestId: String): js.Promise[SignatureRequestResponse] = js.native
  
  def list(): js.Promise[SignatureListRequestResponse] = js.native
  def list(params: Page): js.Promise[SignatureListRequestResponse] = js.native
  
  def releaseHold(requestId: String): js.Promise[BaseResponse] = js.native
  
  def remind(requestId: String, options: Any): js.Promise[SignatureRequestResponse] = js.native
  
  def removeAccess(requestId: String): js.Promise[BaseResponse] = js.native
  
  def send(options: SignatureRequestRequestOptions[StringDictionary[Any]]): js.Promise[SignatureRequestResponse] = js.native
  
  def sendWithTemplate(options: SignatureRequestRequestOptions[StringDictionary[Any]]): js.Promise[SignatureRequestResponse] = js.native
}
