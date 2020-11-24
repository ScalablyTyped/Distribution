package typings.guacamoleClient

import typings.guacamoleClient.layerMod.Layer.LineCap
import typings.guacamoleClient.layerMod.Layer.LineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guacamoleClientStrings {
  
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  
  @scala.inline
  def mitter: mitter = "mitter".asInstanceOf[mitter]
  
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait bevel extends LineJoin
  
  @js.native
  sealed trait butt extends LineCap
  
  @js.native
  sealed trait mitter extends LineJoin
  
  @js.native
  sealed trait round
    extends LineCap
       with LineJoin
  
  @js.native
  sealed trait square extends LineCap
}
