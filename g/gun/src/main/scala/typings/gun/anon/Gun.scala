package typings.gun.anon

import typings.gun.gunBooleans.`false`
import typings.gun.mod.Gun.ArrayAsRecord
import typings.gun.mod.Gun.ChainReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gun[DataType, ReferenceKey] extends StObject {
  
  var gun: ChainReference[DataType, ReferenceKey, `false`]
  
  var key: ReferenceKey
  
  var put: ArrayAsRecord[DataType]
}
object Gun {
  
  inline def apply[DataType, ReferenceKey](
    gun: ChainReference[DataType, ReferenceKey, `false`],
    key: ReferenceKey,
    put: ArrayAsRecord[DataType]
  ): Gun[DataType, ReferenceKey] = {
    val __obj = js.Dynamic.literal(gun = gun.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gun[DataType, ReferenceKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gun[?, ?], DataType, ReferenceKey] (val x: Self & (Gun[DataType, ReferenceKey])) extends AnyVal {
    
    inline def setGun(value: ChainReference[DataType, ReferenceKey, `false`]): Self = StObject.set(x, "gun", value.asInstanceOf[js.Any])
    
    inline def setKey(value: ReferenceKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ArrayAsRecord[DataType]): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
