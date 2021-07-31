package typings.jui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  /**
    * @cfg {Integer} [count=0]
    * Total number of data records subject to paging)
    */
  var count: js.UndefOr[Double] = js.undefined
  
  var event: js.UndefOr[js.Any] = js.undefined
  
  /**
    * @cfg {Integer} [pageCount=10]
    * Number of data records per page
    */
  var pageCount: js.UndefOr[Double] = js.undefined
  
  /**
    * @cfg {Integer} [screenCount=5]
    * Number of pages shown on the paging screen
    */
  var screenCount: js.UndefOr[Double] = js.undefined
  
  var tpl: js.UndefOr[js.Any] = js.undefined
}
object Count {
  
  @scala.inline
  def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    @scala.inline
    def setScreenCount(value: Double): Self = StObject.set(x, "screenCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenCountUndefined: Self = StObject.set(x, "screenCount", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
