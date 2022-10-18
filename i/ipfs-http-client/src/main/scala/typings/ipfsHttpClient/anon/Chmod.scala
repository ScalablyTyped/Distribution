package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chmod extends StObject {
  
  def chmod(path: String, mode: String): js.Promise[Unit] = js.native
  def chmod(
    path: String,
    mode: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ChmodOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def chmod(path: String, mode: Double): js.Promise[Unit] = js.native
  def chmod(
    path: String,
    mode: Double,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ChmodOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def cp(
    sources: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
    ],
    destination: String
  ): js.Promise[Unit] = js.native
  def cp(
    sources: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
    ],
    destination: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.CpOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def cp(
    sources: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    destination: String
  ): js.Promise[Unit] = js.native
  def cp(
    sources: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    destination: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.CpOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def flush(path: String): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def flush(path: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def ls(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MFSEntry */ Any
  ] = js.native
  def ls(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    options: AbortOptions & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MFSEntry */ Any
  ] = js.native
  
  def mkdir(path: String): js.Promise[Unit] = js.native
  def mkdir(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MkdirOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def mv(sources: String, destination: String): js.Promise[Unit] = js.native
  def mv(
    sources: String,
    destination: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MvOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def mv(sources: js.Array[String], destination: String): js.Promise[Unit] = js.native
  def mv(
    sources: js.Array[String],
    destination: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MvOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def read(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
  ): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def read(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ReadOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[js.typedarray.Uint8Array] = js.native
  
  def rm(path: String): js.Promise[Unit] = js.native
  def rm(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RmOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def rm(path: js.Array[String]): js.Promise[Unit] = js.native
  def rm(
    path: js.Array[String],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RmOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def stat(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
  def stat(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
  
  def touch(path: String): js.Promise[Unit] = js.native
  def touch(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.TouchOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def write(path: String, input: String): js.Promise[Unit] = js.native
  def write(
    path: String,
    input: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def write(path: String, input: js.Iterable[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
  def write(
    path: String,
    input: js.Iterable[js.typedarray.Uint8Array],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def write(path: String, input: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  def write(
    path: String,
    input: js.typedarray.Uint8Array,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def write(path: String, input: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
  def write(
    path: String,
    input: AsyncIterable[js.typedarray.Uint8Array],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def write(path: String, input: Blob): js.Promise[Unit] = js.native
  def write(
    path: String,
    input: Blob,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
}
