package typings.ipfsUnixfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-unixfs", "UnixFS")
  @js.native
  open class UnixFS () extends StObject {
    def this(options: UnixFSOptions) = this()
    
    /* private */ var _mode: Any = js.native
    
    /* private */ var _originalMode: Any = js.native
    
    def addBlockSize(size: js.BigInt): Unit = js.native
    
    var blockSizes: js.Array[js.BigInt] = js.native
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    var fanout: js.UndefOr[js.BigInt] = js.native
    
    /**
      * Returns `0n` for directories or `data.length + sum(blockSizes)` for everything else
      */
    def fileSize(): js.BigInt = js.native
    
    var hashType: js.UndefOr[js.BigInt] = js.native
    
    def isDirectory(): Boolean = js.native
    
    /**
      * encode to protobuf Uint8Array
      */
    def marshal(): js.typedarray.Uint8Array = js.native
    
    def mode: js.UndefOr[Double] = js.native
    def mode_=(mode: js.UndefOr[Double]): Unit = js.native
    
    var mtime: js.UndefOr[Mtime] = js.native
    
    def removeBlockSize(index: Double): Unit = js.native
    
    var `type`: String = js.native
  }
  object UnixFS {
    
    @JSImport("ipfs-unixfs", "UnixFS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decode from protobuf https://github.com/ipfs/specs/blob/master/UNIXFS.md
      */
    /* static member */
    inline def unmarshal(marshaled: js.typedarray.Uint8Array): UnixFS = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshal")(marshaled.asInstanceOf[js.Any]).asInstanceOf[UnixFS]
  }
  
  trait Mtime
    extends StObject
       with _MtimeLike {
    
    var nsecs: js.UndefOr[Double] = js.undefined
    
    var secs: js.BigInt
  }
  object Mtime {
    
    inline def apply(secs: js.BigInt): Mtime = {
      val __obj = js.Dynamic.literal(secs = secs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mtime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mtime] (val x: Self) extends AnyVal {
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setNsecsUndefined: Self = StObject.set(x, "nsecs", js.undefined)
      
      inline def setSecs(value: js.BigInt): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsUnixfs.mod.Mtime
    - typings.ipfsUnixfs.anon.FractionalNanoseconds
    - js.Tuple2[scala.Double, scala.Double]
    - js.Date
  */
  type MtimeLike = _MtimeLike | (js.Tuple2[Double, Double]) | js.Date
  
  trait UnixFSOptions extends StObject {
    
    var blockSizes: js.UndefOr[js.Array[js.BigInt]] = js.undefined
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var fanout: js.UndefOr[js.BigInt] = js.undefined
    
    var hashType: js.UndefOr[js.BigInt] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object UnixFSOptions {
    
    inline def apply(): UnixFSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnixFSOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnixFSOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockSizes(value: js.Array[js.BigInt]): Self = StObject.set(x, "blockSizes", value.asInstanceOf[js.Any])
      
      inline def setBlockSizesUndefined: Self = StObject.set(x, "blockSizes", js.undefined)
      
      inline def setBlockSizesVarargs(value: js.BigInt*): Self = StObject.set(x, "blockSizes", js.Array(value*))
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFanout(value: js.BigInt): Self = StObject.set(x, "fanout", value.asInstanceOf[js.Any])
      
      inline def setFanoutUndefined: Self = StObject.set(x, "fanout", js.undefined)
      
      inline def setHashType(value: js.BigInt): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      inline def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait _MtimeLike extends StObject
  object _MtimeLike {
    
    inline def FractionalNanoseconds(Seconds: Double): typings.ipfsUnixfs.anon.FractionalNanoseconds = {
      val __obj = js.Dynamic.literal(Seconds = Seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsUnixfs.anon.FractionalNanoseconds]
    }
    
    inline def Mtime(secs: js.BigInt): typings.ipfsUnixfs.mod.Mtime = {
      val __obj = js.Dynamic.literal(secs = secs.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsUnixfs.mod.Mtime]
    }
  }
}
