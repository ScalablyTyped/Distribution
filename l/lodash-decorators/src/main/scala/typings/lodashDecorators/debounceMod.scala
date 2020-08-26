package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import typings.lodashDecorators.sharedMod.DebounceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/debounce", JSImport.Namespace)
@js.native
object debounceMod extends js.Object {
  @JSName("Debounce")
  def Debounce_(): LodashDecorator = js.native
  @JSName("Debounce")
  def Debounce_(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashDecorator = js.native
  @JSName("Debounce")
  def Debounce_(wait: Double): LodashDecorator = js.native
  @JSName("Debounce")
  def Debounce_(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  def debounce(): LodashDecorator = js.native
  def debounce(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashDecorator = js.native
  def debounce(wait: Double): LodashDecorator = js.native
  def debounce(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  def default(args: js.Any*): LodashDecorator = js.native
}

