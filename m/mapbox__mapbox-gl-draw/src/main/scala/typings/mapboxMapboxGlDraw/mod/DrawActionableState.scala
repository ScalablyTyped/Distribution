package typings.mapboxMapboxGlDraw.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawActionableState extends StObject {
  
  var combineFeatures: Boolean
  
  var trash: Boolean
  
  var uncombineFeatures: Boolean
}
object DrawActionableState {
  
  inline def apply(combineFeatures: Boolean, trash: Boolean, uncombineFeatures: Boolean): DrawActionableState = {
    val __obj = js.Dynamic.literal(combineFeatures = combineFeatures.asInstanceOf[js.Any], trash = trash.asInstanceOf[js.Any], uncombineFeatures = uncombineFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawActionableState]
  }
  
  extension [Self <: DrawActionableState](x: Self) {
    
    inline def setCombineFeatures(value: Boolean): Self = StObject.set(x, "combineFeatures", value.asInstanceOf[js.Any])
    
    inline def setTrash(value: Boolean): Self = StObject.set(x, "trash", value.asInstanceOf[js.Any])
    
    inline def setUncombineFeatures(value: Boolean): Self = StObject.set(x, "uncombineFeatures", value.asInstanceOf[js.Any])
  }
}
