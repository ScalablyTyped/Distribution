package typings.json2csvPlainjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParserMod {
  
  @JSImport("@json2csv/plainjs/src/Parser", JSImport.Default)
  @js.native
  open class default () extends JSON2CSVParser
  
  @js.native
  trait JSON2CSVParser
    extends typings.json2csvPlainjs.srcBaseParserMod.default {
    
    def parse(data: Any): String = js.native
    
    def preprocessData(data: Any): js.Array[Any] = js.native
    
    def processData(data: js.Array[Any]): String = js.native
  }
}
