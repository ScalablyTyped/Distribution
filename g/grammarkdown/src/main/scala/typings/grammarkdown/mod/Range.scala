package typings.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Range")
@js.native
object Range extends js.Object {
  
  def clone(range: typings.grammarkdown.typesMod.Range): typings.grammarkdown.typesMod.Range = js.native
  
  def collapseToEnd(range: typings.grammarkdown.typesMod.Range): typings.grammarkdown.typesMod.Range = js.native
  
  def collapseToStart(range: typings.grammarkdown.typesMod.Range): typings.grammarkdown.typesMod.Range = js.native
  
  def contains(left: typings.grammarkdown.typesMod.Range, right: typings.grammarkdown.typesMod.Range): Boolean = js.native
  
  def containsPosition(range: typings.grammarkdown.typesMod.Range, position: typings.grammarkdown.typesMod.Position): Boolean = js.native
  
  def create(start: typings.grammarkdown.typesMod.Position, end: typings.grammarkdown.typesMod.Position): typings.grammarkdown.typesMod.Range = js.native
  
  def equals(left: typings.grammarkdown.typesMod.Range, right: typings.grammarkdown.typesMod.Range): Boolean = js.native
  
  def intersects(left: typings.grammarkdown.typesMod.Range, right: typings.grammarkdown.typesMod.Range): Boolean = js.native
  
  def isCollapsed(range: typings.grammarkdown.typesMod.Range): Boolean = js.native
}
