package typings.ipfsCli

import typings.ipfsCli.anon.Human
import typings.ipfsCli.anon.SizeOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsRepoMod {
  
  @JSImport("ipfs-cli/dist/src/commands/stats/repo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/stats/repo", "builder")
  @js.native
  def builder: SizeOnly = js.native
  inline def builder_=(x: SizeOnly): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builder")(x.asInstanceOf[js.Any])
  
  @JSImport("ipfs-cli/dist/src/commands/stats/repo", "command")
  @js.native
  def command: String = js.native
  inline def command_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("command")(x.asInstanceOf[js.Any])
  
  @JSImport("ipfs-cli/dist/src/commands/stats/repo", "describe")
  @js.native
  def describe: String = js.native
  inline def describe_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  inline def handler(hasHasIpfsPrintHumanSizeOnlyTimeout: Human): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintHumanSizeOnlyTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
