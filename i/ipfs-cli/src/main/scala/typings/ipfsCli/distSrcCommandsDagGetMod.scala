package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.ipfsCli.ipfsCliStrings.`dag-cbor`
import typings.ipfsCli.ipfsCliStrings.`dag-json`
import typings.ipfsCli.ipfsCliStrings.`dag-pb`
import typings.ipfsCli.ipfsCliStrings.base16
import typings.ipfsCli.ipfsCliStrings.base58btc
import typings.ipfsCli.ipfsCliStrings.base64
import typings.ipfsCli.ipfsCliStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsDagGetMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.cidpath
    * @property {'dag-json' | 'dag-cbor' | 'dag-pb' | 'raw'} Argv.outputCodec
    * @property {'base16' | 'base64' | 'base58btc'} Argv.dataEnc
    * @property {boolean} Argv.localResolve
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/dag/get", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = js.native
  
  trait Argv extends StObject {
    
    var cidpath: String
    
    var ctx: Context
    
    var dataEnc: base16 | base64 | base58btc
    
    var localResolve: Boolean
    
    var outputCodec: `dag-json` | `dag-cbor` | `dag-pb` | raw
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      cidpath: String,
      ctx: Context,
      dataEnc: base16 | base64 | base58btc,
      localResolve: Boolean,
      outputCodec: `dag-json` | `dag-cbor` | `dag-pb` | raw,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(cidpath = cidpath.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dataEnc = dataEnc.asInstanceOf[js.Any], localResolve = localResolve.asInstanceOf[js.Any], outputCodec = outputCodec.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setCidpath(value: String): Self = StObject.set(x, "cidpath", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setDataEnc(value: base16 | base64 | base58btc): Self = StObject.set(x, "dataEnc", value.asInstanceOf[js.Any])
      
      inline def setLocalResolve(value: Boolean): Self = StObject.set(x, "localResolve", value.asInstanceOf[js.Any])
      
      inline def setOutputCodec(value: `dag-json` | `dag-cbor` | `dag-pb` | raw): Self = StObject.set(x, "outputCodec", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type BlockCodec[T] = typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Double, T]
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsDagGetMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = default
}
