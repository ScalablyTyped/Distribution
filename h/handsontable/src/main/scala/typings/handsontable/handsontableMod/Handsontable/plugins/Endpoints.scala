package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoints extends js.Object {
  var currentEndpoint: js.Object | Unit = js.native
  var endpoints: js.Array[Endpoint] = js.native
  var hot: Core = js.native
  var plugin: ColumnSummary = js.native
  var settings: js.Object | js.Function0[Unit] = js.native
  var settingsType: String = js.native
  def assignSetting(settings: js.Object, endpoint: js.Object, name: String, defaultValue: js.Any): Unit = js.native
  def getAllEndpoints(): js.Array[_] = js.native
  def getEndpoint(index: Double): js.Object = js.native
  def parseSettings(settings: js.Array[_]): Unit = js.native
  def refreshAllEndpoints(init: Boolean): Unit = js.native
  def refreshChangedEndpoints(changes: js.Array[_]): Unit = js.native
  def refreshEndpoint(endpoint: js.Object): Unit = js.native
  def resetAllEndpoints(endpoints: js.Array[_]): Unit = js.native
  def resetAllEndpoints(endpoints: js.Array[_], useOffset: Boolean): Unit = js.native
  def resetEndpointValue(endpoint: js.Object): Unit = js.native
  def resetEndpointValue(endpoint: js.Object, useOffset: Boolean): Unit = js.native
  def setEndpointValue(endpoint: js.Object, source: String): Unit = js.native
  def setEndpointValue(endpoint: js.Object, source: String, render: Boolean): Unit = js.native
}

