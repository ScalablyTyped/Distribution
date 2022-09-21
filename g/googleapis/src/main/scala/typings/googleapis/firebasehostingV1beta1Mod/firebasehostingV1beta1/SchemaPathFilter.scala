package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathFilter extends StObject {
  
  /**
    * An array of RegEx values by which to filter.
    */
  var regexes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPathFilter {
  
  inline def apply(): SchemaPathFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathFilter]
  }
  
  extension [Self <: SchemaPathFilter](x: Self) {
    
    inline def setRegexes(value: js.Array[String]): Self = StObject.set(x, "regexes", value.asInstanceOf[js.Any])
    
    inline def setRegexesNull: Self = StObject.set(x, "regexes", null)
    
    inline def setRegexesUndefined: Self = StObject.set(x, "regexes", js.undefined)
    
    inline def setRegexesVarargs(value: String*): Self = StObject.set(x, "regexes", js.Array(value*))
  }
}
