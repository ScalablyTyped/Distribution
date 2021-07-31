package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Entry
import typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Source
import typings.std.AsyncIterable
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexBrowserMod {
  
  @scala.inline
  def apply(input: Source): AsyncIterable[Entry[Blob]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[Entry[Blob]]]
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input/index.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
