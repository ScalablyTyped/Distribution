package typings.inquirer.mod

import typings.inquirer.inquirerStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQuestion[T /* <: Answers */]
  extends StObject
     with LoopableListQuestionOptionsBase[T, ListChoiceMap[T]] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ListQuestion: list
}
object ListQuestion {
  
  inline def apply[T /* <: Answers */](): ListQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[ListQuestion[T]]
  }
  
  extension [Self <: ListQuestion[?], T /* <: Answers */](x: Self & ListQuestion[T]) {
    
    inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
