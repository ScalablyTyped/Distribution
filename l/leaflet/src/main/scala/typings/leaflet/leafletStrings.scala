package typings.leaflet

import typings.leaflet.leafletMod.ControlPosition
import typings.leaflet.leafletMod.Direction
import typings.leaflet.leafletMod.FillRule
import typings.leaflet.leafletMod.LineCapShape
import typings.leaflet.leafletMod.LineJoinShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object leafletStrings {
  @js.native
  sealed trait auto extends Direction
  
  @js.native
  sealed trait bevel extends LineJoinShape
  
  @js.native
  sealed trait bottom extends Direction
  
  @js.native
  sealed trait bottomleft extends ControlPosition
  
  @js.native
  sealed trait bottomright extends ControlPosition
  
  @js.native
  sealed trait butt extends LineCapShape
  
  @js.native
  sealed trait center extends Direction
  
  @js.native
  sealed trait evenodd extends FillRule
  
  @js.native
  sealed trait inherit
    extends FillRule
       with LineCapShape
       with LineJoinShape
  
  @js.native
  sealed trait left extends Direction
  
  @js.native
  sealed trait miter extends LineJoinShape
  
  @js.native
  sealed trait nonzero extends FillRule
  
  @js.native
  sealed trait right extends Direction
  
  @js.native
  sealed trait round
    extends LineCapShape
       with LineJoinShape
  
  @js.native
  sealed trait square extends LineCapShape
  
  @js.native
  sealed trait top extends Direction
  
  @js.native
  sealed trait topleft extends ControlPosition
  
  @js.native
  sealed trait topright extends ControlPosition
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def bottomleft: bottomleft = "bottomleft".asInstanceOf[bottomleft]
  @scala.inline
  def bottomright: bottomright = "bottomright".asInstanceOf[bottomright]
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def evenodd: evenodd = "evenodd".asInstanceOf[evenodd]
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def miter: miter = "miter".asInstanceOf[miter]
  @scala.inline
  def nonzero: nonzero = "nonzero".asInstanceOf[nonzero]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def topleft: topleft = "topleft".asInstanceOf[topleft]
  @scala.inline
  def topright: topright = "topright".asInstanceOf[topright]
}

