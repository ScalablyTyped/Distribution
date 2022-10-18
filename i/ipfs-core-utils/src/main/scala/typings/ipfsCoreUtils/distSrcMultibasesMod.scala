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
    var _basesByName: Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
      ] = js.native
    
    /** @type {Record<string, MultibaseCodec>}} */
    var _basesByPrefix: Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
      ] = js.native
    
    def _loadBase(codeOrName: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
      ] = js.native
    @JSName("_loadBase")
    var _loadBase_Original: typings.ipfsCoreUtils.distSrcTypesMod.LoadBaseFn = js.native
    
    /**
      * Add support for a multibase codec
      *
      * @param {MultibaseCodec} base
      */
    def addBase(
      base: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
    ): Unit = js.native
    
    /**
      * @param {string} nameOrPrefix
      */
    def getBase(nameOrPrefix: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
      ] = js.native
    
    def listBases(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
      ] = js.native
    
    /**
      * Remove support for a multibase codec
      *
      * @param {MultibaseCodec} base
      */
    def removeBase(
      base: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
    ): Unit = js.native
  }
  
  type AbortOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ Any
  
  type LoadBaseFn = typings.ipfsCoreUtils.distSrcTypesMod.LoadBaseFn
  
  type MultibaseCodec = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
}
