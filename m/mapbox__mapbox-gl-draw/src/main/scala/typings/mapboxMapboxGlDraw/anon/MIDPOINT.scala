package typings.mapboxMapboxGlDraw.anon

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.feature_
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.midpoint
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDPOINT extends StObject {
  
  var FEATURE: feature_
  
  var MIDPOINT: midpoint
  
  var VERTEX: vertex
}
object MIDPOINT {
  
  inline def apply(): MIDPOINT = {
    val __obj = js.Dynamic.literal(FEATURE = "feature", MIDPOINT = "midpoint", VERTEX = "vertex")
    __obj.asInstanceOf[MIDPOINT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MIDPOINT] (val x: Self) extends AnyVal {
    
    inline def setFEATURE(value: feature_): Self = StObject.set(x, "FEATURE", value.asInstanceOf[js.Any])
    
    inline def setMIDPOINT(value: midpoint): Self = StObject.set(x, "MIDPOINT", value.asInstanceOf[js.Any])
    
    inline def setVERTEX(value: vertex): Self = StObject.set(x, "VERTEX", value.asInstanceOf[js.Any])
  }
}
