package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.ReportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnsResource extends StObject {
  
  /** Lists all columns for a report type */
  def list(): Request[Columns] = js.native
  def list(request: ReportType): Request[Columns] = js.native
}
