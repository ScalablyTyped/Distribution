package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRegionUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionsResource extends StObject {
  
  /** Returns the specified Region resource. Gets a list of available regions by making a list() request. */
  def get(): Request[Region] = js.native
  def get(request: ProjectQuotaUserRegionUploadType): Request[Region] = js.native
  
  /** Retrieves the list of region resources available to the specified project. */
  def list(): Request[RegionList] = js.native
  def list(request: MaxResults): Request[RegionList] = js.native
}
