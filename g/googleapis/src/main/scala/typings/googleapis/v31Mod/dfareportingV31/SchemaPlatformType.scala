package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a platform type that can be targeted by ads.
  */
trait SchemaPlatformType extends StObject {
  
  /**
    * ID of this platform type.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#platformType&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this platform type.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaPlatformType {
  
  @scala.inline
  def apply(): SchemaPlatformType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformType]
  }
  
  @scala.inline
  implicit class SchemaPlatformTypeMutableBuilder[Self <: SchemaPlatformType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
