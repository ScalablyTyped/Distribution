package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerComponent extends StObject {
  
  /**
    * 添加子视图
    * @param view 子视图
    */
  def appendChild(view: HummerComponent): Unit
  
  /**
    * 在指定子视图前插入一个子视图
    *
    * @param view 新的子视图
    * @param existingChild 指定的子视图
    */
  def insertBefore(view: HummerComponent, existingChild: HummerComponent): Unit
  
  /**
    * 移除所有子视图
    */
  def removeAll(): Unit
  
  /**
    * 移除子视图
    * @param view 子视图
    */
  def removeChild(view: HummerComponent): Unit
  
  /**
    * 把指定的子视图替换成另一个子视图
    *
    * @param newView 新的子视图
    * @param oldView 指定的子视图
    */
  def replaceChild(newView: HummerComponent, oldView: HummerComponent): Unit
}
object ContainerComponent {
  
  inline def apply(
    appendChild: HummerComponent => Unit,
    insertBefore: (HummerComponent, HummerComponent) => Unit,
    removeAll: () => Unit,
    removeChild: HummerComponent => Unit,
    replaceChild: (HummerComponent, HummerComponent) => Unit
  ): ContainerComponent = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), insertBefore = js.Any.fromFunction2(insertBefore), removeAll = js.Any.fromFunction0(removeAll), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild))
    __obj.asInstanceOf[ContainerComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerComponent] (val x: Self) extends AnyVal {
    
    inline def setAppendChild(value: HummerComponent => Unit): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setInsertBefore(value: (HummerComponent, HummerComponent) => Unit): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    inline def setRemoveAll(value: () => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction0(value))
    
    inline def setRemoveChild(value: HummerComponent => Unit): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    inline def setReplaceChild(value: (HummerComponent, HummerComponent) => Unit): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
  }
}
