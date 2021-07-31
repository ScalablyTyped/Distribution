package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The app type the restriction applies to for mobile device.
  */
trait SchemaAppContext extends StObject {
  
  /**
    * The app types this restriction applies to.
    */
  var appTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAppContext {
  
  @scala.inline
  def apply(): SchemaAppContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppContext]
  }
  
  @scala.inline
  implicit class SchemaAppContextMutableBuilder[Self <: SchemaAppContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppTypes(value: js.Array[String]): Self = StObject.set(x, "appTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTypesUndefined: Self = StObject.set(x, "appTypes", js.undefined)
    
    @scala.inline
    def setAppTypesVarargs(value: String*): Self = StObject.set(x, "appTypes", js.Array(value :_*))
  }
}
