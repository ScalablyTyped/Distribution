package typings.keystonejsAuthPassword.mod

import typings.keystonejsKeystone.mod.BaseAuthStrategy
import typings.keystonejsKeystone.mod.Keystone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/auth-password", "PasswordAuthStrategy")
@js.native
class PasswordAuthStrategy protected () extends BaseAuthStrategy {
  def this(keystone: Keystone[String], listKey: String, config: PasswordAuthStrategyConfig) = this()
  var authType: String = js.native
   // TODO
  def getAdminMeta(): js.Any = js.native
   // TODO
  def getInputFragment(): String = js.native
  def getList(): js.Any = js.native
  def validate(args: js.Any): js.Promise[PasswordValidationResult] = js.native
}

