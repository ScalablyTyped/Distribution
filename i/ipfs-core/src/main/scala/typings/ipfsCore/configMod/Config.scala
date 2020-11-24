package typings.ipfsCore.configMod

import typings.ipfsCore.anon.PartialIPFSConfig
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  def get(): js.Promise[JSON] = js.native
  def get(key: js.UndefOr[scala.Nothing], options: typings.ipfsCore.srcUtilsMod.AbortOptions): js.Promise[JSON] = js.native
  def get(key: String): js.Promise[JSON] = js.native
  def get(key: String, options: typings.ipfsCore.srcUtilsMod.AbortOptions): js.Promise[JSON] = js.native
  
  def getAll(): js.Promise[IPFSConfig] = js.native
  def getAll(options: typings.ipfsCore.srcUtilsMod.AbortOptions): js.Promise[IPFSConfig] = js.native
  @JSName("getAll")
  var getAll_Original: GetAll = js.native
  
  @JSName("get")
  var get_Original: Get = js.native
  
  var profiles: Profiles_ = js.native
  
  def replace(value: PartialIPFSConfig): js.Promise[Unit] = js.native
  def replace(value: PartialIPFSConfig, options: typings.ipfsCore.srcUtilsMod.AbortOptions): js.Promise[Unit] = js.native
  @JSName("replace")
  var replace_Original: Replace = js.native
  
  var set: typings.std.Set[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ _
  ] = js.native
}
