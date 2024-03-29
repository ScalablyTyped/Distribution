package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirtyFlagResult extends StObject {
  
  def forceDirty(): Unit
  
  var isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
  
  def reset(): Unit
}
object DirtyFlagResult {
  
  inline def apply(
    forceDirty: () => Unit,
    isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any,
    reset: () => Unit
  ): DirtyFlagResult = {
    val __obj = js.Dynamic.literal(forceDirty = js.Any.fromFunction0(forceDirty), isDirty = isDirty.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[DirtyFlagResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirtyFlagResult] (val x: Self) extends AnyVal {
    
    inline def setForceDirty(value: () => Unit): Self = StObject.set(x, "forceDirty", js.Any.fromFunction0(value))
    
    inline def setIsDirty(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
    ): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
