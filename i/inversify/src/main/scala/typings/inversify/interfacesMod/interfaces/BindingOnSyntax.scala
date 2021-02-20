package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingOnSyntax[T] extends StObject {
  
  def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): BindingWhenSyntax[T] = js.native
}
object BindingOnSyntax {
  
  @scala.inline
  def apply[T](onActivation: js.Function2[/* context */ Context, /* injectable */ T, T] => BindingWhenSyntax[T]): BindingOnSyntax[T] = {
    val __obj = js.Dynamic.literal(onActivation = js.Any.fromFunction1(onActivation))
    __obj.asInstanceOf[BindingOnSyntax[T]]
  }
  
  @scala.inline
  implicit class BindingOnSyntaxMutableBuilder[Self <: BindingOnSyntax[_], T] (val x: Self with BindingOnSyntax[T]) extends AnyVal {
    
    @scala.inline
    def setOnActivation(value: js.Function2[/* context */ Context, /* injectable */ T, T] => BindingWhenSyntax[T]): Self = StObject.set(x, "onActivation", js.Any.fromFunction1(value))
  }
}
