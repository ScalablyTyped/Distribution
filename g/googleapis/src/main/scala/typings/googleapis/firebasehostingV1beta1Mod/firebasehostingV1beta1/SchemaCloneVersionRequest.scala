package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloneVersionRequest extends StObject {
  
  /**
    * If provided, only paths that do not match any of the RegEx values in this list will be included in the new version.
    */
  var exclude: js.UndefOr[SchemaPathFilter] = js.undefined
  
  /**
    * If true, the call to `CloneVersion` immediately finalizes the version after cloning is complete. If false, the cloned version will have a status of `CREATED`. Use [`UpdateVersion`](patch) to set the status of the version to `FINALIZED`.
    */
  @JSName("finalize")
  var finalize_FSchemaCloneVersionRequest: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If provided, only paths that match one or more RegEx values in this list will be included in the new version.
    */
  var include: js.UndefOr[SchemaPathFilter] = js.undefined
  
  /**
    * Required. The unique identifier for the version to be cloned, in the format: sites/SITE_ID/versions/VERSION_ID
    */
  var sourceVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloneVersionRequest {
  
  inline def apply(): SchemaCloneVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloneVersionRequest]
  }
  
  extension [Self <: SchemaCloneVersionRequest](x: Self) {
    
    inline def setExclude(value: SchemaPathFilter): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setFinalize_(value: Boolean): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
    
    inline def setFinalize_Null: Self = StObject.set(x, "finalize", null)
    
    inline def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
    
    inline def setInclude(value: SchemaPathFilter): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionNull: Self = StObject.set(x, "sourceVersion", null)
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
  }
}
