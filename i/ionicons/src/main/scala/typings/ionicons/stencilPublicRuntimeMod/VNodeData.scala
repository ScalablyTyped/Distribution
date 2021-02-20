package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VNodeData
  extends /* prop */ StringDictionary[js.Any] {
  
  var `class`: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
}
object VNodeData {
  
  @scala.inline
  def apply(): VNodeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VNodeData]
  }
  
  @scala.inline
  implicit class VNodeDataMutableBuilder[Self <: VNodeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: StringDictionary[Boolean]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
