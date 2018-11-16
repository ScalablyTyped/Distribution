package typings
package inlineDashStyleDashPrefixerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inlineDashStyleDashPrefixerMod {
  type Plugin = js.Function4[
    /* property */ java.lang.String, 
    /* value */ scala.Double | java.lang.String | js.Array[scala.Double] | js.Array[java.lang.String] | js.Any, 
    /* style */ js.Any, 
    /* prefixMap */ js.UndefOr[stdLib.Record[java.lang.String, js.Array[java.lang.String]]], 
    js.UndefOr[
      scala.Double | java.lang.String | js.Array[scala.Double] | js.Array[java.lang.String] | js.Any
    ]
  ]
  type Prefix = js.Function1[/* style */ js.Any, js.Any]
}
