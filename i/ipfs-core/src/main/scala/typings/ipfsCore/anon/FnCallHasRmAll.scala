package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.filesRmMod.RmOptions
import typings.ipfsCore.pinRmMod.CID
import typings.ipfsCore.pinRmMod.RmSettings
import typings.ipfsCore.rmMod.RmFailure
import typings.ipfsCore.rmMod.RmSucceess
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasRmAll extends js.Object {
  
  def apply(context: js.Any): js.Function1[
    /* args */ (js.Tuple2[String, js.UndefOr[RmOptions]]) | (js.Tuple3[String, String, js.UndefOr[RmOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[RmOptions]]), 
    js.Promise[Unit]
  ] = js.native
  def apply(hasBlockServiceGcLockPinManager: PinManager): js.Function2[
    /* cids */ ^  | js.Array[^], 
    /* options */ js.UndefOr[typings.ipfsCore.rmMod.RmOptions with AbortOptions], 
    AsyncIterable[RmSucceess | RmFailure]
  ] = js.native
  def apply(hasKeychain: Keychain): js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
  def apply(hasRmAll: RmAllReturnType): js.Function2[
    /* path */ String | CID, 
    /* options */ js.UndefOr[RmSettings with AbortOptions], 
    js.Promise[CID]
  ] = js.native
}
