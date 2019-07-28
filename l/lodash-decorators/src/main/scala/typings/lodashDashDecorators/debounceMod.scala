package typings.lodashDashDecorators

import typings.lodashDashDecorators.factoryCommonMod.LodashDecorator
import typings.lodashDashDecorators.sharedMod.DebounceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/debounce", JSImport.Namespace)
@js.native
object debounceMod extends js.Object {
  def Debounce(): LodashDecorator = js.native
  def Debounce(wait: Double): LodashDecorator = js.native
  def Debounce(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  def debounce(): LodashDecorator = js.native
  def debounce(wait: Double): LodashDecorator = js.native
  def debounce(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  def default(args: js.Any*): LodashDecorator = js.native
}

