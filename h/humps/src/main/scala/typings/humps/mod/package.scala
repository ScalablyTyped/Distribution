package typings.humps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HumpsProcessor = js.Function3[
    /* key */ java.lang.String, 
    /* convert */ typings.humps.mod.HumpsProcessorParameter, 
    /* options */ js.UndefOr[typings.humps.mod.HumpsOptions], 
    java.lang.String
  ]
  type HumpsProcessorParameter = js.Function2[
    /* key */ java.lang.String, 
    /* options */ js.UndefOr[typings.humps.mod.HumpsOptions], 
    java.lang.String
  ]
  type OptionOrProcessor = typings.humps.mod.HumpsOptions | typings.humps.mod.HumpsProcessor
}
