package typings.mapboxMapboxGlDraw.anon

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotactionable
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotcombine
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotcreate
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotdelete
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotmodechange
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotrender
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotselectionchange
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotuncombine
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotupdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ACTIONABLE extends StObject {
  
  var ACTIONABLE: drawDotactionable
  
  var COMBINE_FEATURES: drawDotcombine
  
  var CREATE: drawDotcreate
  
  var DELETE: drawDotdelete
  
  var MODE_CHANGE: drawDotmodechange
  
  var RENDER: drawDotrender
  
  var SELECTION_CHANGE: drawDotselectionchange
  
  var UNCOMBINE_FEATURES: drawDotuncombine
  
  var UPDATE: drawDotupdate
}
object ACTIONABLE {
  
  inline def apply(): ACTIONABLE = {
    val __obj = js.Dynamic.literal(ACTIONABLE = "draw.actionable", COMBINE_FEATURES = "draw.combine", CREATE = "draw.create", DELETE = "draw.delete", MODE_CHANGE = "draw.modechange", RENDER = "draw.render", SELECTION_CHANGE = "draw.selectionchange", UNCOMBINE_FEATURES = "draw.uncombine", UPDATE = "draw.update")
    __obj.asInstanceOf[ACTIONABLE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ACTIONABLE] (val x: Self) extends AnyVal {
    
    inline def setACTIONABLE(value: drawDotactionable): Self = StObject.set(x, "ACTIONABLE", value.asInstanceOf[js.Any])
    
    inline def setCOMBINE_FEATURES(value: drawDotcombine): Self = StObject.set(x, "COMBINE_FEATURES", value.asInstanceOf[js.Any])
    
    inline def setCREATE(value: drawDotcreate): Self = StObject.set(x, "CREATE", value.asInstanceOf[js.Any])
    
    inline def setDELETE(value: drawDotdelete): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setMODE_CHANGE(value: drawDotmodechange): Self = StObject.set(x, "MODE_CHANGE", value.asInstanceOf[js.Any])
    
    inline def setRENDER(value: drawDotrender): Self = StObject.set(x, "RENDER", value.asInstanceOf[js.Any])
    
    inline def setSELECTION_CHANGE(value: drawDotselectionchange): Self = StObject.set(x, "SELECTION_CHANGE", value.asInstanceOf[js.Any])
    
    inline def setUNCOMBINE_FEATURES(value: drawDotuncombine): Self = StObject.set(x, "UNCOMBINE_FEATURES", value.asInstanceOf[js.Any])
    
    inline def setUPDATE(value: drawDotupdate): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
  }
}
