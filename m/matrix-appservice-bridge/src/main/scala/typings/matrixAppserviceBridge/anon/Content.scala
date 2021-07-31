package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content[T] extends StObject {
  
  var content: T
  
  var ts: Double
}
object Content {
  
  @scala.inline
  def apply[T](content: T, ts: Double): Content[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content[T]]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content[?], T] (val x: Self & Content[T]) extends AnyVal {
    
    @scala.inline
    def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
