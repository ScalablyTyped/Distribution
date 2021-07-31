package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedOptions[T, TTarget] extends StObject {
  
  var deferEvaluation: js.UndefOr[Boolean] = js.undefined
  
  var disposeWhen: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var disposeWhenNodeIsRemoved: js.UndefOr[Node] = js.undefined
  
  var owner: js.UndefOr[TTarget] = js.undefined
  
  var pure: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[ComputedReadFunction[T, TTarget]] = js.undefined
  
  var write: js.UndefOr[ComputedWriteFunction[T, TTarget]] = js.undefined
}
object ComputedOptions {
  
  @scala.inline
  def apply[T, TTarget](): ComputedOptions[T, TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedOptions[T, TTarget]]
  }
  
  @scala.inline
  implicit class ComputedOptionsMutableBuilder[Self <: ComputedOptions[?, ?], T, TTarget] (val x: Self & (ComputedOptions[T, TTarget])) extends AnyVal {
    
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
    def setOwner(value: TTarget): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    @scala.inline
    def setRead(value: ComputedReadFunction[T, TTarget]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setWrite(value: ComputedWriteFunction[T, TTarget]): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
