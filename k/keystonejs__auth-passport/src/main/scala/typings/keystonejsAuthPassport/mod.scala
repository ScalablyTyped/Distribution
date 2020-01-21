package typings.keystonejsAuthPassport

import typings.keystonejsKeystone.mod.Keystone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/auth-passport", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class FacebookAuthStrategy () extends PassportAuthStrategy
  
  @js.native
  class GitHubAuthStrategy () extends PassportAuthStrategy
  
  @js.native
  class GoogleAuthStrategy () extends PassportAuthStrategy
  
  @js.native
  class PassportAuthStrategy protected () extends js.Object {
    // TODO: Better types here: https://www.keystonejs.com/keystonejs/auth-passport/
    def this(authType: String, keystone: Keystone[String], listKey: String, config: js.Any, strategy: js.Any) = this()
    def getInputFragment(): String = js.native
  }
  
  @js.native
  class TwitterAuthStrategy () extends PassportAuthStrategy
  
  /* static members */
  @js.native
  object PassportAuthStrategy extends js.Object {
    var authType: String = js.native
  }
  
}

