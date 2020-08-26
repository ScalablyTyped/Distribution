package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.lodashDecorators.sharedMod.DebounceOptions
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/debounceAll", JSImport.Namespace)
@js.native
object debounceAllMod extends js.Object {
  @JSName("DebounceAll")
  def DebounceAll_(): LodashMethodDecorator = js.native
  @JSName("DebounceAll")
  def DebounceAll_(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashMethodDecorator = js.native
  @JSName("DebounceAll")
  def DebounceAll_(wait: Double): LodashMethodDecorator = js.native
  @JSName("DebounceAll")
  def DebounceAll_(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def debounceAll(): LodashMethodDecorator = js.native
  def debounceAll(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashMethodDecorator = js.native
  def debounceAll(wait: Double): LodashMethodDecorator = js.native
  def debounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
}

