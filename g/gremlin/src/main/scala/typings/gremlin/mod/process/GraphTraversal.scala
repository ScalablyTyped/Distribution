package typings.gremlin.mod.process

import typings.gremlin.mod.Nullable
import typings.gremlin.mod.structure.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.GraphTraversal")
@js.native
class GraphTraversal protected () extends Traversal_ {
  def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies], bytecode: Bytecode) = this()
  
  def V(args: js.Any*): this.type = js.native
  
  def addE(args: js.Any*): this.type = js.native
  
  def addV(args: js.Any*): this.type = js.native
  
  def aggregate(args: js.Any*): this.type = js.native
  
  def and(args: js.Any*): this.type = js.native
  
  def as(args: js.Any*): this.type = js.native
  
  def barrier(args: js.Any*): this.type = js.native
  
  def both(args: js.Any*): this.type = js.native
  
  def bothE(args: js.Any*): this.type = js.native
  
  def bothV(args: js.Any*): this.type = js.native
  
  def branch(args: js.Any*): this.type = js.native
  
  def by(args: js.Any*): this.type = js.native
  
  def cap(args: js.Any*): this.type = js.native
  
  def choose(args: js.Any*): this.type = js.native
  
  def coalesce(args: js.Any*): this.type = js.native
  
  def coin(args: js.Any*): this.type = js.native
  
  def connectedComponent(args: js.Any*): this.type = js.native
  
  def constant(args: js.Any*): this.type = js.native
  
  def count(args: js.Any*): this.type = js.native
  
  def cyclicPath(args: js.Any*): this.type = js.native
  
  def dedup(args: js.Any*): this.type = js.native
  
  def drop(args: js.Any*): this.type = js.native
  
  def elementMap(args: js.Any*): this.type = js.native
  
  def emit(args: js.Any*): this.type = js.native
  
  def filter(args: js.Any*): this.type = js.native
  
  def flatMap(args: js.Any*): this.type = js.native
  
  def fold(args: js.Any*): this.type = js.native
  
  def from_(args: js.Any*): this.type = js.native
  
  def group(args: js.Any*): this.type = js.native
  
  def groupCount(args: js.Any*): this.type = js.native
  
  def has(args: js.Any*): this.type = js.native
  
  def hasId(args: js.Any*): this.type = js.native
  
  def hasKey(args: js.Any*): this.type = js.native
  
  def hasLabel(args: js.Any*): this.type = js.native
  
  def hasNot(args: js.Any*): this.type = js.native
  
  def hasValue(args: js.Any*): this.type = js.native
  
  def id(args: js.Any*): this.type = js.native
  
  def identity(args: js.Any*): this.type = js.native
  
  def inE(args: js.Any*): this.type = js.native
  
  def inV(args: js.Any*): this.type = js.native
  
  def in_(args: js.Any*): this.type = js.native
  
  def index(args: js.Any*): this.type = js.native
  
  def inject(args: js.Any*): this.type = js.native
  
  def is(args: js.Any*): this.type = js.native
  
  def key(args: js.Any*): this.type = js.native
  
  def label(args: js.Any*): this.type = js.native
  
  def limit(args: js.Any*): this.type = js.native
  
  def local(args: js.Any*): this.type = js.native
  
  def loops(args: js.Any*): this.type = js.native
  
  def map(args: js.Any*): this.type = js.native
  
  def `match`(args: js.Any*): this.type = js.native
  
  def math(args: js.Any*): this.type = js.native
  
  def max(args: js.Any*): this.type = js.native
  
  def mean(args: js.Any*): this.type = js.native
  
  def min(args: js.Any*): this.type = js.native
  
  def not(args: js.Any*): this.type = js.native
  
  def option(args: js.Any*): this.type = js.native
  
  def optional(args: js.Any*): this.type = js.native
  
  def or(args: js.Any*): this.type = js.native
  
  def order(args: js.Any*): this.type = js.native
  
  def otherV(args: js.Any*): this.type = js.native
  
  def out(args: js.Any*): this.type = js.native
  
  def outE(args: js.Any*): this.type = js.native
  
  def outV(args: js.Any*): this.type = js.native
  
  def pageRank(args: js.Any*): this.type = js.native
  
  def path(args: js.Any*): this.type = js.native
  
  def peerPressure(args: js.Any*): this.type = js.native
  
  def profile(args: js.Any*): this.type = js.native
  
  def program(args: js.Any*): this.type = js.native
  
  def project(args: js.Any*): this.type = js.native
  
  def properties(args: js.Any*): this.type = js.native
  
  def property(args: js.Any*): this.type = js.native
  
  def propertyMap(args: js.Any*): this.type = js.native
  
  def range(args: js.Any*): this.type = js.native
  
  def read(args: js.Any*): this.type = js.native
  
  def repeat(args: js.Any*): this.type = js.native
  
  def sack(args: js.Any*): this.type = js.native
  
  def sample(args: js.Any*): this.type = js.native
  
  def select(args: js.Any*): this.type = js.native
  
  def shortestPath(args: js.Any*): this.type = js.native
  
  def sideEffect(args: js.Any*): this.type = js.native
  
  def simplePath(args: js.Any*): this.type = js.native
  
  def skip(args: js.Any*): this.type = js.native
  
  def store(args: js.Any*): this.type = js.native
  
  def subgraph(args: js.Any*): this.type = js.native
  
  def sum(args: js.Any*): this.type = js.native
  
  def tail(args: js.Any*): this.type = js.native
  
  def timeLimit(args: js.Any*): this.type = js.native
  
  def times(args: js.Any*): this.type = js.native
  
  def to(args: js.Any*): this.type = js.native
  
  def toE(args: js.Any*): this.type = js.native
  
  def toV(args: js.Any*): this.type = js.native
  
  def tree(args: js.Any*): this.type = js.native
  
  def unfold(args: js.Any*): this.type = js.native
  
  def union(args: js.Any*): this.type = js.native
  
  def until(args: js.Any*): this.type = js.native
  
  def value(args: js.Any*): this.type = js.native
  
  def valueMap(args: js.Any*): this.type = js.native
  
  def values(args: js.Any*): this.type = js.native
  
  def where(args: js.Any*): this.type = js.native
  
  def with_(args: js.Any*): this.type = js.native
  
  def write(args: js.Any*): this.type = js.native
}
