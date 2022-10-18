package typings.ktxParse

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distContainerMod {
  
  @JSImport("ktx-parse/dist/container", "KTX2Container")
  @js.native
  open class KTX2Container () extends StObject {
    
    /** Data Format Descriptor. */
    var dataFormatDescriptor: js.Array[KTX2DataFormatDescriptorBasicFormat] = js.native
    
    /**
      * Number of cubemap faces. For cubemaps and cubemap arrays, `faceCount` must be 6. For all
      * other textures, `faceCount` must be 1. Cubemap faces are stored in +X, -X, +Y, -Y, +Z, -Z
      * order.
      */
    var faceCount: Double = js.native
    
    /** Supercompression Global Data. */
    var globalData: KTX2GlobalDataBasisLZ | Null = js.native
    
    /** Key/Value Data. */
    var keyValue: StringDictionary[String | js.typedarray.Uint8Array] = js.native
    
    /** Number of array elements (array textures only). */
    var layerCount: Double = js.native
    
    /** Mip levels, ordered largest (original) to smallest (~1px). */
    var levels: js.Array[KTX2Level] = js.native
    
    /** Depth of the texture image for level 0, in pixels (3D textures only). */
    var pixelDepth: Double = js.native
    
    /** Height of the texture image for level 0, in pixels. */
    var pixelHeight: Double = js.native
    
    /** Width of the texture image for level 0, in pixels. */
    var pixelWidth: Double = js.native
    
    /** Indicates which supercompression scheme has been applied to mip level images, if any. */
    var supercompressionScheme: Double = js.native
    
    /**
      * Size of the data type in bytes used to upload the data to a graphics API. When `vkFormat` is
      * VK_FORMAT_UNDEFINED, `typeSize` must be 1.
      */
    var typeSize: Double = js.native
    
    /**
      * Specifies the image format using Vulkan VkFormat enum values. When using Basis Universal
      * texture formats, `vkFormat` must be VK_FORMAT_UNDEFINED.
      */
    var vkFormat: Double = js.native
  }
  
  trait KTX2BasicFormatSample extends StObject {
    
    var bitLength: Double
    
    var bitOffset: Double
    
    /** @deprecated Renamed to 'channelType'. */
    var channelID: js.UndefOr[Double] = js.undefined
    
    var channelType: Double
    
    var sampleLower: Double
    
    var samplePosition: js.Array[Double]
    
    var sampleUpper: Double
  }
  object KTX2BasicFormatSample {
    
    inline def apply(
      bitLength: Double,
      bitOffset: Double,
      channelType: Double,
      sampleLower: Double,
      samplePosition: js.Array[Double],
      sampleUpper: Double
    ): KTX2BasicFormatSample = {
      val __obj = js.Dynamic.literal(bitLength = bitLength.asInstanceOf[js.Any], bitOffset = bitOffset.asInstanceOf[js.Any], channelType = channelType.asInstanceOf[js.Any], sampleLower = sampleLower.asInstanceOf[js.Any], samplePosition = samplePosition.asInstanceOf[js.Any], sampleUpper = sampleUpper.asInstanceOf[js.Any])
      __obj.asInstanceOf[KTX2BasicFormatSample]
    }
    
    extension [Self <: KTX2BasicFormatSample](x: Self) {
      
      inline def setBitLength(value: Double): Self = StObject.set(x, "bitLength", value.asInstanceOf[js.Any])
      
      inline def setBitOffset(value: Double): Self = StObject.set(x, "bitOffset", value.asInstanceOf[js.Any])
      
      inline def setChannelID(value: Double): Self = StObject.set(x, "channelID", value.asInstanceOf[js.Any])
      
      inline def setChannelIDUndefined: Self = StObject.set(x, "channelID", js.undefined)
      
      inline def setChannelType(value: Double): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
      
      inline def setSampleLower(value: Double): Self = StObject.set(x, "sampleLower", value.asInstanceOf[js.Any])
      
      inline def setSamplePosition(value: js.Array[Double]): Self = StObject.set(x, "samplePosition", value.asInstanceOf[js.Any])
      
      inline def setSamplePositionVarargs(value: Double*): Self = StObject.set(x, "samplePosition", js.Array(value*))
      
      inline def setSampleUpper(value: Double): Self = StObject.set(x, "sampleUpper", value.asInstanceOf[js.Any])
    }
  }
  
  trait KTX2DataFormatDescriptorBasicFormat extends StObject {
    
    var bytesPlane: js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]
    
    var colorModel: Double
    
    var colorPrimaries: Double
    
    /** @deprecated Inferred. */
    var descriptorBlockSize: Double
    
    var descriptorType: Double
    
    var flags: Double
    
    var samples: js.Array[KTX2BasicFormatSample]
    
    var texelBlockDimension: js.Tuple4[Double, Double, Double, Double]
    
    var transferFunction: Double
    
    var vendorId: Double
    
    var versionNumber: Double
  }
  object KTX2DataFormatDescriptorBasicFormat {
    
    inline def apply(
      bytesPlane: js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double],
      colorModel: Double,
      colorPrimaries: Double,
      descriptorBlockSize: Double,
      descriptorType: Double,
      flags: Double,
      samples: js.Array[KTX2BasicFormatSample],
      texelBlockDimension: js.Tuple4[Double, Double, Double, Double],
      transferFunction: Double,
      vendorId: Double,
      versionNumber: Double
    ): KTX2DataFormatDescriptorBasicFormat = {
      val __obj = js.Dynamic.literal(bytesPlane = bytesPlane.asInstanceOf[js.Any], colorModel = colorModel.asInstanceOf[js.Any], colorPrimaries = colorPrimaries.asInstanceOf[js.Any], descriptorBlockSize = descriptorBlockSize.asInstanceOf[js.Any], descriptorType = descriptorType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], texelBlockDimension = texelBlockDimension.asInstanceOf[js.Any], transferFunction = transferFunction.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any], versionNumber = versionNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[KTX2DataFormatDescriptorBasicFormat]
    }
    
    extension [Self <: KTX2DataFormatDescriptorBasicFormat](x: Self) {
      
      inline def setBytesPlane(value: js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]): Self = StObject.set(x, "bytesPlane", value.asInstanceOf[js.Any])
      
      inline def setColorModel(value: Double): Self = StObject.set(x, "colorModel", value.asInstanceOf[js.Any])
      
      inline def setColorPrimaries(value: Double): Self = StObject.set(x, "colorPrimaries", value.asInstanceOf[js.Any])
      
      inline def setDescriptorBlockSize(value: Double): Self = StObject.set(x, "descriptorBlockSize", value.asInstanceOf[js.Any])
      
      inline def setDescriptorType(value: Double): Self = StObject.set(x, "descriptorType", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setSamples(value: js.Array[KTX2BasicFormatSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesVarargs(value: KTX2BasicFormatSample*): Self = StObject.set(x, "samples", js.Array(value*))
      
      inline def setTexelBlockDimension(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "texelBlockDimension", value.asInstanceOf[js.Any])
      
      inline def setTransferFunction(value: Double): Self = StObject.set(x, "transferFunction", value.asInstanceOf[js.Any])
      
      inline def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
      
      inline def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait KTX2GlobalDataBasisLZ extends StObject {
    
    var endpointCount: Double
    
    var endpointsData: js.typedarray.Uint8Array
    
    var extendedData: js.typedarray.Uint8Array
    
    var imageDescs: js.Array[KTX2GlobalDataBasisLZImageDesc]
    
    var selectorCount: Double
    
    var selectorsData: js.typedarray.Uint8Array
    
    var tablesData: js.typedarray.Uint8Array
  }
  object KTX2GlobalDataBasisLZ {
    
    inline def apply(
      endpointCount: Double,
      endpointsData: js.typedarray.Uint8Array,
      extendedData: js.typedarray.Uint8Array,
      imageDescs: js.Array[KTX2GlobalDataBasisLZImageDesc],
      selectorCount: Double,
      selectorsData: js.typedarray.Uint8Array,
      tablesData: js.typedarray.Uint8Array
    ): KTX2GlobalDataBasisLZ = {
      val __obj = js.Dynamic.literal(endpointCount = endpointCount.asInstanceOf[js.Any], endpointsData = endpointsData.asInstanceOf[js.Any], extendedData = extendedData.asInstanceOf[js.Any], imageDescs = imageDescs.asInstanceOf[js.Any], selectorCount = selectorCount.asInstanceOf[js.Any], selectorsData = selectorsData.asInstanceOf[js.Any], tablesData = tablesData.asInstanceOf[js.Any])
      __obj.asInstanceOf[KTX2GlobalDataBasisLZ]
    }
    
    extension [Self <: KTX2GlobalDataBasisLZ](x: Self) {
      
      inline def setEndpointCount(value: Double): Self = StObject.set(x, "endpointCount", value.asInstanceOf[js.Any])
      
      inline def setEndpointsData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "endpointsData", value.asInstanceOf[js.Any])
      
      inline def setExtendedData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "extendedData", value.asInstanceOf[js.Any])
      
      inline def setImageDescs(value: js.Array[KTX2GlobalDataBasisLZImageDesc]): Self = StObject.set(x, "imageDescs", value.asInstanceOf[js.Any])
      
      inline def setImageDescsVarargs(value: KTX2GlobalDataBasisLZImageDesc*): Self = StObject.set(x, "imageDescs", js.Array(value*))
      
      inline def setSelectorCount(value: Double): Self = StObject.set(x, "selectorCount", value.asInstanceOf[js.Any])
      
      inline def setSelectorsData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "selectorsData", value.asInstanceOf[js.Any])
      
      inline def setTablesData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "tablesData", value.asInstanceOf[js.Any])
    }
  }
  
  trait KTX2GlobalDataBasisLZImageDesc extends StObject {
    
    var alphaSliceByteLength: Double
    
    var alphaSliceByteOffset: Double
    
    var imageFlags: Double
    
    var rgbSliceByteLength: Double
    
    var rgbSliceByteOffset: Double
  }
  object KTX2GlobalDataBasisLZImageDesc {
    
    inline def apply(
      alphaSliceByteLength: Double,
      alphaSliceByteOffset: Double,
      imageFlags: Double,
      rgbSliceByteLength: Double,
      rgbSliceByteOffset: Double
    ): KTX2GlobalDataBasisLZImageDesc = {
      val __obj = js.Dynamic.literal(alphaSliceByteLength = alphaSliceByteLength.asInstanceOf[js.Any], alphaSliceByteOffset = alphaSliceByteOffset.asInstanceOf[js.Any], imageFlags = imageFlags.asInstanceOf[js.Any], rgbSliceByteLength = rgbSliceByteLength.asInstanceOf[js.Any], rgbSliceByteOffset = rgbSliceByteOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[KTX2GlobalDataBasisLZImageDesc]
    }
    
    extension [Self <: KTX2GlobalDataBasisLZImageDesc](x: Self) {
      
      inline def setAlphaSliceByteLength(value: Double): Self = StObject.set(x, "alphaSliceByteLength", value.asInstanceOf[js.Any])
      
      inline def setAlphaSliceByteOffset(value: Double): Self = StObject.set(x, "alphaSliceByteOffset", value.asInstanceOf[js.Any])
      
      inline def setImageFlags(value: Double): Self = StObject.set(x, "imageFlags", value.asInstanceOf[js.Any])
      
      inline def setRgbSliceByteLength(value: Double): Self = StObject.set(x, "rgbSliceByteLength", value.asInstanceOf[js.Any])
      
      inline def setRgbSliceByteOffset(value: Double): Self = StObject.set(x, "rgbSliceByteOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait KTX2Level extends StObject {
    
    /** Compressed data of the mip level. */
    var levelData: js.typedarray.Uint8Array
    
    /**
      * Size of the mip level after reflation from supercompression, if applicable. When
      * `supercompressionType` is BASISLZ, `uncompressedByteLength` must be 0. When
      * `supercompressionType` is `NONE`, `uncompressedByteLength` must match the `levelData` byte
      * length.
      *
      * _**NOTICE:** this implies that for formats such as UASTC, `uncompressedByteLength` may
      * indicate size after ZSTD reflation (and of transcoded ASTC data), but does _not_ indicate
      * size of decoded RGBA32 pixels._
      */
    var uncompressedByteLength: Double
  }
  object KTX2Level {
    
    inline def apply(levelData: js.typedarray.Uint8Array, uncompressedByteLength: Double): KTX2Level = {
      val __obj = js.Dynamic.literal(levelData = levelData.asInstanceOf[js.Any], uncompressedByteLength = uncompressedByteLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[KTX2Level]
    }
    
    extension [Self <: KTX2Level](x: Self) {
      
      inline def setLevelData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "levelData", value.asInstanceOf[js.Any])
      
      inline def setUncompressedByteLength(value: Double): Self = StObject.set(x, "uncompressedByteLength", value.asInstanceOf[js.Any])
    }
  }
}
