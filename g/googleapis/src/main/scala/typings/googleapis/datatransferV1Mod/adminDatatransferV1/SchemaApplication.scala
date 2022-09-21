package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplication extends StObject {
  
  /**
    * Etag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The application's ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the resource as a DataTransfer Application Resource.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The application's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of all possible transfer parameters for this application. These parameters can be used to select the data of the user in this application to be transferred.
    */
  var transferParams: js.UndefOr[js.Array[SchemaApplicationTransferParam]] = js.undefined
}
object SchemaApplication {
  
  inline def apply(): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplication]
  }
  
  extension [Self <: SchemaApplication](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTransferParams(value: js.Array[SchemaApplicationTransferParam]): Self = StObject.set(x, "transferParams", value.asInstanceOf[js.Any])
    
    inline def setTransferParamsUndefined: Self = StObject.set(x, "transferParams", js.undefined)
    
    inline def setTransferParamsVarargs(value: SchemaApplicationTransferParam*): Self = StObject.set(x, "transferParams", js.Array(value*))
  }
}
