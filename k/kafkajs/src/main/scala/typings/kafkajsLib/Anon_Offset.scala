package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: java.lang.String
  var partition: scala.Double
}

object Anon_Offset {
  @scala.inline
  def apply(offset: java.lang.String, partition: scala.Double): Anon_Offset = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[Anon_Offset]
  }
}

