package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The projection of document&#39;s fields to return.
  */
trait SchemaProjection extends StObject {
  
  /**
    * The fields to return.  If empty, all fields are returned. To only return
    * the name of the document, use `[&#39;__name__&#39;]`.
    */
  var fields: js.UndefOr[js.Array[SchemaFieldReference]] = js.undefined
}
object SchemaProjection {
  
  inline def apply(): SchemaProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjection]
  }
  
  extension [Self <: SchemaProjection](x: Self) {
    
    inline def setFields(value: js.Array[SchemaFieldReference]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaFieldReference*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
