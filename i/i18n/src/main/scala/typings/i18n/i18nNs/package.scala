package typings.i18n

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nNs {
  type GlobalCatalog = StringDictionary[LocaleCatalog]
  type HashedList = StringDictionary[String]
  type LocaleCatalog = StringDictionary[String]
  type Replacements = StringDictionary[String]
}
