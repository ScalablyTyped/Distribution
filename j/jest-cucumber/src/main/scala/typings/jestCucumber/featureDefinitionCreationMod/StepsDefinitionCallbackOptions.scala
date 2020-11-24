package typings.jestCucumber.featureDefinitionCreationMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepsDefinitionCallbackOptions extends js.Object {
  
  var and: DefineStepFunction = js.native
  
  var but: DefineStepFunction = js.native
  
  var defineStep: DefineStepFunction = js.native
  
  var given: DefineStepFunction = js.native
  
  def pending(): Unit = js.native
  
  var `then`: DefineStepFunction = js.native
  
  var when: DefineStepFunction = js.native
}
object StepsDefinitionCallbackOptions {
  
  @scala.inline
  def apply(
    and: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
    but: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
    defineStep: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
    given: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
    pending: () => Unit,
    `then`: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
    when: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
  ): StepsDefinitionCallbackOptions = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction2(and), but = js.Any.fromFunction2(but), defineStep = js.Any.fromFunction2(defineStep), given = js.Any.fromFunction2(given), pending = js.Any.fromFunction0(pending), when = js.Any.fromFunction2(when))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[StepsDefinitionCallbackOptions]
  }
  
  @scala.inline
  implicit class StepsDefinitionCallbackOptionsOps[Self <: StepsDefinitionCallbackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnd(
      value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
    ): Self = this.set("and", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBut(
      value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
    ): Self = this.set("but", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefineStep(
      value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
    ): Self = this.set("defineStep", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGiven(
      value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
    ): Self = this.set("given", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPending(value: () => Unit): Self = this.set("pending", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(
      value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
    ): Self = this.set("then", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWhen(
      value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
    ): Self = this.set("when", js.Any.fromFunction2(value))
  }
}
