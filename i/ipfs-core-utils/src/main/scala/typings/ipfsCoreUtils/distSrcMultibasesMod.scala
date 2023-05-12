package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.anon.Bases
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMultibasesMod {
  
  @JSImport("ipfs-core-utils/dist/src/multibases", "Multibases")
  @js.native
  open class Multibases protected () extends StObject {
    /**
      * @param {object} options
      * @param {LoadBaseFn} [options.loadBase]
      * @param {MultibaseCodec[]} options.bases
      */
    def this(options: Bases) = this()
    
    /** @type {Record<string, MultibaseCodec>}} */
    var _basesByName: Record[String, typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec[Any]] = js.native
    
    /** @type {Record<string, MultibaseCodec>}} */
    var _basesByPrefix: Record[String, typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec[Any]] = js.native
    
    def _loadBase(codeOrName: String): js.Promise[typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec[Any]] = js.native
    @JSName("_loadBase")
    var _loadBase_Original: typings.ipfsCoreUtils.distSrcTypesMod.LoadBaseFn = js.native
    
    /**
      * Add support for a multibase codec
      *
      * @param {MultibaseCodec} base
      */
    def addBase(base: typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec[Any]): Unit = js.native
    
    /**
      * @param {string} nameOrPrefix
      */
    def getBase(nameOrPrefix: String): js.Promise[typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec[Any]] = js.native
    
    def listBases(): js.Array[typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec[Any]] = js.native
    
    /**
      * Remove support for a multibase codec
      *
      * @param {MultibaseCodec} base
      */
    def removeBase(base: typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec[Any]): Unit = js.native
  }
  
  type AbortOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ Any
  
  type LoadBaseFn = typings.ipfsCoreUtils.distSrcTypesMod.LoadBaseFn
  
  type MultibaseCodec = typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec[Any]
}
