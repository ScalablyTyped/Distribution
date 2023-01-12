package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import typings.ipfsCli.ipfsCliInts.`-1`
import typings.ipfsCli.ipfsCliInts.`0`
import typings.ipfsCli.ipfsCliInts.`1`
import typings.ipfsCli.ipfsCliInts.`2`
import typings.ipfsCli.ipfsCliInts.`3`
import typings.ipfsCli.ipfsCliInts.`4`
import typings.ipfsCli.ipfsCliInts.`5`
import typings.ipfsCli.ipfsCliInts.`6`
import typings.ipfsCli.ipfsCliInts.`7`
import typings.ipfsCli.ipfsCliInts.`8`
import typings.ipfsCli.ipfsCliInts.`9`
import typings.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsGetMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../types').Context} Argv.ctx
    * @property {string} Argv.ipfsPath
    * @property {string} Argv.output
    * @property {boolean} Argv.force
    * @property {number} Argv.timeout
    * @property {boolean} Argv.archive
    * @property {boolean} Argv.compress
    * @property {-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6| 7 | 8| 9} Argv.compressionLevel
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/get", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var archive: Boolean
    
    var compress: Boolean
    
    var compressionLevel: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`
    
    var ctx: Context
    
    var force: Boolean
    
    var ipfsPath: String
    
    var output: String
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      archive: Boolean,
      compress: Boolean,
      compressionLevel: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`,
      ctx: Context,
      force: Boolean,
      ipfsPath: String,
      output: String,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(archive = archive.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], compressionLevel = compressionLevel.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setArchive(value: Boolean): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressionLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setIpfsPath(value: String): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsGetMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
