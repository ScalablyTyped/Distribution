package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobTemplate extends StObject {
  
  /**
    * The configuration for this template.
    */
  var config: js.UndefOr[SchemaJobConfig] = js.undefined
  
  /**
    * The resource name of the job template. Format: `projects/{project\}/locations/{location\}/jobTemplates/{job_template\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobTemplate {
  
  inline def apply(): SchemaJobTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobTemplate]
  }
  
  extension [Self <: SchemaJobTemplate](x: Self) {
    
    inline def setConfig(value: SchemaJobConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
