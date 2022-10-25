package typings.ipldCar

import typings.multiformats.distTypesSrcCidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
    
    extension [Self <: ByteLength](x: Self) {
      
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
    
    extension [Self <: Resize](x: Self) {
      
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
    
    extension [Self <: Roots](x: Self) {
      
      inline def setRoots(value: js.Array[typings.ipldCar.distSrcBufferWriterMod.CID]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: typings.ipldCar.distSrcBufferWriterMod.CID*): Self = StObject.set(x, "roots", js.Array(value*))
    }
  }
}
