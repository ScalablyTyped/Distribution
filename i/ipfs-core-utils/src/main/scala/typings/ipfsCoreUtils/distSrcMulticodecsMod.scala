package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.anon.Codecs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMulticodecsMod {
  
  @JSImport("ipfs-core-utils/dist/src/multicodecs", "Multicodecs")
  @js.native
  open class Multicodecs protected () extends StObject {
    /**
      * @param {object} options
      * @param {LoadCodecFn} [options.loadCodec]
      * @param {BlockCodec[]} options.codecs
      */
    def this(options: Codecs) = this()
    
    /** @type {Record<number, BlockCodec>}} */
    var _codecsByCode: Record[Double, typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]] = js.native
    
    /** @type {Record<string, BlockCodec>}} */
    var _codecsByName: Record[String, typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]] = js.native
    
    def _loadCodec(codeOrName: String): js.Promise[typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]] = js.native
    def _loadCodec(codeOrName: Double): js.Promise[typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]] = js.native
    @JSName("_loadCodec")
    var _loadCodec_Original: typings.ipfsCoreUtils.distSrcTypesMod.LoadCodecFn = js.native
    
    /**
      * Add support for a block codec
      *
      * @param {BlockCodec} codec
      */
    def addCodec(codec: typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]): Unit = js.native
    
    def getCodec(code: String): js.Promise[typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]] = js.native
    /**
      * @param {number | string} code
      */
    def getCodec(code: Double): js.Promise[typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]] = js.native
    
    def listCodecs(): js.Array[typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]] = js.native
    
    /**
      * Remove support for a block codec
      *
      * @param {BlockCodec} codec
      */
    def removeCodec(codec: typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]): Unit = js.native
  }
  
  type AbortOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ Any
  
  type BlockCodec = typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec[Any, Any]
  
  type LoadCodecFn = typings.ipfsCoreUtils.distSrcTypesMod.LoadCodecFn
}
