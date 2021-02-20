package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.`initial choice`
import typings.jwplayer.jwplayerStrings.api
import typings.jwplayer.jwplayerStrings.auto
import typings.jwplayer.jwplayerStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualityLevel extends StObject {
  
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
  implicit class QualityLevelMutableBuilder[Self <: QualityLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: auto | manual): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: auto | api | (`initial choice`)): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
