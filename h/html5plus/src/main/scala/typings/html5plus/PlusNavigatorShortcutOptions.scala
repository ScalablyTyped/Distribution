package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 创建应用快捷方式要设置的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
  */
trait PlusNavigatorShortcutOptions extends StObject {
  
  /**
    * 要启动Activity类名
    * 通常情况下不需要指定此值，仅在5+SDK集成时自定义Activity才用到。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var classname: js.UndefOr[String] = js.undefined
  
  /**
    * 快捷方式的扩展参数
    * 其中key和value值都必须是字符串类型。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var extra: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 是否需要强制创建快捷方式
    * true表示强制创建，false表示不强制创建，默认值为true。
    *     强制创建可能会导致在无法判断快捷方式是否存在的设备上重复创建，如果需要尽可能避免出现重复创建桌面快捷方式则应该设置force属性值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 快捷方式的图标
    * 如果未设置则优先使用应用中指定的图标（manifest.json中icon节点下对应分辨率的图标），如未区配则使用应用的图标（仅在独立打包时），否则使用runtime提供的默认图标。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * 快捷方式名称
    * 如果未设置则使用应用的名称，manifest.json中name属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * 创建快捷方式后的提示信息
    * 快捷方式创建成功后显示，默认提示内容为“"XXXX"已创建桌面快捷方式”，其中"XXXX"为程序的名称，如果不需要提示则设置此值为空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var toast: js.UndefOr[String] = js.undefined
}
object PlusNavigatorShortcutOptions {
  
  inline def apply(): PlusNavigatorShortcutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNavigatorShortcutOptions]
  }
  
  extension [Self <: PlusNavigatorShortcutOptions](x: Self) {
    
    inline def setClassname(value: String): Self = StObject.set(x, "classname", value.asInstanceOf[js.Any])
    
    inline def setClassnameUndefined: Self = StObject.set(x, "classname", js.undefined)
    
    inline def setExtra(value: js.Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setToast(value: String): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
    
    inline def setToastUndefined: Self = StObject.set(x, "toast", js.undefined)
  }
}
