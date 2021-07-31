package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for a transaction that can only be used to read documents.
  */
trait SchemaReadOnly extends StObject {
  
  /**
    * Reads documents at the given time. This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.undefined
}
object SchemaReadOnly {
  
  @scala.inline
  def apply(): SchemaReadOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadOnly]
  }
  
  @scala.inline
  implicit class SchemaReadOnlyMutableBuilder[Self <: SchemaReadOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
