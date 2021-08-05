package typings.maximMazurokGapiClientBigquery.anon

import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.ProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FriendlyName extends StObject {
  
  /** A descriptive name for this project. */
  var friendlyName: js.UndefOr[String] = js.undefined
  
  /** An opaque ID of this project. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The numeric ID of this project. */
  var numericId: js.UndefOr[String] = js.undefined
  
  /** A unique reference to this project. */
  var projectReference: js.UndefOr[ProjectReference] = js.undefined
}
object FriendlyName {
  
  inline def apply(): FriendlyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FriendlyName]
  }
  
  extension [Self <: FriendlyName](x: Self) {
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNumericId(value: String): Self = StObject.set(x, "numericId", value.asInstanceOf[js.Any])
    
    inline def setNumericIdUndefined: Self = StObject.set(x, "numericId", js.undefined)
    
    inline def setProjectReference(value: ProjectReference): Self = StObject.set(x, "projectReference", value.asInstanceOf[js.Any])
    
    inline def setProjectReferenceUndefined: Self = StObject.set(x, "projectReference", js.undefined)
  }
}
