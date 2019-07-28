package typings.heremaps

import typings.heremaps.HNs.mapNs.SpatialStyleNs.LineCap
import typings.heremaps.HNs.mapNs.SpatialStyleNs.LineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object heremapsStrings {
  @js.native
  sealed trait bevel extends LineJoin
  
  @js.native
  sealed trait butt extends LineCap
  
  @js.native
  sealed trait miter extends LineJoin
  
  @js.native
  sealed trait round
    extends LineCap
       with LineJoin
  
  @js.native
  sealed trait square extends LineCap
  
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  @scala.inline
  def miter: miter = "miter".asInstanceOf[miter]
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
}

