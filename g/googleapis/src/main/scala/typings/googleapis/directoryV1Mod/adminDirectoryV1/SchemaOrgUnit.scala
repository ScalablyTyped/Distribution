package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Org Unit resource in Directory API.
  */
trait SchemaOrgUnit extends StObject {
  
  /**
    * Should block inheritance
    */
  var blockInheritance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Description of OrgUnit
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of OrgUnit
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Id of OrgUnit
    */
  var orgUnitId: js.UndefOr[String] = js.undefined
  
  /**
    * Path of OrgUnit
    */
  var orgUnitPath: js.UndefOr[String] = js.undefined
  
  /**
    * Id of parent OrgUnit
    */
  var parentOrgUnitId: js.UndefOr[String] = js.undefined
  
  /**
    * Path of parent OrgUnit
    */
  var parentOrgUnitPath: js.UndefOr[String] = js.undefined
}
object SchemaOrgUnit {
  
  inline def apply(): SchemaOrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgUnit]
  }
  
  extension [Self <: SchemaOrgUnit](x: Self) {
    
    inline def setBlockInheritance(value: Boolean): Self = StObject.set(x, "blockInheritance", value.asInstanceOf[js.Any])
    
    inline def setBlockInheritanceUndefined: Self = StObject.set(x, "blockInheritance", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
    
    inline def setParentOrgUnitId(value: String): Self = StObject.set(x, "parentOrgUnitId", value.asInstanceOf[js.Any])
    
    inline def setParentOrgUnitIdUndefined: Self = StObject.set(x, "parentOrgUnitId", js.undefined)
    
    inline def setParentOrgUnitPath(value: String): Self = StObject.set(x, "parentOrgUnitPath", value.asInstanceOf[js.Any])
    
    inline def setParentOrgUnitPathUndefined: Self = StObject.set(x, "parentOrgUnitPath", js.undefined)
  }
}
