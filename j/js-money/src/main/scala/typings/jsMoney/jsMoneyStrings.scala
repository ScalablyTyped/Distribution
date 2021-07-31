package typings.jsMoney

import typings.jsMoney.mod.Rounders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMoneyStrings {
  
  @js.native
  sealed trait ceil
    extends StObject
       with Rounders
  @scala.inline
  def ceil: ceil = "ceil".asInstanceOf[ceil]
  
  @js.native
  sealed trait floor
    extends StObject
       with Rounders
  @scala.inline
  def floor: floor = "floor".asInstanceOf[floor]
  
  @js.native
  sealed trait round
    extends StObject
       with Rounders
  @scala.inline
  def round: round = "round".asInstanceOf[round]
}
