package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupState extends js.Object {
  var metadata: nodeLib.Buffer
  var name: java.lang.String
}

object GroupState {
  @scala.inline
  def apply(metadata: nodeLib.Buffer, name: java.lang.String): GroupState = {
    val __obj = js.Dynamic.literal(metadata = metadata, name = name)
  
    __obj.asInstanceOf[GroupState]
  }
}

