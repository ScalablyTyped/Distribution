package typings.maplibreGl.anon

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Around extends StObject {
  
  var around: ^
  
  var panDelta: ^
}
object Around {
  
  inline def apply(around: ^, panDelta: ^): Around = {
    val __obj = js.Dynamic.literal(around = around.asInstanceOf[js.Any], panDelta = panDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Around]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Around] (val x: Self) extends AnyVal {
    
    inline def setAround(value: ^): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
    
    inline def setPanDelta(value: ^): Self = StObject.set(x, "panDelta", value.asInstanceOf[js.Any])
  }
}
