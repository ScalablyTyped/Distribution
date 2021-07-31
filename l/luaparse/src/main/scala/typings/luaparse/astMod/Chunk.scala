package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk
  extends StObject
     with Base[typings.luaparse.luaparseStrings.Chunk]
     with _Node {
  
  var body: js.Array[Statement]
  
  var comments: js.UndefOr[js.Array[String]] = js.undefined
}
object Chunk {
  
  @scala.inline
  def apply(body: js.Array[Statement]): Chunk = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Chunk")
    __obj.asInstanceOf[Chunk]
  }
  
  @scala.inline
  implicit class ChunkMutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[String]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: String*): Self = StObject.set(x, "comments", js.Array(value :_*))
  }
}
