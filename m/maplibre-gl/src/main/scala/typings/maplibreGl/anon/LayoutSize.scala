package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.constant
import typings.maplibreGl.mod.SizeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutSize
  extends StObject
     with SizeData {
  
  var kind: constant
  
  var layoutSize: Double
}
object LayoutSize {
  
  inline def apply(layoutSize: Double): LayoutSize = {
    val __obj = js.Dynamic.literal(kind = "constant", layoutSize = layoutSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutSize]
  }
  
  extension [Self <: LayoutSize](x: Self) {
    
    inline def setKind(value: constant): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLayoutSize(value: Double): Self = StObject.set(x, "layoutSize", value.asInstanceOf[js.Any])
  }
}
