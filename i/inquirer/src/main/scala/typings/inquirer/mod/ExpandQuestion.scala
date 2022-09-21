package typings.inquirer.mod

import typings.inquirer.inquirerStrings.expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandQuestion[T /* <: Answers */]
  extends StObject
     with ListQuestionOptionsBase[T, ExpandChoiceMap[T]] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ExpandQuestion: expand
}
object ExpandQuestion {
  
  inline def apply[T /* <: Answers */](): ExpandQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("expand")
    __obj.asInstanceOf[ExpandQuestion[T]]
  }
  
  extension [Self <: ExpandQuestion[?], T /* <: Answers */](x: Self & ExpandQuestion[T]) {
    
    inline def setType(value: expand): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
