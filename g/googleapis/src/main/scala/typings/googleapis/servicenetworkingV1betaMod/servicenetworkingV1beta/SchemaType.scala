package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A protocol buffer message type.
  */
@js.native
trait SchemaType extends StObject {
  
  /**
    * The list of fields.
    */
  var fields: js.UndefOr[js.Array[SchemaField]] = js.native
  
  /**
    * The fully qualified message name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The list of types appearing in `oneof` definitions in this type.
    */
  var oneofs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
  
  /**
    * The source context.
    */
  var sourceContext: js.UndefOr[SchemaSourceContext] = js.native
  
  /**
    * The source syntax.
    */
  var syntax: js.UndefOr[String] = js.native
}
object SchemaType {
  
  @scala.inline
  def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
  
  @scala.inline
  implicit class SchemaTypeMutableBuilder[Self <: SchemaType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[SchemaField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOneofs(value: js.Array[String]): Self = StObject.set(x, "oneofs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofsUndefined: Self = StObject.set(x, "oneofs", js.undefined)
    
    @scala.inline
    def setOneofsVarargs(value: String*): Self = StObject.set(x, "oneofs", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSourceContext(value: SchemaSourceContext): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
