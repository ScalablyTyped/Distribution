package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingOnSyntax[T] extends StObject {
  
  def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T | js.Promise[T]]): BindingWhenSyntax[T]
  
  def onDeactivation(fn: js.Function1[/* injectable */ T, Unit | js.Promise[Unit]]): BindingWhenSyntax[T]
}
object BindingOnSyntax {
  
  inline def apply[T](
    onActivation: js.Function2[/* context */ Context, /* injectable */ T, T | js.Promise[T]] => BindingWhenSyntax[T],
    onDeactivation: js.Function1[/* injectable */ T, Unit | js.Promise[Unit]] => BindingWhenSyntax[T]
  ): BindingOnSyntax[T] = {
    val __obj = js.Dynamic.literal(onActivation = js.Any.fromFunction1(onActivation), onDeactivation = js.Any.fromFunction1(onDeactivation))
    __obj.asInstanceOf[BindingOnSyntax[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingOnSyntax[?], T] (val x: Self & BindingOnSyntax[T]) extends AnyVal {
    
    inline def setOnActivation(
      value: js.Function2[/* context */ Context, /* injectable */ T, T | js.Promise[T]] => BindingWhenSyntax[T]
    ): Self = StObject.set(x, "onActivation", js.Any.fromFunction1(value))
    
    inline def setOnDeactivation(value: js.Function1[/* injectable */ T, Unit | js.Promise[Unit]] => BindingWhenSyntax[T]): Self = StObject.set(x, "onDeactivation", js.Any.fromFunction1(value))
  }
}
