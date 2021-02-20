package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Modification timestamp.
  */
@js.native
trait SchemaLastModifiedInfo extends StObject {
  
  /**
    * Timestamp of the last change in milliseconds since epoch.
    */
  var time: js.UndefOr[String] = js.native
}
object SchemaLastModifiedInfo {
  
  @scala.inline
  def apply(): SchemaLastModifiedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLastModifiedInfo]
  }
  
  @scala.inline
  implicit class SchemaLastModifiedInfoMutableBuilder[Self <: SchemaLastModifiedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
