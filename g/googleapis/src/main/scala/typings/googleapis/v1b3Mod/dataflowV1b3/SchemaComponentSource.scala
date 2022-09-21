package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComponentSource extends StObject {
  
  /**
    * Dataflow service generated name for this source.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User name for the original user transform or collection with which this source is most closely associated.
    */
  var originalTransformOrCollection: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable name for this transform; may be user or system generated.
    */
  var userName: js.UndefOr[String | Null] = js.undefined
}
object SchemaComponentSource {
  
  inline def apply(): SchemaComponentSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComponentSource]
  }
  
  extension [Self <: SchemaComponentSource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalTransformOrCollection(value: String): Self = StObject.set(x, "originalTransformOrCollection", value.asInstanceOf[js.Any])
    
    inline def setOriginalTransformOrCollectionNull: Self = StObject.set(x, "originalTransformOrCollection", null)
    
    inline def setOriginalTransformOrCollectionUndefined: Self = StObject.set(x, "originalTransformOrCollection", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
