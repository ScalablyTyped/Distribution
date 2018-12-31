package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFactory extends js.Object {
  def getAllMetrics(): js.Array[CommandMetrics]
  def getOrCreate(config: MetricsProperties): CommandMetrics
  def resetCache(): scala.Unit
}

