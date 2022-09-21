package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentPageAnchor extends StObject {
  
  /**
    * One or more references to visual page elements
    */
  var pageRefs: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageAnchorPageRef]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentPageAnchor {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentPageAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentPageAnchor]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentPageAnchor](x: Self) {
    
    inline def setPageRefs(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageAnchorPageRef]): Self = StObject.set(x, "pageRefs", value.asInstanceOf[js.Any])
    
    inline def setPageRefsUndefined: Self = StObject.set(x, "pageRefs", js.undefined)
    
    inline def setPageRefsVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageAnchorPageRef*): Self = StObject.set(x, "pageRefs", js.Array(value*))
  }
}
