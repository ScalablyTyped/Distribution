package typings.jqueryMaskmoney

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jQueryMaskMoney {
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Set if the prefix and suffix will stay in the field's value after the user exits the field
      */
    var affixesStay: js.UndefOr[Boolean] = js.native
    
    /**
      * Setting to prevent negative values
      */
    var allowNegative: js.UndefOr[Boolean] = js.native
    
    /**
      * Setting to prevent users from inputing zero
      */
    var allowZero: js.UndefOr[Boolean] = js.native
    
    /**
      * The decimal separator
      */
    var decimal: js.UndefOr[String] = js.native
    
    /**
      * How many decimal places are allowed
      */
    var precision: js.UndefOr[Double] = js.native
    
    /**
      * The prefix to be displayed before the value entered
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * The prefix to be displayed after the value entered
      */
    var suffix: js.UndefOr[String] = js.native
    
    /**
      * The thousands separator
      */
    var thousands: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixesStay(value: Boolean): Self = StObject.set(x, "affixesStay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixesStayUndefined: Self = StObject.set(x, "affixesStay", js.undefined)
      
      @scala.inline
      def setAllowNegative(value: Boolean): Self = StObject.set(x, "allowNegative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNegativeUndefined: Self = StObject.set(x, "allowNegative", js.undefined)
      
      @scala.inline
      def setAllowZero(value: Boolean): Self = StObject.set(x, "allowZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowZeroUndefined: Self = StObject.set(x, "allowZero", js.undefined)
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandsUndefined: Self = StObject.set(x, "thousands", js.undefined)
    }
  }
}
