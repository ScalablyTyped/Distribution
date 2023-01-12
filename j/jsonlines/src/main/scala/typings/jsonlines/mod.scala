package typings.jsonlines

import typings.jsonlines.jsonlinesStrings.`invalid-line`
import typings.jsonlines.jsonlinesStrings.close
import typings.jsonlines.jsonlinesStrings.data
import typings.jsonlines.jsonlinesStrings.end
import typings.jsonlines.jsonlinesStrings.error
import typings.jsonlines.jsonlinesStrings.pause
import typings.jsonlines.jsonlinesStrings.readable
import typings.jsonlines.jsonlinesStrings.resume
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonlines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsonlines", "Parser")
  @js.native
  open class Parser () extends Transform {
    def this(opts: TransformOptions) = this()
    
    // inherited (must re-declare since this is a class)
    def on(event: close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    // added 'invalid-line'
    def on(event: error | `invalid-line`, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    // inherited
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    // changed
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
  }
  
  @JSImport("jsonlines", "Stringifier")
  @js.native
  open class Stringifier () extends Transform {
    def this(opts: TransformOptions) = this()
    
    // inherited (must re-declare since this is a class)
    def on(event: close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    // inherited
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    // changed
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  }
  
  inline def parse(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Parser]
  inline def parse(options: Options): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
  
  inline def stringify(): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[Stringifier]
  
  trait Options extends StObject {
    
    var emitInvalidLines: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEmitInvalidLines(value: Boolean): Self = StObject.set(x, "emitInvalidLines", value.asInstanceOf[js.Any])
      
      inline def setEmitInvalidLinesUndefined: Self = StObject.set(x, "emitInvalidLines", js.undefined)
    }
  }
}
