package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosVersion extends StObject {
  
  /**
    * An opaque id for this iOS version. Use this id to invoke the TestExecutionService.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An integer representing the major iOS version. Examples: "8", "9".
    */
  var majorVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An integer representing the minor iOS version. Examples: "1", "2".
    */
  var minorVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The available Xcode versions for this version.
    */
  var supportedXcodeVersionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Tags for this dimension. Examples: "default", "preview", "deprecated".
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaIosVersion {
  
  inline def apply(): SchemaIosVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosVersion]
  }
  
  extension [Self <: SchemaIosVersion](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMajorVersion(value: Double): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionNull: Self = StObject.set(x, "majorVersion", null)
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setMinorVersion(value: Double): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersionNull: Self = StObject.set(x, "minorVersion", null)
    
    inline def setMinorVersionUndefined: Self = StObject.set(x, "minorVersion", js.undefined)
    
    inline def setSupportedXcodeVersionIds(value: js.Array[String]): Self = StObject.set(x, "supportedXcodeVersionIds", value.asInstanceOf[js.Any])
    
    inline def setSupportedXcodeVersionIdsNull: Self = StObject.set(x, "supportedXcodeVersionIds", null)
    
    inline def setSupportedXcodeVersionIdsUndefined: Self = StObject.set(x, "supportedXcodeVersionIds", js.undefined)
    
    inline def setSupportedXcodeVersionIdsVarargs(value: String*): Self = StObject.set(x, "supportedXcodeVersionIds", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
