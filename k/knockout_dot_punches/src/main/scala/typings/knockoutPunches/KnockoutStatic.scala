package typings.knockoutPunches

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutStatic extends StObject {
  
  var filters: KnockoutPunchesFilters
  
  var punches: KnockoutPunchesStatic
}
object KnockoutStatic {
  
  inline def apply(filters: KnockoutPunchesFilters, punches: KnockoutPunchesStatic): KnockoutStatic = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], punches = punches.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  extension [Self <: KnockoutStatic](x: Self) {
    
    inline def setFilters(value: KnockoutPunchesFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setPunches(value: KnockoutPunchesStatic): Self = StObject.set(x, "punches", value.asInstanceOf[js.Any])
  }
}
