package typings.jayrboltonSuffixTree

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jayrbolton/suffix-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(str: String, tree: STree): STree = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(str.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[STree]
  
  inline def addSingle(char: String, tree: STree): STree = (^.asInstanceOf[js.Dynamic].applyDynamic("addSingle")(char.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[STree]
  inline def addSingle(char: Double, tree: STree): STree = (^.asInstanceOf[js.Dynamic].applyDynamic("addSingle")(char.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[STree]
  
  inline def allSuffixes(tree: STree): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSuffixes")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def create(): STree = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[STree]
  inline def create(str: String): STree = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(str.asInstanceOf[js.Any]).asInstanceOf[STree]
  
  inline def findSuffix(suffix: String, tree: STree): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSuffix")(suffix.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def format(tree: STree): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStringByIndex(idx: Double, tree: STree): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringByIndex")(idx.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait SNode extends StObject {
    
    var children: StringDictionary[SNode]
    
    var id: Double
    
    var parent: SNode
    
    var start: Double
  }
  object SNode {
    
    inline def apply(children: StringDictionary[SNode], id: Double, parent: SNode, start: Double): SNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SNode] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: StringDictionary[SNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParent(value: SNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait STree extends StObject {
    
    var activeNode: SNode
    
    var idx: Double
    
    var lastID: Double
    
    var left: Double
    
    var right: Double
    
    var root: SNode
    
    var skip: Double
    
    var strings: NumberDictionary[String]
    
    var text: js.Array[String]
  }
  object STree {
    
    inline def apply(
      activeNode: SNode,
      idx: Double,
      lastID: Double,
      left: Double,
      right: Double,
      root: SNode,
      skip: Double,
      strings: NumberDictionary[String],
      text: js.Array[String]
    ): STree = {
      val __obj = js.Dynamic.literal(activeNode = activeNode.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], lastID = lastID.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[STree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: STree] (val x: Self) extends AnyVal {
      
      inline def setActiveNode(value: SNode): Self = StObject.set(x, "activeNode", value.asInstanceOf[js.Any])
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setLastID(value: Double): Self = StObject.set(x, "lastID", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: SNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setStrings(value: NumberDictionary[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    }
  }
}
