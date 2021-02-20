package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * File share configuration for the instance.
  */
@js.native
trait SchemaFileShareConfig extends StObject {
  
  /**
    * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as
    * 1024^3 bytes.
    */
  var capacityGb: js.UndefOr[String] = js.native
  
  /**
    * The name of the file share (must be 16 characters or less).
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaFileShareConfig {
  
  @scala.inline
  def apply(): SchemaFileShareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileShareConfig]
  }
  
  @scala.inline
  implicit class SchemaFileShareConfigMutableBuilder[Self <: SchemaFileShareConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityGb(value: String): Self = StObject.set(x, "capacityGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityGbUndefined: Self = StObject.set(x, "capacityGb", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
