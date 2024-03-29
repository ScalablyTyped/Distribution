package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxChoiceOptions[T /* <: Answers */]
  extends StObject
     with ListChoiceOptions[T] {
  
  /**
    * A value indicating whether the choice should be initially checked.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
}
object CheckboxChoiceOptions {
  
  inline def apply[T /* <: Answers */](): CheckboxChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxChoiceOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxChoiceOptions[?], T /* <: Answers */] (val x: Self & CheckboxChoiceOptions[T]) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
  }
}
