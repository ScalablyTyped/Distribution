package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abort extends js.Object {
  def abort(): js.Promise[scala.Unit]
  def commit(): js.Promise[scala.Unit]
  def isActive(): scala.Boolean
  def sendOffsets(offsets: kafkajsLib.kafkajsMod.Offsets with Anon_ConsumerGroupId): js.Promise[scala.Unit]
}

object Anon_Abort {
  @scala.inline
  def apply(
    abort: () => js.Promise[scala.Unit],
    commit: () => js.Promise[scala.Unit],
    isActive: () => scala.Boolean,
    sendOffsets: kafkajsLib.kafkajsMod.Offsets with Anon_ConsumerGroupId => js.Promise[scala.Unit]
  ): Anon_Abort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), commit = js.Any.fromFunction0(commit), isActive = js.Any.fromFunction0(isActive), sendOffsets = js.Any.fromFunction1(sendOffsets))
  
    __obj.asInstanceOf[Anon_Abort]
  }
}

