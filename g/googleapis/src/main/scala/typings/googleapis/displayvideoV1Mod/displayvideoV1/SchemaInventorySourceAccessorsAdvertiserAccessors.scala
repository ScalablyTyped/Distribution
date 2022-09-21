package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySourceAccessorsAdvertiserAccessors extends StObject {
  
  /**
    * The IDs of the advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaInventorySourceAccessorsAdvertiserAccessors {
  
  inline def apply(): SchemaInventorySourceAccessorsAdvertiserAccessors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySourceAccessorsAdvertiserAccessors]
  }
  
  extension [Self <: SchemaInventorySourceAccessorsAdvertiserAccessors](x: Self) {
    
    inline def setAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdsNull: Self = StObject.set(x, "advertiserIds", null)
    
    inline def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    inline def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value*))
  }
}
