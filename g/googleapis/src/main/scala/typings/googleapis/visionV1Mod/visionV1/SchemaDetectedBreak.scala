package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected start or end of a structural component.
  */
@js.native
trait SchemaDetectedBreak extends StObject {
  
  /**
    * True if break prepends the element.
    */
  var isPrefix: js.UndefOr[Boolean] = js.native
  
  /**
    * Detected break type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDetectedBreak {
  
  @scala.inline
  def apply(): SchemaDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectedBreak]
  }
  
  @scala.inline
  implicit class SchemaDetectedBreakMutableBuilder[Self <: SchemaDetectedBreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPrefix(value: Boolean): Self = StObject.set(x, "isPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrefixUndefined: Self = StObject.set(x, "isPrefix", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
