package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.Class
import typings.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segment extends Class {
  
  def anchor(): Point = js.native
  def anchor(value: Point): Unit = js.native
  
  def controlIn(): Point = js.native
  def controlIn(value: Point): Unit = js.native
  
  def controlOut(): Point = js.native
  def controlOut(value: Point): Unit = js.native
  
  var options: SegmentOptions = js.native
}
