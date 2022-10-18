package typings.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("grammarkdown", "Range")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(range: typings.grammarkdown.distTypesMod.Range): typings.grammarkdown.distTypesMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(range.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.distTypesMod.Range]
  
  inline def collapseToEnd(range: typings.grammarkdown.distTypesMod.Range): typings.grammarkdown.distTypesMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToEnd")(range.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.distTypesMod.Range]
  
  inline def collapseToStart(range: typings.grammarkdown.distTypesMod.Range): typings.grammarkdown.distTypesMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToStart")(range.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.distTypesMod.Range]
  
  inline def contains(left: typings.grammarkdown.distTypesMod.Range, right: typings.grammarkdown.distTypesMod.Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def containsPosition(
    range: typings.grammarkdown.distTypesMod.Range,
    position: typings.grammarkdown.distTypesMod.Position
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPosition")(range.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def create(start: typings.grammarkdown.distTypesMod.Position, end: typings.grammarkdown.distTypesMod.Position): typings.grammarkdown.distTypesMod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.distTypesMod.Range]
  
  inline def equals_(left: typings.grammarkdown.distTypesMod.Range, right: typings.grammarkdown.distTypesMod.Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersects(left: typings.grammarkdown.distTypesMod.Range, right: typings.grammarkdown.distTypesMod.Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCollapsed(range: typings.grammarkdown.distTypesMod.Range): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollapsed")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
