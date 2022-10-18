package typings.hummerEnv

import org.scalablytyped.runtime.StringDictionary
import typings.hummerEnv.anon.AddEventListener
import typings.hummerEnv.anon.Animated
import typings.hummerEnv.anon.AppName
import typings.hummerEnv.anon.Easing
import typings.hummerEnv.hummerEnvStrings.end
import typings.hummerEnv.hummerEnvStrings.start
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("BasicAnimation")
  @js.native
  open class BasicAnimation[T /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationTypeMap * / any */ String */] protected ()
    extends StObject
       with typings.hummerEnv.BasicAnimation[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationTypeMap * / any[T] */ js.Any
        ] {
    /**
      * @param animationType:    "position" | "scale" | "scaleX" | "scaleY" | "rotationX" | "rotationY" | "rotationZ" | "opacity" | "backgroundColor" | "width" | "height";
      * @param animationType = position - 平移动画，单位：px、hm、dp/pt
      * @param animationType = scale - 缩放动画（x轴和y轴同时）
      * @param animationType = scaleX - 缩放动画（x轴）
      * @param animationType = scaleY - 缩放动画（y轴）
      * @param animationType = rotationX - 旋转动画（x轴），单位：度
      * @param animationType = rotationY - 旋转动画（y轴），单位：度
      * @param animationType = rotationZ - 旋转动画（z轴），单位：度
      * @param animationType = opacity - 透明度动画，取值为[0, 1]（0-全透明, 1-不透明）
      * @param animationType = backgroundColor - 背景色动画
      * @param animationType = width - 宽度动画
      * @param animationType = height - 高度动画
      */
    def this(animationType: T) = this()
    
    /**
      * @summary 动画延时（单位：秒）
      */
    /* CompleteClass */
    var delay: Double = js.native
    
    /**
      * @summary 动画持续时间（单位：秒）
      */
    /* CompleteClass */
    var duration: Double = js.native
    
    /**
      * @summary 动画运动速率曲线
      */
    /* CompleteClass */
    var easing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any = js.native
    
    /**
      * 动画执行开始或结束时的回调
      *
      * @param event 事件类型（'start' 或 'end'）
      * @param callback 事件回调
      */
    /* CompleteClass */
    override def on(event: start | end, cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * @summary 动画次数 <0: 无限次 0、1: 动画做1次 2: 动画做2次
      */
    /* CompleteClass */
    var repeatCount: Double = js.native
    
    /**
      * @summary 属性值
      */
    /* CompleteClass */
    var value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationTypeMap * / any[T] */ js.Any = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Button")
  @js.native
  /**
    * 按钮控件
    */
  open class Button ()
    extends StObject
       with typings.hummerEnv.Button
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("CanvasView")
  @js.native
  /**
    * 画布组件，可用于绘制一些自定义图形，如：线段、矩形、圆形、椭圆、图片、文本等，从而实现复杂图形的展示。
    */
  open class CanvasView ()
    extends StObject
       with typings.hummerEnv.CanvasView {
    def this(id: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Dialog")
  @js.native
  open class Dialog ()
    extends StObject
       with typings.hummerEnv.Dialog
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("HorizontalScroller")
  @js.native
  /**
    * 水平滚动组件。
    */
  open class HorizontalScroller ()
    extends StObject
       with typings.hummerEnv.HorizontalScroller {
    
    /**
      * 添加子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def appendChild(view: HummerComponent): Unit = js.native
    
    /**
      * 在指定子视图前插入一个子视图
      *
      * @param view 新的子视图
      * @param existingChild 指定的子视图
      */
    /* CompleteClass */
    override def insertBefore(view: HummerComponent, existingChild: HummerComponent): Unit = js.native
    
    /**
      * 移除所有子视图
      */
    /* CompleteClass */
    override def removeAll(): Unit = js.native
    
    /**
      * 移除子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def removeChild(view: HummerComponent): Unit = js.native
    
    /**
      * 把指定的子视图替换成另一个子视图
      *
      * @param newView 新的子视图
      * @param oldView 指定的子视图
      */
    /* CompleteClass */
    override def replaceChild(newView: HummerComponent, oldView: HummerComponent): Unit = js.native
  }
  
  object Hummer {
    
    @JSGlobal("Hummer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Hummer.env")
    @js.native
    def env: AppName = js.native
    inline def env_=(x: AppName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("env")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Hummer.notifyCenter")
    @js.native
    def notifyCenter: AddEventListener = js.native
    inline def notifyCenter_=(x: AddEventListener): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifyCenter")(x.asInstanceOf[js.Any])
    
    /**
      * 当前页面信息
      */
    @JSGlobal("Hummer.pageInfo")
    @js.native
    def pageInfo: Animated = js.native
    inline def pageInfo_=(x: Animated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(x.asInstanceOf[js.Any])
    
    inline def render(view: HummerComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Image")
  @js.native
  /**
    * 图片组件。
    */
  open class Image ()
    extends StObject
       with typings.hummerEnv.Image
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Input")
  @js.native
  /**
    * 单行文本输入组件。
    */
  open class Input ()
    extends StObject
       with typings.hummerEnv.Input
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("KeyframeAnimation")
  @js.native
  open class KeyframeAnimation[T /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationTypeMap * / any */ String */] protected ()
    extends StObject
       with typings.hummerEnv.KeyframeAnimation[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationTypeMap * / any[T] */ js.Any
        ] {
    /**
      * @param animationType:    "position" | "scale" | "scaleX" | "scaleY" | "rotationX" | "rotationY" | "rotationZ" | "opacity" | "backgroundColor" | "width" | "height";
      * @param animationType = position - 平移动画，单位：px、hm、dp/pt
      * @param animationType = scale - 缩放动画（x轴和y轴同时）
      * @param animationType = scaleX - 缩放动画（x轴）
      * @param animationType = scaleY - 缩放动画（y轴）
      * @param animationType = rotationX - 旋转动画（x轴），单位：度
      * @param animationType = rotationY - 旋转动画（y轴），单位：度
      * @param animationType = rotationZ - 旋转动画（z轴），单位：度
      * @param animationType = opacity - 透明度动画，取值为[0, 1]（0-全透明, 1-不透明）
      * @param animationType = backgroundColor - 背景色动画
      * @param animationType = width - 宽度动画
      * @param animationType = height - 高度动画
      */
    def this(animationType: T) = this()
    
    /**
      * @summary 动画延时（单位：秒）
      */
    /* CompleteClass */
    var delay: Double = js.native
    
    /**
      * @summary 动画持续时间（单位：秒）
      */
    /* CompleteClass */
    var duration: Double = js.native
    
    /**
      * @summary 动画运动速率曲线
      */
    /* CompleteClass */
    var easing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any = js.native
    
    /**
      * @summary 关键帧
      */
    /* CompleteClass */
    var keyframes: js.Array[
        Easing[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationTypeMap * / any[T] */ js.Any
        ]
      ] = js.native
    
    /**
      * 动画执行开始或结束时的回调
      *
      * @param event 事件类型（'start' 或 'end'）
      * @param callback 事件回调
      */
    /* CompleteClass */
    override def on(event: start | end, cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * @summary 动画次数 <0: 无限次 0、1: 动画做1次 2: 动画做2次
      */
    /* CompleteClass */
    var repeatCount: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("List")
  @js.native
  /**
    * 列表组件。
    */
  open class List ()
    extends StObject
       with typings.hummerEnv.List
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Location")
  @js.native
  open class Location ()
    extends StObject
       with typings.hummerEnv.Location
  
  object Memory {
    
    @JSGlobal("Memory")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 是否存在某个键值对
      *
      * @param key 名称
      */
    inline def exist(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exist")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * 获取键对应的值
      *
      * @param key 名称
      * @return value 值
      */
    inline def get(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * 删除键值对
      *
      * @param key 名称
      */
    inline def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 删除所有数据
      */
    inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
    
    /**
      * 保存键值对
      *
      * @param key 名称
      * @param value 值
      */
    inline def set(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Navigator {
    
    @JSGlobal("Navigator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * @param pageInfo 页面信息
      * @param pageInfo.url 跳转页面url
      * @param pageInfo.params 页面间传递的参数
      * @param pageInfo.animated 是否需要转场动画（默认是true）
      * @param pageInfo.id 页面唯一标示，可以不传，当需要pop到该页面时，需要指定page的id
      * @param pageInfo.closeSelf 打开页面时是否关闭自身 (默认是false)
      * @param cb 回调函数
      */
    inline def openPage(
      pageInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.JumpPageInfo */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openPage")(pageInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def openPage(
      pageInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.JumpPageInfo */ Any,
      cb: js.Function1[/* obj */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openPage")(pageInfo.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @summary 回退指定数量的页面
      * @param count 回退的页面数量
      * @param pageInfo.animated 是否需要转场动画（默认是true）
      */
    inline def popBack(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popBack")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def popBack(
      count: Double,
      pageInfo: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.JumpPageInfo */ Any
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("popBack")(count.asInstanceOf[js.Any], pageInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @summary 关闭当前页面
      * @param pageInfo.animated 是否需要转场动画（默认是true）
      */
    inline def popPage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popPage")().asInstanceOf[Unit]
    inline def popPage(
      pageInfo: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.JumpPageInfo */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popPage")(pageInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 回退到指定页面
      * @param pageInfo 页面信息
      * @param pageInfo.id 指定页面的id, 通过openPage打开页面时设置的id
      */
    inline def popToPage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popToPage")().asInstanceOf[Unit]
    inline def popToPage(
      pageInfo: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.JumpPageInfo */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popToPage")(pageInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @summary 回退到首页
      * @param pageInfo.animated 是否需要转场动画（默认是true）
      */
    inline def popToRootPage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popToRootPage")().asInstanceOf[Unit]
    inline def popToRootPage(
      pageInfo: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.JumpPageInfo */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popToRootPage")(pageInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Request")
  @js.native
  open class Request ()
    extends StObject
       with typings.hummerEnv.Request {
    
    /**
      * @summary 网络请求头部
      */
    /* CompleteClass */
    var header: StringDictionary[String | Double] = js.native
    
    /**
      * @summary 请求方式（不区分大小写）
      */
    /* CompleteClass */
    var method: String = js.native
    
    /**
      * @summary 网络请求参数
      */
    /* CompleteClass */
    var param: StringDictionary[String | Double] = js.native
    
    /**
      * 发起网络请求
      * @param cb 请求返回触发的回调
      */
    /* CompleteClass */
    override def send(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.RequestResponse */ /* response */ Any, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * @summary 超时时间（单位：毫秒）
      */
    /* CompleteClass */
    var timeout: Double = js.native
    
    /**
      * @summary API地址 【必填】
      */
    /* CompleteClass */
    var url: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Scroller")
  @js.native
  /**
    * 垂直滚动组件。
    */
  open class Scroller ()
    extends StObject
       with typings.hummerEnv.Scroller {
    
    /**
      * 添加子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def appendChild(view: HummerComponent): Unit = js.native
    
    /**
      * 在指定子视图前插入一个子视图
      *
      * @param view 新的子视图
      * @param existingChild 指定的子视图
      */
    /* CompleteClass */
    override def insertBefore(view: HummerComponent, existingChild: HummerComponent): Unit = js.native
    
    /**
      * 移除所有子视图
      */
    /* CompleteClass */
    override def removeAll(): Unit = js.native
    
    /**
      * 移除子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def removeChild(view: HummerComponent): Unit = js.native
    
    /**
      * 把指定的子视图替换成另一个子视图
      *
      * @param newView 新的子视图
      * @param oldView 指定的子视图
      */
    /* CompleteClass */
    override def replaceChild(newView: HummerComponent, oldView: HummerComponent): Unit = js.native
  }
  
  object Storage {
    
    @JSGlobal("Storage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 是否存在某个键值对
      *
      * @param key 名称
      */
    inline def exist(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exist")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * 获取键对应的值
      *
      * @param key 名称
      * @return value 值
      */
    inline def get(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * 删除键值对
      *
      * @param key 名称
      */
    inline def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 删除所有数据
      */
    inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
    
    /**
      * 保存键值对
      *
      * @param key 名称
      * @param value 值
      */
    inline def set(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Switch")
  @js.native
  /**
    * 开关组件。
    */
  open class Switch ()
    extends StObject
       with typings.hummerEnv.Switch
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Text")
  @js.native
  /**
    * 文本展示控件。
    */
  open class Text ()
    extends StObject
       with typings.hummerEnv.Text
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("TextArea")
  @js.native
  /**
    * 多行文本输入组件。
    */
  open class TextArea ()
    extends StObject
       with typings.hummerEnv.TextArea
  
  object Toast {
    
    @JSGlobal("Toast")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @summary 显示自定义Toast
      * @param view 自定义View
      * @param duration 时长（安卓上duration<=2000时是短时长，duration>2000是长时长）
      */
    inline def custom(view: HummerComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def custom(view: HummerComponent, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("custom")(view.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @summary 展示默认Toast
      * @param msg 信息
      * @param duration 时长（安卓上duration<=2000时是短时长，duration>2000是长时长）
      */
    inline def show(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def show(msg: String, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(msg.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("View")
  @js.native
  /**
    * 容器视图，类似于web端的div标签，内部可以放入其他子视图。
    */
  open class View ()
    extends StObject
       with typings.hummerEnv.View {
    def this(id: String) = this()
    
    /**
      * 添加子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def appendChild(view: HummerComponent): Unit = js.native
    
    /**
      * 在指定子视图前插入一个子视图
      *
      * @param view 新的子视图
      * @param existingChild 指定的子视图
      */
    /* CompleteClass */
    override def insertBefore(view: HummerComponent, existingChild: HummerComponent): Unit = js.native
    
    /**
      * 移除所有子视图
      */
    /* CompleteClass */
    override def removeAll(): Unit = js.native
    
    /**
      * 移除子视图
      * @param view 子视图
      */
    /* CompleteClass */
    override def removeChild(view: HummerComponent): Unit = js.native
    
    /**
      * 把指定的子视图替换成另一个子视图
      *
      * @param newView 新的子视图
      * @param oldView 指定的子视图
      */
    /* CompleteClass */
    override def replaceChild(newView: HummerComponent, oldView: HummerComponent): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ViewPager")
  @js.native
  /**
    * 可自动轮播滚动的翻页组件。
    */
  open class ViewPager ()
    extends StObject
       with typings.hummerEnv.ViewPager
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WebSocket")
  @js.native
  open class WebSocket protected ()
    extends StObject
       with typings.hummerEnv.WebSocket {
    def this(url: String) = this()
    
    /**
      * @summary 链接关闭时的回调
      * @param cb 回调函数, 回调参数 event: {code:错误码(number), reason: 错误原因(string)}
      */
    /* CompleteClass */
    override def onclose(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * @summary 链接出错时的回调
      * @param cb 回调函数
      */
    /* CompleteClass */
    override def onerror(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * @summary 接收消息的回调
      * @param cb 回调函数 , 回调参数 event : {data: 消息文本(string)}
      */
    /* CompleteClass */
    override def onmessage(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * @summary 链接连上时的回调
      * @param cb 回调函数
      */
    /* CompleteClass */
    override def onopen(cb: js.Function0[Unit]): Unit = js.native
  }
  
  inline def clearInterval(timer: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(timer: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object console {
    
    @JSGlobal("console")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def error(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def log(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def setInterval(cb: js.Function0[Unit], interval: Double): Double = (js.Dynamic.global.applyDynamic("setInterval")(cb.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setTimeout(cb: js.Function0[Unit], timeout: Double): Double = (js.Dynamic.global.applyDynamic("setTimeout")(cb.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Double]
}
