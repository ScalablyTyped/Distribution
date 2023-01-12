package typings.hummerEnv

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AddEventListener extends StObject {
    
    /**
      * @summary 设置事件监听
      * @param event 要监听的事件名, 可以通过 triggerEvent 触发该事件
      * @param callback 回调函数
      */
    def addEventListener(event: String, callback: js.Function1[/* value */ js.UndefOr[Any], Unit]): Unit = js.native
    
    /**
      * @summary 移除事件监听
      * @param event 要移除的事件名
      * @param callback 要移除的回调函数
      */
    def removeEventListener(event: String, callback: js.Function1[/* value */ js.UndefOr[Any], Unit]): Unit = js.native
    
    /**
      * @summary 触发事件
      * @param event 触发的事件名
      * @param param 传递的参数, 会当成 addEventListerner 回调函数的参数
      */
    def triggerEvent(event: String): Unit = js.native
    def triggerEvent(event: String, param: Any): Unit = js.native
  }
  
  trait Animated extends StObject {
    
    var animated: Boolean
    
    var closeSelf: Boolean
    
    var params: StringDictionary[String | Double]
    
    var sourcePath: String
    
    var url: String
  }
  object Animated {
    
    inline def apply(
      animated: Boolean,
      closeSelf: Boolean,
      params: StringDictionary[String | Double],
      sourcePath: String,
      url: String
    ): Animated = {
      val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], closeSelf = closeSelf.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animated]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setCloseSelf(value: Boolean): Self = StObject.set(x, "closeSelf", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[String | Double]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppName extends StObject {
    
    /**
      * @summary App名字
      */
    var appName: String
    
    /**
      * @summary App版本号
      */
    var appVersion: String
    
    /**
      * @summary 可用范围高度（单位：dp或pt）
      */
    var availableHeight: Double
    
    /**
      * @summary 可用范围宽度（单位：dp或pt）
      */
    var availableWidth: Double
    
    /**
      * @summary 设备高度（单位：dp或pt）
      */
    var deviceHeight: Double
    
    /**
      * @summary 设备宽度（单位：dp或pt）
      */
    var deviceWidth: Double
    
    /**
      * @summary 平台系统版本号
      */
    var osVersion: String
    
    /**
      * @summary 平台类型
      */
    var platform: String
    
    /**
      * @summary iOS安全区域高度（单位：dp或pt）（Android可忽略）
      */
    var safeAreaBottom: Double
    
    /**
      * @summary 像素缩放比例
      */
    var scale: Double
    
    /**
      * @summary 状态栏高度（单位：dp或pt）
      */
    var statusBarHeight: Double
  }
  object AppName {
    
    inline def apply(
      appName: String,
      appVersion: String,
      availableHeight: Double,
      availableWidth: Double,
      deviceHeight: Double,
      deviceWidth: Double,
      osVersion: String,
      platform: String,
      safeAreaBottom: Double,
      scale: Double,
      statusBarHeight: Double
    ): AppName = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], availableHeight = availableHeight.asInstanceOf[js.Any], availableWidth = availableWidth.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], safeAreaBottom = safeAreaBottom.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppName] (val x: Self) extends AnyVal {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setAvailableHeight(value: Double): Self = StObject.set(x, "availableHeight", value.asInstanceOf[js.Any])
      
      inline def setAvailableWidth(value: Double): Self = StObject.set(x, "availableWidth", value.asInstanceOf[js.Any])
      
      inline def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSafeAreaBottom(value: Double): Self = StObject.set(x, "safeAreaBottom", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
  }
  object BackgroundColor {
    
    inline def apply(): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait Easing[V] extends StObject {
    
    var easing: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any
      ] = js.undefined
    
    var percent: Double
    
    var value: V
  }
  object Easing {
    
    inline def apply[V](percent: Double, value: V): Easing[V] = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Easing[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Easing[?], V] (val x: Self & Easing[V]) extends AnyVal {
      
      inline def setEasing(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.animationEasing */ Any
      ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
