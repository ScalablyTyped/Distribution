package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndexedHotKey extends StObject {
  
  /**
    * A (sparse) mapping from key bucket index to the index of the specific hot row key for that key bucket. The index of the hot row key can be translated to the actual row key via the ScanData.VisualizationData.indexed_keys repeated field.
    */
  var sparseHotKeys: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
}
object SchemaIndexedHotKey {
  
  inline def apply(): SchemaIndexedHotKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexedHotKey]
  }
  
  extension [Self <: SchemaIndexedHotKey](x: Self) {
    
    inline def setSparseHotKeys(value: StringDictionary[Double]): Self = StObject.set(x, "sparseHotKeys", value.asInstanceOf[js.Any])
    
    inline def setSparseHotKeysNull: Self = StObject.set(x, "sparseHotKeys", null)
    
    inline def setSparseHotKeysUndefined: Self = StObject.set(x, "sparseHotKeys", js.undefined)
  }
}
