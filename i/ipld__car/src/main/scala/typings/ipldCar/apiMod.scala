package typings.ipldCar

import typings.ipldCar.anon.Resize
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  trait Block extends StObject {
    
    var bytes: js.typedarray.Uint8Array
    
    var cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
  }
  object Block {
    
    inline def apply(
      bytes: js.typedarray.Uint8Array,
      cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    ): Block = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    extension [Self <: Block](x: Self) {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCid(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockHeader extends StObject {
    
    var blockLength: Double
    
    var cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    
    var length: Double
  }
  object BlockHeader {
    
    inline def apply(
      blockLength: Double,
      cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
      length: Double
    ): BlockHeader = {
      val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockHeader]
    }
    
    extension [Self <: BlockHeader](x: Self) {
      
      inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
      
      inline def setCid(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockIndex
    extends StObject
       with BlockHeader {
    
    var blockOffset: Double
    
    var offset: Double
  }
  object BlockIndex {
    
    inline def apply(
      blockLength: Double,
      blockOffset: Double,
      cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
      length: Double,
      offset: Double
    ): BlockIndex = {
      val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockOffset = blockOffset.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockIndex]
    }
    
    extension [Self <: BlockIndex](x: Self) {
      
      inline def setBlockOffset(value: Double): Self = StObject.set(x, "blockOffset", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type BlockIterator = AsyncIterable[Block]
  
  trait BlockReader extends StObject {
    
    def blocks(): BlockIterator
    
    def cids(): CIDIterator
    
    def get(
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    ): js.Promise[js.UndefOr[Block]]
    
    def has(
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    ): js.Promise[Boolean]
  }
  object BlockReader {
    
    inline def apply(
      blocks: () => BlockIterator,
      cids: () => CIDIterator,
      get: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any => js.Promise[js.UndefOr[Block]],
      has: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any => js.Promise[Boolean]
    ): BlockReader = {
      val __obj = js.Dynamic.literal(blocks = js.Any.fromFunction0(blocks), cids = js.Any.fromFunction0(cids), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[BlockReader]
    }
    
    extension [Self <: BlockReader](x: Self) {
      
      inline def setBlocks(value: () => BlockIterator): Self = StObject.set(x, "blocks", js.Any.fromFunction0(value))
      
      inline def setCids(value: () => CIDIterator): Self = StObject.set(x, "cids", js.Any.fromFunction0(value))
      
      inline def setGet(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any => js.Promise[js.UndefOr[Block]]
      ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any => js.Promise[Boolean]
      ): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  trait BlockWriter extends StObject {
    
    def close(): js.Promise[Unit]
    
    def put(block: Block): js.Promise[Unit]
  }
  object BlockWriter {
    
    inline def apply(close: () => js.Promise[Unit], put: Block => js.Promise[Unit]): BlockWriter = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[BlockWriter]
    }
    
    extension [Self <: BlockWriter](x: Self) {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setPut(value: Block => js.Promise[Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  type CIDIterator = AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
  ]
  
  @js.native
  trait CarBufferWriter extends StObject {
    
    def addRoot(
      root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    ): CarBufferWriter = js.native
    def addRoot(
      root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
      options: Resize
    ): CarBufferWriter = js.native
    
    def close(): js.typedarray.Uint8Array = js.native
    def close(options: Resize): js.typedarray.Uint8Array = js.native
    
    def write(block: Block): CarBufferWriter = js.native
  }
  
  trait CarBufferWriterOptions extends StObject {
    
    var byteLength: js.UndefOr[Double] = js.undefined
    
    var byteOffset: js.UndefOr[Double] = js.undefined
    
    var headerSize: js.UndefOr[Double] = js.undefined
    
    var roots: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
      ] = js.undefined
  }
  object CarBufferWriterOptions {
    
    inline def apply(): CarBufferWriterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarBufferWriterOptions]
    }
    
    extension [Self <: CarBufferWriterOptions](x: Self) {
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      inline def setByteLengthUndefined: Self = StObject.set(x, "byteLength", js.undefined)
      
      inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
      
      inline def setByteOffsetUndefined: Self = StObject.set(x, "byteOffset", js.undefined)
      
      inline def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setHeaderSizeUndefined: Self = StObject.set(x, "headerSize", js.undefined)
      
      inline def setRoots(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
            ]
      ): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
      
      inline def setRootsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any)*
      ): Self = StObject.set(x, "roots", js.Array(value*))
    }
  }
  
  trait CarReader
    extends StObject
       with BlockReader
       with RootsReader
  object CarReader {
    
    inline def apply(
      blocks: () => BlockIterator,
      cids: () => CIDIterator,
      get: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any => js.Promise[js.UndefOr[Block]],
      getRoots: () => js.Promise[
          js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
          ]
        ],
      has: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any => js.Promise[Boolean],
      version: Double
    ): CarReader = {
      val __obj = js.Dynamic.literal(blocks = js.Any.fromFunction0(blocks), cids = js.Any.fromFunction0(cids), get = js.Any.fromFunction1(get), getRoots = js.Any.fromFunction0(getRoots), has = js.Any.fromFunction1(has), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarReader]
    }
  }
  
  trait RootsReader extends StObject {
    
    def getRoots(): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
      ]
    
    var version: Double
  }
  object RootsReader {
    
    inline def apply(
      getRoots: () => js.Promise[
          js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
          ]
        ],
      version: Double
    ): RootsReader = {
      val __obj = js.Dynamic.literal(getRoots = js.Any.fromFunction0(getRoots), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootsReader]
    }
    
    extension [Self <: RootsReader](x: Self) {
      
      inline def setGetRoots(
        value: () => js.Promise[
              js.Array[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
              ]
            ]
      ): Self = StObject.set(x, "getRoots", js.Any.fromFunction0(value))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait WriterChannel extends StObject {
    
    var out: AsyncIterable[js.typedarray.Uint8Array]
    
    var writer: BlockWriter
  }
  object WriterChannel {
    
    inline def apply(out: AsyncIterable[js.typedarray.Uint8Array], writer: BlockWriter): WriterChannel = {
      val __obj = js.Dynamic.literal(out = out.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriterChannel]
    }
    
    extension [Self <: WriterChannel](x: Self) {
      
      inline def setOut(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setWriter(value: BlockWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    }
  }
}
