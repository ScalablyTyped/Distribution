package typings.ipfsCore.putMod

import typings.ipfsCore.anon.GcLock
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/block/put", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBlockServicePinGcLockPreload: GcLock): js.Function2[
    /* block */ Uint8Array | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any), 
    /* options */ js.UndefOr[PutOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
}
