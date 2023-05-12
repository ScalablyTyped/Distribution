package typings.json2csvNode

import typings.json2csvPlainjs.srcStreamParserMod.AsyncOptions
import typings.json2csvPlainjs.srcStreamParserMod.Options
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@json2csv/node", "AsyncParser")
  @js.native
  open class AsyncParser ()
    extends typings.json2csvNode.srcMod.AsyncParser {
    def this(opts: Options) = this()
    def this(opts: Unit, transformOpts: TransformOptions) = this()
    def this(opts: Options, transformOpts: TransformOptions) = this()
  }
  
  @JSImport("@json2csv/node", "Transform")
  @js.native
  open class Transform ()
    extends typings.json2csvNode.srcMod.Transform {
    def this(opts: Options) = this()
    def this(opts: Unit, transformOpts: TransformOptions) = this()
    def this(opts: Options, transformOpts: TransformOptions) = this()
    def this(opts: Unit, transformOpts: Unit, asyncOptions: AsyncOptions) = this()
    def this(opts: Unit, transformOpts: TransformOptions, asyncOptions: AsyncOptions) = this()
    def this(opts: Options, transformOpts: Unit, asyncOptions: AsyncOptions) = this()
    def this(opts: Options, transformOpts: TransformOptions, asyncOptions: AsyncOptions) = this()
  }
}
