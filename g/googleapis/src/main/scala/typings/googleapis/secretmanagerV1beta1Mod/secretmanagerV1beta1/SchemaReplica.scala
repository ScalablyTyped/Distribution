package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplica extends StObject {
  
  /**
    * The canonical IDs of the location to replicate data. For example: `"us-east1"`.
    */
  var location: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplica {
  
  inline def apply(): SchemaReplica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplica]
  }
  
  extension [Self <: SchemaReplica](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
