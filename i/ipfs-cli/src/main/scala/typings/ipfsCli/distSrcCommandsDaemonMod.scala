package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsDaemonMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../types').Context} Argv.ctx
    * @property {string} [Argv.initConfig]
    * @property {string[]} [Argv.initProfile]
    * @property {boolean} Argv.enableShardingExperiment
    * @property {boolean} Argv.offline
    * @property {boolean} Argv.enableNamesysPubsub
    * @property {boolean} Argv.enablePreload
    * @property {boolean} Argv.silent
    * @property {boolean} Argv.migrate
    * @property {string} Argv.pass
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/daemon", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var enableNamesysPubsub: Boolean
    
    var enablePreload: Boolean
    
    var enableShardingExperiment: Boolean
    
    var initConfig: js.UndefOr[String] = js.undefined
    
    var initProfile: js.UndefOr[js.Array[String]] = js.undefined
    
    var migrate: Boolean
    
    var offline: Boolean
    
    var pass: String
    
    var silent: Boolean
  }
  object Argv {
    
    inline def apply(
      ctx: Context,
      enableNamesysPubsub: Boolean,
      enablePreload: Boolean,
      enableShardingExperiment: Boolean,
      migrate: Boolean,
      offline: Boolean,
      pass: String,
      silent: Boolean
    ): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], enableNamesysPubsub = enableNamesysPubsub.asInstanceOf[js.Any], enablePreload = enablePreload.asInstanceOf[js.Any], enableShardingExperiment = enableShardingExperiment.asInstanceOf[js.Any], migrate = migrate.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setEnableNamesysPubsub(value: Boolean): Self = StObject.set(x, "enableNamesysPubsub", value.asInstanceOf[js.Any])
      
      inline def setEnablePreload(value: Boolean): Self = StObject.set(x, "enablePreload", value.asInstanceOf[js.Any])
      
      inline def setEnableShardingExperiment(value: Boolean): Self = StObject.set(x, "enableShardingExperiment", value.asInstanceOf[js.Any])
      
      inline def setInitConfig(value: String): Self = StObject.set(x, "initConfig", value.asInstanceOf[js.Any])
      
      inline def setInitConfigUndefined: Self = StObject.set(x, "initConfig", js.undefined)
      
      inline def setInitProfile(value: js.Array[String]): Self = StObject.set(x, "initProfile", value.asInstanceOf[js.Any])
      
      inline def setInitProfileUndefined: Self = StObject.set(x, "initProfile", js.undefined)
      
      inline def setInitProfileVarargs(value: String*): Self = StObject.set(x, "initProfile", js.Array(value*))
      
      inline def setMigrate(value: Boolean): Self = StObject.set(x, "migrate", value.asInstanceOf[js.Any])
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsDaemonMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = default
}
