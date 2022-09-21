package typings.iconGen

import typings.iconGen.libMod.ICONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  @JSImport("icon-gen/dist/bin/cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Run the tool based on command line arguments.
    * @param argv Arguments of command line interface.
    * @returns Path of generated files.
    */
  inline def default(argv: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(argv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def parseArgv(argv: js.Array[String]): CLIOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgv")(argv.asInstanceOf[js.Any]).asInstanceOf[CLIOptions]
  
  /** Options of command line interface. */
  trait CLIOptions extends StObject {
    
    /** Options of the icon generation. */
    var icon: ICONOptions
    
    /** Path of the SVG file or PNG file directory. */
    var input: String
    
    /** Path of the output directory. */
    var output: String
  }
  object CLIOptions {
    
    inline def apply(icon: ICONOptions, input: String, output: String): CLIOptions = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLIOptions]
    }
    
    extension [Self <: CLIOptions](x: Self) {
      
      inline def setIcon(value: ICONOptions): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
}
