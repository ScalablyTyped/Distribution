package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactoryOptions extends js.Object {
  var factories: js.Any
}

object FactoryOptions {
  @scala.inline
  def apply(factories: js.Any): FactoryOptions = {
    val __obj = js.Dynamic.literal(factories = factories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FactoryOptions]
  }
}

