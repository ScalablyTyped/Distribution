package typings.atHapiPodium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiPodiumMod {
  import org.scalablytyped.runtime.StringDictionary

  type Criteria = String | CriteriaObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.atHapiPodium.atHapiPodiumMod.EventOptionsObject
    - typings.atHapiPodium.atHapiPodiumMod.Podium
  */
  type Events = _Events | String
  type Listener = js.Function3[
    /* data */ js.Any, 
    /* tags */ js.UndefOr[Tags], 
    /* callback */ js.UndefOr[js.Function0[Unit]], 
    Unit
  ]
  type Tags = StringDictionary[Boolean]
}
