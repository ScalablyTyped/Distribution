package typings.ipldCar

import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTestVerifyStoreReaderMod {
  
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
  
  type Block = typings.ipldCar.typesApiMod.Block
  
  type BlockIterator = typings.ipldCar.typesApiMod.BlockIterator
  
  type BlockReader = typings.ipldCar.typesApiMod.BlockReader
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
  
  type CIDIterator = typings.ipldCar.typesApiMod.CIDIterator
  
  type RootsReader = typings.ipldCar.typesApiMod.RootsReader
}
