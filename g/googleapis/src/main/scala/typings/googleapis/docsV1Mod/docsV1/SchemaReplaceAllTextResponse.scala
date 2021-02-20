package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of replacing text.
  */
@js.native
trait SchemaReplaceAllTextResponse extends StObject {
  
  /**
    * The number of occurrences changed by replacing all text.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}
object SchemaReplaceAllTextResponse {
  
  @scala.inline
  def apply(): SchemaReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllTextResponse]
  }
  
  @scala.inline
  implicit class SchemaReplaceAllTextResponseMutableBuilder[Self <: SchemaReplaceAllTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
