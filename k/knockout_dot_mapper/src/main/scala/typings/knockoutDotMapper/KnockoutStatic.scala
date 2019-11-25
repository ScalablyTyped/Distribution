package typings.knockoutDotMapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var mapper: KnockoutMapper
}

object KnockoutStatic {
  @scala.inline
  def apply(mapper: KnockoutMapper): KnockoutStatic = {
    val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutStatic]
  }
}

