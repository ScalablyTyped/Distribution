package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.ExpansionFileType
import typings.maximMazurokGapiClientAndroidpublisher.anon.PackageName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpansionfilesResource extends StObject {
  
  /** Fetches the expansion file configuration for the specified APK. */
  def get(): Request[ExpansionFile] = js.native
  def get(request: ExpansionFileType): Request[ExpansionFile] = js.native
  
  def patch(request: ExpansionFileType, body: ExpansionFile): Request[ExpansionFile] = js.native
  /** Patches the APK's expansion file configuration to reference another APK's expansion file. To add a new expansion file use the Upload method. */
  def patch(request: PackageName): Request[ExpansionFile] = js.native
  
  def update(request: ExpansionFileType, body: ExpansionFile): Request[ExpansionFile] = js.native
  /** Updates the APK's expansion file configuration to reference another APK's expansion file. To add a new expansion file use the Upload method. */
  def update(request: PackageName): Request[ExpansionFile] = js.native
  
  /** Uploads a new expansion file and attaches to the specified APK. */
  def upload(): Request[ExpansionFilesUploadResponse] = js.native
  def upload(request: ExpansionFileType): Request[ExpansionFilesUploadResponse] = js.native
}
