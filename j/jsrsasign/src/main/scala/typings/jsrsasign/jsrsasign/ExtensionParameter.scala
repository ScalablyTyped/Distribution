package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionParameter
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var array: js.Array[Any]
  
  var critical: Boolean
  
  var extname: String
  
  var kid: StringDictionary[Any]
  
  var names: js.Array[String]
}
object ExtensionParameter {
  
  inline def apply(
    array: js.Array[Any],
    critical: Boolean,
    extname: String,
    kid: StringDictionary[Any],
    names: js.Array[String]
  ): ExtensionParameter = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionParameter] (val x: Self) extends AnyVal {
    
    inline def setArray(value: js.Array[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: Any*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setKid(value: StringDictionary[Any]): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
