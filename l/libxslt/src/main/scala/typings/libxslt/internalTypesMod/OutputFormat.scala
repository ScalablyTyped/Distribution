package typings.libxslt.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.libxslt.libxsltStrings.document
  - typings.libxslt.libxsltStrings.string
*/
trait OutputFormat extends js.Object

object OutputFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typings.libxslt.libxsltStrings.document = this.cast("document")
  @scala.inline
  def string: typings.libxslt.libxsltStrings.string = this.cast("string")
}

