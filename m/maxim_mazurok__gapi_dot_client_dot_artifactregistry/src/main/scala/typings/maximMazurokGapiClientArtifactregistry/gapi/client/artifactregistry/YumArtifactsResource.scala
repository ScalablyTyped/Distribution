package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArtifactregistry.anon.Callback
import typings.maximMazurokGapiClientArtifactregistry.anon.Resource
import typings.maximMazurokGapiClientArtifactregistry.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YumArtifactsResource extends StObject {
  
  def `import`(request: Callback, body: ImportYumArtifactsRequest): Request[Operation] = js.native
  /**
    * Imports Yum (RPM) artifacts. The returned Operation will complete once the resources are imported. Package, Version, and File resources are created based on the imported artifacts.
    * Imported artifacts that conflict with existing resources are ignored.
    */
  def `import`(request: Resource): Request[Operation] = js.native
  
  def upload(request: Callback, body: UploadYumArtifactRequest): Request[UploadYumArtifactMediaResponse] = js.native
  /**
    * Directly uploads a Yum artifact. The returned Operation will complete once the resources are uploaded. Package, Version, and File resources are created based on the imported
    * artifact. Imported artifacts that conflict with existing resources are ignored.
    */
  def upload(request: Uploadprotocol): Request[UploadYumArtifactMediaResponse] = js.native
}
