package typings.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("grammarkdown", "Range")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clone_(range: typings.grammarkdown.typesMod.Range): typings.grammarkdown.typesMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(range.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.typesMod.Range]
  
  @scala.inline
  def collapseToEnd(range: typings.grammarkdown.typesMod.Range): typings.grammarkdown.typesMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToEnd")(range.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.typesMod.Range]
  
  @scala.inline
  def collapseToStart(range: typings.grammarkdown.typesMod.Range): typings.grammarkdown.typesMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToStart")(range.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.typesMod.Range]
  
  @scala.inline
  def contains(left: typings.grammarkdown.typesMod.Range, right: typings.grammarkdown.typesMod.Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def containsPosition(range: typings.grammarkdown.typesMod.Range, position: typings.grammarkdown.typesMod.Position): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPosition")(range.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def create(start: typings.grammarkdown.typesMod.Position, end: typings.grammarkdown.typesMod.Position): typings.grammarkdown.typesMod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.typesMod.Range]
  
  @scala.inline
  def equals_(left: typings.grammarkdown.typesMod.Range, right: typings.grammarkdown.typesMod.Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def intersects(left: typings.grammarkdown.typesMod.Range, right: typings.grammarkdown.typesMod.Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isCollapsed(range: typings.grammarkdown.typesMod.Range): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollapsed")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
