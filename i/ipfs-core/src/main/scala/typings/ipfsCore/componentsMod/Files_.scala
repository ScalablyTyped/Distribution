package typings.ipfsCore.componentsMod

import typings.ipfsCore.blockStatMod.Stat
import typings.ipfsCore.blockStatMod.StatOptions
import typings.ipfsCore.chmodMod.ChmodOptions
import typings.ipfsCore.cpMod.CpOptions
import typings.ipfsCore.lsMod.UnixFSEntry
import typings.ipfsCore.mkdirMod.MkdirOptions
import typings.ipfsCore.mvMod.MvOptions
import typings.ipfsCore.pinRmMod.RmOptions
import typings.ipfsCore.readMod.ReadOptions
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.touchMod.TouchOptions
import typings.ipfsCore.writeMod.WriteOptions
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Files_ extends js.Object {
  
  def chmod(path: String, mode: String): js.Promise[Unit] = js.native
  def chmod(path: String, mode: String, options: ChmodOptions with AbortOptions): js.Promise[Unit] = js.native
  def chmod(path: String, mode: Double): js.Promise[Unit] = js.native
  def chmod(path: String, mode: Double, options: ChmodOptions with AbortOptions): js.Promise[Unit] = js.native
  
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple2[String | typings.cids.mod.^ , js.UndefOr[CpOptions]]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple3[String | typings.cids.mod.^ , String | typings.cids.mod.^ , js.UndefOr[CpOptions]]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple4[
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple5[
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple6[
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple7[
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple8[
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple9[
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      String | typings.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  
  def flush(path: String): js.Promise[typings.cids.mod.^] = js.native
  def flush(path: String, options: AbortOptions): js.Promise[typings.cids.mod.^] = js.native
  
  def ls(path: String): AsyncIterable[UnixFSEntry] = js.native
  def ls(path: String, options: AbortOptions): AsyncIterable[UnixFSEntry] = js.native
  
  def mkdir(path: String): js.Promise[Unit] = js.native
  def mkdir(path: String, options: MkdirOptions with AbortOptions): js.Promise[Unit] = js.native
  
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple10[String, String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple3[String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple4[String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple5[String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple6[String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple7[String, String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  
  def read(path: String): AsyncIterable[Uint8Array] = js.native
  def read(path: String, options: ReadOptions with AbortOptions): AsyncIterable[Uint8Array] = js.native
  def read(path: typings.cids.mod.^): AsyncIterable[Uint8Array] = js.native
  def read(path: typings.cids.mod.^, options: ReadOptions with AbortOptions): AsyncIterable[Uint8Array] = js.native
  
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple2[String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple3[String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple4[String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple5[String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple6[String, String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple7[String, String, String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  
  def stat(path: String): js.Promise[Stat] = js.native
  def stat(path: String, options: StatOptions with AbortOptions): js.Promise[Stat] = js.native
  
  def touch(path: String): js.Promise[Unit] = js.native
  def touch(path: String, options: TouchOptions with AbortOptions): js.Promise[Unit] = js.native
  
  def write(path: String, content: String): js.Promise[Unit] = js.native
  def write(path: String, content: String, options: WriteOptions with AbortOptions): js.Promise[Unit] = js.native
  def write(path: String, content: AsyncIterable[Uint8Array]): js.Promise[Unit] = js.native
  def write(path: String, content: AsyncIterable[Uint8Array], options: WriteOptions with AbortOptions): js.Promise[Unit] = js.native
  def write(path: String, content: Blob): js.Promise[Unit] = js.native
  def write(path: String, content: Blob, options: WriteOptions with AbortOptions): js.Promise[Unit] = js.native
  def write(path: String, content: Uint8Array): js.Promise[Unit] = js.native
  def write(path: String, content: Uint8Array, options: WriteOptions with AbortOptions): js.Promise[Unit] = js.native
}
