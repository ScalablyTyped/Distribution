package typings.lodashDashDecorators.factoryMod

import typings.lodashDashDecorators.applicatorsMod.Applicator
import typings.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/factory", "DecoratorConfig")
@js.native
class DecoratorConfig protected ()
  extends typings.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfig {
  def this(execute: js.Function, applicator: Applicator) = this()
  def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
}

