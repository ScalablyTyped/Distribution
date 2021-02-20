package typings.lowlight.lowlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightAutoOptions extends HighlightOptions {
  
  var subset: js.UndefOr[js.Array[String]] = js.native
}
object HighlightAutoOptions {
  
  @scala.inline
  def apply(): HighlightAutoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightAutoOptions]
  }
  
  @scala.inline
  implicit class HighlightAutoOptionsMutableBuilder[Self <: HighlightAutoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubset(value: js.Array[String]): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
    
    @scala.inline
    def setSubsetVarargs(value: String*): Self = StObject.set(x, "subset", js.Array(value :_*))
  }
}
