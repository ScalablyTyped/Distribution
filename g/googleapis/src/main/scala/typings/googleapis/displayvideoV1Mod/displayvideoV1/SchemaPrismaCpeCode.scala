package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrismaCpeCode extends StObject {
  
  /**
    * The Prisma client code.
    */
  var prismaClientCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Prisma estimate code.
    */
  var prismaEstimateCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Prisma product code.
    */
  var prismaProductCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrismaCpeCode {
  
  inline def apply(): SchemaPrismaCpeCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrismaCpeCode]
  }
  
  extension [Self <: SchemaPrismaCpeCode](x: Self) {
    
    inline def setPrismaClientCode(value: String): Self = StObject.set(x, "prismaClientCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaClientCodeNull: Self = StObject.set(x, "prismaClientCode", null)
    
    inline def setPrismaClientCodeUndefined: Self = StObject.set(x, "prismaClientCode", js.undefined)
    
    inline def setPrismaEstimateCode(value: String): Self = StObject.set(x, "prismaEstimateCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaEstimateCodeNull: Self = StObject.set(x, "prismaEstimateCode", null)
    
    inline def setPrismaEstimateCodeUndefined: Self = StObject.set(x, "prismaEstimateCode", js.undefined)
    
    inline def setPrismaProductCode(value: String): Self = StObject.set(x, "prismaProductCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaProductCodeNull: Self = StObject.set(x, "prismaProductCode", null)
    
    inline def setPrismaProductCodeUndefined: Self = StObject.set(x, "prismaProductCode", js.undefined)
  }
}
