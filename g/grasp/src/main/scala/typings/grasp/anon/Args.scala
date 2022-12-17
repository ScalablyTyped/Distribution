package typings.grasp.anon

import typings.cliColor.mod.Color
import typings.node.anon.`6`
import typings.node.processMod.global.NodeJS.ReadStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var args: js.Array[String] | (Record[String, Any]) | String
  
  var callback: js.UndefOr[js.Function1[/* result */ String, Unit]] = js.undefined
  
  var console: js.UndefOr[Typeofconsole] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  
  var exit: js.UndefOr[js.Function1[/* code */ Double, Unit]] = js.undefined
  
  // The following are "overrides" for defaults, such as console, cli-color,
  // process.stdin, or fs. In most cases grasp only makes use of a small
  // surface area of the types, but I think if someone really wants to pass a
  // fake fs that only implements the subset of methods they think grasp uses,
  // it should be up to them to use a cast rather than the typedef to be
  // overly lenient. We never know if grasp might change their internal use of
  // fs, after all.
  var fs: js.UndefOr[Typeoffs] = js.undefined
  
  var input: js.UndefOr[String] = js.undefined
  
  var stdin: js.UndefOr[ReadStream & `6`] = js.undefined
  
  var textFormat: js.UndefOr[Color] = js.undefined
}
object Args {
  
  inline def apply(args: js.Array[String] | (Record[String, Any]) | String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(value: js.Array[String] | (Record[String, Any]) | String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setCallback(value: /* result */ String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setConsole(value: Typeofconsole): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    inline def setError(value: /* message */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExit(value: /* code */ Double => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setFs(value: Typeoffs): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setStdin(value: ReadStream & `6`): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setTextFormat(value: Color): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
