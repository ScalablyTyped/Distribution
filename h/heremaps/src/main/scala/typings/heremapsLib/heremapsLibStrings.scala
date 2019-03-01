package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object heremapsLibStrings {
  @js.native
  sealed trait bevel
    extends heremapsLib.HNs.mapNs.SpatialStyleNs.LineJoin
  
  @js.native
  sealed trait butt
    extends heremapsLib.HNs.mapNs.SpatialStyleNs.LineCap
  
  @js.native
  sealed trait miter
    extends heremapsLib.HNs.mapNs.SpatialStyleNs.LineJoin
  
  @js.native
  sealed trait round
    extends heremapsLib.HNs.mapNs.SpatialStyleNs.LineCap
       with heremapsLib.HNs.mapNs.SpatialStyleNs.LineJoin
  
  @js.native
  sealed trait square
    extends heremapsLib.HNs.mapNs.SpatialStyleNs.LineCap
  
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

