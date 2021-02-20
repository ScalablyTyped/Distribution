package typings.ionicStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DbKey extends StObject {
    
    var dbKey: String = js.native
    
    var driverOrder: js.Array[String] = js.native
    
    var name: String = js.native
    
    var storeName: String = js.native
  }
  object DbKey {
    
    @scala.inline
    def apply(dbKey: String, driverOrder: js.Array[String], name: String, storeName: String): DbKey = {
      val __obj = js.Dynamic.literal(dbKey = dbKey.asInstanceOf[js.Any], driverOrder = driverOrder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DbKey]
    }
    
    @scala.inline
    implicit class DbKeyMutableBuilder[Self <: DbKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbKey(value: String): Self = StObject.set(x, "dbKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverOrder(value: js.Array[String]): Self = StObject.set(x, "driverOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverOrderVarargs(value: String*): Self = StObject.set(x, "driverOrder", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    }
  }
}
