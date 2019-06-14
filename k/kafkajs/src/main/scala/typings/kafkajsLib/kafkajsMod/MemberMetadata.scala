package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberMetadata extends js.Object {
  var topics: js.Array[java.lang.String]
  var userData: nodeLib.Buffer
  var version: scala.Double
}

object MemberMetadata {
  @scala.inline
  def apply(topics: js.Array[java.lang.String], userData: nodeLib.Buffer, version: scala.Double): MemberMetadata = {
    val __obj = js.Dynamic.literal(topics = topics, userData = userData, version = version)
  
    __obj.asInstanceOf[MemberMetadata]
  }
}

