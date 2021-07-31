package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefAny extends StObject {
  
  var ref: js.Any
}
object RefAny {
  
  @scala.inline
  def apply(ref: js.Any): RefAny = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefAny]
  }
  
  @scala.inline
  implicit class RefAnyMutableBuilder[Self <: RefAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
