package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapStringTemplateEngine
  extends knockoutLib.KnockoutNativeTemplateEngine {
  var allowTemplateRewriting: scala.Boolean = js.native
  def addTemplate(name: java.lang.String, template: js.Any): scala.Unit = js.native
  def getTemplate(name: java.lang.String): js.Any = js.native
  def isTemplateExist(name: java.lang.String): scala.Boolean = js.native
  def makeTemplateSource(template: java.lang.String): KnockstrapStringTemplate = js.native
  def removeTemplate(name: java.lang.String): scala.Unit = js.native
}

