package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdCode extends StObject {
  
  /**
    * The ad code snippet.
    */
  var adCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind this is, in this case adsensehost#adCode.
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
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
