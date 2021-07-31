package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One of the person&#39;s interests.
  */
trait SchemaInterest extends StObject {
  
  /**
    * Metadata about the interest.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The interest; for example, `stargazing`.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaInterest {
  
  @scala.inline
  def apply(): SchemaInterest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterest]
  }
  
  @scala.inline
  implicit class SchemaInterestMutableBuilder[Self <: SchemaInterest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
