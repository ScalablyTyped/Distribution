package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArtifactregistry.anon.Alt
import typings.maximMazurokGapiClientArtifactregistry.anon.Callback
import typings.maximMazurokGapiClientArtifactregistry.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AptArtifactsResource extends StObject {
  
  /**
    * Imports Apt artifacts. The returned Operation will complete once the resources are imported. Package, Version, and File resources are created based on the imported artifacts.
    * Imported artifacts that conflict with existing resources are ignored.
    */
  def `import`(request: Alt): Request[Operation] = js.native
  def `import`(request: Callback, body: ImportAptArtifactsRequest): Request[Operation] = js.native
  
  def upload(request: Callback, body: UploadAptArtifactRequest): Request[UploadAptArtifactMediaResponse] = js.native
  /**
    * Directly uploads an Apt artifact. The returned Operation will complete once the resources are uploaded. Package, Version, and File resources are created based on the imported
    * artifact. Imported artifacts that conflict with existing resources are ignored.
    */
  def upload(request: Fields): Request[UploadAptArtifactMediaResponse] = js.native
}
