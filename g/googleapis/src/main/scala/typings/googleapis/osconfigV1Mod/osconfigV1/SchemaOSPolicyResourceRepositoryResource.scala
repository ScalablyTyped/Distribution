package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceRepositoryResource extends StObject {
  
  /**
    * An Apt Repository.
    */
  var apt: js.UndefOr[SchemaOSPolicyResourceRepositoryResourceAptRepository] = js.undefined
  
  /**
    * A Goo Repository.
    */
  var goo: js.UndefOr[SchemaOSPolicyResourceRepositoryResourceGooRepository] = js.undefined
  
  /**
    * A Yum Repository.
    */
  var yum: js.UndefOr[SchemaOSPolicyResourceRepositoryResourceYumRepository] = js.undefined
  
  /**
    * A Zypper Repository.
    */
  var zypper: js.UndefOr[SchemaOSPolicyResourceRepositoryResourceZypperRepository] = js.undefined
}
object SchemaOSPolicyResourceRepositoryResource {
  
  inline def apply(): SchemaOSPolicyResourceRepositoryResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceRepositoryResource]
  }
  
  extension [Self <: SchemaOSPolicyResourceRepositoryResource](x: Self) {
    
    inline def setApt(value: SchemaOSPolicyResourceRepositoryResourceAptRepository): Self = StObject.set(x, "apt", value.asInstanceOf[js.Any])
    
    inline def setAptUndefined: Self = StObject.set(x, "apt", js.undefined)
    
    inline def setGoo(value: SchemaOSPolicyResourceRepositoryResourceGooRepository): Self = StObject.set(x, "goo", value.asInstanceOf[js.Any])
    
    inline def setGooUndefined: Self = StObject.set(x, "goo", js.undefined)
    
    inline def setYum(value: SchemaOSPolicyResourceRepositoryResourceYumRepository): Self = StObject.set(x, "yum", value.asInstanceOf[js.Any])
    
    inline def setYumUndefined: Self = StObject.set(x, "yum", js.undefined)
    
    inline def setZypper(value: SchemaOSPolicyResourceRepositoryResourceZypperRepository): Self = StObject.set(x, "zypper", value.asInstanceOf[js.Any])
    
    inline def setZypperUndefined: Self = StObject.set(x, "zypper", js.undefined)
  }
}
