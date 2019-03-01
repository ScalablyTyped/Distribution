package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lolexLib {
  /**
    * Lolex clock for a browser environment.
    */
  type BrowserClock = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify LolexClock<number> */ js.Any) with Anon_Performance
  /**
    * Clock object created by lolex.
    */
  type Clock = BrowserClock | NodeClock
  /**
    * Clock object created by calling `install();`.
    *
    * @type TClock   type of base clock (e.g BrowserClock).
    */
  type InstalledClock[TClock /* <: Clock */] = TClock with InstalledMethods
  /**
    * Lolex clock for a Node environment.
    */
  type NodeClock = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify LolexClock<NodeTimer> */ js.Any) with Anon_Callback
}
