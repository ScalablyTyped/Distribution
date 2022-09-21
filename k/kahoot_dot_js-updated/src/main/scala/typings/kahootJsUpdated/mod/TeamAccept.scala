package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamAccept extends StObject {
  
  var memberNames: js.Array[String]
}
object TeamAccept {
  
  inline def apply(memberNames: js.Array[String]): TeamAccept = {
    val __obj = js.Dynamic.literal(memberNames = memberNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamAccept]
  }
  
  extension [Self <: TeamAccept](x: Self) {
    
    inline def setMemberNames(value: js.Array[String]): Self = StObject.set(x, "memberNames", value.asInstanceOf[js.Any])
    
    inline def setMemberNamesVarargs(value: String*): Self = StObject.set(x, "memberNames", js.Array(value*))
  }
}
