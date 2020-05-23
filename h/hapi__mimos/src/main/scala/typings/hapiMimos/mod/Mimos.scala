package typings.hapiMimos.mod

import typings.mimeDb.mod.MimeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mimos extends js.Object {
  /**
    * Returns mime object
    */
  def path(path: String): MimosOptionsValue
  /**
    * Returns mime object
    */
  def `type`(`type`: String): MimeEntry
}

object Mimos {
  @scala.inline
  def apply(path: String => MimosOptionsValue, `type`: String => MimeEntry): Mimos = {
    val __obj = js.Dynamic.literal(path = js.Any.fromFunction1(path))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Mimos]
  }
}

