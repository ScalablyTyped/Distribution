package typings.mapsjs.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "envelope")
@js.native
object envelopeNs extends js.Object {
  def createFromCenterAndMargins(centerPtX: Double, centerPtY: Double, marginX: Double, marginY: Double): envelope = js.native
  def createFromMdnXml(xml: String): envelope = js.native
  def createFromPoints(pt1: point, pt2: point): envelope = js.native
  def intersects(env1: envelope, env2: envelope): Boolean = js.native
  def union(env1: envelope, env2: envelope): envelope = js.native
}

