package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextElement kind that represents a run of text that all has the same
  * styling.
  */
trait SchemaTextRun extends StObject {
  
  /**
    * The text of this run.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The styling applied to this run.
    */
  var style: js.UndefOr[SchemaTextStyle] = js.undefined
}
object SchemaTextRun {
  
  @scala.inline
  def apply(): SchemaTextRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextRun]
  }
  
  @scala.inline
  implicit class SchemaTextRunMutableBuilder[Self <: SchemaTextRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setStyle(value: SchemaTextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
