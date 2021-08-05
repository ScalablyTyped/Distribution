package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the client which invoked the test.
  */
trait SchemaClientInfo extends StObject {
  
  /**
    * The list of detailed information about client.
    */
  var clientInfoDetails: js.UndefOr[js.Array[SchemaClientInfoDetail]] = js.undefined
  
  /**
    * Required. Client name, such as gcloud.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaClientInfo {
  
  inline def apply(): SchemaClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientInfo]
  }
  
  extension [Self <: SchemaClientInfo](x: Self) {
    
    inline def setClientInfoDetails(value: js.Array[SchemaClientInfoDetail]): Self = StObject.set(x, "clientInfoDetails", value.asInstanceOf[js.Any])
    
    inline def setClientInfoDetailsUndefined: Self = StObject.set(x, "clientInfoDetails", js.undefined)
    
    inline def setClientInfoDetailsVarargs(value: SchemaClientInfoDetail*): Self = StObject.set(x, "clientInfoDetails", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
