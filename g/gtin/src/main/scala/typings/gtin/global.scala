package typings.gtin

import typings.gtin.mod.GtinFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gtin {
    
    @JSGlobal("gtin")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFormat(gtin: String): GtinFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormat")(gtin.asInstanceOf[js.Any]).asInstanceOf[GtinFormat]
    
    inline def getRealFormat(gtin: String): GtinFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getRealFormat")(gtin.asInstanceOf[js.Any]).asInstanceOf[GtinFormat]
    
    inline def isGTIN(gtin: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGTIN")(gtin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def minify(gtin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(gtin.asInstanceOf[js.Any]).asInstanceOf[String]
    
    object upce {
      
      @JSGlobal("gtin.upce")
      @js.native
      val ^ : js.Any = js.native
      
      inline def compress(gtin: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(gtin.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      inline def expand(gtin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(gtin.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    inline def validate(gtin: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(gtin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
