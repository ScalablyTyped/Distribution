package typings.hystrixjs.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircuitFactory extends js.Object {
  def getCache(): js.Array[CircuitBreaker]
  def getOrCreate(config: CirctuiBreakerConfig): CircuitBreaker
  def resetCache(): Unit
}

object CircuitFactory {
  @scala.inline
  def apply(
    getCache: () => js.Array[CircuitBreaker],
    getOrCreate: CirctuiBreakerConfig => CircuitBreaker,
    resetCache: () => Unit
  ): CircuitFactory = {
    val __obj = js.Dynamic.literal(getCache = js.Any.fromFunction0(getCache), getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = js.Any.fromFunction0(resetCache))
  
    __obj.asInstanceOf[CircuitFactory]
  }
}

