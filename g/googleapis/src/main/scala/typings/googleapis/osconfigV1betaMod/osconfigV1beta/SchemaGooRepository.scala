package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooRepository extends StObject {
  
  /**
    * Required. The name of the repository.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The url of the repository.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooRepository {
  
  inline def apply(): SchemaGooRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooRepository]
  }
  
  extension [Self <: SchemaGooRepository](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
