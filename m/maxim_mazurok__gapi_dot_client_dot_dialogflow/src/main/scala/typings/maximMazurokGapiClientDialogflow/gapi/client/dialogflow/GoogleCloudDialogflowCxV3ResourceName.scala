package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ResourceName extends StObject {
  
  /** Display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Name. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ResourceName {
  
  inline def apply(): GoogleCloudDialogflowCxV3ResourceName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResourceName]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ResourceName](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
