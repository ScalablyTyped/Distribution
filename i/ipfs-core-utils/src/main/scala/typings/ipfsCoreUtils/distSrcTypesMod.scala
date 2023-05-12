package typings.ipfsCoreUtils

import typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec
import typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockCodec
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  type LoadBaseFn = js.Function1[/* codeOrName */ String, js.Promise[MultibaseCodec[Any]]]
  
  type LoadCodecFn = js.Function1[/* codeOrName */ Double | String, js.Promise[BlockCodec[Any, Any]]]
  
  type LoadHasherFn = js.Function1[/* codeOrName */ Double | String, js.Promise[MultihashHasher[Double]]]
}
