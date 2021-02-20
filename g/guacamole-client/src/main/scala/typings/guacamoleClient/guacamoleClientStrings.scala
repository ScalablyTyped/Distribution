package typings.guacamoleClient

import typings.guacamoleClient.layerMod.Layer.LineCap
import typings.guacamoleClient.layerMod.Layer.LineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guacamoleClientStrings {
  
  @js.native
  sealed trait _empty extends StObject
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait bevel extends LineJoin
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait butt extends LineCap
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait mitter extends LineJoin
  @scala.inline
  def mitter: mitter = "mitter".asInstanceOf[mitter]
  
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
