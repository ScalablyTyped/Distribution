package typings.ipldCar

import typings.ipldCar.apiMod.Block
import typings.ipldCar.apiMod.BlockIndex
import typings.ipldCar.ipldCarInts.`1`
import typings.ipldCar.ipldCarInts.`2`
import typings.std.AsyncGenerator
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codingMod {
  
  trait BytesReader extends StObject {
    
    def exactly(length: Double): js.Promise[js.typedarray.Uint8Array]
    
    var pos: Double
    
    def seek(length: Double): Unit
    
    def upTo(length: Double): js.Promise[js.typedarray.Uint8Array]
  }
  object BytesReader {
    
    inline def apply(
      exactly: Double => js.Promise[js.typedarray.Uint8Array],
      pos: Double,
      seek: Double => Unit,
      upTo: Double => js.Promise[js.typedarray.Uint8Array]
    ): BytesReader = {
      val __obj = js.Dynamic.literal(exactly = js.Any.fromFunction1(exactly), pos = pos.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), upTo = js.Any.fromFunction1(upTo))
      __obj.asInstanceOf[BytesReader]
    }
    
    extension [Self <: BytesReader](x: Self) {
      
      inline def setExactly(value: Double => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "exactly", js.Any.fromFunction1(value))
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
      
      inline def setUpTo(value: Double => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "upTo", js.Any.fromFunction1(value))
    }
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
    
    extension [Self <: CarDecoder](x: Self) {
      
      inline def setBlocks(value: () => AsyncGenerator[Block, Any, Any]): Self = StObject.set(x, "blocks", js.Any.fromFunction0(value))
      
      inline def setBlocksIndex(value: () => AsyncGenerator[BlockIndex, Any, Any]): Self = StObject.set(x, "blocksIndex", js.Any.fromFunction0(value))
      
      inline def setHeader(value: () => js.Promise[CarHeader | CarV2Header]): Self = StObject.set(x, "header", js.Any.fromFunction0(value))
    }
  }
  
  trait CarEncoder extends StObject {
    
    def close(): js.Promise[Unit]
    
    def setRoots(
      roots: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
    ): js.Promise[Unit]
    
    def writeBlock(block: Block): js.Promise[Unit]
  }
  object CarEncoder {
    
    inline def apply(
      close: () => js.Promise[Unit],
      setRoots: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ] => js.Promise[Unit],
      writeBlock: Block => js.Promise[Unit]
    ): CarEncoder = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), setRoots = js.Any.fromFunction1(setRoots), writeBlock = js.Any.fromFunction1(writeBlock))
      __obj.asInstanceOf[CarEncoder]
    }
    
    extension [Self <: CarEncoder](x: Self) {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setSetRoots(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
            ] => js.Promise[Unit]
      ): Self = StObject.set(x, "setRoots", js.Any.fromFunction1(value))
      
      inline def setWriteBlock(value: Block => js.Promise[Unit]): Self = StObject.set(x, "writeBlock", js.Any.fromFunction1(value))
    }
  }
  
  trait CarHeader extends StObject {
    
    var roots: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ]
    
    var version: `1`
  }
  object CarHeader {
    
    inline def apply(
      roots: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
    ): CarHeader = {
      val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any], version = 1)
      __obj.asInstanceOf[CarHeader]
    }
    
    extension [Self <: CarHeader](x: Self) {
      
      inline def setRoots(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
            ]
      ): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any)*
      ): Self = StObject.set(x, "roots", js.Array(value*))
      
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
    
    extension [Self <: CarV2FixedHeader](x: Self) {
      
      inline def setCharacteristics(value: js.Tuple2[js.BigInt, js.BigInt]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      inline def setDataOffset(value: Double): Self = StObject.set(x, "dataOffset", value.asInstanceOf[js.Any])
      
      inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
      
      inline def setIndexOffset(value: Double): Self = StObject.set(x, "indexOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait CarV2Header
    extends StObject
       with CarV2FixedHeader {
    
    var roots: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ]
    
    var version: `2`
  }
  object CarV2Header {
    
    inline def apply(
      characteristics: js.Tuple2[js.BigInt, js.BigInt],
      dataOffset: Double,
      dataSize: Double,
      indexOffset: Double,
      roots: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
    ): CarV2Header = {
      val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], indexOffset = indexOffset.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], version = 2)
      __obj.asInstanceOf[CarV2Header]
    }
    
    extension [Self <: CarV2Header](x: Self) {
      
      inline def setRoots(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
            ]
      ): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any)*
      ): Self = StObject.set(x, "roots", js.Array(value*))
      
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
    
    extension [Self <: IteratorChannel[?], T](x: Self & IteratorChannel[T]) {
      
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
    
    extension [Self <: IteratorChannelWriter[?], T](x: Self & IteratorChannelWriter[T]) {
      
      inline def setEnd(value: () => js.Promise[Unit]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setWrite(value: T => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
