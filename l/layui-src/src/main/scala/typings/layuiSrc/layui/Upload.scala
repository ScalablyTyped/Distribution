package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Upload extends StObject {
  
  def render(option: UploadOption): Upload
}
object Upload {
  
  @scala.inline
  def apply(render: UploadOption => Upload): Upload = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Upload]
  }
  
  @scala.inline
  implicit class UploadMutableBuilder[Self <: Upload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: UploadOption => Upload): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
