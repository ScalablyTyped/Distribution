package typings.ipfsCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  type LoadBaseFn = js.Function1[
    /* codeOrName */ String, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
    ]
  ]
  
  type LoadCodecFn = js.Function1[
    /* codeOrName */ Double | String, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
    ]
  ]
  
  type LoadHasherFn = js.Function1[
    /* codeOrName */ Double | String, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
    ]
  ]
}
