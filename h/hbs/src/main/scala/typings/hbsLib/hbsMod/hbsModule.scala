package typings
package hbsLib.hbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hbsModule extends js.Object {
  val handlebars: hbsLib.handlebarsModule = js.native
  def __express(filename: java.lang.String, options: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def localsAsTemplateData(app: js.Any): scala.Unit = js.native
  def registerHelper(helperName: java.lang.String, helperFunction: js.Function1[/* repeated */js.Any, _]): scala.Unit = js.native
  def registerPartial(partialName: java.lang.String, partialValue: java.lang.String): scala.Unit = js.native
  def registerPartials(directoryName: java.lang.String): scala.Unit = js.native
  def registerPartials(directoryName: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

