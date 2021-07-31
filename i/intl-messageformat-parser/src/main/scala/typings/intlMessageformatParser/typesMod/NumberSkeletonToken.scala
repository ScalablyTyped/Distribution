package typings.intlMessageformatParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberSkeletonToken extends StObject {
  
  var options: js.Array[String]
  
  var stem: String
}
object NumberSkeletonToken {
  
  @scala.inline
  def apply(options: js.Array[String], stem: String): NumberSkeletonToken = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSkeletonToken]
  }
  
  @scala.inline
  implicit class NumberSkeletonTokenMutableBuilder[Self <: NumberSkeletonToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
  }
}
