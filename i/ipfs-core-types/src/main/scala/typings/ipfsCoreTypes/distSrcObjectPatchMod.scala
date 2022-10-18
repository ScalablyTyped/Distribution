package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipldDagPb.mod.PBLink
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectPatchMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    def addLink(cid: CID[Any, Double, Double, Version], link: PBLink): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def addLink(cid: CID[Any, Double, Double, Version], link: PBLink, options: AbortOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    def appendData(cid: CID[Any, Double, Double, Version], data: js.typedarray.Uint8Array): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def appendData(
      cid: CID[Any, Double, Double, Version],
      data: js.typedarray.Uint8Array,
      options: AbortOptions & OptionExtension
    ): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    def rmLink(cid: CID[Any, Double, Double, Version], link: String): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def rmLink(cid: CID[Any, Double, Double, Version], link: String, options: AbortOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def rmLink(cid: CID[Any, Double, Double, Version], link: PBLink): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def rmLink(cid: CID[Any, Double, Double, Version], link: PBLink, options: AbortOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    def setData(cid: CID[Any, Double, Double, Version], data: js.typedarray.Uint8Array): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def setData(
      cid: CID[Any, Double, Double, Version],
      data: js.typedarray.Uint8Array,
      options: AbortOptions & OptionExtension
    ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  }
}
