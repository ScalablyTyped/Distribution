package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions extends StObject {
  
  val validate: Typeofvalidate = js.native
}
object Typeofoptions {
  
  @scala.inline
  def apply(validate: Typeofvalidate): Typeofoptions = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions]
  }
  
  @scala.inline
  implicit class TypeofoptionsMutableBuilder[Self <: Typeofoptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidate(value: Typeofvalidate): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
