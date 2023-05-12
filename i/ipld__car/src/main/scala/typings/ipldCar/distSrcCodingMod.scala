package typings.ipldCar

import typings.ipldCar.distSrcApiMod.Block
import typings.ipldCar.distSrcApiMod.BlockIndex
import typings.ipldCar.ipldCarInts.`1`
import typings.ipldCar.ipldCarInts.`2`
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncGenerator
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCodingMod {
  
  @js.native
  trait BytesBufferReader
    extends StObject
       with Seekable {
    
    def exactly(length: Double): js.typedarray.Uint8Array = js.native
    def exactly(length: Double, seek: Boolean): js.typedarray.Uint8Array = js.native
    
    var pos: Double = js.native
    
    def upTo(length: Double): js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  trait BytesReader
    extends StObject
       with Seekable {
    
    def exactly(length: Double): js.Promise[js.typedarray.Uint8Array] = js.native
    def exactly(length: Double, seek: Boolean): js.Promise[js.typedarray.Uint8Array] = js.native
    
    var pos: Double = js.native
    
    def upTo(length: Double): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  trait CarDecoder extends StObject {
    
    def blocks(): AsyncGenerator[Block, Any, Any]
    
    def blocksIndex(): AsyncGenerator[BlockIndex, Any, Any]
    
    def header(): js.Promise[CarHeader | CarV2Header]
  }
  object CarDecoder {
    
    inline def apply(
      blocks: () => AsyncGenerator[Block, Any, Any],
      blocksIndex: () => AsyncGenerator[BlockIndex, Any, Any],
      header: () => js.Promise[CarHeader | CarV2Header]
    ): CarDecoder = {
      val __obj = js.Dynamic.literal(blocks = js.Any.fromFunction0(blocks), blocksIndex = js.Any.fromFunction0(blocksIndex), header = js.Any.fromFunction0(header))
      __obj.asInstanceOf[CarDecoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarDecoder] (val x: Self) extends AnyVal {
      
      inline def setBlocks(value: () => AsyncGenerator[Block, Any, Any]): Self = StObject.set(x, "blocks", js.Any.fromFunction0(value))
      
      inline def setBlocksIndex(value: () => AsyncGenerator[BlockIndex, Any, Any]): Self = StObject.set(x, "blocksIndex", js.Any.fromFunction0(value))
      
      inline def setHeader(value: () => js.Promise[CarHeader | CarV2Header]): Self = StObject.set(x, "header", js.Any.fromFunction0(value))
    }
  }
  
  trait CarEncoder extends StObject {
    
    def close(): js.Promise[Unit]
    
    def setRoots(roots: js.Array[CID[Any, Double, Double, Version]]): js.Promise[Unit]
    
    def writeBlock(block: Block): js.Promise[Unit]
  }
  object CarEncoder {
    
    inline def apply(
      close: () => js.Promise[Unit],
      setRoots: js.Array[CID[Any, Double, Double, Version]] => js.Promise[Unit],
      writeBlock: Block => js.Promise[Unit]
    ): CarEncoder = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), setRoots = js.Any.fromFunction1(setRoots), writeBlock = js.Any.fromFunction1(writeBlock))
      __obj.asInstanceOf[CarEncoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarEncoder] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setSetRoots(value: js.Array[CID[Any, Double, Double, Version]] => js.Promise[Unit]): Self = StObject.set(x, "setRoots", js.Any.fromFunction1(value))
      
      inline def setWriteBlock(value: Block => js.Promise[Unit]): Self = StObject.set(x, "writeBlock", js.Any.fromFunction1(value))
    }
  }
  
  trait CarHeader extends StObject {
    
    var roots: js.Array[CID[Any, Double, Double, Version]]
    
    var version: `1`
  }
  object CarHeader {
    
    inline def apply(roots: js.Array[CID[Any, Double, Double, Version]]): CarHeader = {
      val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any], version = 1)
      __obj.asInstanceOf[CarHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarHeader] (val x: Self) extends AnyVal {
      
      inline def setRoots(value: js.Array[CID[Any, Double, Double, Version]]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: (CID[Any, Double, Double, Version])*): Self = StObject.set(x, "roots", js.Array(value*))
      
      inline def setVersion(value: `1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait CarV2FixedHeader extends StObject {
    
    var characteristics: js.Tuple2[js.BigInt, js.BigInt]
    
    var dataOffset: Double
    
    var dataSize: Double
    
    var indexOffset: Double
  }
  object CarV2FixedHeader {
    
    inline def apply(
      characteristics: js.Tuple2[js.BigInt, js.BigInt],
      dataOffset: Double,
      dataSize: Double,
      indexOffset: Double
    ): CarV2FixedHeader = {
      val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], indexOffset = indexOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarV2FixedHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarV2FixedHeader] (val x: Self) extends AnyVal {
      
      inline def setCharacteristics(value: js.Tuple2[js.BigInt, js.BigInt]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      inline def setDataOffset(value: Double): Self = StObject.set(x, "dataOffset", value.asInstanceOf[js.Any])
      
      inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
      
      inline def setIndexOffset(value: Double): Self = StObject.set(x, "indexOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait CarV2Header
    extends StObject
       with CarV2FixedHeader {
    
    var roots: js.Array[CID[Any, Double, Double, Version]]
    
    var version: `2`
  }
  object CarV2Header {
    
    inline def apply(
      characteristics: js.Tuple2[js.BigInt, js.BigInt],
      dataOffset: Double,
      dataSize: Double,
      indexOffset: Double,
      roots: js.Array[CID[Any, Double, Double, Version]]
    ): CarV2Header = {
      val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], indexOffset = indexOffset.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], version = 2)
      __obj.asInstanceOf[CarV2Header]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarV2Header] (val x: Self) extends AnyVal {
      
      inline def setRoots(value: js.Array[CID[Any, Double, Double, Version]]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: (CID[Any, Double, Double, Version])*): Self = StObject.set(x, "roots", js.Array(value*))
      
      inline def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait IteratorChannel[T] extends StObject {
    
    var iterator: AsyncIterator[T, Any, Unit]
    
    var writer: IteratorChannelWriter[T]
  }
  object IteratorChannel {
    
    inline def apply[T](iterator: AsyncIterator[T, Any, Unit], writer: IteratorChannelWriter[T]): IteratorChannel[T] = {
      val __obj = js.Dynamic.literal(iterator = iterator.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
      __obj.asInstanceOf[IteratorChannel[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IteratorChannel[?], T] (val x: Self & IteratorChannel[T]) extends AnyVal {
      
      inline def setIterator(value: AsyncIterator[T, Any, Unit]): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
      
      inline def setWriter(value: IteratorChannelWriter[T]): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    }
  }
  
  trait IteratorChannelWriter[T] extends StObject {
    
    def end(): js.Promise[Unit]
    
    def write(chunk: T): js.Promise[Unit]
  }
  object IteratorChannelWriter {
    
    inline def apply[T](end: () => js.Promise[Unit], write: T => js.Promise[Unit]): IteratorChannelWriter[T] = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[IteratorChannelWriter[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IteratorChannelWriter[?], T] (val x: Self & IteratorChannelWriter[T]) extends AnyVal {
      
      inline def setEnd(value: () => js.Promise[Unit]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setWrite(value: T => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait Seekable extends StObject {
    
    def seek(length: Double): Unit
  }
  object Seekable {
    
    inline def apply(seek: Double => Unit): Seekable = {
      val __obj = js.Dynamic.literal(seek = js.Any.fromFunction1(seek))
      __obj.asInstanceOf[Seekable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Seekable] (val x: Self) extends AnyVal {
      
      inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    }
  }
}
