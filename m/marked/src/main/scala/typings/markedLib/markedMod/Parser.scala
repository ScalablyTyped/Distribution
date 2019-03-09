package typings
package markedLib.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Parser")
@js.native
class Parser ()
  extends markedLib.markedMod.markedNs.Parser {
  def this(options: markedLib.markedMod.markedNs.MarkedOptions) = this()
  /* CompleteClass */
  override def next(): markedLib.markedMod.markedNs.Token = js.native
  /* CompleteClass */
  override def parse(src: markedLib.markedMod.markedNs.TokensList): java.lang.String = js.native
  /* CompleteClass */
  override def parseText(): java.lang.String = js.native
  /* CompleteClass */
  override def peek(): markedLib.markedMod.markedNs.Token | scala.Double = js.native
  /* CompleteClass */
  override def tok(): java.lang.String = js.native
}

