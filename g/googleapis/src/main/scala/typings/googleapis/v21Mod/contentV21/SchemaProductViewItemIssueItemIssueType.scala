package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductViewItemIssueItemIssueType extends StObject {
  
  /**
    * Canonical attribute name for attribute-specific issues.
    */
  var canonicalAttribute: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductViewItemIssueItemIssueType {
  
  inline def apply(): SchemaProductViewItemIssueItemIssueType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductViewItemIssueItemIssueType]
  }
  
  extension [Self <: SchemaProductViewItemIssueItemIssueType](x: Self) {
    
    inline def setCanonicalAttribute(value: String): Self = StObject.set(x, "canonicalAttribute", value.asInstanceOf[js.Any])
    
    inline def setCanonicalAttributeNull: Self = StObject.set(x, "canonicalAttribute", null)
    
    inline def setCanonicalAttributeUndefined: Self = StObject.set(x, "canonicalAttribute", js.undefined)
  }
}
