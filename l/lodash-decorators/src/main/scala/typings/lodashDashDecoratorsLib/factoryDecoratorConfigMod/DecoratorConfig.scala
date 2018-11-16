package typings
package lodashDashDecoratorsLib.factoryDecoratorConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/factory/DecoratorConfig", "DecoratorConfig")
@js.native
class DecoratorConfig protected () extends js.Object {
  def this(execute: js.Function, applicator: lodashDashDecoratorsLib.applicatorsMod.Applicator) = this()
  def this(execute: js.Function, applicator: lodashDashDecoratorsLib.applicatorsMod.Applicator, options: DecoratorConfigOptions) = this()
  val applicator: lodashDashDecoratorsLib.applicatorsMod.Applicator = js.native
  val bound: scala.Boolean = js.native
  val execute: js.Function = js.native
  val getter: scala.Boolean = js.native
  val method: scala.Boolean = js.native
  val optionalParams: scala.Boolean = js.native
  val options: DecoratorConfigOptions = js.native
  val property: scala.Boolean = js.native
  val setter: scala.Boolean = js.native
}

