package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostTableNestedHeaders extends StObject {
  
  def clear(): Unit = js.native
  
  var container: js.Any = js.native
  
  var nestedHeaders: NestedHeaders = js.native
  
  var widthsCache: js.Array[_] = js.native
}
object GhostTableNestedHeaders {
  
  @scala.inline
  def apply(clear: () => Unit, container: js.Any, nestedHeaders: NestedHeaders, widthsCache: js.Array[_]): GhostTableNestedHeaders = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), container = container.asInstanceOf[js.Any], nestedHeaders = nestedHeaders.asInstanceOf[js.Any], widthsCache = widthsCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostTableNestedHeaders]
  }
  
  @scala.inline
  implicit class GhostTableNestedHeadersMutableBuilder[Self <: GhostTableNestedHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedHeaders(value: NestedHeaders): Self = StObject.set(x, "nestedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthsCache(value: js.Array[_]): Self = StObject.set(x, "widthsCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthsCacheVarargs(value: js.Any*): Self = StObject.set(x, "widthsCache", js.Array(value :_*))
  }
}
