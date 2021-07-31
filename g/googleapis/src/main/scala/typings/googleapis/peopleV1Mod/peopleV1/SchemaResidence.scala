package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s past or current residence.
  */
trait SchemaResidence extends StObject {
  
  /**
    * True if the residence is the person&#39;s current residence; false if the
    * residence is a past residence.
    */
  var current: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Metadata about the residence.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The address of the residence.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaResidence {
  
  @scala.inline
  def apply(): SchemaResidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResidence]
  }
  
  @scala.inline
  implicit class SchemaResidenceMutableBuilder[Self <: SchemaResidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
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
