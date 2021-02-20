package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.Cpksver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictionaryResource extends StObject {
  
  /** Returns a list of offline dictionary metadata available */
  def listOfflineMetadata(): Request[Metadata] = js.native
  def listOfflineMetadata(request: Cpksver): Request[Metadata] = js.native
}
