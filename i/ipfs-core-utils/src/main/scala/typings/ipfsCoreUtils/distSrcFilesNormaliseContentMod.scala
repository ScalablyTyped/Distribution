package typings.ipfsCoreUtils

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesNormaliseContentMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normaliseContent(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ToContent */ Any
  ): js.Promise[AsyncIterable[js.typedarray.Uint8Array]] = ^.asInstanceOf[js.Dynamic].applyDynamic("normaliseContent")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AsyncIterable[js.typedarray.Uint8Array]]]
}
