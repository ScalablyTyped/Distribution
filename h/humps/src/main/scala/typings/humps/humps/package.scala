package typings.humps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object humps {
  type HumpsProcessor = js.Function3[
    /* key */ java.lang.String, 
    /* convert */ typings.humps.humps.HumpsProcessorParameter, 
    /* options */ js.UndefOr[typings.humps.humps.HumpsOptions], 
    java.lang.String
  ]
  type HumpsProcessorParameter = js.Function2[
    /* key */ java.lang.String, 
    /* options */ js.UndefOr[typings.humps.humps.HumpsOptions], 
    java.lang.String
  ]
  type OptionOrProcessor = typings.humps.humps.HumpsOptions | typings.humps.humps.HumpsProcessor
}
