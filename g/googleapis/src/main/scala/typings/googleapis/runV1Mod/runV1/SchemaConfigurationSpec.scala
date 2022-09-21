package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigurationSpec extends StObject {
  
  /**
    * Template holds the latest specification for the Revision to be stamped out.
    */
  var template: js.UndefOr[SchemaRevisionTemplate] = js.undefined
}
object SchemaConfigurationSpec {
  
  inline def apply(): SchemaConfigurationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurationSpec]
  }
  
  extension [Self <: SchemaConfigurationSpec](x: Self) {
    
    inline def setTemplate(value: SchemaRevisionTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
