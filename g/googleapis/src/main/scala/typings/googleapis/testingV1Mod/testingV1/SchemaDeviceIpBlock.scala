package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceIpBlock extends StObject {
  
  /**
    * The date this block was added to Firebase Test Lab
    */
  var addedDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * An IP address block in CIDR notation eg: 34.68.194.64/29
    */
  var block: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this block is used by physical or virtual devices
    */
  var form: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceIpBlock {
  
  inline def apply(): SchemaDeviceIpBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceIpBlock]
  }
  
  extension [Self <: SchemaDeviceIpBlock](x: Self) {
    
    inline def setAddedDate(value: SchemaDate): Self = StObject.set(x, "addedDate", value.asInstanceOf[js.Any])
    
    inline def setAddedDateUndefined: Self = StObject.set(x, "addedDate", js.undefined)
    
    inline def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockNull: Self = StObject.set(x, "block", null)
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormNull: Self = StObject.set(x, "form", null)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
  }
}
