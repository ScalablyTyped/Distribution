package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.distSrcUtilsMod.AwaitIterable
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAll extends StObject {
  
  def add(path: String): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def add(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def add(path: CID[Any, Double, Double, Version]): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def add(
    path: CID[Any, Double, Double, Version],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def addAll(
    source: AwaitIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddInput */ Any
    ]
  ): AsyncIterable[CID[Any, Double, Double, Version]] = js.native
  def addAll(
    source: AwaitIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddInput */ Any
    ],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddAllOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[CID[Any, Double, Double, Version]] = js.native
  
  def ls(): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.LsResult */ Any
  ] = js.native
  def ls(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.LsOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.LsResult */ Any
  ] = js.native
  
  var remote: Rm = js.native
  
  def rm(path: String): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def rm(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RmOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def rm(path: CID[Any, Double, Double, Version]): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def rm(
    path: CID[Any, Double, Double, Version],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RmOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def rmAll(
    source: AwaitIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RmAllInput */ Any
    ]
  ): AsyncIterable[CID[Any, Double, Double, Version]] = js.native
  def rmAll(
    source: AwaitIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RmAllInput */ Any
    ],
    options: AbortOptions & HTTPClientExtraOptions
  ): AsyncIterable[CID[Any, Double, Double, Version]] = js.native
}
