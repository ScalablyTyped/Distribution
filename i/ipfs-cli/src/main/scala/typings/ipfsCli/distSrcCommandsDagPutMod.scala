package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.ipfsCli.ipfsCliStrings.`dag-cbor`
import typings.ipfsCli.ipfsCliStrings.`dag-json`
import typings.ipfsCli.ipfsCliStrings.`dag-pb`
import typings.ipfsCli.ipfsCliStrings.raw
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsDagPutMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.data
    * @property {'dag-cbor' | 'dag-json' | 'dag-pb' | 'raw'} Argv.inputCodec
    * @property {'dag-cbor' | 'dag-json' | 'dag-pb' | 'raw'} Argv.storeCodec
    * @property {import('multiformats/cid').Version} Argv.cidVersion
    * @property {boolean} Argv.pin
    * @property {string} Argv.hashAlg
    * @property {string} Argv.cidBase
    * @property {boolean} Argv.preload
    * @property {boolean} Argv.onlyHash
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/dag/put", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = js.native
  
  trait Argv extends StObject {
    
    var cidBase: String
    
    var cidVersion: Version
    
    var ctx: Context
    
    var data: String
    
    var hashAlg: String
    
    var inputCodec: `dag-cbor` | `dag-json` | `dag-pb` | raw
    
    var onlyHash: Boolean
    
    var pin: Boolean
    
    var preload: Boolean
    
    var storeCodec: `dag-cbor` | `dag-json` | `dag-pb` | raw
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      cidBase: String,
      cidVersion: Version,
      ctx: Context,
      data: String,
      hashAlg: String,
      inputCodec: `dag-cbor` | `dag-json` | `dag-pb` | raw,
      onlyHash: Boolean,
      pin: Boolean,
      preload: Boolean,
      storeCodec: `dag-cbor` | `dag-json` | `dag-pb` | raw,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], cidVersion = cidVersion.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], inputCodec = inputCodec.asInstanceOf[js.Any], onlyHash = onlyHash.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], storeCodec = storeCodec.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setInputCodec(value: `dag-cbor` | `dag-json` | `dag-pb` | raw): Self = StObject.set(x, "inputCodec", value.asInstanceOf[js.Any])
      
      inline def setOnlyHash(value: Boolean): Self = StObject.set(x, "onlyHash", value.asInstanceOf[js.Any])
      
      inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setStoreCodec(value: `dag-cbor` | `dag-json` | `dag-pb` | raw): Self = StObject.set(x, "storeCodec", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type BlockCodec[T] = typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Double, T]
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsDagPutMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = default
}
