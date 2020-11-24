package typings.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Range")
@js.native
object Range extends js.Object {
  
  def clone(range: Range2): Range2 = js.native
  
  def collapseToEnd(range: Range2): Range2 = js.native
  
  def collapseToStart(range: Range2): Range2 = js.native
  
  def contains(left: Range2, right: Range2): Boolean = js.native
  
  def containsPosition(range: Range2, position: Position2): Boolean = js.native
  
  def create(start: Position2, end: Position2): Range2 = js.native
  
  def equals(left: Range2, right: Range2): Boolean = js.native
  
  def intersects(left: Range2, right: Range2): Boolean = js.native
  
  def isCollapsed(range: Range2): Boolean = js.native
}
