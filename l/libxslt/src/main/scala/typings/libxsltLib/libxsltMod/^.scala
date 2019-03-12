package typings
package libxsltLib.libxsltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxslt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val libxmljs: libxsltLib.Anon_Attribute = js.native
  def parse(source: java.lang.String): Stylesheet = js.native
  def parse(source: java.lang.String, callback: libxsltLib.internalDashTypesMod.ParseCallback): scala.Unit = js.native
  def parse(source: libxmljsLib.libxmljsMod.Document): Stylesheet = js.native
  def parse(source: libxmljsLib.libxmljsMod.Document, callback: libxsltLib.internalDashTypesMod.ParseCallback): scala.Unit = js.native
  def parseFile(sourcePath: java.lang.String, callback: libxsltLib.internalDashTypesMod.ParseCallback): scala.Unit = js.native
}

