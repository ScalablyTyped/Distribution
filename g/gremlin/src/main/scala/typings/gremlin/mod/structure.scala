package typings.gremlin.mod

import typings.gremlin.mod.process.GraphTraversal
import typings.gremlin.mod.process.GraphTraversalSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "structure")
@js.native
object structure extends js.Object {
  @js.native
  class Edge protected () extends Element {
    def this(id: Double, outV: Vertex, label: String, inV: Vertex) = this()
    def this(id: Double, outV: Vertex, label: String, inV: Vertex, properties: js.Array[Property]) = this()
  }
  
  @js.native
  class Element protected () extends js.Object {
    def this(id: Double, label: String) = this()
    def equals(other: Element): Boolean = js.native
  }
  
  @js.native
  class Graph () extends js.Object {
    def traversal(): GraphTraversalSource[GraphTraversal] = js.native
  }
  
  @js.native
  class GraphSONReader () extends js.Object {
    def this(options: js.Any) = this()
    def read(obj: js.Any): js.Any = js.native
  }
  
  @js.native
  class GraphSONWriter () extends js.Object {
    def this(options: js.Any) = this()
    def adaptObject(value: js.Any): js.Any = js.native
    def write(obj: js.Any): String = js.native
  }
  
  @js.native
  class Long protected () extends js.Object {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  
  @js.native
  class Path protected () extends js.Object {
    def this(labels: js.Array[String], objects: js.Array[_]) = this()
    def equals(other: Path): Boolean = js.native
  }
  
  @js.native
  class Property protected () extends js.Object {
    def this(key: String, value: js.Any) = this()
    def equals(other: Property): Boolean = js.native
  }
  
  @js.native
  class Vertex protected () extends Element {
    def this(id: Double, label: String) = this()
    def this(id: Double, label: String, properties: js.Array[VertexProperty]) = this()
  }
  
  @js.native
  class VertexProperty protected () extends Element {
    def this(id: Double, label: String, value: js.Any) = this()
    def this(id: Double, label: String, value: js.Any, properties: js.Array[Property]) = this()
  }
  
  def toLong(value: String): Long = js.native
  def toLong(value: Double): Long = js.native
}

