package typings.htmlTableify

import typings.htmlTableify.mod.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlTableifyStrings {
  
  @js.native
  sealed trait Datum extends StObject
  @scala.inline
  def Datum: Datum = "Datum".asInstanceOf[Datum]
  
  @js.native
  sealed trait center
    extends StObject
       with Alignment
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait left
    extends StObject
       with Alignment
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait right
    extends StObject
       with Alignment
  @scala.inline
  def right: right = "right".asInstanceOf[right]
}
