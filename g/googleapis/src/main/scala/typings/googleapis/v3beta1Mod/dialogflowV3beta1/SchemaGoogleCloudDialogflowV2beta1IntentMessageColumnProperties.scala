package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageColumnProperties extends StObject {
  
  /**
    * Required. Column heading.
    */
  var header: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Defines text alignment for all cells in this column.
    */
  var horizontalAlignment: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageColumnProperties {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageColumnProperties]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageColumnProperties](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
