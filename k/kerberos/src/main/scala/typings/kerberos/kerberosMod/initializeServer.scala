package typings.kerberos.kerberosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kerberos", "initializeServer")
@js.native
object initializeServer extends js.Object {
  def apply(service: String): js.Promise[KerberosServer] = js.native
  def apply(service: String, callback: js.Function2[/* err */ String, /* server */ KerberosServer, _]): Unit = js.native
}

