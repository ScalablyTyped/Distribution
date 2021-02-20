package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveIndices extends StObject {
  
  var removeIndices: js.UndefOr[Boolean] = js.native
}
object RemoveIndices {
  
  @scala.inline
  def apply(): RemoveIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveIndices]
  }
  
  @scala.inline
  implicit class RemoveIndicesMutableBuilder[Self <: RemoveIndices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveIndices(value: Boolean): Self = StObject.set(x, "removeIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIndicesUndefined: Self = StObject.set(x, "removeIndices", js.undefined)
  }
}
