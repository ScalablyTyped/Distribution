package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackageRepository extends StObject {
  
  /**
    * An Apt Repository.
    */
  var apt: js.UndefOr[SchemaAptRepository] = js.undefined
  
  /**
    * A Goo Repository.
    */
  var goo: js.UndefOr[SchemaGooRepository] = js.undefined
  
  /**
    * A Yum Repository.
    */
  var yum: js.UndefOr[SchemaYumRepository] = js.undefined
  
  /**
    * A Zypper Repository.
    */
  var zypper: js.UndefOr[SchemaZypperRepository] = js.undefined
}
object SchemaPackageRepository {
  
  inline def apply(): SchemaPackageRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageRepository]
  }
  
  extension [Self <: SchemaPackageRepository](x: Self) {
    
    inline def setApt(value: SchemaAptRepository): Self = StObject.set(x, "apt", value.asInstanceOf[js.Any])
    
    inline def setAptUndefined: Self = StObject.set(x, "apt", js.undefined)
    
    inline def setGoo(value: SchemaGooRepository): Self = StObject.set(x, "goo", value.asInstanceOf[js.Any])
    
    inline def setGooUndefined: Self = StObject.set(x, "goo", js.undefined)
    
    inline def setYum(value: SchemaYumRepository): Self = StObject.set(x, "yum", value.asInstanceOf[js.Any])
    
    inline def setYumUndefined: Self = StObject.set(x, "yum", js.undefined)
    
    inline def setZypper(value: SchemaZypperRepository): Self = StObject.set(x, "zypper", value.asInstanceOf[js.Any])
    
    inline def setZypperUndefined: Self = StObject.set(x, "zypper", js.undefined)
  }
}
