package typings.kerberos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kerberos", "initializeClient")
@js.native
object initializeClient extends js.Object {
  def apply(service: String): js.Promise[KerberosClient] = js.native
  def apply(service: String, callback: js.Function2[/* err */ String, /* client */ KerberosClient, _]): Unit = js.native
  def apply(service: String, options: InitializeClientOptions): js.Promise[KerberosClient] = js.native
  def apply(
    service: String,
    options: InitializeClientOptions,
    callback: js.Function2[/* err */ String, /* client */ KerberosClient, _]
  ): Unit = js.native
}

