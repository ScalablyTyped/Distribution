package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGamesNumberFormatConfiguration extends StObject {
  
  /**
    * The curreny code string. Only used for CURRENCY format type.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of decimal places for number. Only used for NUMERIC format type.
    */
  var numDecimalPlaces: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The formatting for the number.
    */
  var numberFormatType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional suffix for the NUMERIC format type. These strings follow the same plural rules as all Android string resources.
    */
  var suffix: js.UndefOr[SchemaGamesNumberAffixConfiguration] = js.undefined
}
object SchemaGamesNumberFormatConfiguration {
  
  inline def apply(): SchemaGamesNumberFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesNumberFormatConfiguration]
  }
  
  extension [Self <: SchemaGamesNumberFormatConfiguration](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setNumDecimalPlaces(value: Double): Self = StObject.set(x, "numDecimalPlaces", value.asInstanceOf[js.Any])
    
    inline def setNumDecimalPlacesNull: Self = StObject.set(x, "numDecimalPlaces", null)
    
    inline def setNumDecimalPlacesUndefined: Self = StObject.set(x, "numDecimalPlaces", js.undefined)
    
    inline def setNumberFormatType(value: String): Self = StObject.set(x, "numberFormatType", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatTypeNull: Self = StObject.set(x, "numberFormatType", null)
    
    inline def setNumberFormatTypeUndefined: Self = StObject.set(x, "numberFormatType", js.undefined)
    
    inline def setSuffix(value: SchemaGamesNumberAffixConfiguration): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
