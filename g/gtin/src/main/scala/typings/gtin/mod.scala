package typings.gtin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gtin", "getFormat")
  @js.native
  def getFormat(gtin: String): GtinFormat = js.native
  
  @JSImport("gtin", "getRealFormat")
  @js.native
  def getRealFormat(gtin: String): GtinFormat = js.native
  
  @JSImport("gtin", "isGTIN")
  @js.native
  def isGTIN(gtin: String): Boolean = js.native
  
  @JSImport("gtin", "minify")
  @js.native
  def minify(gtin: String): String = js.native
  
  object upce {
    
    @JSImport("gtin", "upce.compress")
    @js.native
    def compress(gtin: String): String | Null = js.native
    
    @JSImport("gtin", "upce.expand")
    @js.native
    def expand(gtin: String): String = js.native
  }
  
  @JSImport("gtin", "validate")
  @js.native
  def validate(gtin: String): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.gtin.gtinStrings.`GTIN-8`
    - typings.gtin.gtinStrings.`GTIN-12`
    - typings.gtin.gtinStrings.`GTIN-13`
    - typings.gtin.gtinStrings.`GTIN-14`
  */
  trait GtinFormat extends StObject
  object GtinFormat {
    
    @scala.inline
    def `GTIN-12`: typings.gtin.gtinStrings.`GTIN-12` = "GTIN-12".asInstanceOf[typings.gtin.gtinStrings.`GTIN-12`]
    
    @scala.inline
    def `GTIN-13`: typings.gtin.gtinStrings.`GTIN-13` = "GTIN-13".asInstanceOf[typings.gtin.gtinStrings.`GTIN-13`]
    
    @scala.inline
    def `GTIN-14`: typings.gtin.gtinStrings.`GTIN-14` = "GTIN-14".asInstanceOf[typings.gtin.gtinStrings.`GTIN-14`]
    
    @scala.inline
    def `GTIN-8`: typings.gtin.gtinStrings.`GTIN-8` = "GTIN-8".asInstanceOf[typings.gtin.gtinStrings.`GTIN-8`]
  }
}
