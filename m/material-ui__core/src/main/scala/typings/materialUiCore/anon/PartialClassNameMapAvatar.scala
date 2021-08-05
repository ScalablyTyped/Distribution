package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Avatar/Avatar.AvatarClassKey>> */
trait PartialClassNameMapAvatar extends StObject {
  
  var colorDefault: js.UndefOr[String] = js.undefined
  
  var img: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapAvatar {
  
  inline def apply(): PartialClassNameMapAvatar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapAvatar]
  }
  
  extension [Self <: PartialClassNameMapAvatar](x: Self) {
    
    inline def setColorDefault(value: String): Self = StObject.set(x, "colorDefault", value.asInstanceOf[js.Any])
    
    inline def setColorDefaultUndefined: Self = StObject.set(x, "colorDefault", js.undefined)
    
    inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
