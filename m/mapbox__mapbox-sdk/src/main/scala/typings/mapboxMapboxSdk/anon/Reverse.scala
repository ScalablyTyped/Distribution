package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reverse extends StObject {
  
  var reverse: js.UndefOr[Boolean] = js.native
}
object Reverse {
  
  @scala.inline
  def apply(): Reverse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reverse]
  }
  
  @scala.inline
  implicit class ReverseMutableBuilder[Self <: Reverse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
  }
}
