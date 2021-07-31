package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Healthcare API resource.
  */
trait SchemaCloudHealthcareSource extends StObject {
  
  /**
    * Full path of a Cloud Healthcare API resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaCloudHealthcareSource {
  
  @scala.inline
  def apply(): SchemaCloudHealthcareSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudHealthcareSource]
  }
  
  @scala.inline
  implicit class SchemaCloudHealthcareSourceMutableBuilder[Self <: SchemaCloudHealthcareSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
