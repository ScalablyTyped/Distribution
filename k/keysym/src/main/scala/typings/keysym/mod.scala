package typings.keysym

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keysym", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromKeysym(keysym: Double): js.UndefOr[Record] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeysym")(keysym.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record]]
  
  inline def fromName(name: String): js.UndefOr[Record] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record]]
  
  inline def fromUnicode(code: String): js.Array[Record] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnicode")(code.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record]]
  inline def fromUnicode(code: Double): js.Array[Record] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnicode")(code.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record]]
  
  @JSImport("keysym", "records")
  @js.native
  val records: js.Array[Record] = js.native
  
  trait Record extends StObject {
    
    var keysym: Double
    
    var names: js.Array[String]
    
    var status: String
    
    var unicode: Double
  }
  object Record {
    
    inline def apply(keysym: Double, names: js.Array[String], status: String, unicode: Double): Record = {
      val __obj = js.Dynamic.literal(keysym = keysym.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Record]
    }
    
    extension [Self <: Record](x: Self) {
      
      inline def setKeysym(value: Double): Self = StObject.set(x, "keysym", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUnicode(value: Double): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    }
  }
}
