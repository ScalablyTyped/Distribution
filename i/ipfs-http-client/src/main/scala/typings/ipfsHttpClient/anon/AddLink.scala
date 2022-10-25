package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.ipldDagPb.distSrcInterfaceMod.PBLink
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddLink extends StObject {
  
  def addLink(cid: CID[Any, Double, Double, Version], dLink: PBLink): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def addLink(
    cid: CID[Any, Double, Double, Version],
    dLink: PBLink,
    options: AbortOptions & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def appendData(cid: CID[Any, Double, Double, Version], data: js.typedarray.Uint8Array): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def appendData(
    cid: CID[Any, Double, Double, Version],
    data: js.typedarray.Uint8Array,
    options: AbortOptions & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def rmLink(cid: CID[Any, Double, Double, Version], dLink: String): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def rmLink(
    cid: CID[Any, Double, Double, Version],
    dLink: String,
    options: AbortOptions & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def rmLink(cid: CID[Any, Double, Double, Version], dLink: PBLink): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def rmLink(
    cid: CID[Any, Double, Double, Version],
    dLink: PBLink,
    options: AbortOptions & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def setData(cid: CID[Any, Double, Double, Version], data: js.typedarray.Uint8Array): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def setData(
    cid: CID[Any, Double, Double, Version],
    data: js.typedarray.Uint8Array,
    options: AbortOptions & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
}
