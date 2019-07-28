package typings.k6.htmlMod

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
  
  /* 8 */ val CommentNode: typings.k6.htmlMod.NodeType.CommentNode with Double = js.native
  /* 10 */ val DoctypeNode: typings.k6.htmlMod.NodeType.DoctypeNode with Double = js.native
  /* 9 */ val DocumentNode: typings.k6.htmlMod.NodeType.DocumentNode with Double = js.native
  /* 1 */ val ElementNode: typings.k6.htmlMod.NodeType.ElementNode with Double = js.native
  /* 3 */ val TextNode: typings.k6.htmlMod.NodeType.TextNode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
}

