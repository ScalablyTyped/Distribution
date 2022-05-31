package typings.lineNavigator

import typings.lineNavigator.mod.Options
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object LineNavigator {
    
    @JSGlobal("LineNavigator")
    @js.native
    class ^ protected ()
      extends typings.lineNavigator.mod.^ {
      def this(file: String) = this()
      /**
        * Creates an instance of LineNavigator.
        * @param file HTML5 File for client side or a string with file path for server side.
        * @param [options]
        */
      def this(file: File) = this()
      def this(file: String, options: Options) = this()
      def this(file: File, options: Options) = this()
    }
  }
}
