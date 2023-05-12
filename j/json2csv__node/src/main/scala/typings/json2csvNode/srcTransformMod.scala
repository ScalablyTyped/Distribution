package typings.json2csvNode

import typings.json2csvNode.anon.FnCall
import typings.json2csvNode.anon.FnCallAsyncOpts
import typings.json2csvNode.anon.FnCallOptsAsyncOpts
import typings.json2csvNode.anon.FnCallRow
import typings.json2csvNode.anon.RequiredStreamOptions
import typings.json2csvPlainjs.anon.End
import typings.json2csvPlainjs.srcBaseParserMod.JSON2CSVBase
import typings.json2csvPlainjs.srcMod.Field
import typings.json2csvPlainjs.srcMod.FieldObject
import typings.json2csvPlainjs.srcStreamParserMod.AsyncOptions
import typings.json2csvPlainjs.srcStreamParserMod.Options
import typings.node.streamMod.TransformOptions
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformMod {
  
  @JSImport("@json2csv/node/src/Transform", JSImport.Default)
  @js.native
  open class default () extends JSON2CSVNodeTransform {
    def this(opts: Options) = this()
    def this(opts: Unit, transformOpts: TransformOptions) = this()
    def this(opts: Options, transformOpts: TransformOptions) = this()
    def this(opts: Unit, transformOpts: Unit, asyncOptions: AsyncOptions) = this()
    def this(opts: Unit, transformOpts: TransformOptions, asyncOptions: AsyncOptions) = this()
    def this(opts: Options, transformOpts: Unit, asyncOptions: AsyncOptions) = this()
    def this(opts: Options, transformOpts: TransformOptions, asyncOptions: AsyncOptions) = this()
  }
  
  @js.native
  trait JSON2CSVNodeTransform extends Transform {
    
    def endUnderlyingLayer(): Unit = js.native
    
    @JSName("opts")
    var opts_JSON2CSVNodeTransform: RequiredStreamOptions = js.native
    
    def promise(): js.Promise[String] = js.native
  }
  
  /**
    * @todo Update this body to match StreamParser whenever it changes.
    * Doing this is the closest I think we can get with TypeScript to mimicking
    * {@link <https://github.com/juanjoDiaz/json2csv/blob/2d827e99d849e3afbbfcde4fa25f9789aab25c83/packages/node/src/Transform.js#L9>}
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.json2csvPlainjs.srcBaseParserMod.default because Inheritance from two classes. Inlined 
  - typings.json2csvPlainjs.srcStreamParserMod.JSON2CSVStreamParser because Inheritance from two classes. Inlined tokenizer, tokenParser, _hasWritten, configureCallbacks, end, getBinaryModeTokenizer, getBinaryModeTokenizer, getNdJsonTokenizer, getNdJsonTokenizer, getObjectModeTokenzier, initTokenizer, initTokenizer, initTokenizer, initTokenizer, onData, onEnd, onError, onHeader, onLine, pushHeader, pushHeaderIfNotWritten, pushLine, write
  - typings.json2csvPlainjs.srcStreamParserMod.default because Inheritance from two classes. Inlined 
  - typings.json2csvPlainjs.srcMod.StreamParser because Inheritance from two classes. Inlined 
  - typings.json2csvPlainjs.mod.StreamParser because Inheritance from two classes. Inlined  */ @js.native
  trait Transform
    extends typings.node.nodeColonstreamMod.Transform
       with JSON2CSVBase {
    
    /* protected */ var _hasWritten: js.UndefOr[Boolean] = js.native
    
    def configureCallbacks(
      tokenizer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tokenizer */ Any,
      tokenParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenParser */ Any
    ): Unit = js.native
    @JSName("configureCallbacks")
    var configureCallbacks_Original: js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tokenizer */ /* tokenizer */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenParser */ /* tokenParser */ Any, 
        Unit
      ] = js.native
    
    def end(): Unit = js.native
    
    def getBinaryModeTokenizer(): Any = js.native
    def getBinaryModeTokenizer(asyncOpts: AsyncOptions): Any = js.native
    @JSName("getBinaryModeTokenizer")
    var getBinaryModeTokenizer_Original: FnCallAsyncOpts = js.native
    
    @JSName("getHeader")
    var getHeader_Original: js.Function0[String] = js.native
    
    def getNdJsonTokenizer(): Any = js.native
    def getNdJsonTokenizer(asyncOpts: AsyncOptions): Any = js.native
    @JSName("getNdJsonTokenizer")
    var getNdJsonTokenizer_Original: FnCallAsyncOpts = js.native
    
    def getObjectModeTokenzier(): End = js.native
    @JSName("getObjectModeTokenzier")
    var getObjectModeTokenzier_Original: js.Function0[End] = js.native
    
    def initTokenizer(): Unit = js.native
    def initTokenizer(opts: Unit, asyncOpts: AsyncOptions): Unit = js.native
    def initTokenizer(opts: typings.json2csvPlainjs.srcBaseParserMod.Options): Unit = js.native
    def initTokenizer(opts: typings.json2csvPlainjs.srcBaseParserMod.Options, asyncOpts: AsyncOptions): Unit = js.native
    @JSName("initTokenizer")
    var initTokenizer_Original: FnCallOptsAsyncOpts = js.native
    
    def onData(data: Any): Unit = js.native
    @JSName("onData")
    var onData_Original: js.Function1[/* data */ Any, Unit] = js.native
    
    def onEnd(): Unit = js.native
    @JSName("onEnd")
    var onEnd_Original: js.Function0[Unit] = js.native
    
    def onError(): Unit = js.native
    @JSName("onError")
    var onError_Original: js.Function0[Unit] = js.native
    
    def onHeader(header: String): Unit = js.native
    @JSName("onHeader")
    var onHeader_Original: js.Function1[/* header */ String, Unit] = js.native
    
    def onLine(line: js.Array[Any]): Unit = js.native
    @JSName("onLine")
    var onLine_Original: js.Function1[/* line */ js.Array[Any], Unit] = js.native
    
    @JSName("preprocessFieldsInfo")
    var preprocessFieldsInfo_Original: js.Function2[/* fields */ js.Array[Field], /* globalDefaultValue */ String, js.Array[FieldObject]] = js.native
    
    @JSName("preprocessOpts")
    var preprocessOpts_Original: FnCall = js.native
    
    @JSName("preprocessRow")
    var preprocessRow_Original: js.Function1[/* row */ js.Array[Any], js.Array[Any]] = js.native
    
    @JSName("processCell")
    var processCell_Original: js.Function2[/* row */ js.Array[Any], /* fieldInfo */ FieldObject, String] = js.native
    
    @JSName("processRow")
    var processRow_Original: FnCallRow = js.native
    
    @JSName("processValue")
    var processValue_Original: js.Function1[/* value */ Any, String] = js.native
    
    def pushHeader(): Unit = js.native
    
    def pushHeaderIfNotWritten(): Unit = js.native
    @JSName("pushHeaderIfNotWritten")
    var pushHeaderIfNotWritten_Original: js.Function0[Unit] = js.native
    
    @JSName("pushHeader")
    var pushHeader_Original: js.Function0[Unit] = js.native
    
    def pushLine(data: Any): Unit = js.native
    @JSName("pushLine")
    var pushLine_Original: js.Function1[/* data */ Any, Unit] = js.native
    
    var tokenParser: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenParser */ Any
      ] = js.native
    
    var tokenizer: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tokenizer */ Any) | (ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: this['getObjectModeTokenzier'] */ js.Any
        ])
      ] = js.native
    
    def write(data: Any): Unit = js.native
  }
}
