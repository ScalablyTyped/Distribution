package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionLike extends StObject {
  
  val name: String = js.native
}
object FunctionLike {
  
  @scala.inline
  def apply(name: String): FunctionLike = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionLike]
  }
  
  @scala.inline
  implicit class FunctionLikeMutableBuilder[Self <: FunctionLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
