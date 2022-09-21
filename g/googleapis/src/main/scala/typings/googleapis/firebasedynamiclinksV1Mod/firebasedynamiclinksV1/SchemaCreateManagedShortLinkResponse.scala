package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateManagedShortLinkResponse extends StObject {
  
  /**
    * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
    */
  var managedShortLink: js.UndefOr[SchemaManagedShortLink] = js.undefined
  
  /**
    * Preview link to show the link flow chart. (debug info.)
    */
  var previewLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about potential warnings on link creation.
    */
  var warning: js.UndefOr[js.Array[SchemaDynamicLinkWarning]] = js.undefined
}
object SchemaCreateManagedShortLinkResponse {
  
  inline def apply(): SchemaCreateManagedShortLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateManagedShortLinkResponse]
  }
  
  extension [Self <: SchemaCreateManagedShortLinkResponse](x: Self) {
    
    inline def setManagedShortLink(value: SchemaManagedShortLink): Self = StObject.set(x, "managedShortLink", value.asInstanceOf[js.Any])
    
    inline def setManagedShortLinkUndefined: Self = StObject.set(x, "managedShortLink", js.undefined)
    
    inline def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
    
    inline def setPreviewLinkNull: Self = StObject.set(x, "previewLink", null)
    
    inline def setPreviewLinkUndefined: Self = StObject.set(x, "previewLink", js.undefined)
    
    inline def setWarning(value: js.Array[SchemaDynamicLinkWarning]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    inline def setWarningVarargs(value: SchemaDynamicLinkWarning*): Self = StObject.set(x, "warning", js.Array(value*))
  }
}
