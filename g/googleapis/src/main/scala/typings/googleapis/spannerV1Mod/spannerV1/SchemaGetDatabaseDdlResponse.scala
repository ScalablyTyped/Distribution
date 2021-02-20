package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for GetDatabaseDdl.
  */
@js.native
trait SchemaGetDatabaseDdlResponse extends StObject {
  
  /**
    * A list of formatted DDL statements defining the schema of the database
    * specified in the request.
    */
  var statements: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGetDatabaseDdlResponse {
  
  @scala.inline
  def apply(): SchemaGetDatabaseDdlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetDatabaseDdlResponse]
  }
  
  @scala.inline
  implicit class SchemaGetDatabaseDdlResponseMutableBuilder[Self <: SchemaGetDatabaseDdlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    @scala.inline
    def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
