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

object mod {
  
  @JSImport("hummer-env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("hummer-env", "BasicAnimation")
  @js.native
  open class BasicAnimationCls[T /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationTypeMap * / any */ String */] protected ()
    extends StObject
       with BasicAnimation[
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("hummer-env", "Dialog")
  @js.native
  open class DialogCls ()
    extends StObject
       with Dialog
  
  object Hummer {
    
    @JSImport("hummer-env", "Hummer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hummer-env", "Hummer.env")
    @js.native
    def env: AppName = js.native
    inline def env_=(x: AppName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("env")(x.asInstanceOf[js.Any])
    
    @JSImport("hummer-env", "Hummer.notifyCenter")
    @js.native
    def notifyCenter: AddEventListener = js.native
    inline def notifyCenter_=(x: AddEventListener): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifyCenter")(x.asInstanceOf[js.Any])
    
    /**
      * 当前页面信息
      */
    @JSImport("hummer-env", "Hummer.pageInfo")
    @js.native
    def pageInfo: Animated = js.native
    inline def pageInfo_=(x: Animated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(x.asInstanceOf[js.Any])
    
    inline def render(view: HummerComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("hummer-env", "KeyframeAnimation")
  @js.native
  open class KeyframeAnimationCls[T /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationTypeMap * / any */ String */] protected ()
    extends StObject
       with KeyframeAnimation[
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("hummer-env", "Location")
  @js.native
  open class LocationCls ()
    extends StObject
       with Location
  
  object Memory {
    
    @JSImport("hummer-env", "Memory")
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
    
    @JSImport("hummer-env", "Navigator")
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("hummer-env", "Request")
  @js.native
  open class RequestCls ()
    extends StObject
       with Request {
    
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
  
  object Storage {
    
    @JSImport("hummer-env", "Storage")
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
  
  object Toast {
    
    @JSImport("hummer-env", "Toast")
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("hummer-env", "WebSocket")
  @js.native
  open class WebSocketCls protected ()
    extends StObject
       with WebSocket {
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
  
  inline def clearInterval(timer: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(timer: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object console {
    
    @JSImport("hummer-env", "console")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def error(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def log(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(msg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def setInterval(cb: js.Function0[Unit], interval: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(cb.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setTimeout(cb: js.Function0[Unit], timeout: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(cb.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait BasicAnimation[V] extends StObject {
    
    /**
      * @summary 动画延时（单位：秒）
      */
    var delay: Double
    
    /**
      * @summary 动画持续时间（单位：秒）
      */
    var duration: Double
    
    /**
      * @summary 动画运动速率曲线
      */
    var easing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any
    
    /**
      * 动画执行开始或结束时的回调
      *
      * @param event 事件类型（'start' 或 'end'）
      * @param callback 事件回调
      */
    def on(event: start | end, cb: js.Function0[Unit]): Unit
    
    /**
      * @summary 动画次数 <0: 无限次 0、1: 动画做1次 2: 动画做2次
      */
    var repeatCount: Double
    
    /**
      * @summary 属性值
      */
    var value: V
  }
  object BasicAnimation {
    
    inline def apply[V](
      delay: Double,
      duration: Double,
      easing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any,
      on: (start | end, js.Function0[Unit]) => Unit,
      repeatCount: Double,
      value: V
    ): BasicAnimation[V] = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), repeatCount = repeatCount.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicAnimation[V]]
    }
    
    extension [Self <: BasicAnimation[?], V](x: Self & BasicAnimation[V]) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any
      ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (start | end, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dialog extends StObject {
    
    /**
      * 显示提示对话框（用户需要点击【确定】按钮才能继续进行操作）
      *
      * @param msg 内容
      * @param btnText 按钮内容
      * @param callback 按钮点击回调
      */
    def alert(msg: String): Unit = js.native
    def alert(msg: String, btnText: String): Unit = js.native
    def alert(msg: String, btnText: String, callback: js.Function0[Unit]): Unit = js.native
    def alert(msg: String, btnText: Unit, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @summary 是否可以被取消（按返回键或者点击空白区域是否可以关闭对话框）默认 true
      */
    var cancelable: Boolean = js.native
    
    /**
      * 显示确认对话框（用户需要点击【确定】或【取消】按钮才能继续进行操作）
      *
      * @param title 标题
      * @param msg 内容
      * @param okBtnText [确认]按钮内容
      * @param cancelBtnText [取消]按钮内容
      * @param okCallback [确认]按钮点击回调
      * @param cancelCallback [取消]按钮点击回调
      */
    def confirm(title: String): Unit = js.native
    def confirm(title: String, msg: String): Unit = js.native
    def confirm(title: String, msg: String, okBtnText: String): Unit = js.native
    def confirm(title: String, msg: String, okBtnText: String, cancelBtnText: String): Unit = js.native
    def confirm(
      title: String,
      msg: String,
      okBtnText: String,
      cancelBtnText: String,
      okCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(
      title: String,
      msg: String,
      okBtnText: String,
      cancelBtnText: String,
      okCallback: js.Function0[Unit],
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(
      title: String,
      msg: String,
      okBtnText: String,
      cancelBtnText: String,
      okCallback: Unit,
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(title: String, msg: String, okBtnText: String, cancelBtnText: Unit, okCallback: js.Function0[Unit]): Unit = js.native
    def confirm(
      title: String,
      msg: String,
      okBtnText: String,
      cancelBtnText: Unit,
      okCallback: js.Function0[Unit],
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(
      title: String,
      msg: String,
      okBtnText: String,
      cancelBtnText: Unit,
      okCallback: Unit,
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(title: String, msg: String, okBtnText: Unit, cancelBtnText: String): Unit = js.native
    def confirm(title: String, msg: String, okBtnText: Unit, cancelBtnText: String, okCallback: js.Function0[Unit]): Unit = js.native
    def confirm(
      title: String,
      msg: String,
      okBtnText: Unit,
      cancelBtnText: String,
      okCallback: js.Function0[Unit],
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(
      title: String,
      msg: String,
      okBtnText: Unit,
      cancelBtnText: String,
      okCallback: Unit,
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(title: String, msg: String, okBtnText: Unit, cancelBtnText: Unit, okCallback: js.Function0[Unit]): Unit = js.native
    def confirm(
      title: String,
      msg: String,
      okBtnText: Unit,
      cancelBtnText: Unit,
      okCallback: js.Function0[Unit],
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(
      title: String,
      msg: String,
      okBtnText: Unit,
      cancelBtnText: Unit,
      okCallback: Unit,
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(title: String, msg: Unit, okBtnText: String): Unit = js.native
    def confirm(title: String, msg: Unit, okBtnText: String, cancelBtnText: String): Unit = js.native
    def confirm(title: String, msg: Unit, okBtnText: String, cancelBtnText: String, okCallback: js.Function0[Unit]): Unit = js.native
    def confirm(
      title: String,
      msg: Unit,
      okBtnText: String,
      cancelBtnText: String,
      okCallback: js.Function0[Unit],
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(
      title: String,
      msg: Unit,
      okBtnText: String,
      cancelBtnText: String,
      okCallback: Unit,
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(title: String, msg: Unit, okBtnText: String, cancelBtnText: Unit, okCallback: js.Function0[Unit]): Unit = js.native
    def confirm(
      title: String,
      msg: Unit,
      okBtnText: String,
      cancelBtnText: Unit,
      okCallback: js.Function0[Unit],
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(
      title: String,
      msg: Unit,
      okBtnText: String,
      cancelBtnText: Unit,
      okCallback: Unit,
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(title: String, msg: Unit, okBtnText: Unit, cancelBtnText: String): Unit = js.native
    def confirm(title: String, msg: Unit, okBtnText: Unit, cancelBtnText: String, okCallback: js.Function0[Unit]): Unit = js.native
    def confirm(
      title: String,
      msg: Unit,
      okBtnText: Unit,
      cancelBtnText: String,
      okCallback: js.Function0[Unit],
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(
      title: String,
      msg: Unit,
      okBtnText: Unit,
      cancelBtnText: String,
      okCallback: Unit,
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(title: String, msg: Unit, okBtnText: Unit, cancelBtnText: Unit, okCallback: js.Function0[Unit]): Unit = js.native
    def confirm(
      title: String,
      msg: Unit,
      okBtnText: Unit,
      cancelBtnText: Unit,
      okCallback: js.Function0[Unit],
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    def confirm(
      title: String,
      msg: Unit,
      okBtnText: Unit,
      cancelBtnText: Unit,
      okCallback: Unit,
      cancelCallback: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * 显示自定义对话框
      *
      * @param view 自定义View
      */
    def custom(view: HummerComponent): Unit = js.native
    
    /**
      * 关闭对话框
      */
    def dismiss(): Unit = js.native
    
    /**
      * 显示等待对话框（只能通过调用dismiss方法关闭对话框）
      * @param msg message to display, can only be closed by dismiss method
      */
    def loading(msg: String): Unit = js.native
    
    /**
      * @summary 对话框显示层级是否是低层级（比系统对话框层级低）默认 false
      */
    var lowLayer: Boolean = js.native
  }
  
  trait KeyframeAnimation[V] extends StObject {
    
    /**
      * @summary 动画延时（单位：秒）
      */
    var delay: Double
    
    /**
      * @summary 动画持续时间（单位：秒）
      */
    var duration: Double
    
    /**
      * @summary 动画运动速率曲线
      */
    var easing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any
    
    /**
      * @summary 关键帧
      */
    var keyframes: js.Array[Easing[V]]
    
    /**
      * 动画执行开始或结束时的回调
      *
      * @param event 事件类型（'start' 或 'end'）
      * @param callback 事件回调
      */
    def on(event: start | end, cb: js.Function0[Unit]): Unit
    
    /**
      * @summary 动画次数 <0: 无限次 0、1: 动画做1次 2: 动画做2次
      */
    var repeatCount: Double
  }
  object KeyframeAnimation {
    
    inline def apply[V](
      delay: Double,
      duration: Double,
      easing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any,
      keyframes: js.Array[Easing[V]],
      on: (start | end, js.Function0[Unit]) => Unit,
      repeatCount: Double
    ): KeyframeAnimation[V] = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), repeatCount = repeatCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyframeAnimation[V]]
    }
    
    extension [Self <: KeyframeAnimation[?], V](x: Self & KeyframeAnimation[V]) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any
      ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setKeyframes(value: js.Array[Easing[V]]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesVarargs(value: Easing[V]*): Self = StObject.set(x, "keyframes", js.Array(value*))
      
      inline def setOn(value: (start | end, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Location extends StObject {
    
    /**
      * 获取上一次缓存的位置信息
      * @param cb 位置信息回调, (locationInfo : LocationInfo) => void
      */
    def getLastLocation(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * 定位时遇到的错误信息
      * @param cb 错误回调, (errCode:number, errMsg:string) => void;
      */
    def onError(cb: js.Function2[/* errCode */ Double, /* errMsg */ String, Unit]): Unit = js.native
    
    /**
      * 开启位置定位
      * @param cb 位置信息回调, (locationInfo : LocationInfo) => void
      * @param intervalTime 位置变化的时间间隔（单位：毫秒），默认60000毫秒
      * @param intervalDistance 位置变化的距离改变范围（单位：米），默认0米
      */
    def startLocation(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
          Unit
        ]
    ): Unit = js.native
    def startLocation(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
          Unit
        ],
      intervalTime: Double
    ): Unit = js.native
    def startLocation(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
          Unit
        ],
      intervalTime: Double,
      intervalDistance: Double
    ): Unit = js.native
    def startLocation(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
          Unit
        ],
      intervalTime: Unit,
      intervalDistance: Double
    ): Unit = js.native
    
    /**
      * 停止位置定位
      */
    def stopLocation(): Unit = js.native
  }
  
  trait Request extends StObject {
    
    /**
      * @summary 网络请求头部
      */
    var header: StringDictionary[String | Double]
    
    /**
      * @summary 请求方式（不区分大小写）
      */
    var method: String
    
    /**
      * @summary 网络请求参数
      */
    var param: StringDictionary[String | Double]
    
    /**
      * 发起网络请求
      * @param cb 请求返回触发的回调
      */
    def send(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.RequestResponse */ /* response */ Any, 
          Unit
        ]
    ): Unit
    
    /**
      * @summary 超时时间（单位：毫秒）
      */
    var timeout: Double
    
    /**
      * @summary API地址 【必填】
      */
    var url: String
  }
  object Request {
    
    inline def apply(
      header: StringDictionary[String | Double],
      method: String,
      param: StringDictionary[String | Double],
      send: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.RequestResponse */ /* response */ Any, 
          Unit
        ] => Unit,
      timeout: Double,
      url: String
    ): Request = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setHeader(value: StringDictionary[String | Double]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParam(value: StringDictionary[String | Double]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setSend(
        value: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.RequestResponse */ /* response */ Any, 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebSocket extends StObject {
    
    /**
      * @summary 链接关闭时的回调
      * @param cb 回调函数, 回调参数 event: {code:错误码(number), reason: 错误原因(string)}
      */
    def onclose(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
          Unit
        ]
    ): Unit
    
    /**
      * @summary 链接出错时的回调
      * @param cb 回调函数
      */
    def onerror(cb: js.Function0[Unit]): Unit
    
    /**
      * @summary 接收消息的回调
      * @param cb 回调函数 , 回调参数 event : {data: 消息文本(string)}
      */
    def onmessage(
      cb: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
          Unit
        ]
    ): Unit
    
    /**
      * @summary 链接连上时的回调
      * @param cb 回调函数
      */
    def onopen(cb: js.Function0[Unit]): Unit
  }
  object WebSocket {
    
    inline def apply(
      onclose: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
          Unit
        ] => Unit,
      onerror: js.Function0[Unit] => Unit,
      onmessage: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
          Unit
        ] => Unit,
      onopen: js.Function0[Unit] => Unit
    ): WebSocket = {
      val __obj = js.Dynamic.literal(onclose = js.Any.fromFunction1(onclose), onerror = js.Any.fromFunction1(onerror), onmessage = js.Any.fromFunction1(onmessage), onopen = js.Any.fromFunction1(onopen))
      __obj.asInstanceOf[WebSocket]
    }
    
    extension [Self <: WebSocket](x: Self) {
      
      inline def setOnclose(
        value: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
      
      inline def setOnerror(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnmessage(
        value: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
      
      inline def setOnopen(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onopen", js.Any.fromFunction1(value))
    }
  }
}
