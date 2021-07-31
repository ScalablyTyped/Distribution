package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a single data row in a CSV file.
  */
trait SchemaCsvRow extends StObject {
  
  /**
    * The data entries in a CSV file row, as a string array rather than a
    * single comma-separated string.
    */
  var entries: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCsvRow {
  
  @scala.inline
  def apply(): SchemaCsvRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCsvRow]
  }
  
  @scala.inline
  implicit class SchemaCsvRowMutableBuilder[Self <: SchemaCsvRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
