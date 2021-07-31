package typings.maximMazurokGapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContainer.anon.NameOauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var clusters: ClustersResource = js.native
  
  /** Returns configuration info about the Google Kubernetes Engine service. */
  def getServerConfig(): Request[ServerConfig] = js.native
  def getServerConfig(request: NameOauthtokenPrettyPrint): Request[ServerConfig] = js.native
  
  var operations: OperationsResource = js.native
}
