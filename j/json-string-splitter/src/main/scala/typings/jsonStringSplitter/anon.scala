package typings.jsonStringSplitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Jsons extends StObject {
    
    var jsons: js.Array[String]
    
    var remainder: String
  }
  object Jsons {
    
    inline def apply(jsons: js.Array[String], remainder: String): Jsons = {
      val __obj = js.Dynamic.literal(jsons = jsons.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Jsons]
    }
    
    extension [Self <: Jsons](x: Self) {
      
      inline def setJsons(value: js.Array[String]): Self = StObject.set(x, "jsons", value.asInstanceOf[js.Any])
      
      inline def setJsonsVarargs(value: String*): Self = StObject.set(x, "jsons", js.Array(value*))
      
      inline def setRemainder(value: String): Self = StObject.set(x, "remainder", value.asInstanceOf[js.Any])
    }
  }
}
