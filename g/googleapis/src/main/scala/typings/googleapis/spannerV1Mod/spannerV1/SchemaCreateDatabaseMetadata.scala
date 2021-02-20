package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata type for the operation returned by CreateDatabase.
  */
@js.native
trait SchemaCreateDatabaseMetadata extends StObject {
  
  /**
    * The database being created.
    */
  var database: js.UndefOr[String] = js.native
}
object SchemaCreateDatabaseMetadata {
  
  @scala.inline
  def apply(): SchemaCreateDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDatabaseMetadata]
  }
  
  @scala.inline
  implicit class SchemaCreateDatabaseMetadataMutableBuilder[Self <: SchemaCreateDatabaseMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
  }
}
