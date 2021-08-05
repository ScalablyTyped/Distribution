package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A skill that the person has.
  */
trait SchemaSkill extends StObject {
  
  /**
    * Metadata about the skill.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The skill; for example, `underwater basket weaving`.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaSkill {
  
  inline def apply(): SchemaSkill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSkill]
  }
  
  extension [Self <: SchemaSkill](x: Self) {
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
