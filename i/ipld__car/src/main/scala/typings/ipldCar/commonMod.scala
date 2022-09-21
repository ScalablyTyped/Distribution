package typings.ipldCar

import typings.ipldCar.anon.AllBlocks
import typings.ipldCar.anon.BlockLength
import typings.ipldCar.anon.BlockOffset
import typings.ipldCar.anon.Code
import typings.ipldCar.anon.TestBlockobjectany
import typings.multiformats.mod.CID
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@ipld/car/types/test/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ipld/car/types/test/common", "assert")
  @js.native
  val assert: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chai.AssertStatic */ Any = js.native
  
  @JSImport("@ipld/car/types/test/common", "carBytes")
  @js.native
  val carBytes: js.typedarray.Uint8Array = js.native
  
  @JSImport("@ipld/car/types/test/common", "goCarBytes")
  @js.native
  val goCarBytes: js.typedarray.Uint8Array = js.native
  
  @JSImport("@ipld/car/types/test/common", "goCarIndex")
  @js.native
  val goCarIndex: js.Array[BlockLength] = js.native
  
  @JSImport("@ipld/car/types/test/common", "goCarRoots")
  @js.native
  val goCarRoots: js.Array[CID] = js.native
  
  @JSImport("@ipld/car/types/test/common", "goCarV2Bytes")
  @js.native
  val goCarV2Bytes: js.typedarray.Uint8Array = js.native
  
  @JSImport("@ipld/car/types/test/common", "goCarV2Index")
  @js.native
  val goCarV2Index: js.Array[BlockOffset] = js.native
  
  @JSImport("@ipld/car/types/test/common", "goCarV2Roots")
  @js.native
  val goCarV2Roots: js.Array[CID] = js.native
  
  inline def makeData(): js.Promise[AllBlocks] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeData")().asInstanceOf[js.Promise[AllBlocks]]
  
  inline def makeIterable(data: js.typedarray.Uint8Array, chunkSize: Double): AsyncIterable[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeIterable")(data.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  
  @JSImport("@ipld/car/types/test/common", "rndCid")
  @js.native
  val rndCid: CID = js.native
  
  inline def toBlock(`object`: Any, codec: Code): js.Promise[TestBlockobjectany] = (^.asInstanceOf[js.Dynamic].applyDynamic("toBlock")(`object`.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestBlockobjectany]]
  inline def toBlock(
    `object`: Any,
    codec: Code,
    version: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CIDVersion */ Any
  ): js.Promise[TestBlockobjectany] = (^.asInstanceOf[js.Dynamic].applyDynamic("toBlock")(`object`.asInstanceOf[js.Any], codec.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestBlockobjectany]]
  
  type Block = typings.ipldCar.apiMod.Block
  
  type PBNode = typings.ipldDagPb.mod.PBNode
  
  /**
    * @typedef {import('../api').Block} Block
    * @typedef {import('@ipld/dag-pb').PBNode} PBNode
    */
  /**
    * @extends {Block}
    */
  trait TestBlock extends StObject {
    
    var bytes: js.typedarray.Uint8Array
    
    var cid: CID
    
    var `object`: Any
  }
  object TestBlock {
    
    inline def apply(bytes: js.typedarray.Uint8Array, cid: CID, `object`: Any): TestBlock = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestBlock]
    }
    
    extension [Self <: TestBlock](x: Self) {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCid(value: CID): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
}
