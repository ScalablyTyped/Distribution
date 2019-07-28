package typings.inlineDashStyleDashPrefixer

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inlineDashStyleDashPrefixerMod {
  type Plugin = js.Function4[
    /* property */ String, 
    /* value */ Double | String | (js.Array[Double | String]) | js.Any, 
    /* style */ js.Any, 
    /* prefixMap */ js.UndefOr[Record[String, js.Array[String]]], 
    js.UndefOr[Double | String | (js.Array[Double | String]) | js.Any]
  ]
  type Prefix = js.Function1[/* style */ js.Any, js.Any]
}
