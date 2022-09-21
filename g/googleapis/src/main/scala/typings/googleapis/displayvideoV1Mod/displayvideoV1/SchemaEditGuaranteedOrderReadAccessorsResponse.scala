package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEditGuaranteedOrderReadAccessorsResponse extends StObject {
  
  /**
    * Whether all advertisers of read_write_partner_id have read access to the guaranteed order.
    */
  var readAccessInherited: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The IDs of advertisers with read access to the guaranteed order.
    */
  var readAdvertiserIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaEditGuaranteedOrderReadAccessorsResponse {
  
  inline def apply(): SchemaEditGuaranteedOrderReadAccessorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditGuaranteedOrderReadAccessorsResponse]
  }
  
  extension [Self <: SchemaEditGuaranteedOrderReadAccessorsResponse](x: Self) {
    
    inline def setReadAccessInherited(value: Boolean): Self = StObject.set(x, "readAccessInherited", value.asInstanceOf[js.Any])
    
    inline def setReadAccessInheritedNull: Self = StObject.set(x, "readAccessInherited", null)
    
    inline def setReadAccessInheritedUndefined: Self = StObject.set(x, "readAccessInherited", js.undefined)
    
    inline def setReadAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "readAdvertiserIds", value.asInstanceOf[js.Any])
    
    inline def setReadAdvertiserIdsNull: Self = StObject.set(x, "readAdvertiserIds", null)
    
    inline def setReadAdvertiserIdsUndefined: Self = StObject.set(x, "readAdvertiserIds", js.undefined)
    
    inline def setReadAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "readAdvertiserIds", js.Array(value*))
  }
}
