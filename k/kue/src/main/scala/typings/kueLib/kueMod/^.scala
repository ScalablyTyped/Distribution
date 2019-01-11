package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var app: expressLib.expressMod.eNs.Application = js.native
  var workers: js.Array[kueLib.kueMod.Worker] = js.native
  def createQueue(): kueLib.kueMod.Queue = js.native
  def createQueue(options: js.Object): kueLib.kueMod.Queue = js.native
}

