package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKindExpression extends StObject {
  
  /**
    * The name of the kind.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaKindExpression {
  
  inline def apply(): SchemaKindExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKindExpression]
  }
  
  extension [Self <: SchemaKindExpression](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
