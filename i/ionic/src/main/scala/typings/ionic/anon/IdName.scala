package typings.ionic.anon

import typings.ionic.definitionsMod.IntegrationName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdName extends StObject {
  
  var id: String
  
  var name: IntegrationName
}
object IdName {
  
  inline def apply(id: String, name: IntegrationName): IdName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdName] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: IntegrationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
