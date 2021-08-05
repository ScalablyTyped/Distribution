package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GithubRepo extends StObject {
  
  var full_name: String
  
  var id: Double
}
object GithubRepo {
  
  inline def apply(full_name: String, id: Double): GithubRepo = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubRepo]
  }
  
  extension [Self <: GithubRepo](x: Self) {
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
