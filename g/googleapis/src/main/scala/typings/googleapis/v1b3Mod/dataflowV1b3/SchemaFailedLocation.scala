package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFailedLocation extends StObject {
  
  /**
    * The name of the [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that failed to respond.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaFailedLocation {
  
  inline def apply(): SchemaFailedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailedLocation]
  }
  
  extension [Self <: SchemaFailedLocation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
