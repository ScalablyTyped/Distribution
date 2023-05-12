package typings.ipfsHttpClient.anon

import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Export extends StObject {
  
  def `export`(root: CID[Any, Double, Double, Version]): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def `export`(
    root: CID[Any, Double, Double, Version],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ExportOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[js.typedarray.Uint8Array] = js.native
  
  def get(cid: CID[Any, Double, Double, Version]): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.GetResult */ Any
  ] = js.native
  def get(
    cid: CID[Any, Double, Double, Version],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.GetOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.GetResult */ Any
  ] = js.native
  
  def `import`(sources: js.Iterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array]): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ImportResult */ Any
  ] = js.native
  def `import`(
    sources: js.Iterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ImportOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ImportResult */ Any
  ] = js.native
  def `import`(sources: AsyncIterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array]): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ImportResult */ Any
  ] = js.native
  def `import`(
    sources: AsyncIterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ImportOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ImportResult */ Any
  ] = js.native
  
  def put(node: Any): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def put(
    node: Any,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.PutOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def resolve(
    ipfsPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ResolveResult */ Any
  ] = js.native
  def resolve(
    ipfsPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ResolveOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ResolveResult */ Any
  ] = js.native
}
