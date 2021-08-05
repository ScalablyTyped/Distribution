package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleLayout
  extends StObject
     with Layout
     with _AnyLayout {
  
  var `circle-sort-key`: js.UndefOr[Double | Expression] = js.undefined
}
object CircleLayout {
  
  inline def apply(): CircleLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleLayout]
  }
  
  extension [Self <: CircleLayout](x: Self) {
    
    inline def `setCircle-sort-key`(value: Double | Expression): Self = StObject.set(x, "circle-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setCircle-sort-keyUndefined`: Self = StObject.set(x, "circle-sort-key", js.undefined)
  }
}
