package typings.lodashDashDecorators

import typings.lodashDashDecorators.factoryCommonMod.LodashMethodDecorator
import typings.lodashDashDecorators.sharedMod.DebounceOptions
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/debounceAll", JSImport.Namespace)
@js.native
object debounceAllMod extends js.Object {
  def DebounceAll(): LodashMethodDecorator = js.native
  def DebounceAll(wait: Double): LodashMethodDecorator = js.native
  def DebounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def debounceAll(): LodashMethodDecorator = js.native
  def debounceAll(wait: Double): LodashMethodDecorator = js.native
  def debounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
}

