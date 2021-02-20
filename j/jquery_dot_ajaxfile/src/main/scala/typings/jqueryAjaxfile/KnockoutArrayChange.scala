package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutArrayChange[T] extends StObject {
  
  var index: Double = js.native
  
  var moved: js.UndefOr[Double] = js.native
  
  var status: String = js.native
  
  var value: T = js.native
}
object KnockoutArrayChange {
  
  @scala.inline
  def apply[T](index: Double, status: String, value: T): KnockoutArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutArrayChange[T]]
  }
  
  @scala.inline
  implicit class KnockoutArrayChangeMutableBuilder[Self <: KnockoutArrayChange[_], T] (val x: Self with KnockoutArrayChange[T]) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoved(value: Double): Self = StObject.set(x, "moved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
