package typings.inquirer.mod

import typings.inquirer.inquirerStrings.rawlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawListQuestion[T /* <: Answers */]
  extends StObject
     with LoopableListQuestionOptionsBase[T, ListChoiceMap[T]] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_RawListQuestion: rawlist
}
object RawListQuestion {
  
  inline def apply[T /* <: Answers */](): RawListQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rawlist")
    __obj.asInstanceOf[RawListQuestion[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawListQuestion[?], T /* <: Answers */] (val x: Self & RawListQuestion[T]) extends AnyVal {
    
    inline def setType(value: rawlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
