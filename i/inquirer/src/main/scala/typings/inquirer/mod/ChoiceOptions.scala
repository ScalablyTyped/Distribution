package typings.inquirer.mod

import typings.inquirer.inquirerStrings.choice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a choice.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ChoiceOptions[T /* <: Answers */] extends ChoiceBase {
  
  /**
    * The extra properties of the choice.
    */
  var extra: js.UndefOr[js.Any] = js.native
  
  /**
    * The name of the choice to show to the user.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The short form of the name of the choice.
    */
  var short: js.UndefOr[String] = js.native
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ChoiceOptions: js.UndefOr[choice] = js.native
  
  /**
    * The value of the choice.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object ChoiceOptions {
  
  @scala.inline
  def apply[T /* <: Answers */](): ChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceOptions[T]]
  }
  
  @scala.inline
  implicit class ChoiceOptionsMutableBuilder[Self <: ChoiceOptions[_], T /* <: Answers */] (val x: Self with ChoiceOptions[T]) extends AnyVal {
    
    @scala.inline
    def setExtra(value: js.Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    @scala.inline
    def setType(value: choice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
