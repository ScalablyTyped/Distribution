package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Per-project settings for the Tool Results service.
  */
trait SchemaProjectSettings extends StObject {
  
  /**
    * The name of the Google Cloud Storage bucket to which results are written.
    * By default, this is unset.  In update request: optional In response:
    * optional
    */
  var defaultBucket: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project&#39;s settings.  Always of the form:
    * projects/{project-id}/settings  In update request: never set In response:
    * always set
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaProjectSettings {
  
  inline def apply(): SchemaProjectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectSettings]
  }
  
  extension [Self <: SchemaProjectSettings](x: Self) {
    
    inline def setDefaultBucket(value: String): Self = StObject.set(x, "defaultBucket", value.asInstanceOf[js.Any])
    
    inline def setDefaultBucketUndefined: Self = StObject.set(x, "defaultBucket", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
