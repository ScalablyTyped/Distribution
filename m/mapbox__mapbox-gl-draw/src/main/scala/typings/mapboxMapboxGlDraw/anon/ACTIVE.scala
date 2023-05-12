package typings.mapboxMapboxGlDraw.anon

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.`false`
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ACTIVE extends StObject {
  
  var ACTIVE: `true`
  
  var INACTIVE: `false`
}
object ACTIVE {
  
  inline def apply(): ACTIVE = {
    val __obj = js.Dynamic.literal(ACTIVE = "true", INACTIVE = "false")
    __obj.asInstanceOf[ACTIVE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ACTIVE] (val x: Self) extends AnyVal {
    
    inline def setACTIVE(value: `true`): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
    
    inline def setINACTIVE(value: `false`): Self = StObject.set(x, "INACTIVE", value.asInstanceOf[js.Any])
  }
}
