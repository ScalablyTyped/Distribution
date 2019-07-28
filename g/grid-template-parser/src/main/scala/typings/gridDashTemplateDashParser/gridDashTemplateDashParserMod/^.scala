package typings.gridDashTemplateDashParser.gridDashTemplateDashParserMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grid-template-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def area(): Area = js.native
  def area(rect: Partial[Rect]): Area = js.native
  def grid(template: String): Grid = js.native
  def maxColumnEnd(grid: Grid): Double = js.native
  def maxColumnStart(grid: Grid): Double = js.native
  def maxRowEnd(grid: Grid): Double = js.native
  def maxRowStart(grid: Grid): Double = js.native
  def minColumnEnd(grid: Grid): Double = js.native
  def minColumnStart(grid: Grid): Double = js.native
  def minRowEnd(grid: Grid): Double = js.native
  def minRowStart(grid: Grid): Double = js.native
  def rect(): Rect = js.native
  def rect(area: Partial[Area]): Rect = js.native
  def template(grid: Grid): String = js.native
}

