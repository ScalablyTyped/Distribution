package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageItem extends StObject {
  
  /**
    * Required. The image displayed in the item.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
}
object SchemaImageItem {
  
  inline def apply(): SchemaImageItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageItem]
  }
  
  extension [Self <: SchemaImageItem](x: Self) {
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
