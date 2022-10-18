package typings.jsurl2

import typings.jsurl2.mod.ParseOptions
import typings.jsurl2.mod.StringifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JSURL2 {
    
    @JSGlobal("JSURL2")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse[T /* <: js.Object */](urlFragment: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlFragment.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def parse[T /* <: js.Object */](urlFragment: String, options: ParseOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlFragment.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def stringify(`object`: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(`object`: js.Object, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def tryParse[T /* <: js.Object */](urlFragment: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(urlFragment.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def tryParse[T /* <: js.Object */](urlFragment: String, defaultValue: T, options: ParseOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(urlFragment.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
