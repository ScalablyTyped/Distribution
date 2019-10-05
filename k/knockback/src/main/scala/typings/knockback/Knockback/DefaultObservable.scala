package typings.knockback.Knockback

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Knockback.DefaultObservable")
@js.native
class DefaultObservable protected () extends Destroyable {
  def this(targetObservable: KnockoutObservable[_], defaultValue: js.Any) = this()
  def setToDefault(): js.Any = js.native
}

