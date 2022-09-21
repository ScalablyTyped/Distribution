package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndexedKeyRangeInfos extends StObject {
  
  /**
    * A (sparse) mapping from key bucket index to the KeyRangeInfos for that key bucket.
    */
  var keyRangeInfos: js.UndefOr[StringDictionary[SchemaKeyRangeInfos] | Null] = js.undefined
}
object SchemaIndexedKeyRangeInfos {
  
  inline def apply(): SchemaIndexedKeyRangeInfos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexedKeyRangeInfos]
  }
  
  extension [Self <: SchemaIndexedKeyRangeInfos](x: Self) {
    
    inline def setKeyRangeInfos(value: StringDictionary[SchemaKeyRangeInfos]): Self = StObject.set(x, "keyRangeInfos", value.asInstanceOf[js.Any])
    
    inline def setKeyRangeInfosNull: Self = StObject.set(x, "keyRangeInfos", null)
    
    inline def setKeyRangeInfosUndefined: Self = StObject.set(x, "keyRangeInfos", js.undefined)
  }
}
