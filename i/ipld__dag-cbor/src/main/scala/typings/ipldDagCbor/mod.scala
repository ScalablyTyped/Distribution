package typings.ipldDagCbor

import typings.ipldDagCbor.ipldDagCborInts.`113`
import typings.ipldDagCbor.ipldDagCborStrings.`dag-cbor`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ipld/dag-cbor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ipld/dag-cbor", "code")
  @js.native
  val code: `113` = js.native
  
  inline def decode[T](data: typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def encode[T](node: T): typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(node.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView[T]]
  
  @JSImport("@ipld/dag-cbor", "name")
  @js.native
  val name: `dag-cbor` = js.native
  
  type ByteView[T] = typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView[T]
}
