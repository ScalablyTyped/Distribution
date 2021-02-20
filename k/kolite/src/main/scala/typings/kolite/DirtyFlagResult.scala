package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirtyFlagResult extends StObject {
  
  def forceDirty(): Unit = js.native
  
  var isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any = js.native
  
  def reset(): Unit = js.native
}
object DirtyFlagResult {
  
  @scala.inline
  def apply(
    forceDirty: () => Unit,
    isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any,
    reset: () => Unit
  ): DirtyFlagResult = {
    val __obj = js.Dynamic.literal(forceDirty = js.Any.fromFunction0(forceDirty), isDirty = isDirty.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[DirtyFlagResult]
  }
  
  @scala.inline
  implicit class DirtyFlagResultMutableBuilder[Self <: DirtyFlagResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceDirty(value: () => Unit): Self = StObject.set(x, "forceDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDirty(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any
    ): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
