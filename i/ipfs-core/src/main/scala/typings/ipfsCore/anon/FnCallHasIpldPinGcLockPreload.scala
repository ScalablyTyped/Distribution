package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.putMod.PutOptions
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasIpldPinGcLockPreload extends js.Object {
  
  def apply(hasBlockServicePinGcLockPreload: GcLock): js.Function2[
    /* block */ Uint8Array | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any), 
    /* options */ js.UndefOr[PutOptions with AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
  def apply(hasIpldGcLockPreload: GcLockIpldPreload): js.Function2[/* obj */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  def apply(hasIpldPinGcLockPreload: Pin): js.Function2[
    /* dagNode */ js.Any, 
    /* options */ js.UndefOr[typings.ipfsCore.dagPutMod.PutOptions with AbortOptions], 
    js.Promise[^]
  ] = js.native
}
