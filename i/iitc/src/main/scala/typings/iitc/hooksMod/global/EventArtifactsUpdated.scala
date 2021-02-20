package typings.iitc.hooksMod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventArtifactsUpdated extends StObject {
  
  var `new`: js.Any = js.native
  
  var old: js.Any = js.native
}
object EventArtifactsUpdated {
  
  @scala.inline
  def apply(`new`: js.Any, old: js.Any): EventArtifactsUpdated = {
    val __obj = js.Dynamic.literal(old = old.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArtifactsUpdated]
  }
  
  @scala.inline
  implicit class EventArtifactsUpdatedMutableBuilder[Self <: EventArtifactsUpdated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNew(value: js.Any): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld(value: js.Any): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
  }
}
