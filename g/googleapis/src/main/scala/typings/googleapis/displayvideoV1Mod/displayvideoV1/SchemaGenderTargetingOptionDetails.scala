package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenderTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The gender of an audience.
    */
  var gender: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenderTargetingOptionDetails {
  
  inline def apply(): SchemaGenderTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenderTargetingOptionDetails]
  }
  
  extension [Self <: SchemaGenderTargetingOptionDetails](x: Self) {
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderNull: Self = StObject.set(x, "gender", null)
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
  }
}
