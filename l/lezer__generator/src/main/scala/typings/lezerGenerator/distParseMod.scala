package typings.lezerGenerator

import typings.lezerGenerator.anon.Ch
import typings.lezerGenerator.distNodeMod.GrammarDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseMod {
  
  @JSImport("@lezer/generator/dist/parse", "Input")
  @js.native
  open class Input protected () extends StObject {
    def this(string: String) = this()
    def this(string: String, fileName: String) = this()
    
    def eat(`type`: String): Boolean = js.native
    def eat(`type`: String, value: Any): Boolean = js.native
    
    var end: Double = js.native
    
    def expect(`type`: String): Any = js.native
    def expect(`type`: String, value: Any): Any = js.native
    
    val fileName: String | Null = js.native
    
    def lineInfo(pos: Double): Ch = js.native
    
    def `match`(pos: Double, re: js.RegExp): Double = js.native
    
    def message(msg: String): String = js.native
    def message(msg: String, pos: Double): String = js.native
    
    def next(): Unit = js.native
    
    def parse(): GrammarDeclaration = js.native
    
    def raise(msg: String): scala.Nothing = js.native
    def raise(msg: String, pos: Double): scala.Nothing = js.native
    
    def set(`type`: String, value: Any, start: Double, end: Double): Unit = js.native
    
    var start: Double = js.native
    
    val string: String = js.native
    
    var `type`: String = js.native
    
    def unexpected(): scala.Nothing = js.native
    
    var value: Any = js.native
  }
}
