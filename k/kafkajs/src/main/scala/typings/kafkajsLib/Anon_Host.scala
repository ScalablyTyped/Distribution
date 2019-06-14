package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var nodeId: scala.Double
  var port: scala.Double
}

object Anon_Host {
  @scala.inline
  def apply(host: java.lang.String, nodeId: scala.Double, port: scala.Double): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, nodeId = nodeId, port = port)
  
    __obj.asInstanceOf[Anon_Host]
  }
}

