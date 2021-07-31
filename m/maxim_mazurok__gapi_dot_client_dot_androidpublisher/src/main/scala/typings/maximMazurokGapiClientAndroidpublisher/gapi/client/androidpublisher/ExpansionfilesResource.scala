package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.EditId
import typings.maximMazurokGapiClientAndroidpublisher.anon.ExpansionFileType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpansionfilesResource extends StObject {
  
  /** Fetches the expansion file configuration for the specified APK. */
  def get(): Request[ExpansionFile] = js.native
  def get(request: EditId): Request[ExpansionFile] = js.native
  
  def patch(request: EditId, body: ExpansionFile): Request[ExpansionFile] = js.native
  /** Patches the APK's expansion file configuration to reference another APK's expansion file. To add a new expansion file use the Upload method. */
  def patch(request: ExpansionFileType): Request[ExpansionFile] = js.native
  
  def update(request: EditId, body: ExpansionFile): Request[ExpansionFile] = js.native
  /** Updates the APK's expansion file configuration to reference another APK's expansion file. To add a new expansion file use the Upload method. */
  def update(request: ExpansionFileType): Request[ExpansionFile] = js.native
  
  /** Uploads a new expansion file and attaches to the specified APK. */
  def upload(): Request[ExpansionFilesUploadResponse] = js.native
  def upload(request: EditId): Request[ExpansionFilesUploadResponse] = js.native
}
