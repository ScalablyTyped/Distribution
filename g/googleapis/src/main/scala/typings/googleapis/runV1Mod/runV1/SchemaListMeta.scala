package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMeta extends StObject {
  
  /**
    * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response.
    */
  var continue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency +optional
    */
  var resourceVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SelfLink is a URL representing this object. Populated by the system. Read-only. +optional
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaListMeta {
  
  inline def apply(): SchemaListMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMeta]
  }
  
  extension [Self <: SchemaListMeta](x: Self) {
    
    inline def setContinue(value: String): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
    
    inline def setContinueNull: Self = StObject.set(x, "continue", null)
    
    inline def setContinueUndefined: Self = StObject.set(x, "continue", js.undefined)
    
    inline def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    inline def setResourceVersionNull: Self = StObject.set(x, "resourceVersion", null)
    
    inline def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
