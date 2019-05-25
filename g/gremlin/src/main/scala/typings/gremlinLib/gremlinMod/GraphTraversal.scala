package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "GraphTraversal")
@js.native
class GraphTraversal protected () extends Traversal {
  def this(graph: Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  def this(graph: Graph, traversalStrategies: scala.Null, bytecode: Bytecode) = this()
  def this(graph: scala.Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  def this(graph: scala.Null, traversalStrategies: scala.Null, bytecode: Bytecode) = this()
  def V(args: js.Any*): GraphTraversal = js.native
  def addE(args: js.Any*): GraphTraversal = js.native
  def addV(args: js.Any*): GraphTraversal = js.native
  def aggregate(args: js.Any*): GraphTraversal = js.native
  def and(args: js.Any*): GraphTraversal = js.native
  def as(args: js.Any*): GraphTraversal = js.native
  def barrier(args: js.Any*): GraphTraversal = js.native
  def both(args: js.Any*): GraphTraversal = js.native
  def bothE(args: js.Any*): GraphTraversal = js.native
  def bothV(args: js.Any*): GraphTraversal = js.native
  def branch(args: js.Any*): GraphTraversal = js.native
  def by(args: js.Any*): GraphTraversal = js.native
  def cap(args: js.Any*): GraphTraversal = js.native
  def choose(args: js.Any*): GraphTraversal = js.native
  def coalesce(args: js.Any*): GraphTraversal = js.native
  def coin(args: js.Any*): GraphTraversal = js.native
  def connectedComponent(args: js.Any*): GraphTraversal = js.native
  def constant(args: js.Any*): GraphTraversal = js.native
  def count(args: js.Any*): GraphTraversal = js.native
  def cyclicPath(args: js.Any*): GraphTraversal = js.native
  def dedup(args: js.Any*): GraphTraversal = js.native
  def drop(args: js.Any*): GraphTraversal = js.native
  def emit(args: js.Any*): GraphTraversal = js.native
  def filter(args: js.Any*): GraphTraversal = js.native
  def flatMap(args: js.Any*): GraphTraversal = js.native
  def fold(args: js.Any*): GraphTraversal = js.native
  def from_(args: js.Any*): GraphTraversal = js.native
  def group(args: js.Any*): GraphTraversal = js.native
  def groupCount(args: js.Any*): GraphTraversal = js.native
  def has(args: js.Any*): GraphTraversal = js.native
  def hasId(args: js.Any*): GraphTraversal = js.native
  def hasKey(args: js.Any*): GraphTraversal = js.native
  def hasLabel(args: js.Any*): GraphTraversal = js.native
  def hasNot(args: js.Any*): GraphTraversal = js.native
  def hasValue(args: js.Any*): GraphTraversal = js.native
  def id(args: js.Any*): GraphTraversal = js.native
  def identity(args: js.Any*): GraphTraversal = js.native
  def inE(args: js.Any*): GraphTraversal = js.native
  def inV(args: js.Any*): GraphTraversal = js.native
  def in_(args: js.Any*): GraphTraversal = js.native
  def index(args: js.Any*): GraphTraversal = js.native
  def inject(args: js.Any*): GraphTraversal = js.native
  def is(args: js.Any*): GraphTraversal = js.native
  def key(args: js.Any*): GraphTraversal = js.native
  def label(args: js.Any*): GraphTraversal = js.native
  def limit(args: js.Any*): GraphTraversal = js.native
  def local(args: js.Any*): GraphTraversal = js.native
  def loops(args: js.Any*): GraphTraversal = js.native
  def map(args: js.Any*): GraphTraversal = js.native
  def `match`(args: js.Any*): GraphTraversal = js.native
  def math(args: js.Any*): GraphTraversal = js.native
  def max(args: js.Any*): GraphTraversal = js.native
  def mean(args: js.Any*): GraphTraversal = js.native
  def min(args: js.Any*): GraphTraversal = js.native
  def not(args: js.Any*): GraphTraversal = js.native
  def option(args: js.Any*): GraphTraversal = js.native
  def optional(args: js.Any*): GraphTraversal = js.native
  def or(args: js.Any*): GraphTraversal = js.native
  def order(args: js.Any*): GraphTraversal = js.native
  def otherV(args: js.Any*): GraphTraversal = js.native
  def out(args: js.Any*): GraphTraversal = js.native
  def outE(args: js.Any*): GraphTraversal = js.native
  def outV(args: js.Any*): GraphTraversal = js.native
  def pageRank(args: js.Any*): GraphTraversal = js.native
  def path(args: js.Any*): GraphTraversal = js.native
  def peerPressure(args: js.Any*): GraphTraversal = js.native
  def profile(args: js.Any*): GraphTraversal = js.native
  def program(args: js.Any*): GraphTraversal = js.native
  def project(args: js.Any*): GraphTraversal = js.native
  def properties(args: js.Any*): GraphTraversal = js.native
  def property(args: js.Any*): GraphTraversal = js.native
  def propertyMap(args: js.Any*): GraphTraversal = js.native
  def range(args: js.Any*): GraphTraversal = js.native
  def read(args: js.Any*): GraphTraversal = js.native
  def repeat(args: js.Any*): GraphTraversal = js.native
  def sack(args: js.Any*): GraphTraversal = js.native
  def sample(args: js.Any*): GraphTraversal = js.native
  def select(args: js.Any*): GraphTraversal = js.native
  def shortestPath(args: js.Any*): GraphTraversal = js.native
  def sideEffect(args: js.Any*): GraphTraversal = js.native
  def simplePath(args: js.Any*): GraphTraversal = js.native
  def skip(args: js.Any*): GraphTraversal = js.native
  def store(args: js.Any*): GraphTraversal = js.native
  def subgraph(args: js.Any*): GraphTraversal = js.native
  def sum(args: js.Any*): GraphTraversal = js.native
  def tail(args: js.Any*): GraphTraversal = js.native
  def timeLimit(args: js.Any*): GraphTraversal = js.native
  def times(args: js.Any*): GraphTraversal = js.native
  def to(args: js.Any*): GraphTraversal = js.native
  def toE(args: js.Any*): GraphTraversal = js.native
  def toV(args: js.Any*): GraphTraversal = js.native
  def tree(args: js.Any*): GraphTraversal = js.native
  def unfold(args: js.Any*): GraphTraversal = js.native
  def union(args: js.Any*): GraphTraversal = js.native
  def until(args: js.Any*): GraphTraversal = js.native
  def value(args: js.Any*): GraphTraversal = js.native
  def valueMap(args: js.Any*): GraphTraversal = js.native
  def values(args: js.Any*): GraphTraversal = js.native
  def where(args: js.Any*): GraphTraversal = js.native
  def with_(args: js.Any*): GraphTraversal = js.native
  def write(args: js.Any*): GraphTraversal = js.native
}

