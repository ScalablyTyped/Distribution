package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionRewriting {
  
  @JSImport("knockout", "expressionRewriting")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("knockout", "expressionRewriting._twoWayBindings")
  @js.native
  val _twoWayBindings: TwoWayBindings = js.native
  
  @JSImport("knockout", "expressionRewriting.bindingRewriteValidators")
  @js.native
  val bindingRewriteValidators: js.Array[js.Any] = js.native
  
  inline def parseObjectLiteral(objectLiteralString: String): js.Array[KeyValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseObjectLiteral")(objectLiteralString.asInstanceOf[js.Any]).asInstanceOf[js.Array[KeyValue]]
  
  inline def preProcessBindings(bindingsString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("preProcessBindings")(bindingsString.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def preProcessBindings(bindingsString: String, bindingOptions: BindingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcessBindings")(bindingsString.asInstanceOf[js.Any], bindingOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def preProcessBindings(keyValueArray: js.Array[KeyValue]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("preProcessBindings")(keyValueArray.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def preProcessBindings(keyValueArray: js.Array[KeyValue], bindingOptions: BindingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcessBindings")(keyValueArray.asInstanceOf[js.Any], bindingOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait KeyValue extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var unknown: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object KeyValue {
    
    inline def apply(): KeyValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyValue]
    }
    
    extension [Self <: KeyValue](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setUnknown(value: String): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TwoWayBindings = StringDictionary[Boolean | String]
}
