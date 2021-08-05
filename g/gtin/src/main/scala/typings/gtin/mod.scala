package typings.gtin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gtin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFormat(gtin: String): GtinFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormat")(gtin.asInstanceOf[js.Any]).asInstanceOf[GtinFormat]
  
  inline def getRealFormat(gtin: String): GtinFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getRealFormat")(gtin.asInstanceOf[js.Any]).asInstanceOf[GtinFormat]
  
  inline def isGTIN(gtin: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGTIN")(gtin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def minify(gtin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(gtin.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object upce {
    
    @JSImport("gtin", "upce")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compress(gtin: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(gtin.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def expand(gtin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(gtin.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def validate(gtin: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(gtin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.gtin.gtinStrings.`GTIN-8`
    - typings.gtin.gtinStrings.`GTIN-12`
    - typings.gtin.gtinStrings.`GTIN-13`
    - typings.gtin.gtinStrings.`GTIN-14`
  */
  trait GtinFormat extends StObject
  object GtinFormat {
    
    inline def `GTIN-12`: typings.gtin.gtinStrings.`GTIN-12` = "GTIN-12".asInstanceOf[typings.gtin.gtinStrings.`GTIN-12`]
    
    inline def `GTIN-13`: typings.gtin.gtinStrings.`GTIN-13` = "GTIN-13".asInstanceOf[typings.gtin.gtinStrings.`GTIN-13`]
    
    inline def `GTIN-14`: typings.gtin.gtinStrings.`GTIN-14` = "GTIN-14".asInstanceOf[typings.gtin.gtinStrings.`GTIN-14`]
    
    inline def `GTIN-8`: typings.gtin.gtinStrings.`GTIN-8` = "GTIN-8".asInstanceOf[typings.gtin.gtinStrings.`GTIN-8`]
  }
}
