package typings
package kytheLib.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fact extends Entry {
  var value: java.lang.String
}

object Fact {
  @scala.inline
  def apply(label: java.lang.String, source: VName, value: java.lang.String): Fact = {
    val __obj = js.Dynamic.literal(label = label, source = source, value = value)
  
    __obj.asInstanceOf[Fact]
  }
}

