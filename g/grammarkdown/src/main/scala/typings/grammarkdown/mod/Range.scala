package typings.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("grammarkdown", "Range.clone")
  @js.native
  def clone_(range: typings.grammarkdown.typesMod.Range): typings.grammarkdown.typesMod.Range = js.native
  
  @JSImport("grammarkdown", "Range.collapseToEnd")
  @js.native
  def collapseToEnd(range: typings.grammarkdown.typesMod.Range): typings.grammarkdown.typesMod.Range = js.native
  
  @JSImport("grammarkdown", "Range.collapseToStart")
  @js.native
  def collapseToStart(range: typings.grammarkdown.typesMod.Range): typings.grammarkdown.typesMod.Range = js.native
  
  @JSImport("grammarkdown", "Range.contains")
  @js.native
  def contains(left: typings.grammarkdown.typesMod.Range, right: typings.grammarkdown.typesMod.Range): Boolean = js.native
  
  @JSImport("grammarkdown", "Range.containsPosition")
  @js.native
  def containsPosition(range: typings.grammarkdown.typesMod.Range, position: typings.grammarkdown.typesMod.Position): Boolean = js.native
  
  @JSImport("grammarkdown", "Range.create")
  @js.native
  def create(start: typings.grammarkdown.typesMod.Position, end: typings.grammarkdown.typesMod.Position): typings.grammarkdown.typesMod.Range = js.native
  
  @JSImport("grammarkdown", "Range.equals")
  @js.native
  def equals_(left: typings.grammarkdown.typesMod.Range, right: typings.grammarkdown.typesMod.Range): Boolean = js.native
  
  @JSImport("grammarkdown", "Range.intersects")
  @js.native
  def intersects(left: typings.grammarkdown.typesMod.Range, right: typings.grammarkdown.typesMod.Range): Boolean = js.native
  
  @JSImport("grammarkdown", "Range.isCollapsed")
  @js.native
  def isCollapsed(range: typings.grammarkdown.typesMod.Range): Boolean = js.native
}
