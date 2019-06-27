package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeType extends js.Object

@JSImport("k6/html", "NodeType")
@js.native
object NodeType extends js.Object {
  @js.native
  sealed trait CommentNode
    extends k6Lib.htmlMod.NodeType
  
  @js.native
  sealed trait DoctypeNode
    extends k6Lib.htmlMod.NodeType
  
  @js.native
  sealed trait DocumentNode
    extends k6Lib.htmlMod.NodeType
  
  @js.native
  sealed trait ElementNode
    extends k6Lib.htmlMod.NodeType
  
  @js.native
  sealed trait TextNode
    extends k6Lib.htmlMod.NodeType
  
  /* 8 */ val CommentNode: CommentNode with scala.Double = js.native
  /* 10 */ val DoctypeNode: DoctypeNode with scala.Double = js.native
  /* 9 */ val DocumentNode: DocumentNode with scala.Double = js.native
  /* 1 */ val ElementNode: ElementNode with scala.Double = js.native
  /* 3 */ val TextNode: TextNode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[k6Lib.htmlMod.NodeType with scala.Double] = js.native
}

