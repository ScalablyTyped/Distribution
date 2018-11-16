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

