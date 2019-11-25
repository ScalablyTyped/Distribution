package typings.kythe.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fact extends Entry {
  var value: String
}

object Fact {
  @scala.inline
  def apply(label: String, source: VName, value: String): Fact = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Fact]
  }
}

