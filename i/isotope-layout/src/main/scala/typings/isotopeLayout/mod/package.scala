package typings.isotopeLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Elements = js.Array[typings.std.HTMLElement] | typings.std.HTMLElement | typings.isotopeLayout.mod._Global_.JQuery | typings.std.NodeList
  type SortOrder = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type Sorter = org.scalablytyped.runtime.StringDictionary[
    (js.Function1[
      /* itemElm */ typings.isotopeLayout.mod._Global_.JQuery, 
      scala.Double | java.lang.String
    ]) | java.lang.String
  ]
  type Style = org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]
}
