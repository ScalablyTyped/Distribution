package typings.ipldDagPb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbDecodeMod {
  
  @JSImport("@ipld/dag-pb/types/src/pb-decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeNode(bytes: js.typedarray.Uint8Array): RawPBNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeNode")(bytes.asInstanceOf[js.Any]).asInstanceOf[RawPBNode]
  
  type RawPBLink = typings.ipldDagPb.interfaceMod.RawPBLink
  
  type RawPBNode = typings.ipldDagPb.interfaceMod.RawPBNode
}
