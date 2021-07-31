package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a number affix resource.
  */
trait SchemaGamesNumberAffixConfiguration extends StObject {
  
  /**
    * When the language requires special treatment of &quot;small&quot; numbers
    * (as with 2, 3, and 4 in Czech; or numbers ending 2, 3, or 4 but not 12,
    * 13, or 14 in Polish).
    */
  var few: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
  
  /**
    * When the language requires special treatment of &quot;large&quot; numbers
    * (as with numbers ending 11-99 in Maltese).
    */
  var many: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
  
  /**
    * When the language requires special treatment of numbers like one (as with
    * the number 1 in English and most other languages; in Russian, any number
    * ending in 1 but not ending in 11 is in this class).
    */
  var one: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
  
  /**
    * When the language does not require special treatment of the given
    * quantity (as with all numbers in Chinese, or 42 in English).
    */
  var other: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
  
  /**
    * When the language requires special treatment of numbers like two (as with
    * 2 in Welsh, or 102 in Slovenian).
    */
  var two: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
  
  /**
    * When the language requires special treatment of the number 0 (as in
    * Arabic).
    */
  var zero: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
}
object SchemaGamesNumberAffixConfiguration {
  
  @scala.inline
  def apply(): SchemaGamesNumberAffixConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesNumberAffixConfiguration]
  }
  
  @scala.inline
  implicit class SchemaGamesNumberAffixConfigurationMutableBuilder[Self <: SchemaGamesNumberAffixConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFew(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
    
    @scala.inline
    def setMany(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
    
    @scala.inline
    def setOne(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
    
    @scala.inline
    def setOther(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    @scala.inline
    def setTwo(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
    
    @scala.inline
    def setZero(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
