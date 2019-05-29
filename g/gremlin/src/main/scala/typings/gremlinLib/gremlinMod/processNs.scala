package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process")
@js.native
object processNs extends js.Object {
  @js.native
  class AnonymousTraversalSource () extends js.Object {
    def withGraph(graph: gremlinLib.gremlinMod.structureNs.Graph): GraphTraversalSource = js.native
    def withRemote(remoteConnection: gremlinLib.gremlinMod.driverNs.RemoteConnection): GraphTraversalSource = js.native
  }
  
  @js.native
  class Bytecode () extends js.Object {
    def this(toClone: Bytecode) = this()
    def addSource(name: java.lang.String): Bytecode = js.native
    def addSource(name: java.lang.String, values: js.Array[_]): Bytecode = js.native
    def addStep(name: java.lang.String): Bytecode = js.native
    def addStep(name: java.lang.String, values: js.Array[_]): Bytecode = js.native
  }
  
  @js.native
  class EnumValue protected () extends js.Object {
    def this(typeName: java.lang.String, elementName: java.lang.String) = this()
  }
  
  @js.native
  class GraphTraversal protected () extends Traversal {
    def this(graph: gremlinLib.gremlinMod.structureNs.Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def this(graph: gremlinLib.gremlinMod.structureNs.Graph, traversalStrategies: scala.Null, bytecode: Bytecode) = this()
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
  
  @js.native
  class GraphTraversalSource protected () extends js.Object {
    def this(graph: gremlinLib.gremlinMod.structureNs.Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def this(graph: gremlinLib.gremlinMod.structureNs.Graph, traversalStrategies: scala.Null, bytecode: Bytecode) = this()
    def this(graph: scala.Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def this(graph: scala.Null, traversalStrategies: scala.Null, bytecode: Bytecode) = this()
    def E(args: js.Any*): GraphTraversal = js.native
    def V(args: js.Any*): GraphTraversal = js.native
    def addE(args: js.Any*): GraphTraversal = js.native
    def addV(args: js.Any*): GraphTraversal = js.native
    def inject(args: js.Any*): GraphTraversal = js.native
    def io(args: js.Any*): GraphTraversal = js.native
    def withBulk(args: js.Any*): GraphTraversalSource = js.native
    def withPath(args: js.Any*): GraphTraversalSource = js.native
    def withRemote(remoteConnection: gremlinLib.gremlinMod.driverNs.RemoteConnection): GraphTraversalSource = js.native
    def withSack(args: js.Any*): GraphTraversalSource = js.native
    def withSideEffect(args: js.Any*): GraphTraversalSource = js.native
    def withStrategies(args: js.Any*): GraphTraversalSource = js.native
    def with_(args: js.Any*): GraphTraversalSource = js.native
    def withoutStrategies(args: js.Any*): GraphTraversalSource = js.native
  }
  
  trait Operator extends js.Object {
    var addall: EnumValue
    var and: EnumValue
    var assign: EnumValue
    var div: EnumValue
    var max: EnumValue
    var min: EnumValue
    var minus: EnumValue
    var mult: EnumValue
    var or: EnumValue
    var sum: EnumValue
    var sumlong: EnumValue
  }
  
  @js.native
  class P protected () extends js.Object {
    def this(operator: EnumValue, value: js.Any) = this()
    def this(operator: EnumValue, value: js.Any, other: js.Any) = this()
    def and(): P = js.native
    def and(arg: js.Any): P = js.native
    def or(): P = js.native
    def or(arg: js.Any): P = js.native
  }
  
  trait Statics extends js.Object {
    def V(args: js.Any*): GraphTraversal
    def addE(args: js.Any*): GraphTraversal
    def addV(args: js.Any*): GraphTraversal
    def aggregate(args: js.Any*): GraphTraversal
    def and(args: js.Any*): GraphTraversal
    def as(args: js.Any*): GraphTraversal
    def barrier(args: js.Any*): GraphTraversal
    def both(args: js.Any*): GraphTraversal
    def bothE(args: js.Any*): GraphTraversal
    def bothV(args: js.Any*): GraphTraversal
    def branch(args: js.Any*): GraphTraversal
    def cap(args: js.Any*): GraphTraversal
    def choose(args: js.Any*): GraphTraversal
    def coalesce(args: js.Any*): GraphTraversal
    def coin(args: js.Any*): GraphTraversal
    def constant(args: js.Any*): GraphTraversal
    def count(args: js.Any*): GraphTraversal
    def cyclicPath(args: js.Any*): GraphTraversal
    def dedup(args: js.Any*): GraphTraversal
    def drop(args: js.Any*): GraphTraversal
    def emit(args: js.Any*): GraphTraversal
    def filter(args: js.Any*): GraphTraversal
    def flatMap(args: js.Any*): GraphTraversal
    def fold(args: js.Any*): GraphTraversal
    def group(args: js.Any*): GraphTraversal
    def groupCount(args: js.Any*): GraphTraversal
    def has(args: js.Any*): GraphTraversal
    def hasId(args: js.Any*): GraphTraversal
    def hasKey(args: js.Any*): GraphTraversal
    def hasLabel(args: js.Any*): GraphTraversal
    def hasNot(args: js.Any*): GraphTraversal
    def hasValue(args: js.Any*): GraphTraversal
    def id(args: js.Any*): GraphTraversal
    def identity(args: js.Any*): GraphTraversal
    def inE(args: js.Any*): GraphTraversal
    def inV(args: js.Any*): GraphTraversal
    def in_(args: js.Any*): GraphTraversal
    def index(args: js.Any*): GraphTraversal
    def inject(args: js.Any*): GraphTraversal
    def is(args: js.Any*): GraphTraversal
    def key(args: js.Any*): GraphTraversal
    def label(args: js.Any*): GraphTraversal
    def limit(args: js.Any*): GraphTraversal
    def local(args: js.Any*): GraphTraversal
    def loops(args: js.Any*): GraphTraversal
    def map(args: js.Any*): GraphTraversal
    def `match`(args: js.Any*): GraphTraversal
    def math(args: js.Any*): GraphTraversal
    def max(args: js.Any*): GraphTraversal
    def mean(args: js.Any*): GraphTraversal
    def min(args: js.Any*): GraphTraversal
    def not(args: js.Any*): GraphTraversal
    def optional(args: js.Any*): GraphTraversal
    def or(args: js.Any*): GraphTraversal
    def order(args: js.Any*): GraphTraversal
    def otherV(args: js.Any*): GraphTraversal
    def out(args: js.Any*): GraphTraversal
    def outE(args: js.Any*): GraphTraversal
    def outV(args: js.Any*): GraphTraversal
    def path(args: js.Any*): GraphTraversal
    def project(args: js.Any*): GraphTraversal
    def properties(args: js.Any*): GraphTraversal
    def property(args: js.Any*): GraphTraversal
    def propertyMap(args: js.Any*): GraphTraversal
    def range(args: js.Any*): GraphTraversal
    def repeat(args: js.Any*): GraphTraversal
    def sack(args: js.Any*): GraphTraversal
    def sample(args: js.Any*): GraphTraversal
    def select(args: js.Any*): GraphTraversal
    def sideEffect(args: js.Any*): GraphTraversal
    def simplePath(args: js.Any*): GraphTraversal
    def skip(args: js.Any*): GraphTraversal
    def store(args: js.Any*): GraphTraversal
    def subgraph(args: js.Any*): GraphTraversal
    def sum(args: js.Any*): GraphTraversal
    def tail(args: js.Any*): GraphTraversal
    def timeLimit(args: js.Any*): GraphTraversal
    def times(args: js.Any*): GraphTraversal
    def to(args: js.Any*): GraphTraversal
    def toE(args: js.Any*): GraphTraversal
    def toV(args: js.Any*): GraphTraversal
    def tree(args: js.Any*): GraphTraversal
    def unfold(args: js.Any*): GraphTraversal
    def union(args: js.Any*): GraphTraversal
    def until(args: js.Any*): GraphTraversal
    def value(args: js.Any*): GraphTraversal
    def valueMap(args: js.Any*): GraphTraversal
    def values(args: js.Any*): GraphTraversal
    def where(args: js.Any*): GraphTraversal
  }
  
  @js.native
  class TextP protected () extends js.Object {
    def this(operator: EnumValue, value: java.lang.String) = this()
    def this(operator: EnumValue, value: java.lang.String, other: js.Any) = this()
    def and(): P = js.native
    def and(arg: js.Any): P = js.native
    def or(): P = js.native
    def or(arg: js.Any): P = js.native
  }
  
  @js.native
  class Translator protected () extends js.Object {
    def this(traversalSource: AnonymousTraversalSource) = this()
    def this(traversalSource: GraphTraversalSource) = this()
    def getTraversalSource(): Translator = js.native
    def of(traversalSource: AnonymousTraversalSource): scala.Unit = js.native
    def of(traversalSource: GraphTraversalSource): scala.Unit = js.native
    def translate(bytecode: Bytecode): java.lang.String = js.native
  }
  
  @js.native
  class Traversal protected () extends js.Object {
    def this(graph: gremlinLib.gremlinMod.structureNs.Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def this(graph: gremlinLib.gremlinMod.structureNs.Graph, traversalStrategies: scala.Null, bytecode: Bytecode) = this()
    def this(graph: scala.Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def this(graph: scala.Null, traversalStrategies: scala.Null, bytecode: Bytecode) = this()
    // [asyncIteratorSymbol: symbol | SymbolConstructor](): Traversal; // How can I implement this?
    def getBytecode(): Bytecode = js.native
    def iterate(): js.Promise[scala.Unit] = js.native
    def next(): js.Promise[gremlinLib.Anon_Done] = js.native
    def toList(): js.Promise[js.Array[Traverser]] = js.native
  }
  
  @js.native
  class TraversalSideEffects () extends js.Object
  
  @js.native
  class TraversalStrategies () extends js.Object {
    def this(parent: TraversalStrategies) = this()
    def addStrategy(strategy: TraversalStrategy): scala.Unit = js.native
    def applyStrategies(traversal: Traversal): js.Promise[Traversal] = js.native
  }
  
  @js.native
  class TraversalStrategy () extends js.Object {
    @JSName("apply")
    def apply(traversal: Traversal): js.Promise[Traversal] = js.native
  }
  
  @js.native
  class Traverser protected () extends js.Object {
    def this(`object`: js.Any) = this()
    def this(`object`: js.Any, bulk: scala.Double) = this()
  }
  
  trait WithOptions extends js.Object {
    var all: scala.Double
    var ids: scala.Double
    var indexer: java.lang.String
    var keys: scala.Double
    var labels: scala.Double
    var list: scala.Double
    var map: scala.Double
    var none: scala.Double
    var tokens: java.lang.String
    var values: scala.Double
  }
  
  val operator: Operator = js.native
  val statics: Statics = js.native
  val withOptions: WithOptions = js.native
  def traversal(): AnonymousTraversalSource = js.native
  /* static members */
  @js.native
  object AnonymousTraversalSource extends js.Object {
    def traversal(): gremlinLib.gremlinMod.processNs.AnonymousTraversalSource = js.native
  }
  
  /* static members */
  @js.native
  object P extends js.Object {
    def between(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def eq(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def gt(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def gte(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def inside(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def lt(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def lte(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def neq(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def not(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def outside(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def test(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def within(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
    def without(args: js.Any*): gremlinLib.gremlinMod.processNs.P = js.native
  }
  
  /* static members */
  @js.native
  object TextP extends js.Object {
    def containing(args: js.Any*): gremlinLib.gremlinMod.processNs.TextP = js.native
    def endingWith(args: js.Any*): gremlinLib.gremlinMod.processNs.TextP = js.native
    def notContaining(args: js.Any*): gremlinLib.gremlinMod.processNs.TextP = js.native
    def notEndingWith(args: js.Any*): gremlinLib.gremlinMod.processNs.TextP = js.native
    def notStartingWith(args: js.Any*): gremlinLib.gremlinMod.processNs.TextP = js.native
    def startingWith(args: js.Any*): gremlinLib.gremlinMod.processNs.TextP = js.native
  }
  
  @js.native
  object barrier extends js.Object {
    var normsack: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object cardinality extends js.Object {
    var list: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var set: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var single: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object column extends js.Object {
    var keys: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var values: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object direction extends js.Object {
    var both: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var in: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var out: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object graphSONVersion extends js.Object {
    var v1_0: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var v2_0: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var v3_0: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object gryoVersion extends js.Object {
    var v1_0: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var v3_0: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object order extends js.Object {
    var asc: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var decr: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var desc: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var incr: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var shuffle: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object pick extends js.Object {
    var any: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var none: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object pop extends js.Object {
    var all: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var first: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var last: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var mixed: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object scope extends js.Object {
    var global: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var local: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
  @js.native
  object t extends js.Object {
    var id: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var key: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var label: gremlinLib.gremlinMod.processNs.EnumValue = js.native
    var value: gremlinLib.gremlinMod.processNs.EnumValue = js.native
  }
  
}

