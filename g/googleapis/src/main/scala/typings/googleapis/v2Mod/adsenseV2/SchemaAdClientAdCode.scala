package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdClientAdCode extends StObject {
  
  /**
    * Output only. The AdSense code snippet to add to the head of an HTML page.
    */
  var adCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The AdSense code snippet to add to the body of an AMP page.
    */
  var ampBody: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The AdSense code snippet to add to the head of an AMP page.
    */
  var ampHead: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdClientAdCode {
  
  inline def apply(): SchemaAdClientAdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdClientAdCode]
  }
  
  extension [Self <: SchemaAdClientAdCode](x: Self) {
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setAdCodeNull: Self = StObject.set(x, "adCode", null)
    
    inline def setAdCodeUndefined: Self = StObject.set(x, "adCode", js.undefined)
    
    inline def setAmpBody(value: String): Self = StObject.set(x, "ampBody", value.asInstanceOf[js.Any])
    
    inline def setAmpBodyNull: Self = StObject.set(x, "ampBody", null)
    
    inline def setAmpBodyUndefined: Self = StObject.set(x, "ampBody", js.undefined)
    
    inline def setAmpHead(value: String): Self = StObject.set(x, "ampHead", value.asInstanceOf[js.Any])
    
    inline def setAmpHeadNull: Self = StObject.set(x, "ampHead", null)
    
    inline def setAmpHeadUndefined: Self = StObject.set(x, "ampHead", js.undefined)
  }
}
