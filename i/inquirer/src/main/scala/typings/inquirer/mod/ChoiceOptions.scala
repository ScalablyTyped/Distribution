package typings.inquirer.mod

import typings.inquirer.inquirerStrings.choice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceOptions
  extends StObject
     with ChoiceBase {
  
  /**
    * The extra properties of the choice.
    */
  var extra: js.UndefOr[Any] = js.undefined
  
  /**
    * The name of the choice to show to the user.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The short form of the name of the choice.
    */
  var short: js.UndefOr[String] = js.undefined
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ChoiceOptions: js.UndefOr[choice] = js.undefined
  
  /**
    * The value of the choice.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object ChoiceOptions {
  
  inline def apply(): ChoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceOptions]
  }
  
  extension [Self <: ChoiceOptions](x: Self) {
    
    inline def setExtra(value: Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setType(value: choice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
