package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListContainerVersionsResponse extends StObject {
  
  /**
    * All versions of a GTM Container.
    */
  var containerVersion: js.UndefOr[js.Array[SchemaContainerVersion]] = js.undefined
  
  /**
    * All container version headers of a GTM Container.
    */
  var containerVersionHeader: js.UndefOr[js.Array[SchemaContainerVersionHeader]] = js.undefined
}
object SchemaListContainerVersionsResponse {
  
  inline def apply(): SchemaListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainerVersionsResponse]
  }
  
  extension [Self <: SchemaListContainerVersionsResponse](x: Self) {
    
    inline def setContainerVersion(value: js.Array[SchemaContainerVersion]): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionHeader(value: js.Array[SchemaContainerVersionHeader]): Self = StObject.set(x, "containerVersionHeader", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionHeaderUndefined: Self = StObject.set(x, "containerVersionHeader", js.undefined)
    
    inline def setContainerVersionHeaderVarargs(value: SchemaContainerVersionHeader*): Self = StObject.set(x, "containerVersionHeader", js.Array(value*))
    
    inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    inline def setContainerVersionVarargs(value: SchemaContainerVersion*): Self = StObject.set(x, "containerVersion", js.Array(value*))
  }
}
