package typings.highcharts.highmapsMod

import typings.highcharts.mod.ObjectEachCallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts/highmaps", "objectEach")
@js.native
object objectEach extends js.Object {
  
  def apply[T](obj: js.Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
  def apply[T](obj: js.Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
}
