package typings.ipldDagPb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPbDecodeMod {
  
  @JSImport("@ipld/dag-pb/dist/src/pb-decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeNode(bytes: js.typedarray.Uint8Array): RawPBNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeNode")(bytes.asInstanceOf[js.Any]).asInstanceOf[RawPBNode]
  
  type RawPBLink = typings.ipldDagPb.distSrcInterfaceMod.RawPBLink
  
  type RawPBNode = typings.ipldDagPb.distSrcInterfaceMod.RawPBNode
}
