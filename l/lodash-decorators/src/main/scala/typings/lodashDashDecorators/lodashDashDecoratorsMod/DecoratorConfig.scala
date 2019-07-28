package typings.lodashDashDecorators.lodashDashDecoratorsMod

import typings.lodashDashDecorators.applicatorsMod.Applicator
import typings.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators", "DecoratorConfig")
@js.native
class DecoratorConfig protected ()
  extends typings.lodashDashDecorators.factoryMod.DecoratorConfig {
  def this(execute: js.Function, applicator: Applicator) = this()
  def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
}

