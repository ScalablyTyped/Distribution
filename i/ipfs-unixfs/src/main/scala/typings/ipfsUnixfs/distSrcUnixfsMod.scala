package typings.ipfsUnixfs

import typings.ipfsUnixfs.anon.PartialData
import typings.ipfsUnixfs.anon.PartialMetadata
import typings.ipfsUnixfs.anon.PartialUnixTime
import typings.ipfsUnixfs.distSrcUnixfsMod.Data.DataType
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUnixfsMod {
  
  trait Data extends StObject {
    
    var Data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var Type: js.UndefOr[DataType] = js.undefined
    
    var blocksizes: js.Array[js.BigInt]
    
    var fanout: js.UndefOr[js.BigInt] = js.undefined
    
    var filesize: js.UndefOr[js.BigInt] = js.undefined
    
    var hashType: js.UndefOr[js.BigInt] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[UnixTime] = js.undefined
  }
  object Data {
    
    inline def apply(blocksizes: js.Array[js.BigInt]): Data = {
      val __obj = js.Dynamic.literal(blocksizes = blocksizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @JSImport("ipfs-unixfs/dist/src/unixfs", "Data")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait DataType extends StObject
    @JSImport("ipfs-unixfs/dist/src/unixfs", "Data.DataType")
    @js.native
    object DataType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[DataType & String] = js.native
      
      @js.native
      sealed trait Directory
        extends StObject
           with DataType
      /* "Directory" */ val Directory: typings.ipfsUnixfs.distSrcUnixfsMod.Data.DataType.Directory & String = js.native
      
      @js.native
      sealed trait File
        extends StObject
           with DataType
      /* "File" */ val File: typings.ipfsUnixfs.distSrcUnixfsMod.Data.DataType.File & String = js.native
      
      @js.native
      sealed trait HAMTShard
        extends StObject
           with DataType
      /* "HAMTShard" */ val HAMTShard: typings.ipfsUnixfs.distSrcUnixfsMod.Data.DataType.HAMTShard & String = js.native
      
      @js.native
      sealed trait Metadata
        extends StObject
           with DataType
      /* "Metadata" */ val Metadata: typings.ipfsUnixfs.distSrcUnixfsMod.Data.DataType.Metadata & String = js.native
      
      @js.native
      sealed trait Raw
        extends StObject
           with DataType
      /* "Raw" */ val Raw: typings.ipfsUnixfs.distSrcUnixfsMod.Data.DataType.Raw & String = js.native
      
      @js.native
      sealed trait Symlink
        extends StObject
           with DataType
      /* "Symlink" */ val Symlink: typings.ipfsUnixfs.distSrcUnixfsMod.Data.DataType.Symlink & String = js.native
      
      def codec(): Codec[DataType] = js.native
    }
    
    inline def codec(): Codec[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Data]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Data]
    inline def decode(buf: Uint8ArrayList): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Data]
    
    inline def encode(obj: PartialData): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setBlocksizes(value: js.Array[js.BigInt]): Self = StObject.set(x, "blocksizes", value.asInstanceOf[js.Any])
      
      inline def setBlocksizesVarargs(value: js.BigInt*): Self = StObject.set(x, "blocksizes", js.Array(value*))
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setFanout(value: js.BigInt): Self = StObject.set(x, "fanout", value.asInstanceOf[js.Any])
      
      inline def setFanoutUndefined: Self = StObject.set(x, "fanout", js.undefined)
      
      inline def setFilesize(value: js.BigInt): Self = StObject.set(x, "filesize", value.asInstanceOf[js.Any])
      
      inline def setFilesizeUndefined: Self = StObject.set(x, "filesize", js.undefined)
      
      inline def setHashType(value: js.BigInt): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      inline def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: UnixTime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setType(value: DataType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  trait Metadata extends StObject {
    
    var MimeType: js.UndefOr[String] = js.undefined
  }
  object Metadata {
    
    inline def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    @JSImport("ipfs-unixfs/dist/src/unixfs", "Metadata")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Metadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Metadata]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Metadata]
    inline def decode(buf: Uint8ArrayList): Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Metadata]
    
    inline def encode(obj: PartialMetadata): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      inline def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "MimeType", js.undefined)
    }
  }
  
  trait UnixTime extends StObject {
    
    var FractionalNanoseconds: js.UndefOr[Double] = js.undefined
    
    var Seconds: js.UndefOr[js.BigInt] = js.undefined
  }
  object UnixTime {
    
    inline def apply(): UnixTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnixTime]
    }
    
    @JSImport("ipfs-unixfs/dist/src/unixfs", "UnixTime")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[UnixTime] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[UnixTime]]
    
    inline def decode(buf: js.typedarray.Uint8Array): UnixTime = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[UnixTime]
    inline def decode(buf: Uint8ArrayList): UnixTime = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[UnixTime]
    
    inline def encode(obj: PartialUnixTime): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnixTime] (val x: Self) extends AnyVal {
      
      inline def setFractionalNanoseconds(value: Double): Self = StObject.set(x, "FractionalNanoseconds", value.asInstanceOf[js.Any])
      
      inline def setFractionalNanosecondsUndefined: Self = StObject.set(x, "FractionalNanoseconds", js.undefined)
      
      inline def setSeconds(value: js.BigInt): Self = StObject.set(x, "Seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "Seconds", js.undefined)
    }
  }
}
