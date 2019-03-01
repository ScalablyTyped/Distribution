package typings
package jsftpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var port: scala.Double
}

object Anon_Host {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double): Anon_Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[Anon_Host]
  }
}

