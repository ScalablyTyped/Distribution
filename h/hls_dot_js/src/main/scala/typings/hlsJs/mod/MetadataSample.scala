package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataSample extends StObject {
  
  var data: js.typedarray.Uint8Array
  
  var dts: Double
  
  var len: js.UndefOr[Double] = js.undefined
  
  var pts: Double
  
  var `type`: MetadataSchema
}
object MetadataSample {
  
  inline def apply(data: js.typedarray.Uint8Array, dts: Double, pts: Double, `type`: MetadataSchema): MetadataSample = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dts = dts.asInstanceOf[js.Any], pts = pts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataSample]
  }
  
  extension [Self <: MetadataSample](x: Self) {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDts(value: Double): Self = StObject.set(x, "dts", value.asInstanceOf[js.Any])
    
    inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    inline def setPts(value: Double): Self = StObject.set(x, "pts", value.asInstanceOf[js.Any])
    
    inline def setType(value: MetadataSchema): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
