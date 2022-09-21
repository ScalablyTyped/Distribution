package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ActionInvalidDataPartition extends StObject {
  
  /**
    * The issue type of InvalidDataPartition.
    */
  var expectedStructure: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ActionInvalidDataPartition {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ActionInvalidDataPartition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ActionInvalidDataPartition]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ActionInvalidDataPartition](x: Self) {
    
    inline def setExpectedStructure(value: String): Self = StObject.set(x, "expectedStructure", value.asInstanceOf[js.Any])
    
    inline def setExpectedStructureNull: Self = StObject.set(x, "expectedStructure", null)
    
    inline def setExpectedStructureUndefined: Self = StObject.set(x, "expectedStructure", js.undefined)
  }
}
