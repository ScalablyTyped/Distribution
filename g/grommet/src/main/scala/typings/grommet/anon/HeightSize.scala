package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightSize extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object HeightSize {
  
  inline def apply(): HeightSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightSize]
  }
  
  extension [Self <: HeightSize](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
