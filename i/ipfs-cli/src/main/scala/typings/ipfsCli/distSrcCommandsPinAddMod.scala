package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsPinAddMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string[]} Argv.ipfsPath
    * @property {boolean} Argv.recursive
    * @property {string} Argv.cidBase
    * @property {number} Argv.timeout
    * @property {Record<string, any>} Argv.metadata
    * @property {Record<string, any>} Argv.metadataJson
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/pin/add", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = js.native
  
  trait Argv extends StObject {
    
    var cidBase: String
    
    var ctx: Context
    
    var ipfsPath: js.Array[String]
    
    var metadata: Record[String, Any]
    
    var metadataJson: Record[String, Any]
    
    var recursive: Boolean
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      cidBase: String,
      ctx: Context,
      ipfsPath: js.Array[String],
      metadata: Record[String, Any],
      metadataJson: Record[String, Any],
      recursive: Boolean,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], metadataJson = metadataJson.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setIpfsPath(value: js.Array[String]): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
      
      inline def setIpfsPathVarargs(value: String*): Self = StObject.set(x, "ipfsPath", js.Array(value*))
      
      inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataJson(value: Record[String, Any]): Self = StObject.set(x, "metadataJson", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsPinAddMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = default
}
