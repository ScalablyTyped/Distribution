package typings.idb

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilMod {
  
  @JSImport("idb/build/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def instanceOfAny(`object`: Any, constructors: js.Array[Constructor]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfAny")(`object`.asInstanceOf[js.Any], constructors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Constructor = Instantiable1[/* args (repeated) */ Any, Any]
  
  @js.native
  trait Func extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
}
