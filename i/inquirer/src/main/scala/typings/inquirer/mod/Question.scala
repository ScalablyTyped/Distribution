package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question.
  *
  * @template T
  * The type of the answers.
  */
trait Question[T /* <: Answers */] extends StObject {
  
  /**
    * The default value of the question.
    */
  var default: js.UndefOr[AsyncDynamicQuestionProperty[js.Any, T]] = js.undefined
  
  /**
    * Post-processes the answer.
    *
    * @param input
    * The answer provided by the user.
    *
    * @param answers
    * The answers provided by the user.
    */
  var filter: js.UndefOr[js.Function2[/* input */ js.Any, /* answers */ T, js.Any]] = js.undefined
  
  /**
    * The message to show to the user.
    */
  var message: js.UndefOr[AsyncDynamicQuestionProperty[String, T]] = js.undefined
  
  /**
    * The key to save the answer to the answers-hash.
    */
  var name: js.UndefOr[KeyUnion[T]] = js.undefined
  
  /**
    * The prefix of the `message`.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The suffix of the `message`.
    */
  var suffix: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the question.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Validates the integrity of the answer.
    *
    * @param input
    * The answer provided by the user.
    *
    * @param answers
    * The answers provided by the user.
    *
    * @returns
    * Either a value indicating whether the answer is valid or a `string` which describes the error.
    */
  var validate: js.UndefOr[
    js.Function2[
      /* input */ js.Any, 
      /* answers */ js.UndefOr[T], 
      Boolean | String | (js.Promise[Boolean | String])
    ]
  ] = js.undefined
  
  /**
    * A value indicating whether the question should be prompted.
    */
  var when: js.UndefOr[AsyncDynamicQuestionProperty[Boolean, T]] = js.undefined
}
object Question {
  
  @scala.inline
  def apply[T /* <: Answers */](): Question[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Question[T]]
  }
  
  @scala.inline
  implicit class QuestionMutableBuilder[Self <: Question[?], T /* <: Answers */] (val x: Self & Question[T]) extends AnyVal {
    
    @scala.inline
    def setDefault(value: AsyncDynamicQuestionProperty[js.Any, T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFunction1(value: T => js.Any | js.Promise[js.Any]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* input */ js.Any, /* answers */ T) => js.Any): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMessage(value: AsyncDynamicQuestionProperty[String, T]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFunction1(value: T => String | js.Promise[String]): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: KeyUnion[T]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidate(
      value: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String])
    ): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setWhen(value: AsyncDynamicQuestionProperty[Boolean, T]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenFunction1(value: T => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "when", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
