package typings.gremlin.mod

import typings.gremlin.mod.process.GraphTraversal
import typings.gremlin.mod.process.GraphTraversalSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structure {
  
  trait Edge
    extends StObject
       with Element
  object Edge {
    
    inline def apply(equals_ : Element => Boolean): Edge = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Edge]
    }
  }
  
  trait Element extends StObject {
    
    def equals(other: Element): Boolean
  }
  object Element {
    
    inline def apply(equals_ : Element => Boolean): Element = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setEquals_(value: Element => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    }
  }
  
  trait Graph extends StObject {
    
    def traversal(): GraphTraversalSource[GraphTraversal]
  }
  object Graph {
    
    inline def apply(traversal: () => GraphTraversalSource[GraphTraversal]): Graph = {
      val __obj = js.Dynamic.literal(traversal = js.Any.fromFunction0(traversal))
      __obj.asInstanceOf[Graph]
    }
    
    extension [Self <: Graph](x: Self) {
      
      inline def setTraversal(value: () => GraphTraversalSource[GraphTraversal]): Self = StObject.set(x, "traversal", js.Any.fromFunction0(value))
    }
  }
  
  trait Long extends StObject
  
  trait Path extends StObject {
    
    def equals(other: Path): Boolean
  }
  object Path {
    
    inline def apply(equals_ : Path => Boolean): Path = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setEquals_(value: Path => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    }
  }
  
  trait Property extends StObject {
    
    def equals(other: Property): Boolean
  }
  object Property {
    
    inline def apply(equals_ : Property => Boolean): Property = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Property]
    }
    
    extension [Self <: Property](x: Self) {
      
      inline def setEquals_(value: Property => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    }
  }
  
  trait Vertex
    extends StObject
       with Element
  object Vertex {
    
    inline def apply(equals_ : Element => Boolean): Vertex = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Vertex]
    }
  }
  
  trait VertexProperty
    extends StObject
       with Element
  object VertexProperty {
    
    inline def apply(equals_ : Element => Boolean): VertexProperty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[VertexProperty]
    }
  }
  
  object io {
    
    trait GraphSONReader extends StObject {
      
      def read(obj: Any): Any
    }
    object GraphSONReader {
      
      inline def apply(read: Any => Any): GraphSONReader = {
        val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read))
        __obj.asInstanceOf[GraphSONReader]
      }
      
      extension [Self <: GraphSONReader](x: Self) {
        
        inline def setRead(value: Any => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      }
    }
    
    trait GraphSONWriter extends StObject {
      
      def adaptObject(value: Any): Any
      
      def write(obj: Any): String
    }
    object GraphSONWriter {
      
      inline def apply(adaptObject: Any => Any, write: Any => String): GraphSONWriter = {
        val __obj = js.Dynamic.literal(adaptObject = js.Any.fromFunction1(adaptObject), write = js.Any.fromFunction1(write))
        __obj.asInstanceOf[GraphSONWriter]
      }
      
      extension [Self <: GraphSONWriter](x: Self) {
        
        inline def setAdaptObject(value: Any => Any): Self = StObject.set(x, "adaptObject", js.Any.fromFunction1(value))
        
        inline def setWrite(value: Any => String): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      }
    }
  }
}
