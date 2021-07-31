package typings.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/AvatarGroup/AvatarGroup.AvatarGroupClassKey>> */
trait PartialClassNameMapAvatar extends StObject {
  
  var avatar: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapAvatar {
  
  @scala.inline
  def apply(): PartialClassNameMapAvatar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapAvatar]
  }
  
  @scala.inline
  implicit class PartialClassNameMapAvatarMutableBuilder[Self <: PartialClassNameMapAvatar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
