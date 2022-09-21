package typings.indySdk.mod

import typings.indySdk.anon.Primary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredDef extends StObject {
  
  var id: String
  
  var schemaId: String
  
  var tag: String
  
  var `type`: String
  
  var value: Primary
  
  var ver: String
}
object CredDef {
  
  inline def apply(id: String, schemaId: String, tag: String, `type`: String, value: Primary, ver: String): CredDef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], schemaId = schemaId.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredDef]
  }
  
  extension [Self <: CredDef](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSchemaId(value: String): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Primary): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
  }
}
