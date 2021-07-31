package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType extends StObject
@JSImport("k6/html", "NodeType")
@js.native
object NodeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType & Double] = js.native
  
  @js.native
  sealed trait CommentNode
    extends StObject
       with NodeType
  /* 8 */ val CommentNode: typings.k6.htmlMod.NodeType.CommentNode & Double = js.native
  
  @js.native
  sealed trait DoctypeNode
    extends StObject
       with NodeType
  /* 10 */ val DoctypeNode: typings.k6.htmlMod.NodeType.DoctypeNode & Double = js.native
  
  @js.native
  sealed trait DocumentNode
    extends StObject
       with NodeType
  /* 9 */ val DocumentNode: typings.k6.htmlMod.NodeType.DocumentNode & Double = js.native
  
  @js.native
  sealed trait ElementNode
    extends StObject
       with NodeType
  /* 1 */ val ElementNode: typings.k6.htmlMod.NodeType.ElementNode & Double = js.native
  
  @js.native
  sealed trait TextNode
    extends StObject
       with NodeType
  /* 3 */ val TextNode: typings.k6.htmlMod.NodeType.TextNode & Double = js.native
}
