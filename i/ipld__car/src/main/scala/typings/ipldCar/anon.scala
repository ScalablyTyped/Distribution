package typings.ipldCar

import typings.ipldCar.commonMod.TestBlock
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllBlocks extends StObject {
    
    var allBlocks: js.Array[js.Tuple2[String, js.Array[TestBlock]]]
    
    var allBlocksFlattened: js.Array[TestBlock]
    
    var cborBlocks: js.Array[TestBlock]
    
    var pbBlocks: js.Array[TestBlock]
    
    var rawBlocks: js.Array[TestBlock]
  }
  object AllBlocks {
    
    inline def apply(
      allBlocks: js.Array[js.Tuple2[String, js.Array[TestBlock]]],
      allBlocksFlattened: js.Array[TestBlock],
      cborBlocks: js.Array[TestBlock],
      pbBlocks: js.Array[TestBlock],
      rawBlocks: js.Array[TestBlock]
    ): AllBlocks = {
      val __obj = js.Dynamic.literal(allBlocks = allBlocks.asInstanceOf[js.Any], allBlocksFlattened = allBlocksFlattened.asInstanceOf[js.Any], cborBlocks = cborBlocks.asInstanceOf[js.Any], pbBlocks = pbBlocks.asInstanceOf[js.Any], rawBlocks = rawBlocks.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllBlocks]
    }
    
    extension [Self <: AllBlocks](x: Self) {
      
      inline def setAllBlocks(value: js.Array[js.Tuple2[String, js.Array[TestBlock]]]): Self = StObject.set(x, "allBlocks", value.asInstanceOf[js.Any])
      
      inline def setAllBlocksFlattened(value: js.Array[TestBlock]): Self = StObject.set(x, "allBlocksFlattened", value.asInstanceOf[js.Any])
      
      inline def setAllBlocksFlattenedVarargs(value: TestBlock*): Self = StObject.set(x, "allBlocksFlattened", js.Array(value*))
      
      inline def setAllBlocksVarargs(value: (js.Tuple2[String, js.Array[TestBlock]])*): Self = StObject.set(x, "allBlocks", js.Array(value*))
      
      inline def setCborBlocks(value: js.Array[TestBlock]): Self = StObject.set(x, "cborBlocks", value.asInstanceOf[js.Any])
      
      inline def setCborBlocksVarargs(value: TestBlock*): Self = StObject.set(x, "cborBlocks", js.Array(value*))
      
      inline def setPbBlocks(value: js.Array[TestBlock]): Self = StObject.set(x, "pbBlocks", value.asInstanceOf[js.Any])
      
      inline def setPbBlocksVarargs(value: TestBlock*): Self = StObject.set(x, "pbBlocks", js.Array(value*))
      
      inline def setRawBlocks(value: js.Array[TestBlock]): Self = StObject.set(x, "rawBlocks", value.asInstanceOf[js.Any])
      
      inline def setRawBlocksVarargs(value: TestBlock*): Self = StObject.set(x, "rawBlocks", js.Array(value*))
    }
  }
  
  trait BlockLength extends StObject {
    
    var blockLength: Double
    
    var blockOffset: Double
    
    var cid: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version]
    
    var length: Double
    
    var offset: Double
  }
  object BlockLength {
    
    inline def apply(
      blockLength: Double,
      blockOffset: Double,
      cid: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version],
      length: Double,
      offset: Double
    ): BlockLength = {
      val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockOffset = blockOffset.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockLength]
    }
    
    extension [Self <: BlockLength](x: Self) {
      
      inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
      
      inline def setBlockOffset(value: Double): Self = StObject.set(x, "blockOffset", value.asInstanceOf[js.Any])
      
      inline def setCid(value: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockOffset extends StObject {
    
    var blockLength: Double
    
    var blockOffset: Double
    
    var cid: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version]
    
    var length: Double
    
    var offset: Double
  }
  object BlockOffset {
    
    inline def apply(
      blockLength: Double,
      blockOffset: Double,
      cid: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version],
      length: Double,
      offset: Double
    ): BlockOffset = {
      val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockOffset = blockOffset.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockOffset]
    }
    
    extension [Self <: BlockOffset](x: Self) {
      
      inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
      
      inline def setBlockOffset(value: Double): Self = StObject.set(x, "blockOffset", value.asInstanceOf[js.Any])
      
      inline def setCid(value: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait ByteLength extends StObject {
    
    var byteLength: js.UndefOr[Double] = js.undefined
    
    var byteOffset: js.UndefOr[Double] = js.undefined
    
    var headerSize: js.UndefOr[Double] = js.undefined
    
    var roots: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CID */ Any
        ]
      ] = js.undefined
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
      
      inline def setRoots(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CID */ Any
            ]
      ): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
      
      inline def setRootsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CID */ Any)*
      ): Self = StObject.set(x, "roots", js.Array(value*))
    }
  }
  
  trait Cids extends StObject {
    
    var cids: js.Array[String]
    
    var err: Null
    
    var version: Double
  }
  object Cids {
    
    inline def apply(cids: js.Array[String], err: Null, version: Double): Cids = {
      val __obj = js.Dynamic.literal(cids = cids.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cids]
    }
    
    extension [Self <: Cids](x: Self) {
      
      inline def setCids(value: js.Array[String]): Self = StObject.set(x, "cids", value.asInstanceOf[js.Any])
      
      inline def setCidsVarargs(value: String*): Self = StObject.set(x, "cids", js.Array(value*))
      
      inline def setErr(value: Null): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait CidsErr extends StObject {
    
    var cids: Null
    
    var err: String
    
    var version: Double
  }
  object CidsErr {
    
    inline def apply(cids: Null, err: String, version: Double): CidsErr = {
      val __obj = js.Dynamic.literal(cids = cids.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CidsErr]
    }
    
    extension [Self <: CidsErr](x: Self) {
      
      inline def setCids(value: Null): Self = StObject.set(x, "cids", value.asInstanceOf[js.Any])
      
      inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: Double
    
    def encode(obj: Any): js.typedarray.Uint8Array
  }
  object Code {
    
    inline def apply(code: Double, encode: Any => js.typedarray.Uint8Array): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setEncode(value: Any => js.typedarray.Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait Err extends StObject {
    
    var cids: Null
    
    var err: Null
    
    var version: Double
  }
  object Err {
    
    inline def apply(cids: Null, err: Null, version: Double): Err = {
      val __obj = js.Dynamic.literal(cids = cids.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Err]
    }
    
    extension [Self <: Err](x: Self) {
      
      inline def setCids(value: Null): Self = StObject.set(x, "cids", value.asInstanceOf[js.Any])
      
      inline def setErr(value: Null): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
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
    
    var roots: js.Array[typings.ipldCar.bufferWriterMod.CID]
  }
  object Roots {
    
    inline def apply(roots: js.Array[typings.ipldCar.bufferWriterMod.CID]): Roots = {
      val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any])
      __obj.asInstanceOf[Roots]
    }
    
    extension [Self <: Roots](x: Self) {
      
      inline def setRoots(value: js.Array[typings.ipldCar.bufferWriterMod.CID]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: typings.ipldCar.bufferWriterMod.CID*): Self = StObject.set(x, "roots", js.Array(value*))
    }
  }
  
  /* Inlined @ipld/car.@ipld/car/types/test/common.TestBlock & {  object :any} */
  trait TestBlockobjectany extends StObject {
    
    var bytes: js.typedarray.Uint8Array
    
    var cid: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version]
    
    var `object`: Any
  }
  object TestBlockobjectany {
    
    inline def apply(
      bytes: js.typedarray.Uint8Array,
      cid: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version],
      `object`: Any
    ): TestBlockobjectany = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestBlockobjectany]
    }
    
    extension [Self <: TestBlockobjectany](x: Self) {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCid(value: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  trait Version extends StObject {
    
    var cids: Null
    
    var err: String
    
    var version: Null
  }
  object Version {
    
    inline def apply(cids: Null, err: String, version: Null): Version = {
      val __obj = js.Dynamic.literal(cids = cids.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setCids(value: Null): Self = StObject.set(x, "cids", value.asInstanceOf[js.Any])
      
      inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Null): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
