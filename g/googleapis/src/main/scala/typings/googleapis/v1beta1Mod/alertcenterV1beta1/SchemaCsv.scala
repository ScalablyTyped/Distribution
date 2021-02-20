package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a CSV file attachment, as a list of column headers and
  * a list of data rows.
  */
@js.native
trait SchemaCsv extends StObject {
  
  /**
    * The list of data rows in a CSV file, as string arrays rather than as a
    * single comma-separated string.
    */
  var dataRows: js.UndefOr[js.Array[SchemaCsvRow]] = js.native
  
  /**
    * The list of headers for data columns in a CSV file.
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
}
object SchemaCsv {
  
  @scala.inline
  def apply(): SchemaCsv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCsv]
  }
  
  @scala.inline
  implicit class SchemaCsvMutableBuilder[Self <: SchemaCsv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataRows(value: js.Array[SchemaCsvRow]): Self = StObject.set(x, "dataRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRowsUndefined: Self = StObject.set(x, "dataRows", js.undefined)
    
    @scala.inline
    def setDataRowsVarargs(value: SchemaCsvRow*): Self = StObject.set(x, "dataRows", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
  }
}
