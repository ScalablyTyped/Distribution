package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootComponent[T] extends StObject {
  
  /**
    * @summary  页面显示
    */
  def onAppear(): T
  
  /**
    * @summary  页面返回事件 返回true表示要拦截返回事件，不做页面关闭；返回false表示不做拦截，可以正常关闭页面
    */
  def onBack(): /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? T : boolean */ js.Any
  
  def onCreate(): T
  
  /**
    * @summary  页面销毁
    */
  def onDestroy(): T
  
  /**
    * @summary  页面隐藏
    */
  def onDisappear(): T
}
object RootComponent {
  
  inline def apply[T](
    onAppear: () => T,
    onBack: () => /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? T : boolean */ js.Any,
    onCreate: () => T,
    onDestroy: () => T,
    onDisappear: () => T
  ): RootComponent[T] = {
    val __obj = js.Dynamic.literal(onAppear = js.Any.fromFunction0(onAppear), onBack = js.Any.fromFunction0(onBack), onCreate = js.Any.fromFunction0(onCreate), onDestroy = js.Any.fromFunction0(onDestroy), onDisappear = js.Any.fromFunction0(onDisappear))
    __obj.asInstanceOf[RootComponent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootComponent[?], T] (val x: Self & RootComponent[T]) extends AnyVal {
    
    inline def setOnAppear(value: () => T): Self = StObject.set(x, "onAppear", js.Any.fromFunction0(value))
    
    inline def setOnBack(
      value: () => /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? T : boolean */ js.Any
    ): Self = StObject.set(x, "onBack", js.Any.fromFunction0(value))
    
    inline def setOnCreate(value: () => T): Self = StObject.set(x, "onCreate", js.Any.fromFunction0(value))
    
    inline def setOnDestroy(value: () => T): Self = StObject.set(x, "onDestroy", js.Any.fromFunction0(value))
    
    inline def setOnDisappear(value: () => T): Self = StObject.set(x, "onDisappear", js.Any.fromFunction0(value))
  }
}
