package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdCode extends StObject {
  
  /**
    * The Auto ad code snippet. The ad code snippet.
    */
  var adCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The AMP Auto ad code snippet that goes in the body of an AMP page.
    */
  var ampBody: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The AMP Auto ad code snippet that goes in the head of an AMP page.
    */
  var ampHead: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind this is, in this case adsense#adCode.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdCode {
  
  inline def apply(): SchemaAdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdCode]
  }
  
  extension [Self <: SchemaAdCode](x: Self) {
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setAdCodeNull: Self = StObject.set(x, "adCode", null)
    
    inline def setAdCodeUndefined: Self = StObject.set(x, "adCode", js.undefined)
    
    inline def setAmpBody(value: String): Self = StObject.set(x, "ampBody", value.asInstanceOf[js.Any])
    
    inline def setAmpBodyNull: Self = StObject.set(x, "ampBody", null)
    
    inline def setAmpBodyUndefined: Self = StObject.set(x, "ampBody", js.undefined)
    
    inline def setAmpHead(value: String): Self = StObject.set(x, "ampHead", value.asInstanceOf[js.Any])
    
    inline def setAmpHeadNull: Self = StObject.set(x, "ampHead", null)
    
    inline def setAmpHeadUndefined: Self = StObject.set(x, "ampHead", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
