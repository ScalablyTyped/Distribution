package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyRangeInfos extends StObject {
  
  /**
    * The list individual KeyRangeInfos.
    */
  var infos: js.UndefOr[js.Array[SchemaKeyRangeInfo]] = js.undefined
  
  /**
    * The total size of the list of all KeyRangeInfos. This may be larger than the number of repeated messages above. If that is the case, this number may be used to determine how many are not being shown.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaKeyRangeInfos {
  
  inline def apply(): SchemaKeyRangeInfos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyRangeInfos]
  }
  
  extension [Self <: SchemaKeyRangeInfos](x: Self) {
    
    inline def setInfos(value: js.Array[SchemaKeyRangeInfo]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    inline def setInfosUndefined: Self = StObject.set(x, "infos", js.undefined)
    
    inline def setInfosVarargs(value: SchemaKeyRangeInfo*): Self = StObject.set(x, "infos", js.Array(value*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
