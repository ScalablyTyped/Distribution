package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.Action
import typings.maximMazurokGapiClientBooks.anon.AltCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadingpositionsResource extends StObject {
  
  /** Retrieves my reading position information for a volume. */
  def get(): Request[ReadingPosition] = js.native
  def get(request: AltCallback): Request[ReadingPosition] = js.native
  
  /** Sets my reading position information for a volume. */
  def setPosition(): Request[js.Object] = js.native
  def setPosition(request: Action): Request[js.Object] = js.native
}
