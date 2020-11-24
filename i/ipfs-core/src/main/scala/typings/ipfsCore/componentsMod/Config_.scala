package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.PartialIPFSConfig
import typings.ipfsCore.configMod.Get
import typings.ipfsCore.configMod.GetAll
import typings.ipfsCore.configMod.IPFSConfig
import typings.ipfsCore.configMod.Profiles_
import typings.ipfsCore.configMod.Replace
import typings.ipfsCore.configMod.Set
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config_ extends js.Object {
  
  def get(): js.Promise[JSON] = js.native
  def get(key: js.UndefOr[scala.Nothing], options: AbortOptions): js.Promise[JSON] = js.native
  def get(key: String): js.Promise[JSON] = js.native
  def get(key: String, options: AbortOptions): js.Promise[JSON] = js.native
  
  def getAll(): js.Promise[IPFSConfig] = js.native
  def getAll(options: AbortOptions): js.Promise[IPFSConfig] = js.native
  @JSName("getAll")
  var getAll_Original: GetAll = js.native
  
  @JSName("get")
  var get_Original: Get = js.native
  
  var profiles: Profiles_ = js.native
  
  def replace(value: PartialIPFSConfig): js.Promise[Unit] = js.native
  def replace(value: PartialIPFSConfig, options: AbortOptions): js.Promise[Unit] = js.native
  @JSName("replace")
  var replace_Original: Replace = js.native
  
  def set(key: String, value: JSON): js.Promise[Unit] = js.native
  def set(key: String, value: JSON, options: AbortOptions): js.Promise[Unit] = js.native
  @JSName("set")
  var set_Original: Set = js.native
}
