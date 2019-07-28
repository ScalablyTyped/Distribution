package typings.marko.expressMod

import typings.marko.srcRuntimeHtmlTemplateMod.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response {
  def marko(template: Template): Unit = js.native
  def marko(template: Template, data: js.Any): Unit = js.native
}

