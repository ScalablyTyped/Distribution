package typings.kendoDashUi.kendo.dataviz.map

import typings.kendoDashUi.kendo.Class
import typings.kendoDashUi.kendo.dataviz.ui.Map
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

@JSGlobal("kendo.dataviz.map.layer")
@js.native
object layer extends js.Object {
  @js.native
  class Shape () extends js.Object
  
}

