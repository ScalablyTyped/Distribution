package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The collection of fields that make up a displayed line
  */
@js.native
trait SchemaResultDisplayLine extends StObject {
  
  var fields: js.UndefOr[js.Array[SchemaResultDisplayField]] = js.native
}
object SchemaResultDisplayLine {
  
  @scala.inline
  def apply(): SchemaResultDisplayLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayLine]
  }
  
  @scala.inline
  implicit class SchemaResultDisplayLineMutableBuilder[Self <: SchemaResultDisplayLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[SchemaResultDisplayField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaResultDisplayField*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
