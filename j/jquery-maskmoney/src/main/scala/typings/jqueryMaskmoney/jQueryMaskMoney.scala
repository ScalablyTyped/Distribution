package typings.jqueryMaskmoney

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jQueryMaskMoney {
  
  trait Options extends StObject {
    
    /**
      * Set if the prefix and suffix will stay in the field's value after the user exits the field
      */
    var affixesStay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting to prevent negative values
      */
    var allowNegative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting to prevent users from inputing zero
      */
    var allowZero: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The decimal separator
      */
    var decimal: js.UndefOr[String] = js.undefined
    
    /**
      * How many decimal places are allowed
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * The prefix to be displayed before the value entered
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * The prefix to be displayed after the value entered
      */
    var suffix: js.UndefOr[String] = js.undefined
    
    /**
      * The thousands separator
      */
    var thousands: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAffixesStay(value: Boolean): Self = StObject.set(x, "affixesStay", value.asInstanceOf[js.Any])
      
      inline def setAffixesStayUndefined: Self = StObject.set(x, "affixesStay", js.undefined)
      
      inline def setAllowNegative(value: Boolean): Self = StObject.set(x, "allowNegative", value.asInstanceOf[js.Any])
      
      inline def setAllowNegativeUndefined: Self = StObject.set(x, "allowNegative", js.undefined)
      
      inline def setAllowZero(value: Boolean): Self = StObject.set(x, "allowZero", value.asInstanceOf[js.Any])
      
      inline def setAllowZeroUndefined: Self = StObject.set(x, "allowZero", js.undefined)
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
      
      inline def setThousandsUndefined: Self = StObject.set(x, "thousands", js.undefined)
    }
  }
}
