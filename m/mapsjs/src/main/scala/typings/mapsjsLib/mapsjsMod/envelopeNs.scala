package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "envelope")
@js.native
object envelopeNs extends js.Object {
  def createFromCenterAndMargins(centerPtX: scala.Double, centerPtY: scala.Double, marginX: scala.Double, marginY: scala.Double): mapsjsLib.mapsjsMod.envelope = js.native
  def createFromMdnXml(xml: java.lang.String): mapsjsLib.mapsjsMod.envelope = js.native
  def createFromPoints(pt1: mapsjsLib.mapsjsMod.point, pt2: mapsjsLib.mapsjsMod.point): mapsjsLib.mapsjsMod.envelope = js.native
  def intersects(env1: mapsjsLib.mapsjsMod.envelope, env2: mapsjsLib.mapsjsMod.envelope): scala.Boolean = js.native
  def union(env1: mapsjsLib.mapsjsMod.envelope, env2: mapsjsLib.mapsjsMod.envelope): mapsjsLib.mapsjsMod.envelope = js.native
}

