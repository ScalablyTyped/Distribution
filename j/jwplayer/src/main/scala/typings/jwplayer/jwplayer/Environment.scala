package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var Browser: typings.jwplayer.jwplayer.Browser
  var Features: typings.jwplayer.jwplayer.Features
  var OS: typings.jwplayer.jwplayer.OS
}

object Environment {
  @scala.inline
  def apply(Browser: Browser, Features: Features, OS: OS): Environment = {
    val __obj = js.Dynamic.literal(Browser = Browser, Features = Features, OS = OS)
  
    __obj.asInstanceOf[Environment]
  }
}

