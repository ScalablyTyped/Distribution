package typings.ipldDagPb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbEncodeMod {
  
  @JSImport("@ipld/dag-pb/types/src/pb-encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeNode(node: RawPBNode): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  type RawPBLink = typings.ipldDagPb.interfaceMod.RawPBLink
  
  type RawPBNode = typings.ipldDagPb.interfaceMod.RawPBNode
}
