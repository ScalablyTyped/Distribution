package typings.intlMessageformatParser.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberSkeletonToken extends StObject {
  
  var options: js.Array[String]
  
  var stem: String
}
object NumberSkeletonToken {
  
  inline def apply(options: js.Array[String], stem: String): NumberSkeletonToken = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSkeletonToken]
  }
  
  extension [Self <: NumberSkeletonToken](x: Self) {
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
  }
}
