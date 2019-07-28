package typings.knockstrap

import typings.knockout.KnockoutNativeTemplateEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapStringTemplateEngine extends KnockoutNativeTemplateEngine {
  var allowTemplateRewriting: Boolean = js.native
  def addTemplate(name: String, template: js.Any): Unit = js.native
  def getTemplate(name: String): js.Any = js.native
  def isTemplateExist(name: String): Boolean = js.native
  def makeTemplateSource(template: String): KnockstrapStringTemplate = js.native
  def removeTemplate(name: String): Unit = js.native
}

