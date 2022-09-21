package typings.makeError

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.makeError.anon.Instantiable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(name: String): Constructor[BaseError] = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Constructor[BaseError]]
  /**
    * Set the constructor prototype to `BaseError`.
    */
  inline def apply[T /* <: js.Error */](super_ : Instantiable[T]): Constructor[T & BaseError] = ^.asInstanceOf[js.Dynamic].apply(super_.asInstanceOf[js.Any]).asInstanceOf[Constructor[T & BaseError]]
  /**
    * Create a specialized error instance.
    */
  inline def apply[T /* <: js.Error */, K](name: String, super_ : K): K & SpecializedConstructor[T] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], super_.asInstanceOf[js.Any])).asInstanceOf[K & SpecializedConstructor[T]]
  inline def apply[T /* <: js.Error */, K](name: js.Function, super_ : K): K & SpecializedConstructor[T] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], super_.asInstanceOf[js.Any])).asInstanceOf[K & SpecializedConstructor[T]]
  
  @JSImport("make-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-error", "BaseError")
  @js.native
  open class BaseError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    @JSName("stack")
    var stack_BaseError: String = js.native
  }
  
  @js.native
  trait Constructor[T]
    extends StObject
       with Instantiable0[T]
       with Instantiable1[/* message */ String, T] {
    
    var super_ : Any = js.native
  }
  
  trait SpecializedConstructor[T] extends StObject {
    
    var super_ : Any
  }
  object SpecializedConstructor {
    
    inline def apply[T](super_ : Any): SpecializedConstructor[T] = {
      val __obj = js.Dynamic.literal(super_ = super_.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecializedConstructor[T]]
    }
    
    extension [Self <: SpecializedConstructor[?], T](x: Self & SpecializedConstructor[T]) {
      
      inline def setSuper_(value: Any): Self = StObject.set(x, "super_", value.asInstanceOf[js.Any])
    }
  }
}
