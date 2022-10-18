package typings.ipfsCoreUtils

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesNormaliseContentDotbrowserMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-content.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normaliseContent(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ToContent */ Any
  ): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("normaliseContent")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
}
