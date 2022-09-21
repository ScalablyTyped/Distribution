package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeywordAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. The keyword, for example `car insurance`. Positive keyword cannot be offensive word. Must be UTF-8 encoded with a maximum size of 255 bytes. Maximum number of characters is 80. Maximum number of words is 10.
    */
  var keyword: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if this option is being negatively targeted.
    */
  var negative: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaKeywordAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaKeywordAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeywordAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaKeywordAssignedTargetingOptionDetails](x: Self) {
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordNull: Self = StObject.set(x, "keyword", null)
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeNull: Self = StObject.set(x, "negative", null)
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
  }
}
