package typings
package humpsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object humpsNs {
  type HumpsProcessor = js.Function3[
    /* key */ java.lang.String, 
    /* convert */ HumpsProcessorParameter, 
    /* options */ js.UndefOr[HumpsOptions], 
    java.lang.String
  ]
  type HumpsProcessorParameter = js.Function2[/* key */ java.lang.String, /* options */ js.UndefOr[HumpsOptions], java.lang.String]
  type OptionOrProcessor = HumpsOptions | HumpsProcessor
}
