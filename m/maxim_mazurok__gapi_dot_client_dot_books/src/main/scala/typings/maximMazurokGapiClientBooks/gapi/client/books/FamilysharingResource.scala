package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.DocId
import typings.maximMazurokGapiClientBooks.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FamilysharingResource extends StObject {
  
  /** Gets information regarding the family that the user is part of. */
  def getFamilyInfo(): Request[FamilyInfo] = js.native
  def getFamilyInfo(request: QuotaUser): Request[FamilyInfo] = js.native
  
  /** Initiates sharing of the content with the user's family. Empty response indicates success. */
  def share(): Request[js.Object] = js.native
  def share(request: DocId): Request[js.Object] = js.native
  
  /** Initiates revoking content that has already been shared with the user's family. Empty response indicates success. */
  def unshare(): Request[js.Object] = js.native
  def unshare(request: DocId): Request[js.Object] = js.native
}
