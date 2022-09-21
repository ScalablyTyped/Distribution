package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewPager
  extends StObject
     with HummerComponent {
  
  /**
    * 数据源（不设置自定义View时，可以直接传图片url数组作为数据源）
    */
  var data: js.Array[Any] = js.native
  
  /**
    * 设置ViewPager页面被点击的回调
    *
    * @param callback 回调。参数：参数index:页面的位置
    */
  def onItemClick(cb: js.Function1[/* index */ Double, Unit]): Unit = js.native
  
  /**
    * 设置ViewPager页面自定义View创建和更新的回调
    *
    * @param callback 回调。参数position:当前位置；view:当前控件，当view为null时说明要创建view。最后返回view。
    */
  def onItemView(
    cb: js.Function2[/* currentIndex */ Double, /* view */ js.UndefOr[HummerComponent], HummerComponent]
  ): Unit = js.native
  
  /**
    * 设置ViewPager翻页时的回调
    *
    * @param callback 回调。参数：currentIndex:当前位置； total:item总个数
    */
  def onPageChange(cb: js.Function2[/* currentIndex */ Double, /* total */ Double, Unit]): Unit = js.native
  
  /**
    * 设置当前显示的页面
    *
    * @param index 当前显示页面的位置
    */
  def setCurrentItem(index: Double): Unit = js.native
  
  @JSName("style")
  var style_ViewPager: ViewPagerStyle = js.native
}
