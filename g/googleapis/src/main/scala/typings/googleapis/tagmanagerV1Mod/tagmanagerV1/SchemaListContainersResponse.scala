package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListContainersResponse extends StObject {
  
  /**
    * All Containers of a GTM Account.
    */
  var containers: js.UndefOr[js.Array[SchemaContainer]] = js.undefined
}
object SchemaListContainersResponse {
  
  inline def apply(): SchemaListContainersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainersResponse]
  }
  
  extension [Self <: SchemaListContainersResponse](x: Self) {
    
    inline def setContainers(value: js.Array[SchemaContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: SchemaContainer*): Self = StObject.set(x, "containers", js.Array(value*))
  }
}
