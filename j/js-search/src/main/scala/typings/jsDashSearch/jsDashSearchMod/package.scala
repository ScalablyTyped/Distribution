package typings.jsDashSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDashSearchMod {
  import org.scalablytyped.runtime.StringDictionary

  type ITfIdfTokenMap = StringDictionary[ITfIdfTokenMetadata]
  type ITfIdfUidMap = StringDictionary[ITfIdfUidMetadata]
  type StemmingFunction = js.Function1[/* text */ String, String]
}
