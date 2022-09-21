package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketPart extends StObject {
  
  var parameters: TileLayerParameters
  
  var sortKey: js.UndefOr[Double | scala.Unit] = js.undefined
  
  var symbolInstanceEnd: Double
  
  var symbolInstanceStart: Double
}
object BucketPart {
  
  inline def apply(parameters: TileLayerParameters, symbolInstanceEnd: Double, symbolInstanceStart: Double): BucketPart = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], symbolInstanceEnd = symbolInstanceEnd.asInstanceOf[js.Any], symbolInstanceStart = symbolInstanceStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPart]
  }
  
  extension [Self <: BucketPart](x: Self) {
    
    inline def setParameters(value: TileLayerParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setSortKey(value: Double | scala.Unit): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
    
    inline def setSymbolInstanceEnd(value: Double): Self = StObject.set(x, "symbolInstanceEnd", value.asInstanceOf[js.Any])
    
    inline def setSymbolInstanceStart(value: Double): Self = StObject.set(x, "symbolInstanceStart", value.asInstanceOf[js.Any])
  }
}
