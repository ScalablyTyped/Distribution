package typings.jestTestResult.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionLocation extends StObject {
  
  var fullName: String
  
  var path: String
}
object AssertionLocation {
  
  @scala.inline
  def apply(fullName: String, path: String): AssertionLocation = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionLocation]
  }
  
  @scala.inline
  implicit class AssertionLocationMutableBuilder[Self <: AssertionLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
