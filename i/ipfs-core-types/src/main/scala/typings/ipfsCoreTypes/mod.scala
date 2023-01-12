package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcRefsMod.Local
import typings.ipfsCoreTypes.distSrcRefsMod.Refs
import typings.ipfsCoreTypes.distSrcRefsMod.RefsResult
import typings.ipfsCoreTypes.distSrcRootMod.API
import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Bases extends StObject {
    
    def getBase(code: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
      ]
    
    def listBases(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
      ]
  }
  object Bases {
    
    inline def apply(
      getBase: String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
        ],
      listBases: () => js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
        ]
    ): Bases = {
      val __obj = js.Dynamic.literal(getBase = js.Any.fromFunction1(getBase), listBases = js.Any.fromFunction0(listBases))
      __obj.asInstanceOf[Bases]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bases] (val x: Self) extends AnyVal {
      
      inline def setGetBase(
        value: String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
            ]
      ): Self = StObject.set(x, "getBase", js.Any.fromFunction1(value))
      
      inline def setListBases(
        value: () => js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
            ]
      ): Self = StObject.set(x, "listBases", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Codecs extends StObject {
    
    def getCodec(code: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ] = js.native
    def getCodec(code: Double): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ] = js.native
    
    def listCodecs(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ] = js.native
  }
  
  @js.native
  trait Hashers extends StObject {
    
    def getHasher(code: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ] = js.native
    def getHasher(code: Double): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ] = js.native
    
    def listHashers(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ] = js.native
  }
  
  @js.native
  trait IPFS[OptionExtension]
    extends StObject
       with API[OptionExtension] {
    
    var bases: Bases = js.native
    
    var bitswap: typings.ipfsCoreTypes.distSrcBitswapMod.API[OptionExtension] = js.native
    
    var block: typings.ipfsCoreTypes.distSrcBlockMod.API[OptionExtension] = js.native
    
    var bootstrap: typings.ipfsCoreTypes.distSrcBootstrapMod.API[OptionExtension] = js.native
    
    var codecs: Codecs = js.native
    
    var config: typings.ipfsCoreTypes.distSrcConfigMod.API[OptionExtension] = js.native
    
    var dag: typings.ipfsCoreTypes.distSrcDagMod.API[OptionExtension] = js.native
    
    var dht: typings.ipfsCoreTypes.distSrcDhtMod.API[OptionExtension] = js.native
    
    var diag: typings.ipfsCoreTypes.distSrcDiagMod.API[OptionExtension] = js.native
    
    var files: typings.ipfsCoreTypes.distSrcFilesMod.API[OptionExtension] = js.native
    
    var hashers: Hashers = js.native
    
    var key: typings.ipfsCoreTypes.distSrcKeyMod.API[OptionExtension] = js.native
    
    var log: typings.ipfsCoreTypes.distSrcLogMod.API[OptionExtension] = js.native
    
    var name: typings.ipfsCoreTypes.distSrcNameMod.API[OptionExtension] = js.native
    
    var `object`: typings.ipfsCoreTypes.distSrcObjectMod.API[OptionExtension] = js.native
    
    var pin: typings.ipfsCoreTypes.distSrcPinMod.API[OptionExtension] = js.native
    
    var pubsub: typings.ipfsCoreTypes.distSrcPubsubMod.API[OptionExtension] = js.native
    
    var refs: RefsAPI[OptionExtension] = js.native
    
    var repo: typings.ipfsCoreTypes.distSrcRepoMod.API[OptionExtension] = js.native
    
    var stats: typings.ipfsCoreTypes.distSrcStatsMod.API[OptionExtension] = js.native
    
    var swarm: typings.ipfsCoreTypes.distSrcSwarmMod.API[OptionExtension] = js.native
  }
  
  @js.native
  trait RefsAPI[OptionExtension] extends Refs[OptionExtension] {
    
    def local(): AsyncIterable[RefsResult] = js.native
    def local(options: AbortOptions & OptionExtension): AsyncIterable[RefsResult] = js.native
    @JSName("local")
    var local_Original: Local[OptionExtension] = js.native
  }
}
