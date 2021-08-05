package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.count
import typings.layuiSrc.layuiSrcStrings.limit
import typings.layuiSrc.layuiSrcStrings.next
import typings.layuiSrc.layuiSrcStrings.page
import typings.layuiSrc.layuiSrcStrings.prev
import typings.layuiSrc.layuiSrcStrings.skip
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageOptions extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var curr: js.UndefOr[Double] = js.undefined
  
  // id选择器 不加#
  var elem: js.UndefOr[String | HTMLElement] = js.undefined
  
  var first: js.UndefOr[String] = js.undefined
  
  var groups: js.UndefOr[Double] = js.undefined
  
  var hash: js.UndefOr[String | Boolean] = js.undefined
  
  var jump: js.UndefOr[js.Function2[/* obj */ this.type, /* first */ Boolean, Unit]] = js.undefined
  
  var last: js.UndefOr[String] = js.undefined
  
  var layout: js.UndefOr[js.Array[count | prev | page | next | limit | skip]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var limits: js.UndefOr[js.Array[Double]] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
  
  var prev: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
}
object PageOptions {
  
  inline def apply(): PageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageOptions]
  }
  
  extension [Self <: PageOptions](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCurr(value: Double): Self = StObject.set(x, "curr", value.asInstanceOf[js.Any])
    
    inline def setCurrUndefined: Self = StObject.set(x, "curr", js.undefined)
    
    inline def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setGroups(value: Double): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setHash(value: String | Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setJump(value: (PageOptions, /* first */ Boolean) => Unit): Self = StObject.set(x, "jump", js.Any.fromFunction2(value))
    
    inline def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
    
    inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setLayout(value: js.Array[count | prev | page | next | limit | skip]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLayoutVarargs(value: (count | prev | page | next | limit | skip)*): Self = StObject.set(x, "layout", js.Array(value :_*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLimits(value: js.Array[Double]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setLimitsVarargs(value: Double*): Self = StObject.set(x, "limits", js.Array(value :_*))
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
