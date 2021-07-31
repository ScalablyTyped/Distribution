package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edges extends StObject {
  
  var ctx: Print
  
  var edges: js.Any
  
  var format: js.Any
  
  var key: js.Any
  
  var keys: js.Any
  
  var maxDepth: js.Any
  
  var recursive: js.Any
  
  var timeout: js.Any
  
  var unique: js.Any
}
object Edges {
  
  @scala.inline
  def apply(
    ctx: Print,
    edges: js.Any,
    format: js.Any,
    key: js.Any,
    keys: js.Any,
    maxDepth: js.Any,
    recursive: js.Any,
    timeout: js.Any,
    unique: js.Any
  ): Edges = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edges]
  }
  
  @scala.inline
  implicit class EdgesMutableBuilder[Self <: Edges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdges(value: js.Any): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: js.Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDepth(value: js.Any): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: js.Any): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: js.Any): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
