package typings.ipfsHttpClient.anon

import typings.ipfsHttpClient.distSrcTypesMod.LoadBaseFn
import typings.ipfsHttpClient.distSrcTypesMod.LoadCodecFn
import typings.ipfsHttpClient.distSrcTypesMod.LoadHasherFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ipfs-http-client.ipfs-http-client/dist/src/types.IPLDOptions> */
trait PartialIPLDOptions extends StObject {
  
  var bases: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
    ]
  ] = js.undefined
  
  var codecs: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
    ]
  ] = js.undefined
  
  var hashers: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
    ]
  ] = js.undefined
  
  var loadBase: js.UndefOr[LoadBaseFn] = js.undefined
  
  var loadCodec: js.UndefOr[LoadCodecFn] = js.undefined
  
  var loadHasher: js.UndefOr[LoadHasherFn] = js.undefined
}
object PartialIPLDOptions {
  
  inline def apply(): PartialIPLDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIPLDOptions]
  }
  
  extension [Self <: PartialIPLDOptions](x: Self) {
    
    inline def setBases(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
        ]
    ): Self = StObject.set(x, "bases", value.asInstanceOf[js.Any])
    
    inline def setBasesUndefined: Self = StObject.set(x, "bases", js.undefined)
    
    inline def setBasesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any)*
    ): Self = StObject.set(x, "bases", js.Array(value*))
    
    inline def setCodecs(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
        ]
    ): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    inline def setCodecsUndefined: Self = StObject.set(x, "codecs", js.undefined)
    
    inline def setCodecsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any)*
    ): Self = StObject.set(x, "codecs", js.Array(value*))
    
    inline def setHashers(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
        ]
    ): Self = StObject.set(x, "hashers", value.asInstanceOf[js.Any])
    
    inline def setHashersUndefined: Self = StObject.set(x, "hashers", js.undefined)
    
    inline def setHashersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any)*
    ): Self = StObject.set(x, "hashers", js.Array(value*))
    
    inline def setLoadBase(
      value: /* codeOrName */ Double | String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
        ]
    ): Self = StObject.set(x, "loadBase", js.Any.fromFunction1(value))
    
    inline def setLoadBaseUndefined: Self = StObject.set(x, "loadBase", js.undefined)
    
    inline def setLoadCodec(
      value: /* codeOrName */ Double | String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
        ]
    ): Self = StObject.set(x, "loadCodec", js.Any.fromFunction1(value))
    
    inline def setLoadCodecUndefined: Self = StObject.set(x, "loadCodec", js.undefined)
    
    inline def setLoadHasher(
      value: /* codeOrName */ Double | String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
        ]
    ): Self = StObject.set(x, "loadHasher", js.Any.fromFunction1(value))
    
    inline def setLoadHasherUndefined: Self = StObject.set(x, "loadHasher", js.undefined)
  }
}
