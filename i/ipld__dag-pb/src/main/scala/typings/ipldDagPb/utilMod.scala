package typings.ipldDagPb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@ipld/dag-pb/types/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLink(
    name: String,
    size: Double,
    cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
  ): PBLink = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[PBLink]
  
  inline def createNode(data: js.typedarray.Uint8Array): PBNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(data.asInstanceOf[js.Any]).asInstanceOf[PBNode]
  inline def createNode(data: js.typedarray.Uint8Array, links: js.Array[typings.ipldDagPb.interfaceMod.PBLink]): PBNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(data.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[PBNode]
  
  inline def prepare(node: Any): PBNode = ^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(node.asInstanceOf[js.Any]).asInstanceOf[PBNode]
  
  inline def validate(node: PBNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type PBLink = typings.ipldDagPb.interfaceMod.PBLink
  
  type PBNode = typings.ipldDagPb.interfaceMod.PBNode
}
