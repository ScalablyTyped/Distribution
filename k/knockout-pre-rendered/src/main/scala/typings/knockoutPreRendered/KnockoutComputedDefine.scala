package typings.knockoutPreRendered

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutComputedDefine[T] extends StObject {
  
  var deferEvaluation: js.UndefOr[Boolean] = js.undefined
  
  var disposeWhen: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var disposeWhenNodeIsRemoved: js.UndefOr[Node] = js.undefined
  
  var owner: js.UndefOr[js.Any] = js.undefined
  
  var pure: js.UndefOr[Boolean] = js.undefined
  
  def read(): T
  
  var write: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}
object KnockoutComputedDefine {
  
  @scala.inline
  def apply[T](read: () => T): KnockoutComputedDefine[T] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[KnockoutComputedDefine[T]]
  }
  
  @scala.inline
  implicit class KnockoutComputedDefineMutableBuilder[Self <: KnockoutComputedDefine[?], T] (val x: Self & KnockoutComputedDefine[T]) extends AnyVal {
    
    @scala.inline
    def setDeferEvaluation(value: Boolean): Self = StObject.set(x, "deferEvaluation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferEvaluationUndefined: Self = StObject.set(x, "deferEvaluation", js.undefined)
    
    @scala.inline
    def setDisposeWhen(value: () => Boolean): Self = StObject.set(x, "disposeWhen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposeWhenNodeIsRemoved(value: Node): Self = StObject.set(x, "disposeWhenNodeIsRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposeWhenNodeIsRemovedUndefined: Self = StObject.set(x, "disposeWhenNodeIsRemoved", js.undefined)
    
    @scala.inline
    def setDisposeWhenUndefined: Self = StObject.set(x, "disposeWhen", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    @scala.inline
    def setRead(value: () => T): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrite(value: /* value */ T => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
