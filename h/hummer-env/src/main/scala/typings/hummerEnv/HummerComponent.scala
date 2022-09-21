package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HummerComponent extends StObject {
  
  /**
    * @summary 为组件添加动画
    * @param animation : 添加的动画, 通过 KeyframeAnimation | BasicAnimation 生成的实例;
    * @param key: 动画对应的唯一key, 之后可以通过 removeAnimationForKey 删除对应的动画
    */
  def addAnimation(
    animation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyframeAnimation */ Any,
    key: String
  ): Unit = js.native
  
  /**
    * @summary 为组件绑定事件
    * @param type 事件类型
    * @param listener 触发事件后的回调
    */
  def addEventListener[K /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_event.EventHandlersEventMap * / any */ String */](
    `type`: K,
    listener: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_event.EventHandlersEventMap * / any[K] */ /* ev */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * @summary 组件是否响应交互
    */
  var enable: Boolean = js.native
  
  /**
    * 异步获取控件宽高等信息（单位：dp或pt）
    *
    * @param callback 结果回调，返回rect对象
    * @param rect.width  number 控件宽度
    * @param rect.height number 控件高度
    * @param rect.left number 控件左边框相对于父容器左边框的坐标
    * @param rect.right number 控件右边框相对于父容器左边框的坐标
    * @param rect.top number 控件上边框相对于父容器上边框的坐标
    * @param rect.bottom number 控件下边框相对于父容器上边框的坐标
    * @param rect.windowLeft number 控件左边框相对于屏幕左边缘的坐标
    * @param rect.windowRight number 控件右边框相对于屏幕左边缘的坐标
    * @param rect.windowTop number 控件上边框相对于屏幕上边缘的坐标
    * @param rect.windowBottom number 控件下边框相对于屏幕上边缘的坐标
    */
  def getRect(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.viewRect */ /* rect */ Any, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * @summary 删除组件上的所有动画
    */
  def removeAllAnimation(): Unit = js.native
  
  /**
    * @summary 删除key对应的动画
    * @param key addAnimation时添加的key
    */
  def removeAnimationForKey(key: String): Unit = js.native
  
  /**
    * @summary 移除组件事件
    * @param type 事件类型
    * @param listener 移除的事件
    */
  def removeEventListener[K /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_event.EventHandlersEventMap * / any */ String */](
    `type`: K,
    listener: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_event.EventHandlersEventMap * / any[K] */ /* ev */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * @summary 设置组件样式
    */
  var style: HummerCommonStyle = js.native
}
