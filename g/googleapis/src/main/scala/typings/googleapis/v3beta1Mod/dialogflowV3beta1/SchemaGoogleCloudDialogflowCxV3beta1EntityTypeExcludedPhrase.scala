package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhrase extends StObject {
  
  /**
    * Required. The word or phrase to be excluded.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhrase {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhrase]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhrase](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
