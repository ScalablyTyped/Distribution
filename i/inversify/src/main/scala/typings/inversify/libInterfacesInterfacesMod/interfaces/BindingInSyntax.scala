package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingInSyntax[T] extends StObject {
  
  def inRequestScope(): BindingWhenOnSyntax[T]
  
  def inSingletonScope(): BindingWhenOnSyntax[T]
  
  def inTransientScope(): BindingWhenOnSyntax[T]
}
object BindingInSyntax {
  
  inline def apply[T](
    inRequestScope: () => BindingWhenOnSyntax[T],
    inSingletonScope: () => BindingWhenOnSyntax[T],
    inTransientScope: () => BindingWhenOnSyntax[T]
  ): BindingInSyntax[T] = {
    val __obj = js.Dynamic.literal(inRequestScope = js.Any.fromFunction0(inRequestScope), inSingletonScope = js.Any.fromFunction0(inSingletonScope), inTransientScope = js.Any.fromFunction0(inTransientScope))
    __obj.asInstanceOf[BindingInSyntax[T]]
  }
  
  extension [Self <: BindingInSyntax[?], T](x: Self & BindingInSyntax[T]) {
    
    inline def setInRequestScope(value: () => BindingWhenOnSyntax[T]): Self = StObject.set(x, "inRequestScope", js.Any.fromFunction0(value))
    
    inline def setInSingletonScope(value: () => BindingWhenOnSyntax[T]): Self = StObject.set(x, "inSingletonScope", js.Any.fromFunction0(value))
    
    inline def setInTransientScope(value: () => BindingWhenOnSyntax[T]): Self = StObject.set(x, "inTransientScope", js.Any.fromFunction0(value))
  }
}
