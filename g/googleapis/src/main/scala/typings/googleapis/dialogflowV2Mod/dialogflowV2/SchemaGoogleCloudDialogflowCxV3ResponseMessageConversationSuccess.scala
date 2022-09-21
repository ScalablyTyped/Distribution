package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ResponseMessageConversationSuccess extends StObject {
  
  /**
    * Custom metadata. Dialogflow doesn't impose any structure on this.
    */
  var metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ResponseMessageConversationSuccess {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ResponseMessageConversationSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ResponseMessageConversationSuccess]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ResponseMessageConversationSuccess](x: Self) {
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
