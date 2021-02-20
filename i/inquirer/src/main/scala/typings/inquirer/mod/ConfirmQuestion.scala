package typings.inquirer.mod

import typings.inquirer.inquirerStrings.confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `ConfirmPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ConfirmQuestion[T /* <: Answers */] extends Question[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ConfirmQuestion: confirm = js.native
}
object ConfirmQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](`type`: confirm): ConfirmQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmQuestion[T]]
  }
  
  @scala.inline
  implicit class ConfirmQuestionMutableBuilder[Self <: ConfirmQuestion[_], T /* <: Answers */] (val x: Self with ConfirmQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: confirm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
