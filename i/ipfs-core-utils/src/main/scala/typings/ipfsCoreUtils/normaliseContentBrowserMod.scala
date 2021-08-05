package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.ToContent
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normaliseContentBrowserMod {
  
  /**
    * @param {import('./normalise-input').ToContent} input
    * @returns {Promise<Blob>}
    */
  inline def apply(input: ToContent): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input/normalise-content.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
