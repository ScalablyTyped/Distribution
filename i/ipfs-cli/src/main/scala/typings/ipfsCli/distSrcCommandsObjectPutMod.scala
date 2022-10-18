package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.ipfsCli.ipfsCliStrings.json
import typings.ipfsCli.ipfsCliStrings.protobuf
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsObjectPutMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.data
    * @property {'json' | 'protobuf'} Argv.inputEnc
    * @property {string} Argv.cidBase
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/object/put", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var cidBase: String
    
    var ctx: Context
    
    var data: String
    
    var inputEnc: json | protobuf
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(cidBase: String, ctx: Context, data: String, inputEnc: json | protobuf, timeout: Double): Argv = {
      val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], inputEnc = inputEnc.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setInputEnc(value: json | protobuf): Self = StObject.set(x, "inputEnc", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsObjectPutMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
