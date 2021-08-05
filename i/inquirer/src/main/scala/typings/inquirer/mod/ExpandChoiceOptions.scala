package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a choice of the `ExpandPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait ExpandChoiceOptions[T /* <: Answers */]
  extends StObject
     with ChoiceOptions[T] {
  
  /**
    * The key to press for selecting the choice.
    */
  var key: js.UndefOr[String] = js.undefined
}
object ExpandChoiceOptions {
  
  inline def apply[T /* <: Answers */](): ExpandChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandChoiceOptions[T]]
  }
  
  extension [Self <: ExpandChoiceOptions[?], T /* <: Answers */](x: Self & ExpandChoiceOptions[T]) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
