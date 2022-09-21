package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hellosignSdk.anon.OmitSignatureRequestReque
import typings.hellosignSdk.anon.Page
import typings.hellosignSdk.anon.datauristringexpiresatDat
import typings.hellosignSdk.anon.fileurlstringexpiresatDat
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureRequestModule extends StObject {
  
  def cancel(requestId: String): js.Promise[BaseResponse] = js.native
  
  def createEmbedded(options: OmitSignatureRequestReque): js.Promise[SignatureRequestResponse] = js.native
  
  def createEmbeddedWithTemplate(options: OmitSignatureRequestReque): js.Promise[SignatureRequestResponse] = js.native
  
  def download[Options /* <: js.UndefOr[FilesOptions] */](requestId: String): js.Promise[IncomingMessage | datauristringexpiresatDat | fileurlstringexpiresatDat] = js.native
  def download[Options /* <: js.UndefOr[FilesOptions] */](requestId: String, options: Options): js.Promise[IncomingMessage | datauristringexpiresatDat | fileurlstringexpiresatDat] = js.native
  
  def get(signatureRequestId: String): js.Promise[SignatureRequestResponse] = js.native
  
  def list(): js.Promise[SignatureListRequestResponse] = js.native
  def list(params: Page): js.Promise[SignatureListRequestResponse] = js.native
  
  def releaseHold(requestId: String): js.Promise[BaseResponse] = js.native
  
  def remind(requestId: String, options: Any): js.Promise[SignatureRequestResponse] = js.native
  
  def removeAccess(requestId: String): js.Promise[BaseResponse] = js.native
  
  def send(options: SignatureRequestRequestOptions[StringDictionary[Any]]): js.Promise[SignatureRequestResponse] = js.native
  
  def sendWithTemplate(options: SignatureRequestRequestOptions[StringDictionary[Any]]): js.Promise[SignatureRequestResponse] = js.native
}
