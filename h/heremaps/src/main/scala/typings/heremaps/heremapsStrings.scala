package typings.heremaps

import typings.heremaps.H.map.SpatialStyle.LineCap
import typings.heremaps.H.map.SpatialStyle.LineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heremapsStrings {
  
  @js.native
  sealed trait bevel extends LineJoin
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait butt extends LineCap
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait miter extends LineJoin
  @scala.inline
  def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait round
    extends LineCap
       with LineJoin
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait square extends LineCap
  @scala.inline
  def square: square = "square".asInstanceOf[square]
}
