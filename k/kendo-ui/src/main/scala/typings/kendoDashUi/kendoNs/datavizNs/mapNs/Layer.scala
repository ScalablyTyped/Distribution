package typings.kendoDashUi.kendoNs.datavizNs.mapNs

import typings.kendoDashUi.kendoNs.Class
import typings.kendoDashUi.kendoNs.datavizNs.uiNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.Layer")
@js.native
class Layer protected () extends Class {
  def this(map: Map) = this()
  def this(map: Map, options: LayerOptions) = this()
  var map: Map = js.native
  var options: LayerOptions = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
}

