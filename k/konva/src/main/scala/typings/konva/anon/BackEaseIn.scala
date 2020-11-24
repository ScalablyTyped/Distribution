package typings.konva.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackEaseIn extends js.Object {
  
  def BackEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def BackEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def BackEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def BounceEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def BounceEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def BounceEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def EaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def EaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def EaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def ElasticEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = js.native
  
  def ElasticEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = js.native
  
  def ElasticEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = js.native
  
  def Linear(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def StrongEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def StrongEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  
  def StrongEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
}
object BackEaseIn {
  
  @scala.inline
  def apply(
    BackEaseIn: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    BackEaseInOut: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    BackEaseOut: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    BounceEaseIn: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    BounceEaseInOut: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    BounceEaseOut: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    EaseIn: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    EaseInOut: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    EaseOut: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    ElasticEaseIn: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    ElasticEaseInOut: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    ElasticEaseOut: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    Linear: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    StrongEaseIn: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    StrongEaseInOut: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    StrongEaseOut: (js.Any, js.Any, js.Any, js.Any) => js.Any
  ): BackEaseIn = {
    val __obj = js.Dynamic.literal(BackEaseIn = js.Any.fromFunction4(BackEaseIn), BackEaseInOut = js.Any.fromFunction4(BackEaseInOut), BackEaseOut = js.Any.fromFunction4(BackEaseOut), BounceEaseIn = js.Any.fromFunction4(BounceEaseIn), BounceEaseInOut = js.Any.fromFunction4(BounceEaseInOut), BounceEaseOut = js.Any.fromFunction4(BounceEaseOut), EaseIn = js.Any.fromFunction4(EaseIn), EaseInOut = js.Any.fromFunction4(EaseInOut), EaseOut = js.Any.fromFunction4(EaseOut), ElasticEaseIn = js.Any.fromFunction6(ElasticEaseIn), ElasticEaseInOut = js.Any.fromFunction6(ElasticEaseInOut), ElasticEaseOut = js.Any.fromFunction6(ElasticEaseOut), Linear = js.Any.fromFunction4(Linear), StrongEaseIn = js.Any.fromFunction4(StrongEaseIn), StrongEaseInOut = js.Any.fromFunction4(StrongEaseInOut), StrongEaseOut = js.Any.fromFunction4(StrongEaseOut))
    __obj.asInstanceOf[BackEaseIn]
  }
  
  @scala.inline
  implicit class BackEaseInOps[Self <: BackEaseIn] (val x: Self) extends AnyVal {
    
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
    def setBackEaseIn(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("BackEaseIn", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBackEaseInOut(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("BackEaseInOut", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBackEaseOut(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("BackEaseOut", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBounceEaseIn(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("BounceEaseIn", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBounceEaseInOut(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("BounceEaseInOut", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBounceEaseOut(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("BounceEaseOut", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEaseIn(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("EaseIn", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEaseInOut(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("EaseInOut", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEaseOut(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("EaseOut", js.Any.fromFunction4(value))
    
    @scala.inline
    def setElasticEaseIn(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("ElasticEaseIn", js.Any.fromFunction6(value))
    
    @scala.inline
    def setElasticEaseInOut(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("ElasticEaseInOut", js.Any.fromFunction6(value))
    
    @scala.inline
    def setElasticEaseOut(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("ElasticEaseOut", js.Any.fromFunction6(value))
    
    @scala.inline
    def setLinear(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("Linear", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStrongEaseIn(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("StrongEaseIn", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStrongEaseInOut(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("StrongEaseInOut", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStrongEaseOut(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("StrongEaseOut", js.Any.fromFunction4(value))
  }
}
