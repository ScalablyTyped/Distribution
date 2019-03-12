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

object GridsterCollision {
  @scala.inline
  def apply(
    on_overlap: GridsterCollisionData => scala.Unit,
    on_overlap_start: GridsterCollisionData => scala.Unit,
    on_overlap_stop: GridsterCollisionData => scala.Unit
  ): GridsterCollision = {
    val __obj = js.Dynamic.literal(on_overlap = js.Any.fromFunction1(on_overlap), on_overlap_start = js.Any.fromFunction1(on_overlap_start), on_overlap_stop = js.Any.fromFunction1(on_overlap_stop))
  
    __obj.asInstanceOf[GridsterCollision]
  }
}

