package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofprofiles extends StObject {
  
  @JSName("apply")
  val apply: Typeofapply
  
  val list: TypeoflistHandler3
}
object Typeofprofiles {
  
  inline def apply(apply: Typeofapply, list: TypeoflistHandler3): Typeofprofiles = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofprofiles]
  }
  
  extension [Self <: Typeofprofiles](x: Self) {
    
    inline def setApply(value: Typeofapply): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setList(value: TypeoflistHandler3): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
  }
}
