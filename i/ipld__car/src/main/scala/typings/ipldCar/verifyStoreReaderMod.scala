package typings.ipldCar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verifyStoreReaderMod {
  
  @JSImport("@ipld/car/types/test/verify-store-reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyBlocks(iterator: BlockIterator, unordered: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBlocks")(iterator.asInstanceOf[js.Any], unordered.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyBlocks(iterator: BlockIterator, unordered: Unit): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBlocks")(iterator.asInstanceOf[js.Any], unordered.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyCids(iterator: CIDIterator, unordered: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyCids")(iterator.asInstanceOf[js.Any], unordered.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyCids(iterator: CIDIterator, unordered: Unit): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyCids")(iterator.asInstanceOf[js.Any], unordered.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyGet(reader: BlockReader): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyGet")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyHas(reader: BlockReader): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyHas")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyRoots(reader: RootsReader): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyRoots")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type Block = typings.ipldCar.apiMod.Block
  
  type BlockIterator = typings.ipldCar.apiMod.BlockIterator
  
  type BlockReader = typings.ipldCar.apiMod.BlockReader
  
  type CID = typings.multiformats.mod.CID
  
  type CIDIterator = typings.ipldCar.apiMod.CIDIterator
  
  type RootsReader = typings.ipldCar.apiMod.RootsReader
}
