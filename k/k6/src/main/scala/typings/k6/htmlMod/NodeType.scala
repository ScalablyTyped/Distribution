package typings.k6.htmlMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType extends js.Object
@JSImport("k6/html", "NodeType")
@js.native
object NodeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
  
  @js.native
  sealed trait CommentNode extends NodeType
  /* 8 */ @js.native
  object CommentNode extends TopLevel[CommentNode with Double]
  
  @js.native
  sealed trait DoctypeNode extends NodeType
  /* 10 */ @js.native
  object DoctypeNode extends TopLevel[DoctypeNode with Double]
  
  @js.native
  sealed trait DocumentNode extends NodeType
  /* 9 */ @js.native
  object DocumentNode extends TopLevel[DocumentNode with Double]
  
  @js.native
  sealed trait ElementNode extends NodeType
  /* 1 */ @js.native
  object ElementNode extends TopLevel[ElementNode with Double]
  
  @js.native
  sealed trait TextNode extends NodeType
  /* 3 */ @js.native
  object TextNode extends TopLevel[TextNode with Double]
}
