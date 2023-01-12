package typings.keygrip

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("keygrip", JSImport.Namespace)
  @js.native
  val ^ : js.Object & KeygripFunction = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("keygrip", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Keygrip {
    def this(keys: js.Array[String]) = this()
    def this(keys: js.Array[String], algorithm: String) = this()
    def this(keys: js.Array[String], algorithm: String, encoding: String) = this()
    def this(keys: js.Array[String], algorithm: Unit, encoding: String) = this()
    
    /* CompleteClass */
    override def index(data: Any, digest: String): Double = js.native
    
    /* CompleteClass */
    override def sign(data: Any): String = js.native
    
    /* CompleteClass */
    override def verify(data: Any, digest: String): Boolean = js.native
  }
  
  trait Keygrip extends StObject {
    
    def index(data: Any, digest: String): Double
    
    def sign(data: Any): String
    
    def verify(data: Any, digest: String): Boolean
  }
  object Keygrip {
    
    inline def apply(index: (Any, String) => Double, sign: Any => String, verify: (Any, String) => Boolean): Keygrip = {
      val __obj = js.Dynamic.literal(index = js.Any.fromFunction2(index), sign = js.Any.fromFunction1(sign), verify = js.Any.fromFunction2(verify))
      __obj.asInstanceOf[Keygrip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Keygrip] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: (Any, String) => Double): Self = StObject.set(x, "index", js.Any.fromFunction2(value))
      
      inline def setSign(value: Any => String): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      inline def setVerify(value: (Any, String) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait KeygripFunction
    extends StObject
       with Instantiable1[/* keys */ js.Array[String], Keygrip]
       with Instantiable2[/* keys */ js.Array[String], /* algorithm */ String, Keygrip]
       with Instantiable3[
          /* keys */ js.Array[String], 
          (/* algorithm */ String) | (/* algorithm */ Unit), 
          /* encoding */ String, 
          Keygrip
        ] {
    
    def apply(keys: js.Array[String]): Keygrip = js.native
    def apply(keys: js.Array[String], algorithm: String): Keygrip = js.native
    def apply(keys: js.Array[String], algorithm: String, encoding: String): Keygrip = js.native
    def apply(keys: js.Array[String], algorithm: Unit, encoding: String): Keygrip = js.native
  }
  
  type _To = js.Object & KeygripFunction
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & KeygripFunction = ^
}
