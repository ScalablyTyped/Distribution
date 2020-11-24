package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a number affix resource.
  */
@js.native
trait SchemaGamesNumberAffixConfiguration extends js.Object {
  
  /**
    * When the language requires special treatment of &quot;small&quot; numbers
    * (as with 2, 3, and 4 in Czech; or numbers ending 2, 3, or 4 but not 12,
    * 13, or 14 in Polish).
    */
  var few: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  
  /**
    * When the language requires special treatment of &quot;large&quot; numbers
    * (as with numbers ending 11-99 in Maltese).
    */
  var many: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  
  /**
    * When the language requires special treatment of numbers like one (as with
    * the number 1 in English and most other languages; in Russian, any number
    * ending in 1 but not ending in 11 is in this class).
    */
  var one: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  
  /**
    * When the language does not require special treatment of the given
    * quantity (as with all numbers in Chinese, or 42 in English).
    */
  var other: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  
  /**
    * When the language requires special treatment of numbers like two (as with
    * 2 in Welsh, or 102 in Slovenian).
    */
  var two: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  
  /**
    * When the language requires special treatment of the number 0 (as in
    * Arabic).
    */
  var zero: js.UndefOr[SchemaLocalizedStringBundle] = js.native
}
object SchemaGamesNumberAffixConfiguration {
  
  @scala.inline
  def apply(): SchemaGamesNumberAffixConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesNumberAffixConfiguration]
  }
  
  @scala.inline
  implicit class SchemaGamesNumberAffixConfigurationOps[Self <: SchemaGamesNumberAffixConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFew(value: SchemaLocalizedStringBundle): Self = this.set("few", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFew: Self = this.set("few", js.undefined)
    
    @scala.inline
    def setMany(value: SchemaLocalizedStringBundle): Self = this.set("many", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMany: Self = this.set("many", js.undefined)
    
    @scala.inline
    def setOne(value: SchemaLocalizedStringBundle): Self = this.set("one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
    
    @scala.inline
    def setOther(value: SchemaLocalizedStringBundle): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    
    @scala.inline
    def setTwo(value: SchemaLocalizedStringBundle): Self = this.set("two", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwo: Self = this.set("two", js.undefined)
    
    @scala.inline
    def setZero(value: SchemaLocalizedStringBundle): Self = this.set("zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
}
