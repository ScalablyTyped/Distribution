package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly A security context.
  */
trait SchemaSecurityContext extends StObject {
  
  /**
    * The security types in this context.
    */
  var securities: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaSecurityContext {
  
  @scala.inline
  def apply(): SchemaSecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityContext]
  }
  
  @scala.inline
  implicit class SchemaSecurityContextMutableBuilder[Self <: SchemaSecurityContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurities(value: js.Array[String]): Self = StObject.set(x, "securities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecuritiesUndefined: Self = StObject.set(x, "securities", js.undefined)
    
    @scala.inline
    def setSecuritiesVarargs(value: String*): Self = StObject.set(x, "securities", js.Array(value :_*))
  }
}
