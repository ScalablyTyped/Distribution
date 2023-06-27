package typings.lezerMarkdown.distMarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lezer/markdown/dist/markdown", "Line")
@js.native
open class Line () extends StObject {
  
  def addMarker(elt: Element): Unit = js.native
  
  var baseIndent: Double = js.native
  
  var basePos: Double = js.native
  
  def countIndent(to: Double): Double = js.native
  def countIndent(to: Double, from: Double): Double = js.native
  def countIndent(to: Double, from: Double, indent: Double): Double = js.native
  def countIndent(to: Double, from: Unit, indent: Double): Double = js.native
  
  def findColumn(goal: Double): Double = js.native
  
  var indent: Double = js.native
  
  def moveBase(to: Double): Unit = js.native
  
  def moveBaseColumn(indent: Double): Unit = js.native
  
  var next: Double = js.native
  
  var pos: Double = js.native
  
  def skipSpace(from: Double): Double = js.native
  
  var text: String = js.native
}
