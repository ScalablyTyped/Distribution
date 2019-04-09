package typings
package javascriptDashStringifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Next = js.Function2[
    /* value */ js.Any, 
    /* key */ js.UndefOr[stdLib.PropertyKey], 
    js.UndefOr[java.lang.String]
  ]
  type ToString = js.Function3[
    /* value */ js.Any, 
    /* space */ java.lang.String, 
    /* next */ Next, 
    js.UndefOr[java.lang.String]
  ]
}
