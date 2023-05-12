package typings.ipfsUnixfs

import typings.ipfsUnixfs.distSrcUnixfsMod.Data.DataType
import typings.ipfsUnixfs.distSrcUnixfsMod.UnixTime
import typings.ipfsUnixfs.mod._MtimeLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FractionalNanoseconds
    extends StObject
       with _MtimeLike {
    
    var FractionalNanoseconds: js.UndefOr[Double] = js.undefined
    
    var Seconds: Double
  }
  object FractionalNanoseconds {
    
    inline def apply(Seconds: Double): FractionalNanoseconds = {
      val __obj = js.Dynamic.literal(Seconds = Seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[FractionalNanoseconds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FractionalNanoseconds] (val x: Self) extends AnyVal {
      
      inline def setFractionalNanoseconds(value: Double): Self = StObject.set(x, "FractionalNanoseconds", value.asInstanceOf[js.Any])
      
      inline def setFractionalNanosecondsUndefined: Self = StObject.set(x, "FractionalNanoseconds", js.undefined)
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "Seconds", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<ipfs-unixfs.ipfs-unixfs/dist/src/unixfs.Data> */
  trait PartialData extends StObject {
    
    var Data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var Type: js.UndefOr[DataType] = js.undefined
    
    var blocksizes: js.UndefOr[js.Array[js.BigInt]] = js.undefined
    
    var fanout: js.UndefOr[js.BigInt] = js.undefined
    
    var filesize: js.UndefOr[js.BigInt] = js.undefined
    
    var hashType: js.UndefOr[js.BigInt] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[UnixTime] = js.undefined
  }
  object PartialData {
    
    inline def apply(): PartialData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialData] (val x: Self) extends AnyVal {
      
      inline def setBlocksizes(value: js.Array[js.BigInt]): Self = StObject.set(x, "blocksizes", value.asInstanceOf[js.Any])
      
      inline def setBlocksizesUndefined: Self = StObject.set(x, "blocksizes", js.undefined)
      
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
  
  /* Inlined std.Partial<ipfs-unixfs.ipfs-unixfs/dist/src/unixfs.Metadata> */
  trait PartialMetadata extends StObject {
    
    var MimeType: js.UndefOr[String] = js.undefined
  }
  object PartialMetadata {
    
    inline def apply(): PartialMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMetadata] (val x: Self) extends AnyVal {
      
      inline def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "MimeType", js.undefined)
    }
  }
  
  /* Inlined std.Partial<ipfs-unixfs.ipfs-unixfs/dist/src/unixfs.UnixTime> */
  trait PartialUnixTime extends StObject {
    
    var FractionalNanoseconds: js.UndefOr[Double] = js.undefined
    
    var Seconds: js.UndefOr[js.BigInt] = js.undefined
  }
  object PartialUnixTime {
    
    inline def apply(): PartialUnixTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialUnixTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialUnixTime] (val x: Self) extends AnyVal {
      
      inline def setFractionalNanoseconds(value: Double): Self = StObject.set(x, "FractionalNanoseconds", value.asInstanceOf[js.Any])
      
      inline def setFractionalNanosecondsUndefined: Self = StObject.set(x, "FractionalNanoseconds", js.undefined)
      
      inline def setSeconds(value: js.BigInt): Self = StObject.set(x, "Seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "Seconds", js.undefined)
    }
  }
}
