package typings.kerberos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kerberos", "checkPassword")
@js.native
object checkPassword extends js.Object {
  
  def apply(name: String, password: String, service: String): js.Promise[Unit] = js.native
  def apply(name: String, password: String, service: String, callback: js.Function1[/* err */ String, _]): Unit = js.native
  def apply(name: String, password: String, service: String, defaultRealm: String): js.Promise[Unit] = js.native
  def apply(
    name: String,
    password: String,
    service: String,
    defaultRealm: String,
    callback: js.Function1[/* err */ String, _]
  ): Unit = js.native
}
