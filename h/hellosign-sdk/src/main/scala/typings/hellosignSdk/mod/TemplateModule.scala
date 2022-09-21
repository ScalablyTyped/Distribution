package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hellosignSdk.anon.Page
import typings.hellosignSdk.anon.datauristringexpiresatDat
import typings.hellosignSdk.anon.fileurlstringexpiresatDat
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateModule extends StObject {
  
  def addUser(templateId: String, user: AccountIdOrEmailRequestOptions): js.Promise[TemplateResponse] = js.native
  
  def createEmbeddedDraft(options: Template[StringDictionary[Any]]): js.Promise[TemplateResponse] = js.native
  
  def delete(templateId: String): js.Promise[BaseResponse] = js.native
  
  def files[Options /* <: js.UndefOr[FilesOptions] */](templateId: String): js.Promise[IncomingMessage | datauristringexpiresatDat | fileurlstringexpiresatDat] = js.native
  def files[Options /* <: js.UndefOr[FilesOptions] */](templateId: String, options: Options): js.Promise[IncomingMessage | datauristringexpiresatDat | fileurlstringexpiresatDat] = js.native
  
  def get(templateId: String): js.Promise[TemplateResponse] = js.native
  
  def list(): js.Promise[TemplatesResponse] = js.native
  def list(params: Page): js.Promise[TemplatesResponse] = js.native
  
  def removeUser(templateId: String, user: AccountIdOrEmailRequestOptions): js.Promise[TemplateResponse] = js.native
}
