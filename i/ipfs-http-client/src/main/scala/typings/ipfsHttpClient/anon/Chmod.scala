package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
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
    from: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
    ],
    to: String
  ): js.Promise[Unit] = js.native
  def cp(
    from: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
    ],
    to: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.CpOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def cp(
    from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    to: String
  ): js.Promise[Unit] = js.native
  def cp(
    from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    to: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.CpOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def flush(ipfsPath: String): js.Promise[CID[Any, Double, Double, Version]] = js.native
  def flush(ipfsPath: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[CID[Any, Double, Double, Version]] = js.native
  
  def ls(
    ipfsPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MFSEntry */ Any
  ] = js.native
  def ls(
    ipfsPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    options: AbortOptions & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MFSEntry */ Any
  ] = js.native
  
  def mkdir(path: String): js.Promise[Unit] = js.native
  def mkdir(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MkdirOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def mv(from: String, to: String): js.Promise[Unit] = js.native
  def mv(
    from: String,
    to: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MvOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def mv(from: js.Array[String], to: String): js.Promise[Unit] = js.native
  def mv(
    from: js.Array[String],
    to: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.MvOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def read(
    ipfsPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
  ): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def read(
    ipfsPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ReadOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[js.typedarray.Uint8Array] = js.native
  
  def rm(ipfsPaths: String): js.Promise[Unit] = js.native
  def rm(
    ipfsPaths: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RmOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def rm(ipfsPaths: js.Array[String]): js.Promise[Unit] = js.native
  def rm(
    ipfsPaths: js.Array[String],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RmOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def stat(
    ipfsPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
  def stat(
    ipfsPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.IPFSPath */ Any,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StatResult */ Any
  ] = js.native
  
  def touch(ipfsPath: String): js.Promise[Unit] = js.native
  def touch(
    ipfsPath: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.TouchOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def write(ipfsPath: String, content: String): js.Promise[Unit] = js.native
  def write(
    ipfsPath: String,
    content: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def write(ipfsPath: String, content: js.Iterable[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
  def write(
    ipfsPath: String,
    content: js.Iterable[js.typedarray.Uint8Array],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def write(ipfsPath: String, content: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  def write(
    ipfsPath: String,
    content: js.typedarray.Uint8Array,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def write(ipfsPath: String, content: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
  def write(
    ipfsPath: String,
    content: AsyncIterable[js.typedarray.Uint8Array],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  def write(ipfsPath: String, content: Blob): js.Promise[Unit] = js.native
  def write(
    ipfsPath: String,
    content: Blob,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.WriteOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
}
