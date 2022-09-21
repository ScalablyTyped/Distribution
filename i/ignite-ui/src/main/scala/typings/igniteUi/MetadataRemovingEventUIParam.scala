package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataRemovingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[Any] = js.undefined
  
  /**
    * A reference to the dragged element.
    */
  var targetElement: js.UndefOr[String] = js.undefined
}
object MetadataRemovingEventUIParam {
  
  inline def apply(): MetadataRemovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataRemovingEventUIParam]
  }
  
  extension [Self <: MetadataRemovingEventUIParam](x: Self) {
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setTargetElement(value: String): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    inline def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
  }
}
