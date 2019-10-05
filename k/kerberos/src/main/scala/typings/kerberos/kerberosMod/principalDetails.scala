package typings.kerberos.kerberosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kerberos", "principalDetails")
@js.native
object principalDetails extends js.Object {
  def apply(service: String, hostname: String): js.Promise[String] = js.native
  def apply(
    service: String,
    hostname: String,
    callback: js.Function2[/* err */ String, /* details */ String, _]
  ): Unit = js.native
}

