package typings.hyperlorisTyson

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeTokenMod {
  
  @JSImport("@hyperloris/tyson/dist/types/reflect/typeToken", "TypeToken")
  @js.native
  open class TypeToken[T] protected () extends StObject {
    def this(`type`: js.Array[Any]) = this()
    def this(`type`: ClassType[T]) = this()
    
    /* private */ var _hash: Any = js.native
    
    /* private */ var _type: Any = js.native
    
    val hash: String = js.native
    
    val `type`: ClassType[T] | js.Array[Any] = js.native
  }
  
  @js.native
  trait ClassType[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
}
