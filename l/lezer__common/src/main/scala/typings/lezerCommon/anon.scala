package typings.lezerCommon

import typings.lezerCommon.distTreeMod.IterMode
import typings.lezerCommon.distTreeMod.NodeProp
import typings.lezerCommon.distTreeMod.NodePropSource
import typings.lezerCommon.distTreeMod.SyntaxNodeRef
import typings.lezerCommon.distTreeMod.TreeBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Deserialize[T] extends StObject {
    
    var deserialize: js.UndefOr[js.Function1[/* str */ String, T]] = js.undefined
    
    var perNode: js.UndefOr[Boolean] = js.undefined
  }
  object Deserialize {
    
    inline def apply[T](): Deserialize[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deserialize[T]]
    }
    
    extension [Self <: Deserialize[?], T](x: Self & Deserialize[T]) {
      
      inline def setDeserialize(value: /* str */ String => T): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setPerNode(value: Boolean): Self = StObject.set(x, "perNode", value.asInstanceOf[js.Any])
      
      inline def setPerNodeUndefined: Self = StObject.set(x, "perNode", js.undefined)
    }
  }
  
  trait Enter extends StObject {
    
    def enter(node: SyntaxNodeRef): Boolean | Unit
    
    var from: js.UndefOr[Double] = js.undefined
    
    var leave: js.UndefOr[js.Function1[/* node */ SyntaxNodeRef, Unit]] = js.undefined
    
    var mode: js.UndefOr[IterMode] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
  }
  object Enter {
    
    inline def apply(enter: SyntaxNodeRef => Boolean | Unit): Enter = {
      val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter))
      __obj.asInstanceOf[Enter]
    }
    
    extension [Self <: Enter](x: Self) {
      
      inline def setEnter(value: SyntaxNodeRef => Boolean | Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLeave(value: /* node */ SyntaxNodeRef => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction1(value))
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      inline def setMode(value: IterMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var props: js.UndefOr[js.Array[(js.Tuple2[NodeProp[Any], Any]) | NodePropSource]] = js.undefined
    
    var skipped: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object Error {
    
    inline def apply(id: Double): Error = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProps(value: js.Array[(js.Tuple2[NodeProp[Any], Any]) | NodePropSource]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setPropsVarargs(value: ((js.Tuple2[NodeProp[Any], Any]) | NodePropSource)*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setSkipped(value: Boolean): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      inline def setSkippedUndefined: Self = StObject.set(x, "skipped", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object From {
    
    inline def apply(from: Double, to: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait MakeTree extends StObject {
    
    var makeTree: js.UndefOr[
        js.Function3[
          /* children */ js.Array[this.type | TreeBuffer], 
          /* positions */ js.Array[Double], 
          /* length */ Double, 
          this.type
        ]
      ] = js.undefined
  }
  object MakeTree {
    
    inline def apply(): MakeTree = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MakeTree]
    }
    
    extension [Self <: MakeTree](x: Self) {
      
      inline def setMakeTree(
        value: (/* children */ js.Array[MakeTree | TreeBuffer], /* positions */ js.Array[Double], /* length */ Double) => MakeTree
      ): Self = StObject.set(x, "makeTree", js.Any.fromFunction3(value))
      
      inline def setMakeTreeUndefined: Self = StObject.set(x, "makeTree", js.undefined)
    }
  }
}
