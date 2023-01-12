package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.ipfsCli.ipfsCliStrings.ed25519
import typings.ipfsCli.ipfsCliStrings.rsa
import typings.ipfsCli.ipfsCliStrings.secp256k1
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsInitMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../types').Context} Argv.ctx
    * @property {string} Argv.defaultConfig
    * @property {'rsa' | 'ed25519' | 'secp256k1'} Argv.algorithm
    * @property {number} Argv.bits
    * @property {boolean} Argv.emptyRepo
    * @property {string} Argv.privateKey
    * @property {string[]} Argv.profile
    * @property {string} Argv.pass
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/init", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var algorithm: rsa | ed25519 | secp256k1
    
    var bits: Double
    
    var ctx: Context
    
    var defaultConfig: String
    
    var emptyRepo: Boolean
    
    var pass: String
    
    var privateKey: String
    
    var profile: js.Array[String]
  }
  object Argv {
    
    inline def apply(
      algorithm: rsa | ed25519 | secp256k1,
      bits: Double,
      ctx: Context,
      defaultConfig: String,
      emptyRepo: Boolean,
      pass: String,
      privateKey: String,
      profile: js.Array[String]
    ): Argv = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], defaultConfig = defaultConfig.asInstanceOf[js.Any], emptyRepo = emptyRepo.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: rsa | ed25519 | secp256k1): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setDefaultConfig(value: String): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
      
      inline def setEmptyRepo(value: Boolean): Self = StObject.set(x, "emptyRepo", value.asInstanceOf[js.Any])
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: js.Array[String]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileVarargs(value: String*): Self = StObject.set(x, "profile", js.Array(value*))
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsInitMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
