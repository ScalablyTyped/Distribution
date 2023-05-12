package typings.gorillaEngine.GorillaEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instrument parameter session persistence
  */
trait InstrumentPropertyPersistence extends StObject {
  
  /**
    * Indicates that the parameter is not exposed to the host DAW, should not saved in a preset and should not be saved in the session.
    */
  var `private`: Boolean
  
  /**
    * Indicates that the parameter should be saved into a preset.
    */
  var saveInPreset: Boolean
  
  /**
    * Indicates that the parameter should be saved in the session.
    */
  var saveInSession: Boolean
  
  /**
    * Indicates the the parameter is exposed to the host DAW.
    */
  var showInHost: Boolean
}
object InstrumentPropertyPersistence {
  
  inline def apply(`private`: Boolean, saveInPreset: Boolean, saveInSession: Boolean, showInHost: Boolean): InstrumentPropertyPersistence = {
    val __obj = js.Dynamic.literal(saveInPreset = saveInPreset.asInstanceOf[js.Any], saveInSession = saveInSession.asInstanceOf[js.Any], showInHost = showInHost.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentPropertyPersistence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstrumentPropertyPersistence] (val x: Self) extends AnyVal {
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setSaveInPreset(value: Boolean): Self = StObject.set(x, "saveInPreset", value.asInstanceOf[js.Any])
    
    inline def setSaveInSession(value: Boolean): Self = StObject.set(x, "saveInSession", value.asInstanceOf[js.Any])
    
    inline def setShowInHost(value: Boolean): Self = StObject.set(x, "showInHost", value.asInstanceOf[js.Any])
  }
}
