package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  var attrNames: js.Array[String]
  
  var id: SchemaId
  
  var name: String
  
  var seqNo: Double
  
  var ver: String
  
  var version: String
}
object Schema {
  
  inline def apply(
    attrNames: js.Array[String],
    id: SchemaId,
    name: String,
    seqNo: Double,
    ver: String,
    version: String
  ): Schema = {
    val __obj = js.Dynamic.literal(attrNames = attrNames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seqNo = seqNo.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
    
    inline def setAttrNames(value: js.Array[String]): Self = StObject.set(x, "attrNames", value.asInstanceOf[js.Any])
    
    inline def setAttrNamesVarargs(value: String*): Self = StObject.set(x, "attrNames", js.Array(value*))
    
    inline def setId(value: SchemaId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSeqNo(value: Double): Self = StObject.set(x, "seqNo", value.asInstanceOf[js.Any])
    
    inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
