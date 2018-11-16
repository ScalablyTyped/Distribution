package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoints extends js.Object {
  var currentEndpoint: js.Object | scala.Unit = js.native
  var endpoints: js.Array[_] = js.native
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core = js.native
  var plugin: ColumnSummary = js.native
  var settings: js.Object | js.Function0[scala.Unit] = js.native
  var settingsType: java.lang.String = js.native
  def assignSetting(settings: js.Object, endpoint: js.Object, name: java.lang.String, defaultValue: js.Any): scala.Unit = js.native
  def getAllEndpoints(): js.Array[_] = js.native
  def getEndpoint(index: scala.Double): js.Object = js.native
  def parseSettings(settings: js.Array[_]): scala.Unit = js.native
  def refreshAllEndpoints(init: scala.Boolean): scala.Unit = js.native
  def refreshChangedEndpoints(changes: js.Array[_]): scala.Unit = js.native
  def refreshEndpoint(endpoint: js.Object): scala.Unit = js.native
  def resetAllEndpoints(endpoints: js.Array[_]): scala.Unit = js.native
  def resetAllEndpoints(endpoints: js.Array[_], useOffset: scala.Boolean): scala.Unit = js.native
  def resetEndpointValue(endpoint: js.Object): scala.Unit = js.native
  def resetEndpointValue(endpoint: js.Object, useOffset: scala.Boolean): scala.Unit = js.native
  def setEndpointValue(endpoint: js.Object, source: java.lang.String): scala.Unit = js.native
  def setEndpointValue(endpoint: js.Object, source: java.lang.String, render: scala.Boolean): scala.Unit = js.native
}

