package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoints extends StObject {
  
  def assignSetting(settings: js.Object, endpoint: js.Object, name: String, defaultValue: js.Any): Unit = js.native
  
  var currentEndpoint: js.Object | Unit = js.native
  
  var endpoints: js.Array[Endpoint] = js.native
  
  def getAllEndpoints(): js.Array[_] = js.native
  
  def getEndpoint(index: Double): js.Object = js.native
  
  var hot: Core = js.native
  
  def parseSettings(settings: js.Array[_]): Unit = js.native
  
  var plugin: ColumnSummary = js.native
  
  def refreshAllEndpoints(init: Boolean): Unit = js.native
  
  def refreshChangedEndpoints(changes: js.Array[_]): Unit = js.native
  
  def refreshEndpoint(endpoint: js.Object): Unit = js.native
  
  def resetAllEndpoints(endpoints: js.Array[_]): Unit = js.native
  def resetAllEndpoints(endpoints: js.Array[_], useOffset: Boolean): Unit = js.native
  
  def resetEndpointValue(endpoint: js.Object): Unit = js.native
  def resetEndpointValue(endpoint: js.Object, useOffset: Boolean): Unit = js.native
  
  def setEndpointValue(endpoint: js.Object, source: String): Unit = js.native
  def setEndpointValue(endpoint: js.Object, source: String, render: Boolean): Unit = js.native
  
  var settings: js.Object | js.Function0[Unit] = js.native
  
  var settingsType: String = js.native
}
