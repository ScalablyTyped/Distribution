package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ELangCommonStatic extends js.Object {
  var resource: IPageResource = js.native
  def getLabel(labelid: java.lang.String): java.lang.String = js.native
  def getLabel(labelid: java.lang.String, langid: java.lang.String): java.lang.String = js.native
  def setLang(langid: java.lang.String): scala.Unit = js.native
  def setLang(langid: java.lang.String, node: jqueryLib.JQuery[stdLib.HTMLElement]): scala.Unit = js.native
}

