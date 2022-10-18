package typings.lezerCommon

import typings.lezerCommon.anon.From
import typings.lezerCommon.distTreeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseMod {
  
  /* note: abstract class */ @JSImport("@lezer/common/dist/parse", "Parser")
  @js.native
  open class Parser () extends StObject {
    
    def createParse(input: Input, fragments: js.Array[TreeFragment], ranges: js.Array[From]): PartialParse = js.native
    
    def parse(input: String): Tree = js.native
    def parse(input: String, fragments: js.Array[TreeFragment]): Tree = js.native
    def parse(input: String, fragments: js.Array[TreeFragment], ranges: js.Array[From]): Tree = js.native
    def parse(input: String, fragments: Unit, ranges: js.Array[From]): Tree = js.native
    def parse(input: Input): Tree = js.native
    def parse(input: Input, fragments: js.Array[TreeFragment]): Tree = js.native
    def parse(input: Input, fragments: js.Array[TreeFragment], ranges: js.Array[From]): Tree = js.native
    def parse(input: Input, fragments: Unit, ranges: js.Array[From]): Tree = js.native
    
    def startParse(input: String): PartialParse = js.native
    def startParse(input: String, fragments: js.Array[TreeFragment]): PartialParse = js.native
    def startParse(input: String, fragments: js.Array[TreeFragment], ranges: js.Array[From]): PartialParse = js.native
    def startParse(input: String, fragments: Unit, ranges: js.Array[From]): PartialParse = js.native
    def startParse(input: Input): PartialParse = js.native
    def startParse(input: Input, fragments: js.Array[TreeFragment]): PartialParse = js.native
    def startParse(input: Input, fragments: js.Array[TreeFragment], ranges: js.Array[From]): PartialParse = js.native
    def startParse(input: Input, fragments: Unit, ranges: js.Array[From]): PartialParse = js.native
  }
  
  @JSImport("@lezer/common/dist/parse", "TreeFragment")
  @js.native
  open class TreeFragment protected () extends StObject {
    def this(from: Double, to: Double, tree: Tree, offset: Double) = this()
    def this(from: Double, to: Double, tree: Tree, offset: Double, openStart: Boolean) = this()
    def this(from: Double, to: Double, tree: Tree, offset: Double, openStart: Boolean, openEnd: Boolean) = this()
    def this(from: Double, to: Double, tree: Tree, offset: Double, openStart: Unit, openEnd: Boolean) = this()
    
    val from: Double = js.native
    
    val offset: Double = js.native
    
    def openEnd: Boolean = js.native
    
    def openStart: Boolean = js.native
    
    val to: Double = js.native
    
    val tree: Tree = js.native
  }
  /* static members */
  object TreeFragment {
    
    @JSImport("@lezer/common/dist/parse", "TreeFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addTree(tree: Tree): js.Array[TreeFragment] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeFragment]]
    inline def addTree(tree: Tree, fragments: js.Array[TreeFragment]): js.Array[TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeFragment]]
    inline def addTree(tree: Tree, fragments: js.Array[TreeFragment], partial: Boolean): js.Array[TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], partial.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeFragment]]
    inline def addTree(tree: Tree, fragments: Unit, partial: Boolean): js.Array[TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], partial.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeFragment]]
    
    inline def applyChanges(fragments: js.Array[TreeFragment], changes: js.Array[ChangedRange]): js.Array[TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(fragments.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeFragment]]
    inline def applyChanges(fragments: js.Array[TreeFragment], changes: js.Array[ChangedRange], minGap: Double): js.Array[TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(fragments.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], minGap.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeFragment]]
  }
  
  trait ChangedRange extends StObject {
    
    var fromA: Double
    
    var fromB: Double
    
    var toA: Double
    
    var toB: Double
  }
  object ChangedRange {
    
    inline def apply(fromA: Double, fromB: Double, toA: Double, toB: Double): ChangedRange = {
      val __obj = js.Dynamic.literal(fromA = fromA.asInstanceOf[js.Any], fromB = fromB.asInstanceOf[js.Any], toA = toA.asInstanceOf[js.Any], toB = toB.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangedRange]
    }
    
    extension [Self <: ChangedRange](x: Self) {
      
      inline def setFromA(value: Double): Self = StObject.set(x, "fromA", value.asInstanceOf[js.Any])
      
      inline def setFromB(value: Double): Self = StObject.set(x, "fromB", value.asInstanceOf[js.Any])
      
      inline def setToA(value: Double): Self = StObject.set(x, "toA", value.asInstanceOf[js.Any])
      
      inline def setToB(value: Double): Self = StObject.set(x, "toB", value.asInstanceOf[js.Any])
    }
  }
  
  trait Input extends StObject {
    
    def chunk(from: Double): String
    
    val length: Double
    
    val lineChunks: Boolean
    
    def read(from: Double, to: Double): String
  }
  object Input {
    
    inline def apply(chunk: Double => String, length: Double, lineChunks: Boolean, read: (Double, Double) => String): Input = {
      val __obj = js.Dynamic.literal(chunk = js.Any.fromFunction1(chunk), length = length.asInstanceOf[js.Any], lineChunks = lineChunks.asInstanceOf[js.Any], read = js.Any.fromFunction2(read))
      __obj.asInstanceOf[Input]
    }
    
    extension [Self <: Input](x: Self) {
      
      inline def setChunk(value: Double => String): Self = StObject.set(x, "chunk", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLineChunks(value: Boolean): Self = StObject.set(x, "lineChunks", value.asInstanceOf[js.Any])
      
      inline def setRead(value: (Double, Double) => String): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
    }
  }
  
  type ParseWrapper = js.Function4[
    /* inner */ PartialParse, 
    /* input */ Input, 
    /* fragments */ js.Array[TreeFragment], 
    /* ranges */ js.Array[From], 
    PartialParse
  ]
  
  trait PartialParse extends StObject {
    
    def advance(): Tree | Null
    
    val parsedPos: Double
    
    def stopAt(pos: Double): Unit
    
    val stoppedAt: Double | Null
  }
  object PartialParse {
    
    inline def apply(advance: () => Tree | Null, parsedPos: Double, stopAt: Double => Unit): PartialParse = {
      val __obj = js.Dynamic.literal(advance = js.Any.fromFunction0(advance), parsedPos = parsedPos.asInstanceOf[js.Any], stopAt = js.Any.fromFunction1(stopAt), stoppedAt = null)
      __obj.asInstanceOf[PartialParse]
    }
    
    extension [Self <: PartialParse](x: Self) {
      
      inline def setAdvance(value: () => Tree | Null): Self = StObject.set(x, "advance", js.Any.fromFunction0(value))
      
      inline def setParsedPos(value: Double): Self = StObject.set(x, "parsedPos", value.asInstanceOf[js.Any])
      
      inline def setStopAt(value: Double => Unit): Self = StObject.set(x, "stopAt", js.Any.fromFunction1(value))
      
      inline def setStoppedAt(value: Double): Self = StObject.set(x, "stoppedAt", value.asInstanceOf[js.Any])
      
      inline def setStoppedAtNull: Self = StObject.set(x, "stoppedAt", null)
    }
  }
}
