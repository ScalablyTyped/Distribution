package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.AnnotationId
import typings.maximMazurokGapiClientBooks.anon.EndOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeAnnotationsResource extends StObject {
  
  /** Gets the volume annotation. */
  def get(): Request[Volumeannotation] = js.native
  def get(request: AnnotationId): Request[Volumeannotation] = js.native
  
  /** Gets the volume annotations for a volume and layer. */
  def list(): Request[Volumeannotations] = js.native
  def list(request: EndOffset): Request[Volumeannotations] = js.native
}
