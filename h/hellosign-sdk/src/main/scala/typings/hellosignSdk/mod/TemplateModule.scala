package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hellosignSdk.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateModule extends StObject {
  
  def addUser(templateId: String, user: AccountIdOrEmailRequestOptions): js.Promise[TemplateResponse] = js.native
  
  def createEmbeddedDraft(options: Template[StringDictionary[Any]]): js.Promise[TemplateResponse] = js.native
  
  def delete(templateId: String): js.Promise[BaseResponse] = js.native
  
  def files[Options /* <: js.UndefOr[FilesOptions] */](templateId: String): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: Options extends {  file_type :'pdf',   get_url :true} ? / * Inlined {  file_url :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse * /
  {  file_url :string,   expires_at :std.Date,   resHeaders :node.http.IncomingHttpHeaders,   statusCode :number | undefined | undefined,   statusMessage :string | undefined | undefined} : Options extends {  file_type :'pdf',   get_data_uri :true} ? / * Inlined {  data_uri :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse * /
  {  data_uri :string,   expires_at :std.Date,   resHeaders :node.http.IncomingHttpHeaders,   statusCode :number | undefined | undefined,   statusMessage :string | undefined | undefined} : node.http.IncomingMessage */ js.Any
  ] = js.native
  def files[Options /* <: js.UndefOr[FilesOptions] */](templateId: String, options: Options): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: Options extends {  file_type :'pdf',   get_url :true} ? / * Inlined {  file_url :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse * /
  {  file_url :string,   expires_at :std.Date,   resHeaders :node.http.IncomingHttpHeaders,   statusCode :number | undefined | undefined,   statusMessage :string | undefined | undefined} : Options extends {  file_type :'pdf',   get_data_uri :true} ? / * Inlined {  data_uri :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse * /
  {  data_uri :string,   expires_at :std.Date,   resHeaders :node.http.IncomingHttpHeaders,   statusCode :number | undefined | undefined,   statusMessage :string | undefined | undefined} : node.http.IncomingMessage */ js.Any
  ] = js.native
  
  def get(templateId: String): js.Promise[TemplateResponse] = js.native
  
  def list(): js.Promise[TemplatesResponse] = js.native
  def list(params: Page): js.Promise[TemplatesResponse] = js.native
  
  def removeUser(templateId: String, user: AccountIdOrEmailRequestOptions): js.Promise[TemplateResponse] = js.native
}
