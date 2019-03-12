package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var Browser: jwplayerLib.jwplayerNs.Browser
  var Features: jwplayerLib.jwplayerNs.Features
  var OS: jwplayerLib.jwplayerNs.OS
}

object Environment {
  @scala.inline
  def apply(Browser: Browser, Features: Features, OS: OS): Environment = {
    val __obj = js.Dynamic.literal(Browser = Browser, Features = Features, OS = OS)
  
    __obj.asInstanceOf[Environment]
  }
}

