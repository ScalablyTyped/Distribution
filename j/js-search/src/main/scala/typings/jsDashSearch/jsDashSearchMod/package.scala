package typings.jsDashSearch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDashSearchMod {
  type ITfIdfTokenMap = StringDictionary[ITfIdfTokenMetadata]
  type ITfIdfUidMap = StringDictionary[ITfIdfUidMetadata]
  type StemmingFunction = js.Function1[/* text */ String, String]
}
