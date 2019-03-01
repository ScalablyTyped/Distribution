package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircuitFactory extends js.Object {
  def getCache(): js.Array[CircuitBreaker]
  def getOrCreate(config: CirctuiBreakerConfig): CircuitBreaker
  def resetCache(): scala.Unit
}

object CircuitFactory {
  @scala.inline
  def apply(
    getCache: js.Function0[js.Array[CircuitBreaker]],
    getOrCreate: js.Function1[CirctuiBreakerConfig, CircuitBreaker],
    resetCache: js.Function0[scala.Unit]
  ): CircuitFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCache")(getCache)
    __obj.updateDynamic("getOrCreate")(getOrCreate)
    __obj.updateDynamic("resetCache")(resetCache)
    __obj.asInstanceOf[CircuitFactory]
  }
}

