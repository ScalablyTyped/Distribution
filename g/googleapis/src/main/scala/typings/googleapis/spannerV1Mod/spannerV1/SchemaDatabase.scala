package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Spanner database.
  */
@js.native
trait SchemaDatabase extends StObject {
  
  /**
    * Required. The name of the database. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`,
    * where `&lt;database&gt;` is as specified in the `CREATE DATABASE`
    * statement. This name can be passed to other API methods to identify the
    * database.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The current database state.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaDatabase {
  
  @scala.inline
  def apply(): SchemaDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabase]
  }
  
  @scala.inline
  implicit class SchemaDatabaseMutableBuilder[Self <: SchemaDatabase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
