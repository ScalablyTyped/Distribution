package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaXcodeVersion extends StObject {
  
  /**
    * Tags for this Xcode version. Example: "default".
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The id for this version. Example: "9.2".
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaXcodeVersion {
  
  inline def apply(): SchemaXcodeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXcodeVersion]
  }
  
  extension [Self <: SchemaXcodeVersion](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
