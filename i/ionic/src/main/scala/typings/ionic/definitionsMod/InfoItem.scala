package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoItem extends StObject {
  
  var flair: js.UndefOr[String] = js.undefined
  
  var group: InfoItemGroup
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var path: js.UndefOr[String] = js.undefined
  
  var value: String
}
object InfoItem {
  
  inline def apply(group: InfoItemGroup, name: String, value: String): InfoItem = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoItem]
  }
  
  extension [Self <: InfoItem](x: Self) {
    
    inline def setFlair(value: String): Self = StObject.set(x, "flair", value.asInstanceOf[js.Any])
    
    inline def setFlairUndefined: Self = StObject.set(x, "flair", js.undefined)
    
    inline def setGroup(value: InfoItemGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
