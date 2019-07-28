package typings.jwplayer.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var Browser: typings.jwplayer.jwplayerNs.Browser
  var Features: typings.jwplayer.jwplayerNs.Features
  var OS: typings.jwplayer.jwplayerNs.OS
}

object Environment {
  @scala.inline
  def apply(Browser: Browser, Features: Features, OS: OS): Environment = {
    val __obj = js.Dynamic.literal(Browser = Browser, Features = Features, OS = OS)
  
    __obj.asInstanceOf[Environment]
  }
}

