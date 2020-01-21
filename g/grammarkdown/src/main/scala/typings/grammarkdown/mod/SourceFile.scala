package typings.grammarkdown.mod

import typings.grammarkdown.nodesMod.SourceElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SourceFile")
@js.native
class SourceFile protected ()
  extends typings.grammarkdown.nodesMod.SourceFile {
  def this(filename: String, text: String, elements: js.Array[SourceElement]) = this()
}

