package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.`initial choice`
import typings.jwplayer.jwplayerStrings.api
import typings.jwplayer.jwplayerStrings.auto
import typings.jwplayer.jwplayerStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualityLevel extends js.Object {
  
  var level: Level = js.native
  
  var mode: auto | manual = js.native
  
  var reason: auto | api | (`initial choice`) = js.native
}
object QualityLevel {
  
  @scala.inline
  def apply(level: Level, mode: auto | manual, reason: auto | api | (`initial choice`)): QualityLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualityLevel]
  }
  
  @scala.inline
  implicit class QualityLevelOps[Self <: QualityLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLevel(value: Level): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: auto | manual): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: auto | api | (`initial choice`)): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
