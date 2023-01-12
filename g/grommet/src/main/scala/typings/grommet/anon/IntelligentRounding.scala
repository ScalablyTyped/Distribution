package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntelligentRounding extends StObject {
  
  var intelligentRounding: js.UndefOr[Boolean] = js.undefined
  
  var radius: js.UndefOr[String] = js.undefined
}
object IntelligentRounding {
  
  inline def apply(): IntelligentRounding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntelligentRounding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntelligentRounding] (val x: Self) extends AnyVal {
    
    inline def setIntelligentRounding(value: Boolean): Self = StObject.set(x, "intelligentRounding", value.asInstanceOf[js.Any])
    
    inline def setIntelligentRoundingUndefined: Self = StObject.set(x, "intelligentRounding", js.undefined)
    
    inline def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
