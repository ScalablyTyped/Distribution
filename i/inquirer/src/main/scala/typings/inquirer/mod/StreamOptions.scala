package typings.inquirer.mod

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamOptions extends StObject {
  
  /**
    * A stream to read the input from.
    */
  var input: js.UndefOr[ReadStream] = js.undefined
  
  /**
    * A stream to write the output to.
    */
  var output: js.UndefOr[WriteStream] = js.undefined
}
object StreamOptions {
  
  inline def apply(): StreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamOptions]
  }
  
  extension [Self <: StreamOptions](x: Self) {
    
    inline def setInput(value: ReadStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setOutput(value: WriteStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
