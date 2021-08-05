package typings.iitc.hooksMod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventArtifactsUpdated extends StObject {
  
  var `new`: js.Any
  
  var old: js.Any
}
object EventArtifactsUpdated {
  
  inline def apply(`new`: js.Any, old: js.Any): EventArtifactsUpdated = {
    val __obj = js.Dynamic.literal(old = old.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArtifactsUpdated]
  }
  
  extension [Self <: EventArtifactsUpdated](x: Self) {
    
    inline def setNew(value: js.Any): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setOld(value: js.Any): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
  }
}
