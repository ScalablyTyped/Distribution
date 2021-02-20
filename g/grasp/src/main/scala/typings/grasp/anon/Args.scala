package typings.grasp.anon

import typings.cliColor.mod.Color
import typings.node.anon.ReadStreamfd0
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends StObject {
  
  var args: js.Array[String] | (Record[String, _]) | String = js.native
  
  var callback: js.UndefOr[js.Function1[/* result */ String, Unit]] = js.native
  
  var console: js.UndefOr[Typeofconsole] = js.native
  
  var error: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  
  var exit: js.UndefOr[js.Function1[/* code */ Double, Unit]] = js.native
  
  // The following are "overrides" for defaults, such as console, cli-color,
  // process.stdin, or fs. In most cases grasp only makes use of a small
  // surface area of the types, but I think if someone really wants to pass a
  // fake fs that only implements the subset of methods they think grasp uses,
  // it should be up to them to use a cast rather than the typedef to be
  // overly lenient. We never know if grasp might change their internal use of
  // fs, after all.
  var fs: js.UndefOr[Typeoffs] = js.native
  
  var input: js.UndefOr[String] = js.native
  
  var stdin: js.UndefOr[ReadStreamfd0] = js.native
  
  var textFormat: js.UndefOr[Color] = js.native
}
object Args {
  
  @scala.inline
  def apply(args: js.Array[String] | (Record[String, _]) | String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String] | (Record[String, _]) | String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCallback(value: /* result */ String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setConsole(value: Typeofconsole): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    @scala.inline
    def setError(value: /* message */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExit(value: /* code */ Double => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    @scala.inline
    def setFs(value: Typeoffs): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setStdin(value: ReadStreamfd0): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    @scala.inline
    def setTextFormat(value: Color): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
