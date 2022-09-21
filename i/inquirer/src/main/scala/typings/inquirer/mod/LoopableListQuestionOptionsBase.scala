package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list-based question that can loop.
  *
  * @template T
  * The type of the answers.
  *
  * @template TChoiceMap
  * The valid choices for the question.
  */
trait LoopableListQuestionOptionsBase[T /* <: Answers */, TChoiceMap]
  extends StObject
     with ListQuestionOptionsBase[T, TChoiceMap] {
  
  /**
    * A value indicating whether choices in a list should be looped.
    */
  var loop: js.UndefOr[Boolean] = js.undefined
}
object LoopableListQuestionOptionsBase {
  
  inline def apply[T /* <: Answers */, TChoiceMap](): LoopableListQuestionOptionsBase[T, TChoiceMap] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoopableListQuestionOptionsBase[T, TChoiceMap]]
  }
  
  extension [Self <: LoopableListQuestionOptionsBase[?, ?], T /* <: Answers */, TChoiceMap](x: Self & (LoopableListQuestionOptionsBase[T, TChoiceMap])) {
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
  }
}
