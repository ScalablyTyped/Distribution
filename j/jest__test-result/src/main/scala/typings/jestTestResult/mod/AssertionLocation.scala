package typings.jestTestResult.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionLocation extends StObject {
  
  var fullName: String
  
  var path: String
}
object AssertionLocation {
  
  inline def apply(fullName: String, path: String): AssertionLocation = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssertionLocation] (val x: Self) extends AnyVal {
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
