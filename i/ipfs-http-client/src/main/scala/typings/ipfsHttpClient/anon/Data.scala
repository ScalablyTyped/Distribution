package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.ipldDagPb.distSrcInterfaceMod.PBLink
import typings.ipldDagPb.distSrcInterfaceMod.PBNode
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  def data(cid: CID[Any, Double, Double, Version]): js.Promise[js.typedarray.Uint8Array] = js.native
  def data(
    cid: CID[Any, Double, Double, Version],
    options: AbortOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.PreloadOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  
  def get(cid: CID[Any, Double, Double, Version]): js.Promise[PBNode] = js.native
  def get(
    cid: CID[Any, Double, Double, Version],
    options: AbortOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.PreloadOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[PBNode] = js.native
  
  def links(cid: CID[Any, Double, Double, Version]): js.Promise[js.Array[PBLink]] = js.native
  def links(
    cid: CID[Any, Double, Double, Version],
    options: AbortOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.PreloadOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[js.Array[PBLink]] = js.native
  
  def `new`(): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def `new`(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.NewObjectOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  var patch: AddLink = js.native
  
  def put(obj: PBNode): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def put(
    obj: PBNode,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PutOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def stat(cid: CID[Any, Double, Double, Version]): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
  def stat(
    cid: CID[Any, Double, Double, Version],
    options: AbortOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.PreloadOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
}
