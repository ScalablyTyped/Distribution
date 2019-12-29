package typings.hirestime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hirestime", JSImport.Namespace)
@js.native
object hirestimeMod extends js.Object {
  @js.native
  trait getElapsed extends js.Object {
    def apply(): Double = js.native
    def milliseconds(): Double = js.native
    def ms(): Double = js.native
    def nanoseconds(): Double = js.native
    def ns(): Double = js.native
    def s(): Double = js.native
    def seconds(): Double = js.native
  }
  
  def apply(): getElapsed = js.native
}

