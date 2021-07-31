package typings.loremIpsum

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regexMod {
  
  object REGEX {
    
    @JSImport("lorem-ipsum/types/src/constants/regex", "REGEX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lorem-ipsum/types/src/constants/regex", "REGEX.FORMATS")
    @js.native
    def FORMATS: RegExp = js.native
    @scala.inline
    def FORMATS_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMATS")(x.asInstanceOf[js.Any])
    
    @JSImport("lorem-ipsum/types/src/constants/regex", "REGEX.UNITS")
    @js.native
    def UNITS: RegExp = js.native
    @scala.inline
    def UNITS_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNITS")(x.asInstanceOf[js.Any])
  }
}
