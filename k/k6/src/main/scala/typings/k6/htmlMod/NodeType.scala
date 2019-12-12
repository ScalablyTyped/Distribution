package typings.k6.htmlMod

import org.scalablytyped.runtime.TopLevel
import typings.k6.htmlMod.NodeType.CommentNode
import typings.k6.htmlMod.NodeType.DoctypeNode
import typings.k6.htmlMod.NodeType.DocumentNode
import typings.k6.htmlMod.NodeType.ElementNode
import typings.k6.htmlMod.NodeType.TextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeType extends js.Object

@JSImport("k6/html", "NodeType")
@js.native
object NodeType extends js.Object {
  @js.native
  sealed trait CommentNode extends NodeType
  
  @js.native
  sealed trait DoctypeNode extends NodeType
  
  @js.native
  sealed trait DocumentNode extends NodeType
  
  @js.native
  sealed trait ElementNode extends NodeType
  
  @js.native
  sealed trait TextNode extends NodeType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
  /* 8 */ @js.native
  object CommentNode extends TopLevel[CommentNode with Double]
  
  /* 10 */ @js.native
  object DoctypeNode extends TopLevel[DoctypeNode with Double]
  
  /* 9 */ @js.native
  object DocumentNode extends TopLevel[DocumentNode with Double]
  
  /* 1 */ @js.native
  object ElementNode extends TopLevel[ElementNode with Double]
  
  /* 3 */ @js.native
  object TextNode extends TopLevel[TextNode with Double]
  
}

