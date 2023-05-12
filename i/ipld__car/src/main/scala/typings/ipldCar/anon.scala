package typings.ipldCar

import typings.ipldCar.distSrcBufferDecoderMod.Block
import typings.ipldCar.distSrcBufferDecoderMod.CarHeader
import typings.ipldCar.distSrcBufferDecoderMod.CarV2Header
import typings.multiformats.distTypesSrcCidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Blocks extends StObject {
    
    var blocks: js.Array[Block]
    
    var header: CarHeader | CarV2Header
  }
  object Blocks {
    
    inline def apply(blocks: js.Array[Block], header: CarHeader | CarV2Header): Blocks = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blocks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blocks] (val x: Self) extends AnyVal {
      
      inline def setBlocks(value: js.Array[Block]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: Block*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setHeader(value: CarHeader | CarV2Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait ByteLength extends StObject {
    
    var byteLength: js.UndefOr[Double] = js.undefined
    
    var byteOffset: js.UndefOr[Double] = js.undefined
    
    var headerSize: js.UndefOr[Double] = js.undefined
    
    var roots: js.UndefOr[js.Array[CID[Any, Double, Double, Version]]] = js.undefined
  }
  object ByteLength {
    
    inline def apply(): ByteLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByteLength]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ByteLength] (val x: Self) extends AnyVal {
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      inline def setByteLengthUndefined: Self = StObject.set(x, "byteLength", js.undefined)
      
      inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
      
      inline def setByteOffsetUndefined: Self = StObject.set(x, "byteOffset", js.undefined)
      
      inline def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setHeaderSizeUndefined: Self = StObject.set(x, "headerSize", js.undefined)
      
      inline def setRoots(value: js.Array[CID[Any, Double, Double, Version]]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
      
      inline def setRootsVarargs(value: (CID[Any, Double, Double, Version])*): Self = StObject.set(x, "roots", js.Array(value*))
    }
  }
  
  trait Resize extends StObject {
    
    var resize: js.UndefOr[Boolean] = js.undefined
  }
  object Resize {
    
    inline def apply(): Resize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Resize] (val x: Self) extends AnyVal {
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    }
  }
  
  trait Roots extends StObject {
    
    var roots: js.Array[typings.ipldCar.distSrcBufferWriterMod.CID]
  }
  object Roots {
    
    inline def apply(roots: js.Array[typings.ipldCar.distSrcBufferWriterMod.CID]): Roots = {
      val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any])
      __obj.asInstanceOf[Roots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Roots] (val x: Self) extends AnyVal {
      
      inline def setRoots(value: js.Array[typings.ipldCar.distSrcBufferWriterMod.CID]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: typings.ipldCar.distSrcBufferWriterMod.CID*): Self = StObject.set(x, "roots", js.Array(value*))
    }
  }
}
