package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Knockback.ViewModel")
@js.native
class ViewModel () extends Destroyable {
  def this(model: backboneLib.backboneMod.Model) = this()
  def this(model: backboneLib.backboneMod.Model, options: ViewModelOptions) = this()
  def this(model: backboneLib.backboneMod.Model, options: ViewModelOptions, viewModel: ViewModel) = this()
  def extend(source: js.Any): js.Any = js.native
  def model(): backboneLib.backboneMod.Model = js.native
  def shareOptions(): ViewModelOptions = js.native
}

