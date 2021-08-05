package typings.ionicStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DbKey extends StObject {
    
    var dbKey: String
    
    var driverOrder: js.Array[String]
    
    var name: String
    
    var storeName: String
  }
  object DbKey {
    
    inline def apply(dbKey: String, driverOrder: js.Array[String], name: String, storeName: String): DbKey = {
      val __obj = js.Dynamic.literal(dbKey = dbKey.asInstanceOf[js.Any], driverOrder = driverOrder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DbKey]
    }
    
    extension [Self <: DbKey](x: Self) {
      
      inline def setDbKey(value: String): Self = StObject.set(x, "dbKey", value.asInstanceOf[js.Any])
      
      inline def setDriverOrder(value: js.Array[String]): Self = StObject.set(x, "driverOrder", value.asInstanceOf[js.Any])
      
      inline def setDriverOrderVarargs(value: String*): Self = StObject.set(x, "driverOrder", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    }
  }
}
