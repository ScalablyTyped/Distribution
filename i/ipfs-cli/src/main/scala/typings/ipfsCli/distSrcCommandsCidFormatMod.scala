package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsCidFormatMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string[]} [Argv.cids]
    * @property {string} [Argv.format]
    * @property {import('multiformats/cid').Version} [Argv.cidVersion]
    * @property {string} [Argv.base]
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/cid/format", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    var cidVersion: js.UndefOr[Version] = js.undefined
    
    var cids: js.UndefOr[js.Array[String]] = js.undefined
    
    var ctx: Context
    
    var format: js.UndefOr[String] = js.undefined
  }
  object Argv {
    
    inline def apply(ctx: Context): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setCids(value: js.Array[String]): Self = StObject.set(x, "cids", value.asInstanceOf[js.Any])
      
      inline def setCidsUndefined: Self = StObject.set(x, "cids", js.undefined)
      
      inline def setCidsVarargs(value: String*): Self = StObject.set(x, "cids", js.Array(value*))
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsCidFormatMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
