package typings.materialUiCore.transitionsMod

import typings.materialUiCore.Partialdurationnumberstringeasingstringdelaynumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transitions extends js.Object {
  var duration: Duration_ = js.native
  var easing: Easing_ = js.native
  def create(props: String): String = js.native
  def create(props: String, options: Partialdurationnumberstringeasingstringdelaynumber): String = js.native
  def create(props: js.Array[String]): String = js.native
  def create(props: js.Array[String], options: Partialdurationnumberstringeasingstringdelaynumber): String = js.native
  def getAutoHeightDuration(height: Double): Double = js.native
}

