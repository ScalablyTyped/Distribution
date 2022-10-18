package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsConfigMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../types').Context} Argv.ctx
    * @property {any} Argv.value
    * @property {boolean} Argv.bool
    * @property {boolean} Argv.json
    * @property {string} Argv.key
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/config", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var bool: Boolean
    
    var ctx: Context
    
    var json: Boolean
    
    var key: String
    
    var timeout: Double
    
    var value: Any
  }
  object Argv {
    
    inline def apply(bool: Boolean, ctx: Context, json: Boolean, key: String, timeout: Double, value: Any): Argv = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsConfigMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
