package typings.lerc

import typings.lerc.anon.InputOffset
import typings.lerc.anon.LocateFile
import typings.lerc.anon.MaxValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lerc/LercDecode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(input: js.typedarray.ArrayBuffer): LercData = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[LercData]
  inline def decode(input: js.typedarray.ArrayBuffer, options: DecodeOptions): LercData = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LercData]
  inline def decode(input: js.typedarray.Uint8Array): LercData = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[LercData]
  inline def decode(input: js.typedarray.Uint8Array, options: DecodeOptions): LercData = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LercData]
  
  inline def getBandCount(input: js.typedarray.ArrayBuffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBandCount")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getBandCount(input: js.typedarray.ArrayBuffer, options: InputOffset): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBandCount")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getBandCount(input: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBandCount")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getBandCount(input: js.typedarray.Uint8Array, options: InputOffset): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBandCount")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getBlobInfo(input: js.typedarray.ArrayBuffer): LercHeaderInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlobInfo")(input.asInstanceOf[js.Any]).asInstanceOf[LercHeaderInfo]
  inline def getBlobInfo(input: js.typedarray.ArrayBuffer, options: InputOffset): LercHeaderInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlobInfo")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LercHeaderInfo]
  inline def getBlobInfo(input: js.typedarray.Uint8Array): LercHeaderInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlobInfo")(input.asInstanceOf[js.Any]).asInstanceOf[LercHeaderInfo]
  inline def getBlobInfo(input: js.typedarray.Uint8Array, options: InputOffset): LercHeaderInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlobInfo")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LercHeaderInfo]
  
  inline def isLoaded(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoaded")().asInstanceOf[Boolean]
  
  inline def load(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[js.Promise[Unit]]
  inline def load(options: LocateFile): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait BandStats extends StObject {
    
    var depthStats: js.UndefOr[MaxValues] = js.undefined
    
    var maxValue: Double
    
    var minValue: Double
  }
  object BandStats {
    
    inline def apply(maxValue: Double, minValue: Double): BandStats = {
      val __obj = js.Dynamic.literal(maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[BandStats]
    }
    
    extension [Self <: BandStats](x: Self) {
      
      inline def setDepthStats(value: MaxValues): Self = StObject.set(x, "depthStats", value.asInstanceOf[js.Any])
      
      inline def setDepthStatsUndefined: Self = StObject.set(x, "depthStats", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecodeOptions extends StObject {
    
    var inputOffset: js.UndefOr[Double] = js.undefined
    
    var noDataValue: js.UndefOr[Double] = js.undefined
    
    var returnInterleaved: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptions {
    
    inline def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    extension [Self <: DecodeOptions](x: Self) {
      
      inline def setInputOffset(value: Double): Self = StObject.set(x, "inputOffset", value.asInstanceOf[js.Any])
      
      inline def setInputOffsetUndefined: Self = StObject.set(x, "inputOffset", js.undefined)
      
      inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
      
      inline def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
      
      inline def setReturnInterleaved(value: Boolean): Self = StObject.set(x, "returnInterleaved", value.asInstanceOf[js.Any])
      
      inline def setReturnInterleavedUndefined: Self = StObject.set(x, "returnInterleaved", js.undefined)
    }
  }
  
  trait LercData extends StObject {
    
    var bandMasks: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
    
    var depthCount: Double
    
    var height: Double
    
    var mask: js.typedarray.Uint8Array
    
    var pixelType: LercPixelType
    
    var pixels: js.Array[PixelTypedArray]
    
    var statistics: js.Array[BandStats]
    
    var width: Double
  }
  object LercData {
    
    inline def apply(
      depthCount: Double,
      height: Double,
      mask: js.typedarray.Uint8Array,
      pixelType: LercPixelType,
      pixels: js.Array[PixelTypedArray],
      statistics: js.Array[BandStats],
      width: Double
    ): LercData = {
      val __obj = js.Dynamic.literal(depthCount = depthCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], pixelType = pixelType.asInstanceOf[js.Any], pixels = pixels.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[LercData]
    }
    
    extension [Self <: LercData](x: Self) {
      
      inline def setBandMasks(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "bandMasks", value.asInstanceOf[js.Any])
      
      inline def setBandMasksUndefined: Self = StObject.set(x, "bandMasks", js.undefined)
      
      inline def setBandMasksVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "bandMasks", js.Array(value*))
      
      inline def setDepthCount(value: Double): Self = StObject.set(x, "depthCount", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMask(value: js.typedarray.Uint8Array): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setPixelType(value: LercPixelType): Self = StObject.set(x, "pixelType", value.asInstanceOf[js.Any])
      
      inline def setPixels(value: js.Array[PixelTypedArray]): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
      
      inline def setPixelsVarargs(value: PixelTypedArray*): Self = StObject.set(x, "pixels", js.Array(value*))
      
      inline def setStatistics(value: js.Array[BandStats]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
      
      inline def setStatisticsVarargs(value: BandStats*): Self = StObject.set(x, "statistics", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait LercHeaderInfo extends StObject {
    
    var bandCount: Double
    
    var bandCountWithNoData: Double
    
    var blobSize: Double
    
    var dataType: Double
    
    var depthCount: Double
    
    var height: Double
    
    var maskCount: Double
    
    var maxValue: Double
    
    var maxZerror: Double
    
    var minValue: Double
    
    var statistics: js.Array[BandStats]
    
    var validPixelCount: Double
    
    var version: Double
    
    var width: Double
  }
  object LercHeaderInfo {
    
    inline def apply(
      bandCount: Double,
      bandCountWithNoData: Double,
      blobSize: Double,
      dataType: Double,
      depthCount: Double,
      height: Double,
      maskCount: Double,
      maxValue: Double,
      maxZerror: Double,
      minValue: Double,
      statistics: js.Array[BandStats],
      validPixelCount: Double,
      version: Double,
      width: Double
    ): LercHeaderInfo = {
      val __obj = js.Dynamic.literal(bandCount = bandCount.asInstanceOf[js.Any], bandCountWithNoData = bandCountWithNoData.asInstanceOf[js.Any], blobSize = blobSize.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], depthCount = depthCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maskCount = maskCount.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], maxZerror = maxZerror.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], validPixelCount = validPixelCount.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[LercHeaderInfo]
    }
    
    extension [Self <: LercHeaderInfo](x: Self) {
      
      inline def setBandCount(value: Double): Self = StObject.set(x, "bandCount", value.asInstanceOf[js.Any])
      
      inline def setBandCountWithNoData(value: Double): Self = StObject.set(x, "bandCountWithNoData", value.asInstanceOf[js.Any])
      
      inline def setBlobSize(value: Double): Self = StObject.set(x, "blobSize", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: Double): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDepthCount(value: Double): Self = StObject.set(x, "depthCount", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaskCount(value: Double): Self = StObject.set(x, "maskCount", value.asInstanceOf[js.Any])
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxZerror(value: Double): Self = StObject.set(x, "maxZerror", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setStatistics(value: js.Array[BandStats]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
      
      inline def setStatisticsVarargs(value: BandStats*): Self = StObject.set(x, "statistics", js.Array(value*))
      
      inline def setValidPixelCount(value: Double): Self = StObject.set(x, "validPixelCount", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lerc.lercStrings.S8
    - typings.lerc.lercStrings.U8
    - typings.lerc.lercStrings.S16
    - typings.lerc.lercStrings.U16
    - typings.lerc.lercStrings.S32
    - typings.lerc.lercStrings.U32
    - typings.lerc.lercStrings.F32
    - typings.lerc.lercStrings.F64
  */
  trait LercPixelType extends StObject
  object LercPixelType {
    
    inline def F32: typings.lerc.lercStrings.F32 = "F32".asInstanceOf[typings.lerc.lercStrings.F32]
    
    inline def F64: typings.lerc.lercStrings.F64 = "F64".asInstanceOf[typings.lerc.lercStrings.F64]
    
    inline def S16: typings.lerc.lercStrings.S16 = "S16".asInstanceOf[typings.lerc.lercStrings.S16]
    
    inline def S32: typings.lerc.lercStrings.S32 = "S32".asInstanceOf[typings.lerc.lercStrings.S32]
    
    inline def S8: typings.lerc.lercStrings.S8 = "S8".asInstanceOf[typings.lerc.lercStrings.S8]
    
    inline def U16: typings.lerc.lercStrings.U16 = "U16".asInstanceOf[typings.lerc.lercStrings.U16]
    
    inline def U32: typings.lerc.lercStrings.U32 = "U32".asInstanceOf[typings.lerc.lercStrings.U32]
    
    inline def U8: typings.lerc.lercStrings.U8 = "U8".asInstanceOf[typings.lerc.lercStrings.U8]
  }
  
  type PixelTypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
}
