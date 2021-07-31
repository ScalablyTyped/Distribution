package typings.ipfsCli

import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.DefaultNumber
import typings.ipfsCli.anon.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addLinkMod {
  
  @JSImport("ipfs-cli/dist/src/commands/object/patch/add-link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/object/patch/add-link", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/object/patch/add-link", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/object/patch/add-link", "builder.cid-version")
    @js.native
    def cidVersion: DefaultNumber = js.native
    
    @scala.inline
    def cidVersion_=(x: DefaultNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-version")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/object/patch/add-link", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/object/patch/add-link", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/object/patch/add-link", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintRootNameRefCidBaseCidVersionTimeout: Root): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintRootNameRefCidBaseCidVersionTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
