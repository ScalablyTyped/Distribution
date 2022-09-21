package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrismaConfig extends StObject {
  
  /**
    * Required. Relevant client, product, and estimate codes from the Mediaocean Prisma tool.
    */
  var prismaCpeCode: js.UndefOr[SchemaPrismaCpeCode] = js.undefined
  
  /**
    * Required. The Prisma type.
    */
  var prismaType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The entity allocated this budget (DSP, site, etc.).
    */
  var supplier: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrismaConfig {
  
  inline def apply(): SchemaPrismaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrismaConfig]
  }
  
  extension [Self <: SchemaPrismaConfig](x: Self) {
    
    inline def setPrismaCpeCode(value: SchemaPrismaCpeCode): Self = StObject.set(x, "prismaCpeCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaCpeCodeUndefined: Self = StObject.set(x, "prismaCpeCode", js.undefined)
    
    inline def setPrismaType(value: String): Self = StObject.set(x, "prismaType", value.asInstanceOf[js.Any])
    
    inline def setPrismaTypeNull: Self = StObject.set(x, "prismaType", null)
    
    inline def setPrismaTypeUndefined: Self = StObject.set(x, "prismaType", js.undefined)
    
    inline def setSupplier(value: String): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierNull: Self = StObject.set(x, "supplier", null)
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
  }
}
