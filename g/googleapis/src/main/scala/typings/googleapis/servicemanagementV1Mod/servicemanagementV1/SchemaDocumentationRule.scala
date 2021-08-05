package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A documentation rule provides information about individual API elements.
  */
trait SchemaDocumentationRule extends StObject {
  
  /**
    * Deprecation description of the selected element(s). It can be provided if
    * an element is marked as `deprecated`.
    */
  var deprecationDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the selected API(s).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The selector is a comma-separated list of patterns. Each pattern is a
    * qualified name of the element which may end in &quot;*&quot;, indicating
    * a wildcard. Wildcards are only allowed at the end and for a whole
    * component of the qualified name, i.e. &quot;foo.*&quot; is ok, but not
    * &quot;foo.b*&quot; or &quot;foo.*.bar&quot;. A wildcard will match one or
    * more components. To specify a default for all applicable elements, the
    * whole pattern &quot;*&quot; is used.
    */
  var selector: js.UndefOr[String] = js.undefined
}
object SchemaDocumentationRule {
  
  inline def apply(): SchemaDocumentationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentationRule]
  }
  
  extension [Self <: SchemaDocumentationRule](x: Self) {
    
    inline def setDeprecationDescription(value: String): Self = StObject.set(x, "deprecationDescription", value.asInstanceOf[js.Any])
    
    inline def setDeprecationDescriptionUndefined: Self = StObject.set(x, "deprecationDescription", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
