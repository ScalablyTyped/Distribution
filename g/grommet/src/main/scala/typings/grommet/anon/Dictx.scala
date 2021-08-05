package typings.grommet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx
  extends StObject
     with /* x */ StringDictionary[js.UndefOr[BorderSize]] {
  
  var large: js.UndefOr[BorderSize] = js.undefined
  
  var medium: js.UndefOr[BorderSize] = js.undefined
  
  var small: js.UndefOr[BorderSize] = js.undefined
}
object Dictx {
  
  inline def apply(): Dictx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictx]
  }
  
  extension [Self <: Dictx](x: Self) {
    
    inline def setLarge(value: BorderSize): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: BorderSize): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: BorderSize): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
