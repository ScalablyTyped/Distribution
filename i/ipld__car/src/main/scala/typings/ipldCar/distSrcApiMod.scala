package typings.ipldCar

import typings.ipldCar.anon.Resize
import typings.ipldCar.ipldCarInts.`0`
import typings.ipldCar.ipldCarInts.`112`
import typings.ipldCar.ipldCarInts.`18`
import typings.ipldCar.ipldCarInts.`1`
import typings.multiformats.anon.Codec
import typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseDecoder
import typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashDigest
import typings.multiformats.distTypesSrcLinkInterfaceMod.Link
import typings.multiformats.distTypesSrcLinkInterfaceMod.ToString
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiMod {
  
  @JSImport("@ipld/car/dist/src/api", "CID")
  @js.native
  open class CID[Data /* <: Any */, Format /* <: Double */, Alg /* <: Double */, Version /* <: typings.multiformats.distTypesSrcLinkInterfaceMod.Version */] protected ()
    extends typings.multiformats.cidMod.CID[Data, Format, Alg, Version] {
    /**
      * @param {Version} version - Version of the CID
      * @param {Format} code - Code of the codec content is encoded in, see https://github.com/multiformats/multicodec/blob/master/table.csv
      * @param {API.MultihashDigest<Alg>} multihash - (Multi)hash of the of the content.
      * @param {Uint8Array} bytes
      *
      */
    def this(version: Version, code: Format, multihash: MultihashDigest[Alg], bytes: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object CID {
    
    @JSImport("@ipld/car/dist/src/api", "CID")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes any input `value` and returns a `CID` instance if it was
      * a `CID` otherwise returns `null`. If `value` is instanceof `CID`
      * it will return value back. If `value` is not instance of this CID
      * class, but is compatible CID it will return new instance of this
      * `CID` class. Otherwise returs null.
      *
      * This allows two different incompatible versions of CID library to
      * co-exist and interop as long as binary interface is compatible.
      *
      * @template {unknown} Data
      * @template {number} Format
      * @template {number} Alg
      * @template {API.Version} Version
      * @template {unknown} U
      * @param {API.Link<Data, Format, Alg, Version>|U} input
      * @returns {CID<Data, Format, Alg, Version>|null}
      */
    inline def asCID[Data_2 /* <: Any */, Format_2 /* <: Double */, Alg_2 /* <: Double */, Version_2 /* <: Version */, U /* <: Any */](input: U): (typings.multiformats.distTypesSrcCidMod.CID[Data_2, Format_2, Alg_2, Version_2]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asCID")(input.asInstanceOf[js.Any]).asInstanceOf[(typings.multiformats.distTypesSrcCidMod.CID[Data_2, Format_2, Alg_2, Version_2]) | Null]
    inline def asCID[Data_2 /* <: Any */, Format_2 /* <: Double */, Alg_2 /* <: Double */, Version_2 /* <: Version */, U /* <: Any */](input: Link[Data_2, Format_2, Alg_2, Version_2]): (typings.multiformats.distTypesSrcCidMod.CID[Data_2, Format_2, Alg_2, Version_2]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asCID")(input.asInstanceOf[js.Any]).asInstanceOf[(typings.multiformats.distTypesSrcCidMod.CID[Data_2, Format_2, Alg_2, Version_2]) | Null]
    
    /**
      *
      * @template {unknown} Data
      * @template {number} Format
      * @template {number} Alg
      * @template {API.Version} Version
      * @param {Version} version - Version of the CID
      * @param {Format} code - Code of the codec content is encoded in, see https://github.com/multiformats/multicodec/blob/master/table.csv
      * @param {API.MultihashDigest<Alg>} digest - (Multi)hash of the of the content.
      * @returns {CID<Data, Format, Alg, Version>}
      */
    inline def create[Data_3 /* <: Any */, Format_3 /* <: Double */, Alg_3 /* <: Double */, Version_3 /* <: Version */](version: Version_3, code: Format_3, digest: MultihashDigest[Alg_3]): typings.multiformats.distTypesSrcCidMod.CID[Data_3, Format_3, Alg_3, Version_3] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(version.asInstanceOf[js.Any], code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typings.multiformats.distTypesSrcCidMod.CID[Data_3, Format_3, Alg_3, Version_3]]
    
    /**
      * Simplified version of `create` for CIDv0.
      *
      * @template {unknown} [T=unknown]
      * @param {API.MultihashDigest<typeof SHA_256_CODE>} digest - Multihash.
      * @returns {CID<T, typeof DAG_PB_CODE, typeof SHA_256_CODE, 0>}
      */
    inline def createV0_18[T /* <: Any */](digest: MultihashDigest[`18`]): typings.multiformats.distTypesSrcCidMod.CID[T, `112`, `18`, `0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("createV0")(digest.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.distTypesSrcCidMod.CID[T, `112`, `18`, `0`]]
    
    /**
      * Simplified version of `create` for CIDv1.
      *
      * @template {unknown} Data
      * @template {number} Code
      * @template {number} Alg
      * @param {Code} code - Content encoding format code.
      * @param {API.MultihashDigest<Alg>} digest - Miltihash of the content.
      * @returns {CID<Data, Code, Alg, 1>}
      */
    inline def createV1[Data_4 /* <: Any */, Code /* <: Double */, Alg_4 /* <: Double */](code: Code, digest: MultihashDigest[Alg_4]): typings.multiformats.distTypesSrcCidMod.CID[Data_4, Code, Alg_4, `1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("createV1")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typings.multiformats.distTypesSrcCidMod.CID[Data_4, Code, Alg_4, `1`]]
    
    /**
      * Decoded a CID from its binary representation. The byte array must contain
      * only the CID with no additional bytes.
      *
      * An error will be thrown if the bytes provided do not contain a valid
      * binary representation of a CID.
      *
      * @template {unknown} Data
      * @template {number} Code
      * @template {number} Alg
      * @template {API.Version} Ver
      * @param {API.ByteView<API.Link<Data, Code, Alg, Ver>>} bytes
      * @returns {CID<Data, Code, Alg, Ver>}
      */
    inline def decode[Data_5 /* <: Any */, Code_1 /* <: Double */, Alg_5 /* <: Double */, Ver /* <: Version */](bytes: ByteView[Link[Data_5, Code_1, Alg_5, Ver]]): typings.multiformats.distTypesSrcCidMod.CID[Data_5, Code_1, Alg_5, Ver] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.distTypesSrcCidMod.CID[Data_5, Code_1, Alg_5, Ver]]
    
    /**
      * Decoded a CID from its binary representation at the beginning of a byte
      * array.
      *
      * Returns an array with the first element containing the CID and the second
      * element containing the remainder of the original byte array. The remainder
      * will be a zero-length byte array if the provided bytes only contained a
      * binary CID representation.
      *
      * @template {unknown} T
      * @template {number} C
      * @template {number} A
      * @template {API.Version} V
      * @param {API.ByteView<API.Link<T, C, A, V>>} bytes
      * @returns {[CID<T, C, A, V>, Uint8Array]}
      */
    inline def decodeFirst[T_1 /* <: Any */, C /* <: Double */, A /* <: Double */, V /* <: Version */](bytes: ByteView[Link[T_1, C, A, V]]): js.Tuple2[
        typings.multiformats.distTypesSrcCidMod.CID[T_1, C, A, V], 
        js.typedarray.Uint8Array
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
        typings.multiformats.distTypesSrcCidMod.CID[T_1, C, A, V], 
        js.typedarray.Uint8Array
      ]]
    
    /**
      * @template {unknown} Data
      * @template {number} Format
      * @template {number} Alg
      * @template {API.Version} Version
      * @param {API.Link<Data, Format, Alg, Version>} self
      * @param {unknown} other
      * @returns {other is CID}
      */
    inline def equals[Data_1 /* <: Any */, Format_1 /* <: Double */, Alg_1 /* <: Double */, Version_1 /* <: Version */](self: Link[Data_1, Format_1, Alg_1, Version_1], other: Any): /* is multiformats.multiformats/dist/types/src/cid.CID<any, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(self.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[/* is multiformats.multiformats/dist/types/src/cid.CID<any, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean]
    
    /**
      * Inspect the initial bytes of a CID to determine its properties.
      *
      * Involves decoding up to 4 varints. Typically this will require only 4 to 6
      * bytes but for larger multicodec code values and larger multihash digest
      * lengths these varints can be quite large. It is recommended that at least
      * 10 bytes be made available in the `initialBytes` argument for a complete
      * inspection.
      *
      * @template {unknown} T
      * @template {number} C
      * @template {number} A
      * @template {API.Version} V
      * @param {API.ByteView<API.Link<T, C, A, V>>} initialBytes
      * @returns {{ version:V, codec:C, multihashCode:A, digestSize:number, multihashSize:number, size:number }}
      */
    inline def inspectBytes[T_2 /* <: Any */, C_1 /* <: Double */, A_1 /* <: Double */, V_1 /* <: Version */](initialBytes: ByteView[Link[T_2, C_1, A_1, V_1]]): Codec[V_1, C_1, A_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectBytes")(initialBytes.asInstanceOf[js.Any]).asInstanceOf[Codec[V_1, C_1, A_1]]
    
    /**
      * Takes cid in a string representation and creates an instance. If `base`
      * decoder is not provided will use a default from the configuration. It will
      * throw an error if encoding of the CID is not compatible with supplied (or
      * a default decoder).
      *
      * @template {string} Prefix
      * @template {unknown} Data
      * @template {number} Code
      * @template {number} Alg
      * @template {API.Version} Ver
      * @param {API.ToString<API.Link<Data, Code, Alg, Ver>, Prefix>} source
      * @param {API.MultibaseDecoder<Prefix>} [base]
      * @returns {CID<Data, Code, Alg, Ver>}
      */
    inline def parse[Prefix /* <: String */, Data_6 /* <: Any */, Code_2 /* <: Double */, Alg_6 /* <: Double */, Ver_1 /* <: Version */](source: ToString[Link[Data_6, Code_2, Alg_6, Ver_1], Prefix]): typings.multiformats.distTypesSrcCidMod.CID[Data_6, Code_2, Alg_6, Ver_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.distTypesSrcCidMod.CID[Data_6, Code_2, Alg_6, Ver_1]]
    inline def parse[Prefix /* <: String */, Data_6 /* <: Any */, Code_2 /* <: Double */, Alg_6 /* <: Double */, Ver_1 /* <: Version */](source: ToString[Link[Data_6, Code_2, Alg_6, Ver_1], Prefix], base: MultibaseDecoder[Prefix]): typings.multiformats.distTypesSrcCidMod.CID[Data_6, Code_2, Alg_6, Ver_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.multiformats.distTypesSrcCidMod.CID[Data_6, Code_2, Alg_6, Ver_1]]
  }
  
  trait Block extends StObject {
    
    var bytes: js.typedarray.Uint8Array
    
    var cid: typings.multiformats.cidMod.CID[Any, Double, Double, Version]
  }
  object Block {
    
    inline def apply(
      bytes: js.typedarray.Uint8Array,
      cid: typings.multiformats.cidMod.CID[Any, Double, Double, Version]
    ): Block = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCid(value: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockHeader extends StObject {
    
    var blockLength: Double
    
    var cid: typings.multiformats.cidMod.CID[Any, Double, Double, Version]
    
    var length: Double
  }
  object BlockHeader {
    
    inline def apply(
      blockLength: Double,
      cid: typings.multiformats.cidMod.CID[Any, Double, Double, Version],
      length: Double
    ): BlockHeader = {
      val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockHeader] (val x: Self) extends AnyVal {
      
      inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
      
      inline def setCid(value: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
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
      cid: typings.multiformats.cidMod.CID[Any, Double, Double, Version],
      length: Double,
      offset: Double
    ): BlockIndex = {
      val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockOffset = blockOffset.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockIndex] (val x: Self) extends AnyVal {
      
      inline def setBlockOffset(value: Double): Self = StObject.set(x, "blockOffset", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type BlockIterator = AsyncIterable[Block]
  
  trait BlockReader extends StObject {
    
    def blocks(): BlockIterator
    
    def cids(): CIDIterator
    
    def get(key: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): js.Promise[js.UndefOr[Block]]
    
    def has(key: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): js.Promise[Boolean]
  }
  object BlockReader {
    
    inline def apply(
      blocks: () => BlockIterator,
      cids: () => CIDIterator,
      get: typings.multiformats.cidMod.CID[Any, Double, Double, Version] => js.Promise[js.UndefOr[Block]],
      has: typings.multiformats.cidMod.CID[Any, Double, Double, Version] => js.Promise[Boolean]
    ): BlockReader = {
      val __obj = js.Dynamic.literal(blocks = js.Any.fromFunction0(blocks), cids = js.Any.fromFunction0(cids), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[BlockReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockReader] (val x: Self) extends AnyVal {
      
      inline def setBlocks(value: () => BlockIterator): Self = StObject.set(x, "blocks", js.Any.fromFunction0(value))
      
      inline def setCids(value: () => CIDIterator): Self = StObject.set(x, "cids", js.Any.fromFunction0(value))
      
      inline def setGet(
        value: typings.multiformats.cidMod.CID[Any, Double, Double, Version] => js.Promise[js.UndefOr[Block]]
      ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: typings.multiformats.cidMod.CID[Any, Double, Double, Version] => js.Promise[Boolean]): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockWriter] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setPut(value: Block => js.Promise[Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  type CIDIterator = AsyncIterable[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]
  
  @js.native
  trait CarBufferWriter extends StObject {
    
    def addRoot(root: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): CarBufferWriter = js.native
    def addRoot(root: typings.multiformats.cidMod.CID[Any, Double, Double, Version], options: Resize): CarBufferWriter = js.native
    
    def close(): js.typedarray.Uint8Array = js.native
    def close(options: Resize): js.typedarray.Uint8Array = js.native
    
    def write(block: Block): CarBufferWriter = js.native
  }
  
  trait CarBufferWriterOptions extends StObject {
    
    var byteLength: js.UndefOr[Double] = js.undefined
    
    var byteOffset: js.UndefOr[Double] = js.undefined
    
    var headerSize: js.UndefOr[Double] = js.undefined
    
    var roots: js.UndefOr[js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]] = js.undefined
  }
  object CarBufferWriterOptions {
    
    inline def apply(): CarBufferWriterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarBufferWriterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarBufferWriterOptions] (val x: Self) extends AnyVal {
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      inline def setByteLengthUndefined: Self = StObject.set(x, "byteLength", js.undefined)
      
      inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
      
      inline def setByteOffsetUndefined: Self = StObject.set(x, "byteOffset", js.undefined)
      
      inline def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setHeaderSizeUndefined: Self = StObject.set(x, "headerSize", js.undefined)
      
      inline def setRoots(value: js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
      
      inline def setRootsVarargs(value: (typings.multiformats.cidMod.CID[Any, Double, Double, Version])*): Self = StObject.set(x, "roots", js.Array(value*))
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
      get: typings.multiformats.cidMod.CID[Any, Double, Double, Version] => js.Promise[js.UndefOr[Block]],
      getRoots: () => js.Promise[js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]],
      has: typings.multiformats.cidMod.CID[Any, Double, Double, Version] => js.Promise[Boolean],
      version: Double
    ): CarReader = {
      val __obj = js.Dynamic.literal(blocks = js.Any.fromFunction0(blocks), cids = js.Any.fromFunction0(cids), get = js.Any.fromFunction1(get), getRoots = js.Any.fromFunction0(getRoots), has = js.Any.fromFunction1(has), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarReader]
    }
  }
  
  trait RootsReader extends StObject {
    
    def getRoots(): js.Promise[js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]]
    
    var version: Double
  }
  object RootsReader {
    
    inline def apply(
      getRoots: () => js.Promise[js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]],
      version: Double
    ): RootsReader = {
      val __obj = js.Dynamic.literal(getRoots = js.Any.fromFunction0(getRoots), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootsReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RootsReader] (val x: Self) extends AnyVal {
      
      inline def setGetRoots(value: () => js.Promise[js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]]): Self = StObject.set(x, "getRoots", js.Any.fromFunction0(value))
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriterChannel] (val x: Self) extends AnyVal {
      
      inline def setOut(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setWriter(value: BlockWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    }
  }
}
