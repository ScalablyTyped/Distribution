package typings.materialUiCore

import typings.materialUiCore.materialUiCoreStrings.Numbersign000
import typings.materialUiCore.materialUiCoreStrings.Numbersignfff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsCommonMod {
  
  object default {
    
    @JSImport("@material-ui/core/colors/common", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Preview: ![common black](https://mui.com/static/colors-preview/common-black-24x24.svg)
      */
    @JSImport("@material-ui/core/colors/common", "default.black")
    @js.native
    def black: Numbersign000 = js.native
    inline def black_=(x: Numbersign000): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
    
    /**
      * Preview: ![common white](https://mui.com/static/colors-preview/common-white-24x24.svg)
      */
    @JSImport("@material-ui/core/colors/common", "default.white")
    @js.native
    def white: Numbersignfff = js.native
    inline def white_=(x: Numbersignfff): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
  }
}
