package typings.json2csv

import typings.json2csv.json2csvbaseMod.json2csv.Options
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json2csvasyncparserMod {
  
  @JSImport("json2csv/JSON2CSVAsyncParser", JSImport.Default)
  @js.native
  class default[T] () extends JSON2CSVAsyncParser[T] {
    def this(opts: Options[T]) = this()
    def this(opts: js.UndefOr[scala.Nothing], transformOpts: TransformOptions) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
  @js.native
  trait JSON2CSVAsyncParser[T]
    extends typings.json2csv.json2csvbaseMod.default[T] {
    
    def fromInput(input: Readable): JSON2CSVAsyncParser[T] = js.native
    
    var input: Transform = js.native
    
    var processor: Writable = js.native
    
    def promise(): js.Promise[js.UndefOr[String]] = js.native
    def promise(returnCSV: Boolean): js.Promise[js.UndefOr[String]] = js.native
    
    def throughTransform(transform: Transform): JSON2CSVAsyncParser[T] = js.native
    
    def toOutput(output: Writable): JSON2CSVAsyncParser[T] = js.native
    
    var transform: typings.json2csv.json2csvtransformMod.default[T] = js.native
  }
}
