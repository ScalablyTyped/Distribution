package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentPageAnchor extends StObject {
  
  /**
    * One or more references to visual page elements
    */
  var pageRefs: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3DocumentPageAnchorPageRef]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentPageAnchor {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentPageAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentPageAnchor]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentPageAnchor](x: Self) {
    
    inline def setPageRefs(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3DocumentPageAnchorPageRef]): Self = StObject.set(x, "pageRefs", value.asInstanceOf[js.Any])
    
    inline def setPageRefsUndefined: Self = StObject.set(x, "pageRefs", js.undefined)
    
    inline def setPageRefsVarargs(value: SchemaGoogleCloudDocumentaiV1beta3DocumentPageAnchorPageRef*): Self = StObject.set(x, "pageRefs", js.Array(value*))
  }
}
