package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHotKeyDetection extends StObject {
  
  /**
    * The age of the hot key measured from when it was first detected.
    */
  var hotKeyAge: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System-defined name of the step containing this hot key. Unique across the workflow.
    */
  var systemName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-provided name of the step that contains this hot key.
    */
  var userStepName: js.UndefOr[String | Null] = js.undefined
}
object SchemaHotKeyDetection {
  
  inline def apply(): SchemaHotKeyDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHotKeyDetection]
  }
  
  extension [Self <: SchemaHotKeyDetection](x: Self) {
    
    inline def setHotKeyAge(value: String): Self = StObject.set(x, "hotKeyAge", value.asInstanceOf[js.Any])
    
    inline def setHotKeyAgeNull: Self = StObject.set(x, "hotKeyAge", null)
    
    inline def setHotKeyAgeUndefined: Self = StObject.set(x, "hotKeyAge", js.undefined)
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameNull: Self = StObject.set(x, "systemName", null)
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    inline def setUserStepName(value: String): Self = StObject.set(x, "userStepName", value.asInstanceOf[js.Any])
    
    inline def setUserStepNameNull: Self = StObject.set(x, "userStepName", null)
    
    inline def setUserStepNameUndefined: Self = StObject.set(x, "userStepName", js.undefined)
  }
}
