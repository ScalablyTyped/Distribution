package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Keychain
import typings.ipfsCore.anon.Now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "key")
@js.native
object key extends js.Object {
  
  @JSName("_export")
  def export(hasKeychain: Keychain): js.Function3[
    /* name */ js.UndefOr[js.Any], 
    /* password */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    _
  ] = js.native
  
  def gen(hasKeychain: Keychain): js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
  
  @JSName("_import")
  def `import`(hasKeychain: Keychain): js.Function4[
    /* name */ js.UndefOr[js.Any], 
    /* pem */ js.UndefOr[js.Any], 
    /* password */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    _
  ] = js.native
  
  def info(hasKeychain: Keychain): js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
  
  @JSName("list_1")
  def list1(hasKeychain: Keychain): js.Function1[/* options */ js.UndefOr[js.Any], _] = js.native
  
  def rename(hasKeychain: Keychain): js.Function3[
    /* oldName */ js.UndefOr[js.Any], 
    /* newName */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[Now]
  ] = js.native
  
  @JSName("rm_2")
  def rm2(hasKeychain: Keychain): js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
}
