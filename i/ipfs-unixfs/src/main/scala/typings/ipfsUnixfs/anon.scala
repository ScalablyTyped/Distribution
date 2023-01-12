package typings.ipfsUnixfs

import typings.ipfsUnixfs.distSrcTypesMod.MtimeLike
import typings.ipfsUnixfs.distSrcTypesMod._MtimeLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BlockSizes extends StObject {
    
    var blockSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var fanout: js.UndefOr[Double] = js.undefined
    
    var hashType: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String | Double] = js.undefined
    
    var mtime: js.UndefOr[MtimeLike | Null] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BlockSizes {
    
    inline def apply(): BlockSizes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockSizes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockSizes] (val x: Self) extends AnyVal {
      
      inline def setBlockSizes(value: js.Array[Double]): Self = StObject.set(x, "blockSizes", value.asInstanceOf[js.Any])
      
      inline def setBlockSizesUndefined: Self = StObject.set(x, "blockSizes", js.undefined)
      
      inline def setBlockSizesVarargs(value: Double*): Self = StObject.set(x, "blockSizes", js.Array(value*))
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFanout(value: Double): Self = StObject.set(x, "fanout", value.asInstanceOf[js.Any])
      
      inline def setFanoutUndefined: Self = StObject.set(x, "fanout", js.undefined)
      
      inline def setHashType(value: Double): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      inline def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
      
      inline def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: MtimeLike): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeNull: Self = StObject.set(x, "mtime", null)
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
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
}
