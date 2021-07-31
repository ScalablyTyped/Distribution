package typings.jqueryMockjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def mockjax(options: js.Array[MockJaxSettings]): js.Array[Double]
  def mockjax(options: MockJaxSettings): Double
  
  var mockjaxSettings: MockJaxSettings
  
  @JSName("mockjax")
  var mockjax_Original: MockJaxStatic
}
object JQueryStatic {
  
  @scala.inline
  def apply(mockjax: MockJaxStatic, mockjaxSettings: MockJaxSettings): JQueryStatic = {
    val __obj = js.Dynamic.literal(mockjax = mockjax.asInstanceOf[js.Any], mockjaxSettings = mockjaxSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMockjax(value: MockJaxStatic): Self = StObject.set(x, "mockjax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMockjaxSettings(value: MockJaxSettings): Self = StObject.set(x, "mockjaxSettings", value.asInstanceOf[js.Any])
  }
}
