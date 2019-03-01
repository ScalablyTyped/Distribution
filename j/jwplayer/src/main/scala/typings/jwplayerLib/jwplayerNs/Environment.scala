package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var Browser: Browser
  var Features: Features
  var OS: OS
}

object Environment {
  @scala.inline
  def apply(Browser: Browser, Features: Features, OS: OS): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Browser")(Browser)
    __obj.updateDynamic("Features")(Features)
    __obj.updateDynamic("OS")(OS)
    __obj.asInstanceOf[Environment]
  }
}

