package typings.json2csvNode

import typings.json2csvNode.srcAsyncParserMod.default
import typings.json2csvPlainjs.srcStreamParserMod.AsyncOptions
import typings.json2csvPlainjs.srcStreamParserMod.Options
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@json2csv/node/src", "AsyncParser")
  @js.native
  open class AsyncParser () extends default {
    def this(opts: Options) = this()
    def this(opts: Unit, transformOpts: TransformOptions) = this()
    def this(opts: Options, transformOpts: TransformOptions) = this()
  }
  
  @JSImport("@json2csv/node/src", "Transform")
  @js.native
  open class Transform ()
    extends typings.json2csvNode.srcTransformMod.default {
    def this(opts: Options) = this()
    def this(opts: Unit, transformOpts: TransformOptions) = this()
    def this(opts: Options, transformOpts: TransformOptions) = this()
    def this(opts: Unit, transformOpts: Unit, asyncOptions: AsyncOptions) = this()
    def this(opts: Unit, transformOpts: TransformOptions, asyncOptions: AsyncOptions) = this()
    def this(opts: Options, transformOpts: Unit, asyncOptions: AsyncOptions) = this()
    def this(opts: Options, transformOpts: TransformOptions, asyncOptions: AsyncOptions) = this()
  }
}
