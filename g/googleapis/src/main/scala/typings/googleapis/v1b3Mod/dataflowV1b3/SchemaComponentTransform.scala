package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComponentTransform extends StObject {
  
  /**
    * Dataflow service generated name for this source.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User name for the original user transform with which this transform is most closely associated.
    */
  var originalTransform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable name for this transform; may be user or system generated.
    */
  var userName: js.UndefOr[String | Null] = js.undefined
}
object SchemaComponentTransform {
  
  inline def apply(): SchemaComponentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComponentTransform]
  }
  
  extension [Self <: SchemaComponentTransform](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalTransform(value: String): Self = StObject.set(x, "originalTransform", value.asInstanceOf[js.Any])
    
    inline def setOriginalTransformNull: Self = StObject.set(x, "originalTransform", null)
    
    inline def setOriginalTransformUndefined: Self = StObject.set(x, "originalTransform", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
