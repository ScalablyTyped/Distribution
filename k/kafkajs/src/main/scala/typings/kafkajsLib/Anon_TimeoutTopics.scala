package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimeoutTopics extends js.Object {
  var timeout: scala.Double
  var topics: js.Array[java.lang.String]
}

object Anon_TimeoutTopics {
  @scala.inline
  def apply(timeout: scala.Double, topics: js.Array[java.lang.String]): Anon_TimeoutTopics = {
    val __obj = js.Dynamic.literal(timeout = timeout, topics = topics)
  
    __obj.asInstanceOf[Anon_TimeoutTopics]
  }
}

