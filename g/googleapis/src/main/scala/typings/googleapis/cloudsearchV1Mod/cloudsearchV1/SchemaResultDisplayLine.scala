package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The collection of fields that make up a displayed line
  */
trait SchemaResultDisplayLine extends StObject {
  
  var fields: js.UndefOr[js.Array[SchemaResultDisplayField]] = js.undefined
}
object SchemaResultDisplayLine {
  
  inline def apply(): SchemaResultDisplayLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayLine]
  }
  
  extension [Self <: SchemaResultDisplayLine](x: Self) {
    
    inline def setFields(value: js.Array[SchemaResultDisplayField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaResultDisplayField*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
