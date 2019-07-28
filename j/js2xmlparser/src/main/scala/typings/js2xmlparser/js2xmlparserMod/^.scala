package typings.js2xmlparser.js2xmlparserMod

import typings.js2xmlparser.libOptionsMod.IOptions
import typings.xmlcreate.xmlcreateMod.XmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js2xmlparser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(root: String, `object`: js.Any): String = js.native
  def parse(root: String, `object`: js.Any, options: IOptions): String = js.native
  def parseToExistingElement(element: XmlElement[_], `object`: js.Any): Unit = js.native
  def parseToExistingElement(element: XmlElement[_], `object`: js.Any, options: IOptions): Unit = js.native
}

