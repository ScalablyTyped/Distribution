package typings
package isotopeDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object isotopeDashLayoutMod {
  type Elements = js.Array[stdLib.HTMLElement] | stdLib.HTMLElement | isotopeDashLayoutLib.isotopeDashLayoutMod.Global.JQuery | stdLib.NodeList
  type SortOrder = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type Sorter = org.scalablytyped.runtime.StringDictionary[
    (js.Function1[
      /* itemElm */ isotopeDashLayoutLib.isotopeDashLayoutMod.Global.JQuery, 
      scala.Double | java.lang.String
    ]) | java.lang.String
  ]
  type Style = org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]
}
