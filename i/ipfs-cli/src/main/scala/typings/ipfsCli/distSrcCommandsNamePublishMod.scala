package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsNamePublishMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {import('multiformats/cid').CID} Argv.ipfsPath
    * @property {boolean} Argv.resolve
    * @property {string} Argv.lifetime
    * @property {string} Argv.key
    * @property {string} Argv.ttl
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/name/publish", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var ipfsPath: CID[Any, Double, Double, Version]
    
    var key: String
    
    var lifetime: String
    
    var resolve: Boolean
    
    var timeout: Double
    
    var ttl: String
  }
  object Argv {
    
    inline def apply(
      ctx: Context,
      ipfsPath: CID[Any, Double, Double, Version],
      key: String,
      lifetime: String,
      resolve: Boolean,
      timeout: Double,
      ttl: String
    ): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setIpfsPath(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsNamePublishMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
