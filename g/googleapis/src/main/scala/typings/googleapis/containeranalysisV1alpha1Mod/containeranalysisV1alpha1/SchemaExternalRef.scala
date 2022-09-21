package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExternalRef extends StObject {
  
  /**
    * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable information about the purpose and target of the reference
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
    */
  var locator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of category (e.g. 'npm' for the PACKAGE_MANAGER category)
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaExternalRef {
  
  inline def apply(): SchemaExternalRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalRef]
  }
  
  extension [Self <: SchemaExternalRef](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setLocator(value: String): Self = StObject.set(x, "locator", value.asInstanceOf[js.Any])
    
    inline def setLocatorNull: Self = StObject.set(x, "locator", null)
    
    inline def setLocatorUndefined: Self = StObject.set(x, "locator", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
