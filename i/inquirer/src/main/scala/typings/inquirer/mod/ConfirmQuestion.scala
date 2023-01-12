package typings.inquirer.mod

import typings.inquirer.inquirerStrings.confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmQuestion[T /* <: Answers */]
  extends StObject
     with Question[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ConfirmQuestion: confirm
}
object ConfirmQuestion {
  
  inline def apply[T /* <: Answers */](): ConfirmQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("confirm")
    __obj.asInstanceOf[ConfirmQuestion[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfirmQuestion[?], T /* <: Answers */] (val x: Self & ConfirmQuestion[T]) extends AnyVal {
    
    inline def setType(value: confirm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
