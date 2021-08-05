package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A key-value pair attached to a file that is either public or private to an
  * application. The following limits apply to file properties:   - Maximum of
  * 100 properties total per file - Maximum of 30 private properties per app -
  * Maximum of 30 public properties - Maximum of 124 bytes size limit on (key +
  * value) string in UTF-8 encoding for a single property.
  */
trait SchemaProperty extends StObject {
  
  /**
    * ETag of the property.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The key of this property.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * This is always drive#property.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The link back to this property.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The value of this property.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * The visibility of this property. Allowed values are PRIVATE and PUBLIC.
    * (Default: PRIVATE)
    */
  var visibility: js.UndefOr[String] = js.undefined
}
object SchemaProperty {
  
  inline def apply(): SchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProperty]
  }
  
  extension [Self <: SchemaProperty](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
