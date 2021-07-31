package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatcherHintOptions extends StObject {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var expectedColor: js.UndefOr[MatcherHintColor] = js.undefined
  
  var isDirectExpectCall: js.UndefOr[Boolean] = js.undefined
  
  var isNot: js.UndefOr[Boolean] = js.undefined
  
  var promise: js.UndefOr[String] = js.undefined
  
  var receivedColor: js.UndefOr[MatcherHintColor] = js.undefined
  
  var secondArgument: js.UndefOr[String] = js.undefined
  
  var secondArgumentColor: js.UndefOr[MatcherHintColor] = js.undefined
}
object MatcherHintOptions {
  
  @scala.inline
  def apply(): MatcherHintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherHintOptions]
  }
  
  @scala.inline
  implicit class MatcherHintOptionsMutableBuilder[Self <: MatcherHintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setExpectedColor(value: /* arg */ String => String): Self = StObject.set(x, "expectedColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpectedColorUndefined: Self = StObject.set(x, "expectedColor", js.undefined)
    
    @scala.inline
    def setIsDirectExpectCall(value: Boolean): Self = StObject.set(x, "isDirectExpectCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectExpectCallUndefined: Self = StObject.set(x, "isDirectExpectCall", js.undefined)
    
    @scala.inline
    def setIsNot(value: Boolean): Self = StObject.set(x, "isNot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNotUndefined: Self = StObject.set(x, "isNot", js.undefined)
    
    @scala.inline
    def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    @scala.inline
    def setReceivedColor(value: /* arg */ String => String): Self = StObject.set(x, "receivedColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReceivedColorUndefined: Self = StObject.set(x, "receivedColor", js.undefined)
    
    @scala.inline
    def setSecondArgument(value: String): Self = StObject.set(x, "secondArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondArgumentColor(value: /* arg */ String => String): Self = StObject.set(x, "secondArgumentColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSecondArgumentColorUndefined: Self = StObject.set(x, "secondArgumentColor", js.undefined)
    
    @scala.inline
    def setSecondArgumentUndefined: Self = StObject.set(x, "secondArgument", js.undefined)
  }
}
