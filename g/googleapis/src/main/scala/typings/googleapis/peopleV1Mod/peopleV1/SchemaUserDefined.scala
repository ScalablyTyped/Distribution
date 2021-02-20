package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arbitrary user data that is populated by the end users.
  */
@js.native
trait SchemaUserDefined extends StObject {
  
  /**
    * The end user specified key of the user defined data.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the user defined data.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The end user specified value of the user defined data.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaUserDefined {
  
  @scala.inline
  def apply(): SchemaUserDefined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDefined]
  }
  
  @scala.inline
  implicit class SchemaUserDefinedMutableBuilder[Self <: SchemaUserDefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
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
