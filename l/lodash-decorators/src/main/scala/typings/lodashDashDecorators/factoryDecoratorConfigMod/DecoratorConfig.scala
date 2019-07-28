package typings.lodashDashDecorators.factoryDecoratorConfigMod

import typings.lodashDashDecorators.applicatorsMod.Applicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/factory/DecoratorConfig", "DecoratorConfig")
@js.native
class DecoratorConfig protected () extends js.Object {
  def this(execute: js.Function, applicator: Applicator) = this()
  def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  val applicator: Applicator = js.native
  val bound: Boolean = js.native
  val execute: js.Function = js.native
  val getter: Boolean = js.native
  val method: Boolean = js.native
  val optionalParams: Boolean = js.native
  val options: DecoratorConfigOptions = js.native
  val property: Boolean = js.native
  val setter: Boolean = js.native
}

