package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskStatus extends StObject {
  
  /**
    * Free disk space.
    */
  var freeSpaceBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total disk space.
    */
  var totalSpaceBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaDiskStatus {
  
  inline def apply(): SchemaDiskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskStatus]
  }
  
  extension [Self <: SchemaDiskStatus](x: Self) {
    
    inline def setFreeSpaceBytes(value: String): Self = StObject.set(x, "freeSpaceBytes", value.asInstanceOf[js.Any])
    
    inline def setFreeSpaceBytesNull: Self = StObject.set(x, "freeSpaceBytes", null)
    
    inline def setFreeSpaceBytesUndefined: Self = StObject.set(x, "freeSpaceBytes", js.undefined)
    
    inline def setTotalSpaceBytes(value: String): Self = StObject.set(x, "totalSpaceBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalSpaceBytesNull: Self = StObject.set(x, "totalSpaceBytes", null)
    
    inline def setTotalSpaceBytesUndefined: Self = StObject.set(x, "totalSpaceBytes", js.undefined)
  }
}
