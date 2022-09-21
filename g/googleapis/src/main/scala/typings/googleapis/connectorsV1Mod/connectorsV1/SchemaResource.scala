package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResource extends StObject {
  
  /**
    * Template to uniquely represent a GCP resource in a format IAM expects This is a template that can have references to other values provided in the config variable template.
    */
  var pathTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Different types of resource supported.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaResource {
  
  inline def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  
  extension [Self <: SchemaResource](x: Self) {
    
    inline def setPathTemplate(value: String): Self = StObject.set(x, "pathTemplate", value.asInstanceOf[js.Any])
    
    inline def setPathTemplateNull: Self = StObject.set(x, "pathTemplate", null)
    
    inline def setPathTemplateUndefined: Self = StObject.set(x, "pathTemplate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
