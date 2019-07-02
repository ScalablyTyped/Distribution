package typings
package gridDashTemplateDashParserLib.gridDashTemplateDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grid-template-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def area(): Area = js.native
  def area(rect: stdLib.Partial[Rect]): Area = js.native
  def grid(template: java.lang.String): Grid = js.native
  def maxColumnEnd(grid: Grid): scala.Double = js.native
  def maxColumnStart(grid: Grid): scala.Double = js.native
  def maxRowEnd(grid: Grid): scala.Double = js.native
  def maxRowStart(grid: Grid): scala.Double = js.native
  def minColumnEnd(grid: Grid): scala.Double = js.native
  def minColumnStart(grid: Grid): scala.Double = js.native
  def minRowEnd(grid: Grid): scala.Double = js.native
  def minRowStart(grid: Grid): scala.Double = js.native
  def rect(): Rect = js.native
  def rect(area: stdLib.Partial[Area]): Rect = js.native
  def template(grid: Grid): java.lang.String = js.native
}

