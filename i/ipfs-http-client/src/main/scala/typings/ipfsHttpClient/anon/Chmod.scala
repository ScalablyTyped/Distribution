package typings.ipfsHttpClient.anon

import typings.cids.mod.^
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chmod extends StObject {
  
  def chmod(path: String, mode: String): js.Promise[Unit] = js.native
  def chmod(
    path: String,
    mode: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_chmod.ChmodOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
  def chmod(path: String, mode: Double): js.Promise[Unit] = js.native
  def chmod(
    path: String,
    mode: Double,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_chmod.ChmodOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
  
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [a1: string | cids, options: ipfs-core/src/components/files/cp.CpOptions & HttpOptions | undefined | undefined] | [a1: string | cids, a2: string | cids, options: ipfs-core/src/components/files/cp.CpOptions & HttpOptions | undefined | undefined] | [a1: string | cids, a2: string | cids, a3: string | cids, options: ipfs-core/src/components/files/cp.CpOptions & HttpOptions | undefined | undefined] is not an array type */ args: js.Tuple2[
      /* a1 */ String | ^, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cp.CpOptions */ js.Any) & HttpOptions
      ]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [a1: string | cids, options: ipfs-core/src/components/files/cp.CpOptions & HttpOptions | undefined | undefined] | [a1: string | cids, a2: string | cids, options: ipfs-core/src/components/files/cp.CpOptions & HttpOptions | undefined | undefined] | [a1: string | cids, a2: string | cids, a3: string | cids, options: ipfs-core/src/components/files/cp.CpOptions & HttpOptions | undefined | undefined] is not an array type */ args: js.Tuple3[
      /* a1 */ String | ^, 
      /* a2 */ String | ^, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cp.CpOptions */ js.Any) & HttpOptions
      ]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [a1: string | cids, options: ipfs-core/src/components/files/cp.CpOptions & HttpOptions | undefined | undefined] | [a1: string | cids, a2: string | cids, options: ipfs-core/src/components/files/cp.CpOptions & HttpOptions | undefined | undefined] | [a1: string | cids, a2: string | cids, a3: string | cids, options: ipfs-core/src/components/files/cp.CpOptions & HttpOptions | undefined | undefined] is not an array type */ args: js.Tuple4[
      /* a1 */ String | ^, 
      /* a2 */ String | ^, 
      /* a3 */ String | ^, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cp.CpOptions */ js.Any) & HttpOptions
      ]
    ]
  ): js.Promise[Unit] = js.native
  
  def flush(path: String): js.Promise[^] = js.native
  def flush(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[^] = js.native
  
  def ls(path: String): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ls.UnixFSEntry */ js.Any
  ] = js.native
  def ls(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ls.UnixFSEntry */ js.Any
  ] = js.native
  
  def mkdir(path: String): js.Promise[Unit] = js.native
  def mkdir(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_mkdir.MkdirOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
  
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [a1: string, a2: string, options: ipfs-core/src/components/files/mv.MvOptions & HttpOptions | undefined | undefined] | [a1: string, a2: string, a3: string, options: ipfs-core/src/components/files/mv.MvOptions & HttpOptions | undefined | undefined] is not an array type */ args: js.Tuple3[
      /* a1 */ String, 
      /* a2 */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_mv.MvOptions */ js.Any) & HttpOptions
      ]
    ]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [a1: string, a2: string, options: ipfs-core/src/components/files/mv.MvOptions & HttpOptions | undefined | undefined] | [a1: string, a2: string, a3: string, options: ipfs-core/src/components/files/mv.MvOptions & HttpOptions | undefined | undefined] is not an array type */ args: js.Tuple4[
      /* a1 */ String, 
      /* a2 */ String, 
      /* a3 */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_mv.MvOptions */ js.Any) & HttpOptions
      ]
    ]
  ): js.Promise[Unit] = js.native
  
  def read(path: String): AsyncIterable[Uint8Array] = js.native
  def read(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_read.ReadOptions */ js.Any) & HttpOptions
  ): AsyncIterable[Uint8Array] = js.native
  def read(path: ^): AsyncIterable[Uint8Array] = js.native
  def read(
    path: ^,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_read.ReadOptions */ js.Any) & HttpOptions
  ): AsyncIterable[Uint8Array] = js.native
  
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [a1: string, options: ipfs-core/src/components/files/rm.RmOptions & HttpOptions | undefined | undefined] | [a1: string, a2: string, options: ipfs-core/src/components/files/rm.RmOptions & HttpOptions | undefined | undefined] | [a1: string, a2: string, a3: string, options: ipfs-core/src/components/files/rm.RmOptions & HttpOptions | undefined | undefined] is not an array type */ args: js.Tuple2[
      /* a1 */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_rm.RmOptions */ js.Any) & HttpOptions
      ]
    ]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [a1: string, options: ipfs-core/src/components/files/rm.RmOptions & HttpOptions | undefined | undefined] | [a1: string, a2: string, options: ipfs-core/src/components/files/rm.RmOptions & HttpOptions | undefined | undefined] | [a1: string, a2: string, a3: string, options: ipfs-core/src/components/files/rm.RmOptions & HttpOptions | undefined | undefined] is not an array type */ args: js.Tuple3[
      /* a1 */ String, 
      /* a2 */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_rm.RmOptions */ js.Any) & HttpOptions
      ]
    ]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [a1: string, options: ipfs-core/src/components/files/rm.RmOptions & HttpOptions | undefined | undefined] | [a1: string, a2: string, options: ipfs-core/src/components/files/rm.RmOptions & HttpOptions | undefined | undefined] | [a1: string, a2: string, a3: string, options: ipfs-core/src/components/files/rm.RmOptions & HttpOptions | undefined | undefined] is not an array type */ args: js.Tuple4[
      /* a1 */ String, 
      /* a2 */ String, 
      /* a3 */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_rm.RmOptions */ js.Any) & HttpOptions
      ]
    ]
  ): js.Promise[Unit] = js.native
  
  def stat(path: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.Stat */ js.Any
  ] = js.native
  def stat(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.StatOptions */ js.Any) & HttpOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_stat.Stat */ js.Any
  ] = js.native
  
  def touch(path: String): js.Promise[Unit] = js.native
  def touch(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_touch.TouchOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
  
  def write(path: String, input: String): js.Promise[Unit] = js.native
  def write(
    path: String,
    input: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_write.WriteOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
  def write(path: String, input: AsyncIterable[Uint8Array]): js.Promise[Unit] = js.native
  def write(
    path: String,
    input: AsyncIterable[Uint8Array],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_write.WriteOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
  def write(path: String, input: Blob): js.Promise[Unit] = js.native
  def write(
    path: String,
    input: Blob,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_write.WriteOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
  def write(path: String, input: Uint8Array): js.Promise[Unit] = js.native
  def write(
    path: String,
    input: Uint8Array,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_write.WriteOptions */ js.Any) & HttpOptions
  ): js.Promise[Unit] = js.native
}
