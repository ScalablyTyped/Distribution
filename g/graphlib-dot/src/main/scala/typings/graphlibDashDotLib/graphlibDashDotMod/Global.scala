package typings
package graphlibDashDotLib.graphlibDashDotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @JSName("graphlibDot")
  @js.native
  object graphlibDotNs extends js.Object {
    /**
      * Contains the version of the graphlib library used by graphlib-dot.
      */
    val graphlib: js.Any = js.native
    /**
      * Reads a single DOT graph from the str and returns it a Graph representation.
      * @param str a string in the DOT language representing a graph
      */
    def read(str: java.lang.String): graphlibLib.graphlibMod.Graph = js.native
    /**
      * Parses one or more DOT graphs from str in a manner similar to that used by parse for individual graphs.
      * @param str a string in the DOT language representing one or more graphs
      */
    def readMany(str: java.lang.String): js.Array[graphlibLib.graphlibMod.Graph] = js.native
    /**
      * Writes a String representation of the given graph in the DOT language.
      * @param g a graphlib Graph object
      */
    def write(g: graphlibLib.graphlibMod.Graph): java.lang.String = js.native
  }
  
}

