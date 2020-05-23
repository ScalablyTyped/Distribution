package typings.hapiMimos.mod

import typings.mimeDb.mod.MimeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/mimos", JSImport.Namespace)
@js.native
/**
  * Creates a new Mimos object.
  */
class ^ () extends Mimos {
  def this(options: MimosOptions) = this()
  /**
    * Returns mime object
    */
  /* CompleteClass */
  override def path(path: String): MimosOptionsValue = js.native
  /**
    * Returns mime object
    */
  /* CompleteClass */
  override def `type`(`type`: String): MimeEntry = js.native
}

