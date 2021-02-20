package typings.jointjs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deep
  extends /* key */ StringDictionary[js.Any] {
  
  var deep: js.UndefOr[Boolean] = js.native
  
  var parentRelative: js.UndefOr[Boolean] = js.native
}
object Deep {
  
  @scala.inline
  def apply(): Deep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deep]
  }
  
  @scala.inline
  implicit class DeepMutableBuilder[Self <: Deep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    
    @scala.inline
    def setParentRelative(value: Boolean): Self = StObject.set(x, "parentRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRelativeUndefined: Self = StObject.set(x, "parentRelative", js.undefined)
  }
}
