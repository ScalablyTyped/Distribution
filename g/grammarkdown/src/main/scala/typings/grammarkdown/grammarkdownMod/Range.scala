package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range.clone")
  @js.native
  def clone_(range: Range2): Range2 = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range.collapseToEnd")
  @js.native
  def collapseToEnd(range: Range2): Range2 = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range.collapseToStart")
  @js.native
  def collapseToStart(range: Range2): Range2 = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range.contains")
  @js.native
  def contains(left: Range2, right: Range2): Boolean = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range.containsPosition")
  @js.native
  def containsPosition(range: Range2, position: Position2): Boolean = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range.create")
  @js.native
  def create(start: Position2, end: Position2): Range2 = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range.equals")
  @js.native
  def equals_(left: Range2, right: Range2): Boolean = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range.intersects")
  @js.native
  def intersects(left: Range2, right: Range2): Boolean = js.native
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range.isCollapsed")
  @js.native
  def isCollapsed(range: Range2): Boolean = js.native
}
