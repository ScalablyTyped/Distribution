package typings.jqueryElang

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ELangCommonStatic extends js.Object {
  var resource: IPageResource = js.native
  def getLabel(labelid: String): String = js.native
  def getLabel(labelid: String, langid: String): String = js.native
  def setLang(langid: String): Unit = js.native
  def setLang(langid: String, node: JQuery[HTMLElement]): Unit = js.native
}

