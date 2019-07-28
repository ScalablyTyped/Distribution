package typings.kerberos.kerberosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kerberos", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GSS_C_ANON_FLAG: Double = js.native
  val GSS_C_CONF_FLAG: Double = js.native
  val GSS_C_DELEG_FLAG: Double = js.native
  val GSS_C_INTEG_FLAG: Double = js.native
  val GSS_C_MUTUAL_FLAG: Double = js.native
  val GSS_C_NO_OID: Double = js.native
  val GSS_C_PROT_READY_FLAG: Double = js.native
  val GSS_C_REPLAY_FLAG: Double = js.native
  val GSS_C_SEQUENCE_FLAG: Double = js.native
  val GSS_C_TRANS_FLAG: Double = js.native
  val GSS_MECH_OID_KRB5: Double = js.native
  val GSS_MECH_OID_SPNEGO: Double = js.native
  def checkPassword(name: String, password: String, service: String): js.Promise[Unit] = js.native
  def checkPassword(name: String, password: String, service: String, callback: js.Function1[/* err */ String, _]): Unit = js.native
  def checkPassword(name: String, password: String, service: String, defaultRealm: String): js.Promise[Unit] = js.native
  def checkPassword(
    name: String,
    password: String,
    service: String,
    defaultRealm: String,
    callback: js.Function1[/* err */ String, _]
  ): Unit = js.native
  def initializeClient(service: String): js.Promise[KerberosClient] = js.native
  def initializeClient(service: String, callback: js.Function2[/* err */ String, /* client */ KerberosClient, _]): Unit = js.native
  def initializeClient(service: String, options: InitializeClientOptions): js.Promise[KerberosClient] = js.native
  def initializeClient(
    service: String,
    options: InitializeClientOptions,
    callback: js.Function2[/* err */ String, /* client */ KerberosClient, _]
  ): Unit = js.native
  def initializeServer(service: String): js.Promise[KerberosServer] = js.native
  def initializeServer(service: String, callback: js.Function2[/* err */ String, /* server */ KerberosServer, _]): Unit = js.native
  def principalDetails(service: String, hostname: String): js.Promise[String] = js.native
  def principalDetails(
    service: String,
    hostname: String,
    callback: js.Function2[/* err */ String, /* details */ String, _]
  ): Unit = js.native
}

