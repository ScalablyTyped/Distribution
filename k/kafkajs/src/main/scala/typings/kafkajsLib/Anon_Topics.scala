package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Topics extends js.Object {
  var topics: js.Array[java.lang.String]
  var userData: nodeLib.Buffer
}

object Anon_Topics {
  @scala.inline
  def apply(topics: js.Array[java.lang.String], userData: nodeLib.Buffer): Anon_Topics = {
    val __obj = js.Dynamic.literal(topics = topics, userData = userData)
  
    __obj.asInstanceOf[Anon_Topics]
  }
}

