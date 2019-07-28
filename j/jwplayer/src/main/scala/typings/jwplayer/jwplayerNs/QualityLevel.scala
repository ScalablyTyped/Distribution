package typings.jwplayer.jwplayerNs

import typings.jwplayer.jwplayerStrings.`initial choice`
import typings.jwplayer.jwplayerStrings.api
import typings.jwplayer.jwplayerStrings.auto
import typings.jwplayer.jwplayerStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualityLevel extends js.Object {
  var level: Level
  var mode: auto | manual
  var reason: auto | api | (`initial choice`)
}

object QualityLevel {
  @scala.inline
  def apply(level: Level, mode: auto | manual, reason: auto | api | (`initial choice`)): QualityLevel = {
    val __obj = js.Dynamic.literal(level = level, mode = mode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QualityLevel]
  }
}

