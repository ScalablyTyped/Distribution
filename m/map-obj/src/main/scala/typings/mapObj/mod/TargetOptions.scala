package typings.mapObj.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetOptions[TargetObjectType /* <: StringDictionary[js.Any] */] extends Options {
  
  @JSName("target")
  var target_TargetOptions: TargetObjectType = js.native
}
object TargetOptions {
  
  @scala.inline
  def apply[TargetObjectType /* <: StringDictionary[js.Any] */](target: TargetObjectType): TargetOptions[TargetObjectType] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetOptions[TargetObjectType]]
  }
  
  @scala.inline
  implicit class TargetOptionsOps[Self <: TargetOptions[_], TargetObjectType /* <: StringDictionary[js.Any] */] (val x: Self with TargetOptions[TargetObjectType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTarget(value: TargetObjectType): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
