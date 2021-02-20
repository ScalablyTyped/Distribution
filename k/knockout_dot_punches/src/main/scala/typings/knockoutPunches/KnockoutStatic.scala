package typings.knockoutPunches

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutStatic extends StObject {
  
  var filters: KnockoutPunchesFilters = js.native
  
  var punches: KnockoutPunchesStatic = js.native
}
object KnockoutStatic {
  
  @scala.inline
  def apply(filters: KnockoutPunchesFilters, punches: KnockoutPunchesStatic): KnockoutStatic = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], punches = punches.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: KnockoutPunchesFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPunches(value: KnockoutPunchesStatic): Self = StObject.set(x, "punches", value.asInstanceOf[js.Any])
  }
}
