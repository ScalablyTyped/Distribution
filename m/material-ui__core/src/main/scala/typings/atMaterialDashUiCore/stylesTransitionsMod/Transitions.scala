package typings.atMaterialDashUiCore.stylesTransitionsMod

import typings.atMaterialDashUiCore.Partialdurationnumberstringeasingstringdelaynumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transitions extends js.Object {
  var duration: Duration = js.native
  var easing: Easing = js.native
  def create(props: String): String = js.native
  def create(props: String, options: Partialdurationnumberstringeasingstringdelaynumber): String = js.native
  def create(props: js.Array[String]): String = js.native
  def create(props: js.Array[String], options: Partialdurationnumberstringeasingstringdelaynumber): String = js.native
  def getAutoHeightDuration(height: Double): Double = js.native
}

