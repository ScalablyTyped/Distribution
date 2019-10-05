package typings.humps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object humps {
  type HumpsProcessor = js.Function3[
    /* key */ String, 
    /* convert */ HumpsProcessorParameter, 
    /* options */ js.UndefOr[HumpsOptions], 
    String
  ]
  type HumpsProcessorParameter = js.Function2[/* key */ String, /* options */ js.UndefOr[HumpsOptions], String]
  type OptionOrProcessor = HumpsOptions | HumpsProcessor
}
