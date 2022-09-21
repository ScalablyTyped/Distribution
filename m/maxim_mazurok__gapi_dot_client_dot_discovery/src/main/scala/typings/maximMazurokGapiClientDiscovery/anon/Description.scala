package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  /** The description of this API. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A link to the discovery document. */
  var discoveryLink: js.UndefOr[String] = js.undefined
  
  /** The URL for the discovery REST document. */
  var discoveryRestUrl: js.UndefOr[String] = js.undefined
  
  /** A link to human readable documentation for the API. */
  var documentationLink: js.UndefOr[String] = js.undefined
  
  /** Links to 16x16 and 32x32 icons representing the API. */
  var icons: js.UndefOr[X16] = js.undefined
  
  /** The id of this API. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The kind for this response. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Labels for the status of this API, such as labs or deprecated. */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the API. */
  var name: js.UndefOr[String] = js.undefined
  
  /** True if this version is the preferred version to use. */
  var preferred: js.UndefOr[Boolean] = js.undefined
  
  /** The title of this API. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The version of the API. */
  var version: js.UndefOr[String] = js.undefined
}
object Description {
  
  inline def apply(): Description = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscoveryLink(value: String): Self = StObject.set(x, "discoveryLink", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryLinkUndefined: Self = StObject.set(x, "discoveryLink", js.undefined)
    
    inline def setDiscoveryRestUrl(value: String): Self = StObject.set(x, "discoveryRestUrl", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryRestUrlUndefined: Self = StObject.set(x, "discoveryRestUrl", js.undefined)
    
    inline def setDocumentationLink(value: String): Self = StObject.set(x, "documentationLink", value.asInstanceOf[js.Any])
    
    inline def setDocumentationLinkUndefined: Self = StObject.set(x, "documentationLink", js.undefined)
    
    inline def setIcons(value: X16): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
