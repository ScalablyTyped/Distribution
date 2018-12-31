package typings
package jqueryDotGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterCollision extends js.Object {
  def on_overlap(data: GridsterCollisionData): scala.Unit
  def on_overlap_start(data: GridsterCollisionData): scala.Unit
  def on_overlap_stop(data: GridsterCollisionData): scala.Unit
}

