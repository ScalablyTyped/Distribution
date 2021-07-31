package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container message for hash values.
  */
trait SchemaHash extends StObject {
  
  /**
    * The type of hash that was performed.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The hash value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaHash {
  
  @scala.inline
  def apply(): SchemaHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHash]
  }
  
  @scala.inline
  implicit class SchemaHashMutableBuilder[Self <: SchemaHash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
