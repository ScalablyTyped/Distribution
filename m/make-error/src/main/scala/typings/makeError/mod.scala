package typings.makeError

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.makeError.anon.Instantiable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("make-error", JSImport.Namespace)
  @js.native
  def apply(name: String): Constructor[BaseError] = js.native
  /**
    * Set the constructor prototype to `BaseError`.
    */
  @JSImport("make-error", JSImport.Namespace)
  @js.native
  def apply[T /* <: Error */](super_ : Instantiable[T]): Constructor[T with BaseError] = js.native
  /**
    * Create a specialized error instance.
    */
  @JSImport("make-error", JSImport.Namespace)
  @js.native
  def apply[T /* <: Error */, K](name: String, super_ : K): K with SpecializedConstructor[T] = js.native
  @JSImport("make-error", JSImport.Namespace)
  @js.native
  def apply[T /* <: Error */, K](name: js.Function, super_ : K): K with SpecializedConstructor[T] = js.native
  
  @JSImport("make-error", "BaseError")
  @js.native
  class BaseError () extends Error {
    def this(message: String) = this()
    
    @JSName("stack")
    var stack_BaseError: String = js.native
  }
  
  @js.native
  trait Constructor[T]
    extends Instantiable0[T]
       with Instantiable1[/* message */ String, T] {
    
    var super_ : js.Any = js.native
  }
  
  @js.native
  trait SpecializedConstructor[T] extends StObject {
    
    var super_ : js.Any = js.native
  }
  object SpecializedConstructor {
    
    @scala.inline
    def apply[T](super_ : js.Any): SpecializedConstructor[T] = {
      val __obj = js.Dynamic.literal(super_ = super_.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecializedConstructor[T]]
    }
    
    @scala.inline
    implicit class SpecializedConstructorMutableBuilder[Self <: SpecializedConstructor[_], T] (val x: Self with SpecializedConstructor[T]) extends AnyVal {
      
      @scala.inline
      def setSuper_(value: js.Any): Self = StObject.set(x, "super_", value.asInstanceOf[js.Any])
    }
  }
}
