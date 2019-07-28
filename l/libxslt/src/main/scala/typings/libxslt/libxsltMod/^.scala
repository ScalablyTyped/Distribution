package typings.libxslt.libxsltMod

import typings.libxmljs.libxmljsMod.Document
import typings.libxslt.internalDashTypesMod.ParseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxslt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(source: String): Stylesheet = js.native
  def parse(source: String, callback: ParseCallback): Unit = js.native
  def parse(source: Document): Stylesheet = js.native
  def parse(source: Document, callback: ParseCallback): Unit = js.native
  def parseFile(sourcePath: String, callback: ParseCallback): Unit = js.native
}

