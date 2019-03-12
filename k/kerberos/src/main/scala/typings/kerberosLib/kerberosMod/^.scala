package typings
package kerberosLib.kerberosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kerberos", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GSS_C_ANON_FLAG: scala.Double = js.native
  val GSS_C_CONF_FLAG: scala.Double = js.native
  val GSS_C_DELEG_FLAG: scala.Double = js.native
  val GSS_C_INTEG_FLAG: scala.Double = js.native
  val GSS_C_MUTUAL_FLAG: scala.Double = js.native
  val GSS_C_NO_OID: scala.Double = js.native
  val GSS_C_PROT_READY_FLAG: scala.Double = js.native
  val GSS_C_REPLAY_FLAG: scala.Double = js.native
  val GSS_C_SEQUENCE_FLAG: scala.Double = js.native
  val GSS_C_TRANS_FLAG: scala.Double = js.native
  val GSS_MECH_OID_KRB5: scala.Double = js.native
  val GSS_MECH_OID_SPNEGO: scala.Double = js.native
  def checkPassword(name: java.lang.String, password: java.lang.String, service: java.lang.String): js.Promise[scala.Unit] = js.native
  def checkPassword(
    name: java.lang.String,
    password: java.lang.String,
    service: java.lang.String,
    callback: js.Function1[/* err */ java.lang.String, _]
  ): scala.Unit = js.native
  def checkPassword(
    name: java.lang.String,
    password: java.lang.String,
    service: java.lang.String,
    defaultRealm: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def checkPassword(
    name: java.lang.String,
    password: java.lang.String,
    service: java.lang.String,
    defaultRealm: java.lang.String,
    callback: js.Function1[/* err */ java.lang.String, _]
  ): scala.Unit = js.native
  def initializeClient(service: java.lang.String): js.Promise[KerberosClient] = js.native
  def initializeClient(
    service: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* client */ KerberosClient, _]
  ): scala.Unit = js.native
  def initializeClient(service: java.lang.String, options: InitializeClientOptions): js.Promise[KerberosClient] = js.native
  def initializeClient(
    service: java.lang.String,
    options: InitializeClientOptions,
    callback: js.Function2[/* err */ java.lang.String, /* client */ KerberosClient, _]
  ): scala.Unit = js.native
  def initializeServer(service: java.lang.String): js.Promise[KerberosServer] = js.native
  def initializeServer(
    service: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* server */ KerberosServer, _]
  ): scala.Unit = js.native
  def principalDetails(service: java.lang.String, hostname: java.lang.String): js.Promise[java.lang.String] = js.native
  def principalDetails(
    service: java.lang.String,
    hostname: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* details */ java.lang.String, _]
  ): scala.Unit = js.native
}

