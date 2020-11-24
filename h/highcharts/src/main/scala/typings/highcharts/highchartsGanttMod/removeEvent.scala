package typings.highcharts.highchartsGanttMod

import typings.highcharts.mod.Class
import typings.highcharts.mod.EventCallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts/highcharts-gantt", "removeEvent")
@js.native
object removeEvent extends js.Object {
  
  def apply[T](el: T): Unit = js.native
  def apply[T](el: T, `type`: js.UndefOr[scala.Nothing], fn: EventCallbackFunction[T]): Unit = js.native
  def apply[T](el: T, `type`: String): Unit = js.native
  def apply[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
  def apply[T](el: Class[T]): Unit = js.native
  def apply[T](el: Class[T], `type`: js.UndefOr[scala.Nothing], fn: EventCallbackFunction[T]): Unit = js.native
  def apply[T](el: Class[T], `type`: String): Unit = js.native
  def apply[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
}
