package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("grammarkdown/dist/grammarkdown", "Range")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(range: Range2): Range2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(range.asInstanceOf[js.Any]).asInstanceOf[Range2]
  
  inline def collapseToEnd(range: Range2): Range2 = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToEnd")(range.asInstanceOf[js.Any]).asInstanceOf[Range2]
  
  inline def collapseToStart(range: Range2): Range2 = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToStart")(range.asInstanceOf[js.Any]).asInstanceOf[Range2]
  
  inline def contains(left: Range2, right: Range2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def containsPosition(range: Range2, position: Position2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPosition")(range.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def create(start: Position2, end: Position2): Range2 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Range2]
  
  inline def equals_(left: Range2, right: Range2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersects(left: Range2, right: Range2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCollapsed(range: Range2): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollapsed")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
