package typings.ipfsCli

import typings.ipfsCli.anon.CidBase_
import typings.ipfsCli.anon.Cidbase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsBitswapMod {
  
  @JSImport("ipfs-cli/dist/src/commands/stats/bitswap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/stats/bitswap", "builder")
  @js.native
  def builder: Cidbase = js.native
  @scala.inline
  def builder_=(x: Cidbase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builder")(x.asInstanceOf[js.Any])
  
  @JSImport("ipfs-cli/dist/src/commands/stats/bitswap", "command")
  @js.native
  def command: String = js.native
  @scala.inline
  def command_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("command")(x.asInstanceOf[js.Any])
  
  @JSImport("ipfs-cli/dist/src/commands/stats/bitswap", "describe")
  @js.native
  def describe: String = js.native
  @scala.inline
  def describe_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def handler(hasCtxCidBaseHumanTimeout: CidBase_): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxCidBaseHumanTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
