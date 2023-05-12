package typings.json2csvPlainjs

import typings.json2csvPlainjs.anon.End
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStreamParserMod {
  
  @JSImport("@json2csv/plainjs/src/StreamParser", JSImport.Default)
  @js.native
  open class default () extends JSON2CSVStreamParser {
    def this(opts: typings.json2csvPlainjs.srcBaseParserMod.Options) = this()
    def this(opts: Unit, asyncOpts: AsyncOptions) = this()
    def this(opts: typings.json2csvPlainjs.srcBaseParserMod.Options, asyncOpts: AsyncOptions) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenizerOptions * / any */ trait AsyncOptions extends StObject {
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object AsyncOptions {
    
    inline def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncOptions] (val x: Self) extends AnyVal {
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  @js.native
  trait JSON2CSVStreamParser
    extends typings.json2csvPlainjs.srcBaseParserMod.default {
    
    /* protected */ var _hasWritten: js.UndefOr[Boolean] = js.native
    
    def configureCallbacks(
      tokenizer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tokenizer */ Any,
      tokenParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenParser */ Any
    ): Unit = js.native
    
    def end(): Unit = js.native
    
    def getBinaryModeTokenizer(): Any = js.native
    def getBinaryModeTokenizer(asyncOpts: AsyncOptions): Any = js.native
    
    def getNdJsonTokenizer(): Any = js.native
    def getNdJsonTokenizer(asyncOpts: AsyncOptions): Any = js.native
    
    def getObjectModeTokenzier(): End = js.native
    
    def initTokenizer(): Unit = js.native
    def initTokenizer(opts: Unit, asyncOpts: AsyncOptions): Unit = js.native
    def initTokenizer(opts: typings.json2csvPlainjs.srcBaseParserMod.Options): Unit = js.native
    def initTokenizer(opts: typings.json2csvPlainjs.srcBaseParserMod.Options, asyncOpts: AsyncOptions): Unit = js.native
    
    def onData(data: Any): Unit = js.native
    
    def onEnd(): Unit = js.native
    
    def onError(): Unit = js.native
    
    def onHeader(header: String): Unit = js.native
    
    def onLine(line: js.Array[Any]): Unit = js.native
    
    def pushHeader(): Unit = js.native
    
    def pushHeaderIfNotWritten(): Unit = js.native
    
    def pushLine(data: Any): Unit = js.native
    
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
  
  trait Options
    extends StObject
       with typings.json2csvPlainjs.srcBaseParserMod.Options {
    
    var ndjson: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setNdjson(value: Boolean): Self = StObject.set(x, "ndjson", value.asInstanceOf[js.Any])
      
      inline def setNdjsonUndefined: Self = StObject.set(x, "ndjson", js.undefined)
    }
  }
}
