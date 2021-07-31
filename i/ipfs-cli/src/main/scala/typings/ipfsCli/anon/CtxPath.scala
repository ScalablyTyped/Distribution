package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxPath extends StObject {
  
  var ctx: IpfsAny
  
  var path: js.Any
  
  var recursive: js.Any
  
  var timeout: js.Any
}
object CtxPath {
  
  @scala.inline
  def apply(ctx: IpfsAny, path: js.Any, recursive: js.Any, timeout: js.Any): CtxPath = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxPath]
  }
  
  @scala.inline
  implicit class CtxPathMutableBuilder[Self <: CtxPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: IpfsAny): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: js.Any): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
