package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Question[T /* <: Answers */] extends StObject {
  
  /**
    * The default value of the question.
    */
  var default: js.UndefOr[AsyncDynamicQuestionProperty[Any, T]] = js.undefined
  
  /**
    * Force to prompt the question if the answer already exists.
    */
  var askAnswered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Post-processes the answer.
    *
    * @param input
    * The answer provided by the user.
    *
    * @param answers
    * The answers provided by the user.
    */
  var filter: js.UndefOr[js.Function2[/* input */ Any, /* answers */ T, Any]] = js.undefined
  
  /**
    * The message to show to the user.
    */
  var message: js.UndefOr[AsyncDynamicQuestionProperty[String, T]] = js.undefined
  
  /**
    * The key to save the answer to the answers-hash.
    */
  var name: js.UndefOr[KeyUnion[T]] = js.undefined
  
  /**
    * The prefix of the {@link message `message`}.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The suffix of the {@link message `message`}.
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
    * Either a value indicating whether the answer is valid or a {@link String `string`} which describes the error.
    */
  var validate: js.UndefOr[
    js.Function2[
      /* input */ Any, 
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
  
  inline def apply[T /* <: Answers */](): Question[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Question[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Question[?], T /* <: Answers */] (val x: Self & Question[T]) extends AnyVal {
    
    inline def setAskAnswered(value: Boolean): Self = StObject.set(x, "askAnswered", value.asInstanceOf[js.Any])
    
    inline def setAskAnsweredUndefined: Self = StObject.set(x, "askAnswered", js.undefined)
    
    inline def setDefault(value: AsyncDynamicQuestionProperty[Any, T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction1(value: T => Any | js.Promise[Any]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setFilter(value: (/* input */ Any, /* answers */ T) => Any): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMessage(value: AsyncDynamicQuestionProperty[String, T]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction1(value: T => String | js.Promise[String]): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: KeyUnion[T]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidate(
      value: (/* input */ Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String])
    ): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setWhen(value: AsyncDynamicQuestionProperty[Boolean, T]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenFunction1(value: T => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "when", js.Any.fromFunction1(value))
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
