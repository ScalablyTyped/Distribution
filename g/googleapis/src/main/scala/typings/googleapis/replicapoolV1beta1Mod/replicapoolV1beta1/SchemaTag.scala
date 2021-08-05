package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compute Engine Instance tag, identical to the tags on the corresponding
  * Compute Engine Instance resource.
  */
trait SchemaTag extends StObject {
  
  /**
    * The fingerprint of the tag. Required for updating the list of tags.
    */
  var fingerPrint: js.UndefOr[String] = js.undefined
  
  /**
    * Items contained in this tag.
    */
  var items: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTag {
  
  inline def apply(): SchemaTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTag]
  }
  
  extension [Self <: SchemaTag](x: Self) {
    
    inline def setFingerPrint(value: String): Self = StObject.set(x, "fingerPrint", value.asInstanceOf[js.Any])
    
    inline def setFingerPrintUndefined: Self = StObject.set(x, "fingerPrint", js.undefined)
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
