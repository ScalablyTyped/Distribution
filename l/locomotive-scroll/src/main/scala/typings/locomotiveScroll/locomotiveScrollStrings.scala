package typings.locomotiveScroll

import typings.locomotiveScroll.mod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locomotiveScrollStrings {
  
  @js.native
  sealed trait call extends StObject
  inline def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with Direction
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait scroll extends StObject
  inline def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait vertical
    extends StObject
       with Direction
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}
