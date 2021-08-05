package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the day part targeting criteria.
  */
trait SchemaDayPartTargeting extends StObject {
  
  /**
    * A list of day part targeting criterion.
    */
  var dayParts: js.UndefOr[js.Array[SchemaDayPart]] = js.undefined
  
  /**
    * The timezone to use for interpreting the day part targeting.
    */
  var timeZoneType: js.UndefOr[String] = js.undefined
}
object SchemaDayPartTargeting {
  
  inline def apply(): SchemaDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDayPartTargeting]
  }
  
  extension [Self <: SchemaDayPartTargeting](x: Self) {
    
    inline def setDayParts(value: js.Array[SchemaDayPart]): Self = StObject.set(x, "dayParts", value.asInstanceOf[js.Any])
    
    inline def setDayPartsUndefined: Self = StObject.set(x, "dayParts", js.undefined)
    
    inline def setDayPartsVarargs(value: SchemaDayPart*): Self = StObject.set(x, "dayParts", js.Array(value :_*))
    
    inline def setTimeZoneType(value: String): Self = StObject.set(x, "timeZoneType", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneTypeUndefined: Self = StObject.set(x, "timeZoneType", js.undefined)
  }
}
