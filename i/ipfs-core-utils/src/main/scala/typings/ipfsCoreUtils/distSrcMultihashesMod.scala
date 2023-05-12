package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.anon.Hashers
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMultihashesMod {
  
  @JSImport("ipfs-core-utils/dist/src/multihashes", "Multihashes")
  @js.native
  open class Multihashes protected () extends StObject {
    /**
      * @param {object} options
      * @param {LoadHasherFn} [options.loadHasher]
      * @param {MultihashHasher[]} options.hashers
      */
    def this(options: Hashers) = this()
    
    /** @type {Record<number, MultihashHasher>}} */
    var _hashersByCode: Record[Double, MultihashHasher] = js.native
    
    /** @type {Record<string, MultihashHasher>}} */
    var _hashersByName: Record[String, MultihashHasher] = js.native
    
    def _loadHasher(codeOrName: String): js.Promise[typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher[Double]] = js.native
    def _loadHasher(codeOrName: Double): js.Promise[typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher[Double]] = js.native
    @JSName("_loadHasher")
    var _loadHasher_Original: typings.ipfsCoreUtils.distSrcTypesMod.LoadHasherFn = js.native
    
    /**
      * Add support for a multibase hasher
      *
      * @param {MultihashHasher} hasher
      */
    def addHasher(hasher: MultihashHasher): Unit = js.native
    
    def getHasher(code: String): js.Promise[typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher[Double]] = js.native
    /**
      * @param {number | string} code
      */
    def getHasher(code: Double): js.Promise[typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher[Double]] = js.native
    
    def listHashers(): js.Array[typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher[Double]] = js.native
    
    /**
      * Remove support for a multibase hasher
      *
      * @param {MultihashHasher} hasher
      */
    def removeHasher(hasher: MultihashHasher): Unit = js.native
  }
  
  type AbortOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ Any
  
  type LoadHasherFn = typings.ipfsCoreUtils.distSrcTypesMod.LoadHasherFn
  
  type MultihashHasher = typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher[Double]
}
