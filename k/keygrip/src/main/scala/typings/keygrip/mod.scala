package typings.keygrip

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("keygrip", JSImport.Namespace)
  @js.native
  val ^ : KeygripFunction = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("keygrip", JSImport.Namespace)
  @js.native
  class Class protected () extends Keygrip {
    def this(keys: js.Array[String]) = this()
    def this(keys: js.Array[String], algorithm: String) = this()
    def this(keys: js.Array[String], algorithm: js.UndefOr[scala.Nothing], encoding: String) = this()
    def this(keys: js.Array[String], algorithm: String, encoding: String) = this()
  }
  
  @js.native
  trait Keygrip extends StObject {
    
    def index(data: js.Any, digest: String): Double = js.native
    
    def sign(data: js.Any): String = js.native
    
    def verify(data: js.Any, digest: String): Boolean = js.native
  }
  object Keygrip {
    
    @scala.inline
    def apply(index: (js.Any, String) => Double, sign: js.Any => String, verify: (js.Any, String) => Boolean): Keygrip = {
      val __obj = js.Dynamic.literal(index = js.Any.fromFunction2(index), sign = js.Any.fromFunction1(sign), verify = js.Any.fromFunction2(verify))
      __obj.asInstanceOf[Keygrip]
    }
    
    @scala.inline
    implicit class KeygripMutableBuilder[Self <: Keygrip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: (js.Any, String) => Double): Self = StObject.set(x, "index", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSign(value: js.Any => String): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerify(value: (js.Any, String) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait KeygripFunction
    extends Instantiable1[/* keys */ js.Array[String], Keygrip]
       with Instantiable2[/* keys */ js.Array[String], /* algorithm */ String, Keygrip]
       with Instantiable3[
          /* keys */ js.Array[String], 
          js.UndefOr[/* algorithm */ String], 
          /* encoding */ String, 
          Keygrip
        ] {
    
    def apply(keys: js.Array[String]): Keygrip = js.native
    def apply(keys: js.Array[String], algorithm: js.UndefOr[scala.Nothing], encoding: String): Keygrip = js.native
    def apply(keys: js.Array[String], algorithm: String): Keygrip = js.native
    def apply(keys: js.Array[String], algorithm: String, encoding: String): Keygrip = js.native
  }
  
  type _To = KeygripFunction
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: KeygripFunction = ^
}
