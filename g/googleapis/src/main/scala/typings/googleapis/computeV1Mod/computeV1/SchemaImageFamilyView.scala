package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageFamilyView extends StObject {
  
  /**
    * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
}
object SchemaImageFamilyView {
  
  inline def apply(): SchemaImageFamilyView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageFamilyView]
  }
  
  extension [Self <: SchemaImageFamilyView](x: Self) {
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
