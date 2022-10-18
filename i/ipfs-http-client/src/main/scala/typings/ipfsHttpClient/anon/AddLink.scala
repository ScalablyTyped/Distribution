package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddLink extends StObject {
  
  def addLink(
    cid: CID[Any, Double, Double, Version],
    dLink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.PBLink */ Any
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def addLink(
    cid: CID[Any, Double, Double, Version],
    dLink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.PBLink */ Any,
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
  def rmLink(
    cid: CID[Any, Double, Double, Version],
    dLink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.PBLink */ Any
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def rmLink(
    cid: CID[Any, Double, Double, Version],
    dLink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.PBLink */ Any,
    options: AbortOptions & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def setData(cid: CID[Any, Double, Double, Version], data: js.typedarray.Uint8Array): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def setData(
    cid: CID[Any, Double, Double, Version],
    data: js.typedarray.Uint8Array,
    options: AbortOptions & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
}
