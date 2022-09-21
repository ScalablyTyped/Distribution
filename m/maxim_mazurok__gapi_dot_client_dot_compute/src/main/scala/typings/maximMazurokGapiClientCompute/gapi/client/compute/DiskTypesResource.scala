package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskTypesResource extends StObject {
  
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(): Request[DiskTypeAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[DiskTypeAggregatedList] = js.native
  
  /** Returns the specified disk type. Gets a list of available disk types by making a list() request. */
  def get(): Request[DiskType] = js.native
  def get(request: typings.maximMazurokGapiClientCompute.anon.DiskType): Request[DiskType] = js.native
  
  /** Retrieves a list of disk types available to the specified project. */
  def list(): Request[DiskTypeList] = js.native
  def list(request: Alt): Request[DiskTypeList] = js.native
}
