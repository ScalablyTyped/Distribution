package typings.gremlin.mod.process

import typings.gremlin.mod.Nullable
import typings.gremlin.mod.structure.Graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.GraphTraversal")
@js.native
open class GraphTraversal protected () extends Traversal_ {
  def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies], bytecode: Bytecode) = this()
  
  def V(args: Any*): this.type = js.native
  
  def addE(args: Any*): this.type = js.native
  
  def addV(args: Any*): this.type = js.native
  
  def aggregate(args: Any*): this.type = js.native
  
  def and(args: Any*): this.type = js.native
  
  def as(args: Any*): this.type = js.native
  
  def barrier(args: Any*): this.type = js.native
  
  def both(args: Any*): this.type = js.native
  
  def bothE(args: Any*): this.type = js.native
  
  def bothV(args: Any*): this.type = js.native
  
  def branch(args: Any*): this.type = js.native
  
  def by(args: Any*): this.type = js.native
  
  def call(args: Any*): this.type = js.native
  
  def cap(args: Any*): this.type = js.native
  
  def choose(args: Any*): this.type = js.native
  
  def coalesce(args: Any*): this.type = js.native
  
  def coin(args: Any*): this.type = js.native
  
  def connectedComponent(args: Any*): this.type = js.native
  
  def constant(args: Any*): this.type = js.native
  
  def count(args: Any*): this.type = js.native
  
  def cyclicPath(args: Any*): this.type = js.native
  
  def dedup(args: Any*): this.type = js.native
  
  def drop(args: Any*): this.type = js.native
  
  def element(args: Any*): this.type = js.native
  
  def elementMap(args: Any*): this.type = js.native
  
  def emit(args: Any*): this.type = js.native
  
  def fail(args: Any*): this.type = js.native
  
  def filter(args: Any*): this.type = js.native
  
  def flatMap(args: Any*): this.type = js.native
  
  def fold(args: Any*): this.type = js.native
  
  def from_(args: Any*): this.type = js.native
  
  def group(args: Any*): this.type = js.native
  
  def groupCount(args: Any*): this.type = js.native
  
  def has(args: Any*): this.type = js.native
  
  def hasId(args: Any*): this.type = js.native
  
  def hasKey(args: Any*): this.type = js.native
  
  def hasLabel(args: Any*): this.type = js.native
  
  def hasNot(args: Any*): this.type = js.native
  
  def hasValue(args: Any*): this.type = js.native
  
  def id(args: Any*): this.type = js.native
  
  def identity(args: Any*): this.type = js.native
  
  def inE(args: Any*): this.type = js.native
  
  def inV(args: Any*): this.type = js.native
  
  def in_(args: Any*): this.type = js.native
  
  def index(args: Any*): this.type = js.native
  
  def inject(args: Any*): this.type = js.native
  
  def is(args: Any*): this.type = js.native
  
  def key(args: Any*): this.type = js.native
  
  def label(args: Any*): this.type = js.native
  
  def limit(args: Any*): this.type = js.native
  
  def local(args: Any*): this.type = js.native
  
  def loops(args: Any*): this.type = js.native
  
  def map(args: Any*): this.type = js.native
  
  def `match`(args: Any*): this.type = js.native
  
  def math(args: Any*): this.type = js.native
  
  def max(args: Any*): this.type = js.native
  
  def mean(args: Any*): this.type = js.native
  
  def mergeE(args: Any*): this.type = js.native
  
  def mergeV(args: Any*): this.type = js.native
  
  def min(args: Any*): this.type = js.native
  
  def none(args: Any*): this.type = js.native
  
  def not(args: Any*): this.type = js.native
  
  def option(args: Any*): this.type = js.native
  
  def optional(args: Any*): this.type = js.native
  
  def or(args: Any*): this.type = js.native
  
  def order(args: Any*): this.type = js.native
  
  def otherV(args: Any*): this.type = js.native
  
  def out(args: Any*): this.type = js.native
  
  def outE(args: Any*): this.type = js.native
  
  def outV(args: Any*): this.type = js.native
  
  def pageRank(args: Any*): this.type = js.native
  
  def path(args: Any*): this.type = js.native
  
  def peerPressure(args: Any*): this.type = js.native
  
  def profile(args: Any*): this.type = js.native
  
  def program(args: Any*): this.type = js.native
  
  def project(args: Any*): this.type = js.native
  
  def properties(args: Any*): this.type = js.native
  
  def property(args: Any*): this.type = js.native
  
  def propertyMap(args: Any*): this.type = js.native
  
  def range(args: Any*): this.type = js.native
  
  def read(args: Any*): this.type = js.native
  
  def repeat(args: Any*): this.type = js.native
  
  def sack(args: Any*): this.type = js.native
  
  def sample(args: Any*): this.type = js.native
  
  def select(args: Any*): this.type = js.native
  
  def shortestPath(args: Any*): this.type = js.native
  
  def sideEffect(args: Any*): this.type = js.native
  
  def simplePath(args: Any*): this.type = js.native
  
  def skip(args: Any*): this.type = js.native
  
  def store(args: Any*): this.type = js.native
  
  def subgraph(args: Any*): this.type = js.native
  
  def sum(args: Any*): this.type = js.native
  
  def tail(args: Any*): this.type = js.native
  
  def timeLimit(args: Any*): this.type = js.native
  
  def times(args: Any*): this.type = js.native
  
  def to(args: Any*): this.type = js.native
  
  def toE(args: Any*): this.type = js.native
  
  def toV(args: Any*): this.type = js.native
  
  def tree(args: Any*): this.type = js.native
  
  def unfold(args: Any*): this.type = js.native
  
  def union(args: Any*): this.type = js.native
  
  def until(args: Any*): this.type = js.native
  
  def value(args: Any*): this.type = js.native
  
  def valueMap(args: Any*): this.type = js.native
  
  def values(args: Any*): this.type = js.native
  
  def where(args: Any*): this.type = js.native
  
  def with_(args: Any*): this.type = js.native
  
  def write(args: Any*): this.type = js.native
}
