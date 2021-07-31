package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.FileId
import typings.maximMazurokGapiClientDfareporting.anon.ReportId
import typings.maximMazurokGapiClientDfareporting.anon.Scope
import typings.maximMazurokGapiClientDfareporting.anon.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends StObject {
  
  /** Retrieves a report file by its report ID and file ID. This method supports media download. */
  def get(): Request[File] = js.native
  def get(request: FileId): Request[File] = js.native
  def get(request: ReportId): Request[File] = js.native
  
  /** Lists files for a user profile. */
  def list(): Request[FileList] = js.native
  def list(request: Scope): Request[FileList] = js.native
  def list(request: SortOrder): Request[FileList] = js.native
}
