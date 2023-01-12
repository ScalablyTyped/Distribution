package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsVersionMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../types').Context} Argv.ctx
    * @property {boolean} Argv.all
    * @property {boolean} Argv.commit
    * @property {boolean} Argv.repo
    * @property {boolean} Argv.number
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/version", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var all: Boolean
    
    var commit: Boolean
    
    var ctx: Context
    
    var number: Boolean
    
    var repo: Boolean
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(all: Boolean, commit: Boolean, ctx: Context, number: Boolean, repo: Boolean, timeout: Double): Argv = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setRepo(value: Boolean): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsVersionMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
