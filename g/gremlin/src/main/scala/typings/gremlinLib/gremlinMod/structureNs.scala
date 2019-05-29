package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "structure")
@js.native
object structureNs extends js.Object {
  @js.native
  class Edge protected () extends Element {
    def this(id: scala.Double, outV: Vertex, label: java.lang.String, inV: Vertex) = this()
    def this(id: scala.Double, outV: Vertex, label: java.lang.String, inV: Vertex, properties: js.Array[Property]) = this()
  }
  
  @js.native
  class Element protected () extends js.Object {
    def this(id: scala.Double, label: java.lang.String) = this()
    def equals(other: Element): scala.Boolean = js.native
  }
  
  @js.native
  class Graph () extends js.Object {
    def traversal(): gremlinLib.gremlinMod.processNs.GraphTraversalSource = js.native
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
    def write(obj: js.Any): java.lang.String = js.native
  }
  
  @js.native
  class Long protected () extends js.Object {
    def this(value: java.lang.String) = this()
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class Path protected () extends js.Object {
    def this(labels: js.Array[java.lang.String], objects: js.Array[_]) = this()
    def equals(other: Path): scala.Boolean = js.native
  }
  
  @js.native
  class Property protected () extends js.Object {
    def this(key: java.lang.String, value: js.Any) = this()
    def equals(other: Property): scala.Boolean = js.native
  }
  
  @js.native
  class Vertex protected () extends Element {
    def this(id: scala.Double, label: java.lang.String) = this()
    def this(id: scala.Double, label: java.lang.String, properties: js.Array[VertexProperty]) = this()
  }
  
  @js.native
  class VertexProperty protected () extends Element {
    def this(id: scala.Double, label: java.lang.String, value: js.Any) = this()
    def this(id: scala.Double, label: java.lang.String, value: js.Any, properties: js.Array[Property]) = this()
  }
  
  def toLong(value: java.lang.String): Long = js.native
  def toLong(value: scala.Double): Long = js.native
}

