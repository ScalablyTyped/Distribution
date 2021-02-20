package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the background of a document.
  */
@js.native
trait SchemaBackground extends StObject {
  
  /**
    * The background color.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.native
}
object SchemaBackground {
  
  @scala.inline
  def apply(): SchemaBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackground]
  }
  
  @scala.inline
  implicit class SchemaBackgroundMutableBuilder[Self <: SchemaBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SchemaOptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
