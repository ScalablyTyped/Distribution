package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sorted extends StObject {
  
  var sorted: js.UndefOr[Boolean] = js.native
}
object Sorted {
  
  @scala.inline
  def apply(): Sorted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sorted]
  }
  
  @scala.inline
  implicit class SortedMutableBuilder[Self <: Sorted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
  }
}
